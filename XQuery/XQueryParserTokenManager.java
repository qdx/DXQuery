/* Generated By:JJTree&JavaCC: Do not edit this line. XQueryParserTokenManager.java */
package XQuery;

/** Token Manager. */
public class XQueryParserTokenManager implements XQueryParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
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
      case 9:
         jjmatchedKind = 14;
         return jjMoveNfa_0(1, 0);
      case 10:
         jjmatchedKind = 15;
         return jjMoveNfa_0(1, 0);
      case 13:
         jjmatchedKind = 16;
         return jjMoveNfa_0(1, 0);
      case 32:
         jjmatchedKind = 13;
         return jjMoveNfa_0(1, 0);
      case 34:
         return jjMoveStringLiteralDfa1_0(0x4L);
      case 40:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x2L);
      case 41:
         jjmatchedKind = 4;
         return jjMoveNfa_0(1, 0);
      case 42:
         jjmatchedKind = 33;
         return jjMoveNfa_0(1, 0);
      case 44:
         jjmatchedKind = 7;
         return jjMoveNfa_0(1, 0);
      case 46:
         jjmatchedKind = 34;
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 47:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 60:
         jjmatchedKind = 8;
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 62:
         jjmatchedKind = 9;
         return jjMoveNfa_0(1, 0);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x18000000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 91:
         jjmatchedKind = 5;
         return jjMoveNfa_0(1, 0);
      case 93:
         jjmatchedKind = 6;
         return jjMoveNfa_0(1, 0);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x18000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 123:
         jjmatchedKind = 10;
         return jjMoveNfa_0(1, 0);
      case 125:
         jjmatchedKind = 11;
         return jjMoveNfa_0(1, 0);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 0);
   }
   switch(curChar)
   {
      case 34:
         if ((active0 & 0x2L) != 0L)
         {
            jjmatchedKind = 1;
            jjmatchedPos = 1;
         }
         break;
      case 41:
         if ((active0 & 0x4L) != 0L)
         {
            jjmatchedKind = 2;
            jjmatchedPos = 1;
         }
         break;
      case 46:
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 1;
         }
         break;
      case 47:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 1;
         }
         break;
      case 61:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 1;
         }
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x8a0000L);
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 77:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 78:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x88200000L);
      case 82:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 1;
         }
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8a0000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 110:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x88200000L);
      case 114:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 1;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(1, 1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 1);
   }
   switch(curChar)
   {
      case 68:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 2;
         }
         break;
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 77:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 80:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 82:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 2;
         }
         break;
      case 84:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x10800000L);
      case 88:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 100:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 2;
         }
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 114:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 2;
         }
         break;
      case 116:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x10800000L);
      case 120:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      default :
         break;
   }
   return jjMoveNfa_0(1, 2);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 2);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 3;
         }
         break;
      case 73:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000L);
      case 82:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 84:
         return jjMoveStringLiteralDfa4_0(active0, 0x4080000L);
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 101:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 3;
         }
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x4080000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      default :
         break;
   }
   return jjMoveNfa_0(1, 3);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 3);
   }
   switch(curChar)
   {
      case 40:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 69:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 4;
         }
         break;
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 83:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L);
      case 89:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 4;
         }
         break;
      case 101:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 4;
         }
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L);
      case 121:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 4;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(1, 4);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 4);
   }
   switch(curChar)
   {
      case 41:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 5;
         }
         break;
      case 70:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000L);
      case 78:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 5;
         }
         break;
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000L);
      case 110:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(1, 5);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 5);
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000L);
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjMoveNfa_0(1, 6);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 6);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 6);
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa8_0(active0, 0x10000000L);
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjMoveNfa_0(1, 7);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 7);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 7);
   }
   switch(curChar)
   {
      case 83:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 8;
         }
         break;
      case 115:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 8;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(1, 8);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 29;
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
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(7, 11);
                  else if (curChar == 36)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if (curChar == 34)
                     jjCheckNAdd(13);
                  else if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 5;
                  if (curChar == 61)
                  {
                     if (kind > 24)
                        kind = 24;
                  }
                  break;
               case 2:
                  if (curChar == 61 && kind > 24)
                     kind = 24;
                  break;
               case 5:
                  if (curChar == 61 && kind > 25)
                     kind = 25;
                  break;
               case 6:
                  if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(7, 11);
                  break;
               case 11:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 34)
                     jjCheckNAdd(13);
                  break;
               case 13:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(13, 14);
                  break;
               case 14:
                  if (curChar == 34 && kind > 39)
                     kind = 39;
                  break;
               case 15:
                  if (curChar == 36)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjstateSet[jjnewStateCnt++] = 17;
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
               case 1:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(7, 11);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(18);
                  }
                  if ((0x1000000010L & l) != 0L)
                     jjAddStates(0, 1);
                  else if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  else if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if ((0x2000000020000L & l) != 0L && kind > 24)
                     kind = 24;
                  break;
               case 3:
                  if ((0x8000000080000L & l) != 0L && kind > 25)
                     kind = 25;
                  break;
               case 4:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 7:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(7, 11);
                  break;
               case 8:
                  if (curChar == 108 && kind > 38)
                     kind = 38;
                  break;
               case 9:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 120)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 13:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjAddStates(2, 3);
                  break;
               case 16:
               case 17:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAdd(17);
                  break;
               case 18:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(18);
                  break;
               case 19:
                  if ((0x1000000010L & l) != 0L)
                     jjAddStates(0, 1);
                  break;
               case 20:
                  if ((0x800000008L & l) != 0L && kind > 18)
                     kind = 18;
                  break;
               case 21:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if ((0x10000000100000L & l) != 0L && kind > 18)
                     kind = 18;
                  break;
               case 23:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if ((0x200000002000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if ((0x800000008L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 27;
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
               case 13:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 3);
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
      if ((i = jjnewStateCnt) == (startsAt = 29 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static final int[] jjnextStates = {
   21, 28, 13, 14, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\50\42", "\42\51", "\50", "\51", "\133", "\135", "\54", "\74", "\76", 
"\173", "\175", "\74\57", null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, "\72\75", "\52", "\56", 
"\56\56", "\57", "\57\57", null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3fffffe1fffL, 
};
static final long[] jjtoSkip = {
   0x1e000L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[29];
private final int[] jjstateSet = new int[58];
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
   for (i = 29; i-- > 0;)
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
