/**
 * 
 */
package XQuery;

import org.apache.xerces.parsers.DOMParser;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.util.*;
import java.io.*;

/**
 * @author QDX
 * 
 */
public class XQProcessVisitor implements XQueryParserVisitor,
		XQueryParserTreeConstants {

	public DebugLogger log;
	public NodeProcessor processor;

	public org.w3c.dom.Node root;
	public Document doc;

	public XQProcessVisitor() {
		log = new DebugLogger("XQProcessVisitor");
		processor = new NodeProcessor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.SimpleNode,
	 * java.lang.Object)
	 */
	@Override
	public Object visit(SimpleNode node, Object data) {
		log.RegularLog("SimpleNode, only called when the node is not implemented");
		data = node.childrenAccept(this, data);
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_Root, java.lang.Object)
	 */
	@Override
	public Object visit(AST_Root node, Object data) {
		log.RegularLog("Visit: AST_Root" + " <" + node.jjtGetNumChildren()
				+ ">");
		XContext context = new XContext();
		// root should only has one node, which is AST_XQ
		assert (node.jjtGetNumChildren() == 1);
		data = node.childrenAccept(this, context);
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_AP, java.lang.Object)
	 */
	@Override
	public Object visit(AST_AP node, Object data) {
		log.SetObjectControl(true, true, true);
		log.RegularLog("Visit: AST_AP" + " <" + node.jjtGetNumChildren() + ">");

		String filename = node.children[0].getText();

		log.DebugLog(filename);

		root = DomOperations.GetRootNodeFromPath(filename);
		doc = (Document) root;

		log.DebugLog(root.getNodeName());

		for (XQuery.Node n : node.children) {
			log.DebugLog(this.jjtNodeName[((SimpleNode) n).getId()]);
		}

		ArrayList<Object> result = null;
		if (((SimpleNode) node.children[1]).getId() == JJTSINGLESLASH) {
			result = processor.ProcessRP((AST_RP) node.children[2], root,
					DomOperations.RP_SIMPLE_FETCH);
		} else if (((SimpleNode) node.children[1]).getId() == JJTDOUBLESLASH) {
			result = processor.ProcessRP((AST_RP) node.children[2], root,
					DomOperations.RP_RECURSIVE_FETCH);
		}
		if (result != null)
			log.DebugLog("The result size is:" + result.size());
		else
			log.DebugLog("The result size is: 0");
		if (result != null) {
			for (Object o : result) {
				if (o instanceof Node) {
					log.DebugLog("node name:" + ((Node) o).getNodeName());
				} else if (o instanceof String) {
					log.DebugLog("get String:" + o);
				} else {
					log.ErrorLog("returned list contain none Node and String type!");
				}
			}
		}
		// node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_RP, org.w3c.dom.Node)
	 */
	@Override
	public Object visit(AST_RP node, Object data) {
		log.RegularLog("Visit: AST_RP" + " <" + node.jjtGetNumChildren() + ">");

		// data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_PF, java.lang.Object)
	 */
	@Override
	public Object visit(AST_PF node, Object data) {
		log.RegularLog("Visit: ASP_PF");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_XQ, java.lang.Object)
	 */
	@Override
	public Object visit(AST_XQ node, Object data) {
		log.RegularLog("Visit: AST_XQ" + " <" + node.jjtGetNumChildren() + ">");

		VariableKeeper result = new VariableKeeper();
		XContext firstContext = null;

		int childrenNum = node.jjtGetNumChildren();
		if (childrenNum == 0) {
			log.ErrorLog("An XQ node should not have 0 children!");
			return null;
		}
		XContext updatedContext = null;
		SimpleNode firstChild = (SimpleNode) node.children[0];

		int firstChildId = firstChild.getId();
		switch (firstChildId) {
		// encountering AP and Tag name can be done immediately
		case JJTAP:
			// appearance of AP at the first child implies this XQ only has one
			// node
			assert (childrenNum == 1);
			ArrayList<Object> apResult = (ArrayList<Object>) ((AST_AP) firstChild)
					.jjtAccept(this, data);
			result.SimpleAddNodeList(apResult);
			return result;
		case JJTTAGNAME:
			assert (childrenNum == 3);
			String tag1 = firstChild.getText();
			String tag2 = node.children[2].getText();
			assert (tag1.equals(tag2));
			AST_XQ secondChild = (AST_XQ) node.children[1];
			VariableKeeper tmpXQ = (VariableKeeper) secondChild.jjtAccept(this,
					data);
			Element newRoot = doc.createElement(tag1);
			for (Node n : tmpXQ.GetNodes()) {
				newRoot.appendChild(n);
			}
			ArrayList<Object> tmpAdd = new ArrayList<Object>();
			log.DebugLog("Warning: Visiting XQ encountered Tagname, the next "
					+ "operation make failed to case from Element to Node!");
			tmpAdd.add(newRoot);
			result.SimpleAddNodeList(tmpAdd);
			return result;
			// appearance of Var in the first child does not imply much on the
			// production rule
		case JJTVAR:
			String name = ((AST_VAR) firstChild).getText();
			result = ((XContext) data).Lookup(name);
			log.RegularLog("case JJTVAR and binds to "
					+ (result == null ? null : result.size()) + " nodes");
			break;
		case JJTSTRING:
			String string = firstChild.getText();
			Node newTextNode = doc.createTextNode(string);
			tmpAdd = new ArrayList<Object>();
			tmpAdd.add(newTextNode);
			result.SimpleAddNodeList(tmpAdd);
			break;
		case JJTXQ:
			result = (VariableKeeper) firstChild.jjtAccept(this, data);
			break;
		case JJTFORCLAUSE:
			assert (childrenNum >= 2);
			// get new context from for clause, we will pass it to let where and
			// return clause after this
			firstContext = (XContext) firstChild.jjtAccept(this, data);
			break;
		case JJTLETCLAUSE:
			assert (childrenNum == 2);
			// get new context from let clause, we will pass it to later clauses
			firstContext = (XContext) firstChild.jjtAccept(this, data);
			break;
		default:
			log.ErrorLog("Encountered unexpected first child:["
					+ jjtNodeName[firstChildId] + "] with children number:<"
					+ childrenNum + "> !");
			break;
		}
		if (childrenNum == 1) {
			return result;
		}

		switch (childrenNum) {
		case 2:
			SimpleNode secondChild = (SimpleNode) node.children[1];
			assert (firstChildId == JJTLETCLAUSE && secondChild.id == JJTXQ);
			result = (VariableKeeper) secondChild.jjtAccept(this, firstContext);
			return result;
		case 3:
			secondChild = (SimpleNode) node.children[1];
			int secondChildId = secondChild.getId();
			SimpleNode thirdChild = (SimpleNode) node.children[2];
			int thirdChildId = thirdChild.getId();
			switch (secondChildId) {
			case JJTSINGLESLASH:
			case JJTDOUBLESLASH:
				assert (thirdChildId == JJTRP);
				int opeartion = secondChildId == JJTSINGLESLASH ? DomOperations.RP_SIMPLE_FETCH
						: DomOperations.RP_RECURSIVE_FETCH;
				VariableKeeper tmpResult = ((AST_RP) thirdChild)
						.EvaluateRPUnderVariable(result, (AST_RP) thirdChild,
								opeartion);
				return tmpResult;
			case JJTCOMMA:
				assert (thirdChildId == JJTXQ);
				// with comma, the xq on the left of comma and right of comma
				// should be evaluated under the same context, thus pass data as
				// parameter
				VariableKeeper result2 = (VariableKeeper) thirdChild.jjtAccept(
						this, data);
				// TODO: do unique here
				break;
			default:
				break;
			}

			break;
		case 4:
			secondChild = (SimpleNode) node.children[1];
			thirdChild = (SimpleNode) node.children[2];
			SimpleNode fourthChild = (SimpleNode) node.children[3];
			break;
		default:
			break;
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_FORCLAUSE,
	 * java.lang.Object)
	 */
	@Override
	public Object visit(AST_FORCLAUSE node, Object data) {
		log.RegularLog("Visit: AST_FORCLAUSE" + " <" + node.jjtGetNumChildren()
				+ ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_LETCLAUSE,
	 * java.lang.Object)
	 */
	@Override
	public Object visit(AST_LETCLAUSE node, Object data) {
		log.RegularLog("Visit: AST_LETCLAUSE" + " <" + node.jjtGetNumChildren()
				+ ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_WHERECLAUSE,
	 * java.lang.Object)
	 */
	@Override
	public Object visit(AST_WHERECLAUSE node, Object data) {
		log.RegularLog("Visit: AST_WHERECLAUSE" + " <"
				+ node.jjtGetNumChildren() + ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_RETURNCLAUSE,
	 * java.lang.Object)
	 */
	@Override
	public Object visit(AST_RETURNCLAUSE node, Object data) {
		log.RegularLog("Visit: AST_RETURNCLAUSE" + " <"
				+ node.jjtGetNumChildren() + ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_COND, java.lang.Object)
	 */
	@Override
	public Object visit(AST_COND node, Object data) {
		log.RegularLog("Visit: AST_COND" + " <" + node.jjtGetNumChildren()
				+ ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_FILENAME,
	 * java.lang.Object)
	 */
	@Override
	public Object visit(AST_FILENAME node, Object data) {
		log.RegularLog("Visit: AST_FILENAME" + " <" + node.jjtGetNumChildren()
				+ ">");
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_VAR, java.lang.Object)
	 */
	@Override
	public Object visit(AST_VAR node, Object data) {
		log.RegularLog("Visit: AST_VAR" + " <" + node.jjtGetNumChildren() + ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_STRING,
	 * java.lang.Object)
	 */
	@Override
	public Object visit(AST_STRING node, Object data) {
		log.RegularLog("Visit: AST_STRING" + " <" + node.jjtGetNumChildren()
				+ ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_TAGNAME,
	 * java.lang.Object)
	 */
	@Override
	public Object visit(AST_TAGNAME node, Object data) {
		log.RegularLog("Visit: AST_TAGNAME" + " <" + node.jjtGetNumChildren()
				+ ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public Object visit(AST_DoubleSlash node, Object data) {
		log.RegularLog("Visit: AST_DoubleSlash" + " <"
				+ node.jjtGetNumChildren() + ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public Object visit(AST_RP2 node, Object data) {
	 * log.RegularLog("Visit: AST_RP2" + " <" + node.jjtGetNumChildren() + ">");
	 * data = node.childrenAccept(this, data); // TODO Auto-generated method
	 * stub return null; }
	 */
	@Override
	public Object visit(AST_SingleSlash node, Object data) {
		log.RegularLog("Visit: AST_SingleSlash" + " <"
				+ node.jjtGetNumChildren() + ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(AST_Comma node, Object data) {
		log.RegularLog("Visit: AST_Comma" + " <" + node.jjtGetNumChildren()
				+ ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(AST_Star node, Object data) {
		log.RegularLog("Visit: AST_Star" + " <" + node.jjtGetNumChildren()
				+ ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(AST_Dot node, Object data) {
		log.RegularLog("Visit: AST_Dot" + " <" + node.jjtGetNumChildren() + ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(AST_DDot node, Object data) {
		log.RegularLog("Visit: AST_DDot" + " <" + node.jjtGetNumChildren()
				+ ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(AST_Txt node, Object data) {
		log.RegularLog("Visit: AST_Txt" + " <" + node.jjtGetNumChildren() + ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(AST_Eq node, Object data) {
		log.RegularLog("Visit: AST_Eq" + " <" + node.jjtGetNumChildren() + ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(AST_Is node, Object data) {
		log.RegularLog("Visit: AST_Is" + " <" + node.jjtGetNumChildren() + ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(AST_Not node, Object data) {
		log.RegularLog("Visit: AST_Not" + " <" + node.jjtGetNumChildren() + ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(AST_And node, Object data) {
		log.RegularLog("Visit: AST_And" + " <" + node.jjtGetNumChildren() + ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(AST_Or node, Object data) {
		log.RegularLog("Visit: AST_Or" + " <" + node.jjtGetNumChildren() + ">");
		data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return null;
	}

}
