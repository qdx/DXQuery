/* Generated By:JJTree&JavaCC: Do not edit this line. XQueryParserTokenManager.java */
package XQuery;

/** Token Manager. */
public class XQueryParserTokenManager implements XQueryParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x4L) != 0L)
            return 1;
         if ((active0 & 0x3fc008e32L) != 0L)
         {
            jjmatchedKind = 41;
            return 7;
         }
         return -1;
      case 1:
         if ((active0 & 0x4000830L) != 0L)
            return 7;
         if ((active0 & 0x3f8008602L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
            return 7;
         }
         if ((active0 & 0x4L) != 0L)
            return 2;
         return -1;
      case 2:
         if ((active0 & 0x18000600L) != 0L)
            return 7;
         if ((active0 & 0x3e0008002L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 2;
            return 7;
         }
         if ((active0 & 0x4L) != 0L)
            return 2;
         return -1;
      case 3:
         if ((active0 & 0x100000000L) != 0L)
            return 7;
         if ((active0 & 0x2e0008002L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 3;
            return 7;
         }
         return -1;
      case 4:
         if ((active0 & 0x20000000L) != 0L)
            return 7;
         if ((active0 & 0x2c0000002L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 4;
            return 7;
         }
         if ((active0 & 0x8000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 41;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x40000000L) != 0L)
            return 7;
         if ((active0 & 0x200000002L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 5;
            return 7;
         }
         if ((active0 & 0x8000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 41;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0x200000002L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 6;
            return 7;
         }
         return -1;
      case 7:
         if ((active0 & 0x200000002L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 7;
            return 7;
         }
         return -1;
      case 8:
         if ((active0 & 0x200000000L) != 0L)
            return 7;
         if ((active0 & 0x2L) != 0L)
         {
            if (jjmatchedPos < 7)
            {
               jjmatchedKind = 41;
               jjmatchedPos = 7;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 34:
         return jjMoveStringLiteralDfa1_0(0x4L);
      case 40:
         return jjStopAtPos(0, 7);
      case 41:
         return jjStopAtPos(0, 8);
      case 42:
         return jjStopAtPos(0, 12);
      case 44:
         return jjStopAtPos(0, 19);
      case 46:
         jjmatchedKind = 13;
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 47:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 60:
         jjmatchedKind = 20;
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 61:
         return jjStopAtPos(0, 6);
      case 62:
         return jjStopAtPos(0, 21);
      case 91:
         return jjStopAtPos(0, 17);
      case 93:
         return jjStopAtPos(0, 18);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x2L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x80000010L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x4000020L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x300000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 123:
         return jjStopAtPos(0, 22);
      case 125:
         return jjStopAtPos(0, 23);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 41:
         return jjMoveStringLiteralDfa2_0(active0, 0x4L);
      case 46:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(1, 14);
         break;
      case 47:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      case 61:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 25);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x50008000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 110:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(1, 26, 7);
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x108000202L);
      case 113:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(1, 4, 7);
         break;
      case 114:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(1, 11, 7);
         break;
      case 115:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(1, 5, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(2, 2, 2);
         break;
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x2L);
      case 100:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(2, 10, 7);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 114:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 7);
         break;
      case 116:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 7);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(2, 28, 7);
         return jjMoveStringLiteralDfa3_0(active0, 0x240000000L);
      case 120:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 7);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x80008000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000002L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 40:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 101:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 29, 7);
         break;
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x2L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 121:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(5, 31);
         break;
      case 41:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(5, 15);
         break;
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x2L);
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 110:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(5, 30, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000L);
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x2L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x200000000L);
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x2L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 40:
         return jjMoveStringLiteralDfa9_0(active0, 0x2L);
      case 115:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(8, 33, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 34:
         if ((active0 & 0x2L) != 0L)
            return jjStopAtPos(9, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 12;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(3, 7);
                  else if (curChar == 36)
                     jjstateSet[jjnewStateCnt++] = 9;
                  else if (curChar == 34)
                     jjCheckNAdd(1);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(3, 7);
                  else if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 2:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  else if (curChar == 34)
                  {
                     if (kind > 38)
                        kind = 38;
                  }
                  break;
               case 1:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(3, 7);
                  break;
               case 8:
                  if (curChar == 36)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjstateSet[jjnewStateCnt++] = 10;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(3, 7);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  break;
               case 7:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(3, 7);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  break;
               case 2:
               case 1:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(3, 7);
                  break;
               case 4:
                  if (curChar == 108 && kind > 39)
                     kind = 39;
                  break;
               case 5:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 120)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 9:
               case 10:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAdd(10);
                  break;
               case 11:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 12 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\144\157\143\165\155\145\156\164\50\42", "\42\51\57", "\57", "\145\161", 
"\151\163", "\75", "\50", "\51", "\156\157\164", "\141\156\144", "\157\162", "\52", "\56", 
"\56\56", "\164\145\170\164\50\51", "\57\57", "\133", "\135", "\54", "\74", "\76", 
"\173", "\175", "\74\57", "\72\75", "\151\156", "\146\157\162", "\154\145\164", 
"\167\150\145\162\145", "\162\145\164\165\162\156", "\145\155\160\164\171\50", "\163\157\155\145", 
"\163\141\164\151\163\146\151\145\163", null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3c3ffffffffL, 
};
static final long[] jjtoSkip = {
   0x3c00000000L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[12];
private final int[] jjstateSet = new int[24];
protected char curChar;
/** Constructor. */
public XQueryParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public XQueryParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 12; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
