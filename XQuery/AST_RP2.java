/* Generated By:JJTree: Do not edit this line. AST_RP2.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST_,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package XQuery;

public
class AST_RP2 extends SimpleNode {
  public AST_RP2(int id) {
    super(id);
  }

  public AST_RP2(XQueryParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XQueryParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a305c99e9597f5acc0f7b8d92eba5154 (do not edit this line) */
