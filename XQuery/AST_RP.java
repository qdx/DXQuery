/* Generated By:JJTree: Do not edit this line. AST_RP.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST_,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package XQuery;

public
class AST_RP extends SimpleNode {
  public AST_RP(int id) {
    super(id);
  }

  public AST_RP(XQueryParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XQueryParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e206f3b0715eb7e4875621802238ab3b (do not edit this line) */
