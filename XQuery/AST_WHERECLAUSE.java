/* Generated By:JJTree: Do not edit this line. AST_WHERECLAUSE.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST_,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package XQuery;

public
class AST_WHERECLAUSE extends SimpleNode {
  public AST_WHERECLAUSE(int id) {
    super(id);
  }

  public AST_WHERECLAUSE(XQueryParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XQueryParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a3d9ad234b0141e40b32bd2aa64d80b7 (do not edit this line) */