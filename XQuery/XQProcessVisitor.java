/**
 * 
 */
package XQuery;
import org.apache.xerces.parsers.DOMParser;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
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
public class XQProcessVisitor implements XQueryParserVisitor {

    public    DebugLogger log;

    public Node root; 
    
    public XQProcessVisitor() {
    	log = new DebugLogger("XQProcessVisitor");
	}   

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.SimpleNode, java.lang.Object)
	 */
	@Override
	public Object visit(SimpleNode node, Object data) {
        log.RegularLog("SimpleNode, only called when the node is not implemented");
        data = node.childrenAccept(this,data);
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_Root, java.lang.Object)
	 */
	@Override
	public Object visit(AST_Root node, Object data) {
        log.RegularLog("Visit: AST_Root");        
        data = node.childrenAccept(this,data);
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_AP, java.lang.Object)
	 */
	@Override
	public Object visit(AST_AP node, Object data) {
        log.RegularLog("Visit: AST_AP");
        
         
        
        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_PF, java.lang.Object)
	 */
	@Override
	public Object visit(AST_PF node, Object data) {
        log.RegularLog("Visit: ASP_PF");
        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_RP, java.lang.Object)
	 */
	@Override
	public Object visit(AST_RP node, Object data) {
        log.RegularLog("Visit: AST_RP");
        for(int i = 0; i < node.jjtGetNumChildren();i++){
        	log.RegularLog(node.children[i].getText());
        }
        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_XQ, java.lang.Object)
	 */
	@Override
	public Object visit(AST_XQ node, Object data) {
        log.RegularLog("Visit: AST_XQ");
        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_FORCLAUSE, java.lang.Object)
	 */
	@Override
	public Object visit(AST_FORCLAUSE node, Object data) {
        log.RegularLog("Visit: AST_FORCLAUSE");
        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_LETCLAUSE, java.lang.Object)
	 */
	@Override
	public Object visit(AST_LETCLAUSE node, Object data) {
        log.RegularLog("Visit: AST_LETCLAUSE");
        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_WHERECLAUSE, java.lang.Object)
	 */
	@Override
	public Object visit(AST_WHERECLAUSE node, Object data) {
        log.RegularLog("Visit: AST_WHERECLAUSE");
        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_RETURNCLAUSE, java.lang.Object)
	 */
	@Override
	public Object visit(AST_RETURNCLAUSE node, Object data) {
        log.RegularLog("Visit: AST_RETURNCLAUSE");
        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_COND, java.lang.Object)
	 */
	@Override
	public Object visit(AST_COND node, Object data) {
        log.RegularLog("Visit: AST_COND");
        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_FILENAME, java.lang.Object)
	 */
	@Override
	public Object visit(AST_FILENAME node, Object data) {
        log.RegularLog("Visit: AST_FILENAME");
        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_VAR, java.lang.Object)
	 */
	@Override
	public Object visit(AST_VAR node, Object data) {
        log.RegularLog("Visit: AST_VAR");
        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_STRING, java.lang.Object)
	 */
	@Override
	public Object visit(AST_STRING node, Object data) {
        log.RegularLog("Visit: AST_STRING");
        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return data;
	}

	/* (non-Javadoc)
	 * @see XQuery.XQueryParserVisitor#visit(XQuery.AST_TAGNAME, java.lang.Object)
	 */
	@Override
	public Object visit(AST_TAGNAME node, Object data) {
        log.RegularLog("Visit: AST_TAGNAME");
        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public Object visit(AST_OneSlash node, Object data) {
		 log.RegularLog("Visit: AST_OneSlash");
	        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(AST_DoubleSlash node, Object data) {
		 log.RegularLog("Visit: AST_DoubleSlash");
	        data = node.childrenAccept(this,data);
		// TODO Auto-generated method stub
		return null;
	}

}
