/* Generated By:JJTree: Do not edit this line. AST_VAR.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST_,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package XQuery;

public
class AST_VAR extends SimpleNode {
  public AST_VAR(int id) {
    super(id);
  }

  public AST_VAR(XQueryParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XQueryParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4bf7269ca7de18af4d6fc2edb714ab21 (do not edit this line) */
