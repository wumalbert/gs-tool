/*
 * Copyright 2006 - 2011 
 *     Julien Baudry	<julien.baudry@graphstream-project.org>
 *     Antoine Dutot	<antoine.dutot@graphstream-project.org>
 *     Yoann Pigné		<yoann.pigne@graphstream-project.org>
 *     Guilhelm Savin	<guilhelm.savin@graphstream-project.org>
 * 
 * This file is part of GraphStream <http://graphstream-project.org>.
 * 
 * GraphStream is a library whose purpose is to handle static or dynamic
 * graph, create them from scratch, file or any source and display them.
 * 
 * This program is free software distributed under the terms of two licenses, the
 * CeCILL-C license that fits European law, and the GNU Lesser General Public
 * License. You can  use, modify and/ or redistribute the software under the terms
 * of the CeCILL-C license as circulated by CEA, CNRS and INRIA at the following
 * URL <http://www.cecill.info> or under the terms of the GNU LGPL as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C and LGPL licenses and that you accept their terms.
 */
package org.graphstream.tool.workbench.cli;
import org.graphstream.graph.Node;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.tool.workbench.cli.CLIContext.ConnectionMode;
import org.graphstream.stream.Source;
import org.graphstream.stream.Sink;
import org.graphstream.stream.file.FileSource;
import org.graphstream.algorithm.generator.Generator;
import java.io.FileInputStream;
import java.io.Reader;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.net.MalformedURLException;
import java.net.URL;
import java.lang.reflect.Constructor;

/** Token Manager. */
public class CLIParserTokenManager implements CLIParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7ffff7fffffe800L) != 0L)
         {
            jjmatchedKind = 61;
            return 41;
         }
         return -1;
      case 1:
         if ((active0 & 0x10003983000000L) != 0L)
            return 41;
         if ((active0 & 0x7efff467cffe800L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 61;
               jjmatchedPos = 1;
            }
            return 41;
         }
         return -1;
      case 2:
         if ((active0 & 0x20031100c480800L) != 0L)
            return 41;
         if ((active0 & 0x5efce4672b7e000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 61;
               jjmatchedPos = 2;
            }
            return 41;
         }
         return -1;
      case 3:
         if ((active0 & 0xcd464412100000L) != 0L)
            return 41;
         if ((active0 & 0x522880268a7e000L) != 0L)
         {
            jjmatchedKind = 61;
            jjmatchedPos = 3;
            return 41;
         }
         return -1;
      case 4:
         if ((active0 & 0x120000040008000L) != 0L)
            return 41;
         if ((active0 & 0x402880228a76000L) != 0L)
         {
            jjmatchedKind = 61;
            jjmatchedPos = 4;
            return 41;
         }
         return -1;
      case 5:
         if ((active0 & 0x2880000830000L) != 0L)
            return 41;
         if ((active0 & 0x400000228246000L) != 0L)
         {
            jjmatchedKind = 61;
            jjmatchedPos = 5;
            return 41;
         }
         return -1;
      case 6:
         if ((active0 & 0x400000008240000L) != 0L)
            return 41;
         if ((active0 & 0x220006000L) != 0L)
         {
            jjmatchedKind = 61;
            jjmatchedPos = 6;
            return 41;
         }
         return -1;
      case 7:
         if ((active0 & 0x200000000L) != 0L)
            return 41;
         if ((active0 & 0x20006000L) != 0L)
         {
            jjmatchedKind = 61;
            jjmatchedPos = 7;
            return 41;
         }
         return -1;
      case 8:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 61;
            jjmatchedPos = 8;
            return 41;
         }
         if ((active0 & 0x20002000L) != 0L)
            return 41;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
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
      case 38:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 40:
         return jjStopAtPos(0, 9);
      case 41:
         return jjStopAtPos(0, 10);
      case 44:
         return jjStopAtPos(0, 65);
      case 59:
         return jjStopAtPos(0, 59);
      case 61:
         return jjStopAtPos(0, 67);
      case 62:
         return jjStopAtPos(0, 69);
      case 64:
         return jjStopAtPos(0, 68);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x6800L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x70000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x400000000080000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x80000000f00000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x1f000000L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x200000060000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x180000000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x30400000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x7800000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x1c0000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x3e00000000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x1c000000000000L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x120000000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x40000000000000L);
      case 123:
         return jjStopAtPos(0, 64);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 125:
         return jjStopAtPos(0, 66);
      default :
         return jjMoveNfa_0(10, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, 0L);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(1, 12);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L);
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x100800L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x2042d0420088000L);
      case 102:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(1, 31, 41);
         else if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000010000L);
      case 105:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x440400002000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 110:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(1, 32, 41);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 37, 41);
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000400000L);
      case 111:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 52, 41);
         return jjMoveStringLiteralDfa2_0(active0, 0x82000c000000L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x50020000L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x3000000002000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000044000L);
      case 118:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000000L);
      case 124:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, 0L);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x40040010000L);
      case 100:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(2, 11, 41);
         else if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(2, 22, 41);
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x9004000a20000L);
      case 102:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 41);
         break;
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x108000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0xa0000000000000L);
      case 108:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(2, 19, 41);
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      case 110:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 44, 41);
         return jjMoveStringLiteralDfa3_0(active0, 0x400020000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 114:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x2000008040000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x504000000000000L);
      case 116:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 45, 41);
         else if ((active0 & 0x200000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 57, 41);
         return jjMoveStringLiteralDfa3_0(active0, 0x40000200006000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000000L);
      case 119:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 41);
         break;
      case 120:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 100:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 42, 41);
         break;
      case 101:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 41);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 25, 41);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 41, 41);
         return jjMoveStringLiteralDfa4_0(active0, 0x102000028000000L);
      case 104:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 54, 41);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 107:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 46, 41);
         break;
      case 109:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 28, 41);
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 110:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 38, 41);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 51, 41);
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000810000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000004000L);
      case 112:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 48, 41);
         return jjMoveStringLiteralDfa4_0(active0, 0x400000040000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000042000L);
      case 116:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 41);
         else if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 50, 41);
         else if ((active0 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 55, 41);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000008000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x240000L);
      case 103:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 53, 41);
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 104:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(4, 30, 41);
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000004000L);
      case 110:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 41);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000L);
      case 116:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 56, 41);
         return jjMoveStringLiteralDfa5_0(active0, 0x820000L);
      case 118:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000020004000L);
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 101:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(5, 16, 41);
         else if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(5, 17, 41);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 43, 41);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 47, 41);
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 109:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 49, 41);
         break;
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x240000L);
      case 115:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 41);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 104:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(6, 27, 41);
         break;
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000L);
      case 116:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(6, 18, 41);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(6, 21, 41);
         return jjMoveStringLiteralDfa7_0(active0, 0x20000000L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000L);
      case 121:
         if ((active0 & 0x400000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 58, 41);
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 103:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(7, 33, 41);
         break;
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x20004000L);
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(8, 13, 41);
         break;
      case 114:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(8, 29, 41);
         break;
      case 117:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0, 0L);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0, 0L);
      return 9;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(9, 14, 41);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0, 0L);
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
   jjnewStateCnt = 41;
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
               case 10:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 45)
                     jjAddStates(3, 5);
                  else if (curChar == 33)
                     jjAddStates(6, 7);
                  else if (curChar == 60)
                     jjAddStates(8, 9);
                  else if (curChar == 39)
                     jjCheckNAddTwoStates(15, 16);
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(12, 13);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 48)
                     jjCheckNAdd(1);
                  if (curChar == 45)
                     jjAddStates(10, 11);
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(37, 38);
                  else if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 39;
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 61)
                        kind = 61;
                     jjCheckNAdd(36);
                  }
                  break;
               case 0:
                  if (curChar == 48)
                     jjCheckNAdd(1);
                  break;
               case 1:
                  if (curChar == 46)
                     jjCheckNAdd(2);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAddTwoStates(2, 3);
                  break;
               case 4:
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(6);
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(6);
                  break;
               case 7:
                  if (curChar == 47)
                     jjCheckNAddTwoStates(8, 9);
                  break;
               case 8:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(8, 9);
                  break;
               case 9:
                  if ((0x2400L & l) != 0L && kind > 8)
                     kind = 8;
                  break;
               case 11:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(12, 13);
                  break;
               case 12:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(12, 13);
                  break;
               case 13:
                  if (curChar == 34 && kind > 60)
                     kind = 60;
                  break;
               case 14:
                  if (curChar == 39)
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 15:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 16:
                  if (curChar == 39 && kind > 60)
                     kind = 60;
                  break;
               case 17:
                  if (curChar == 45)
                     jjAddStates(10, 11);
                  break;
               case 18:
                  if (curChar == 62 && kind > 63)
                     kind = 63;
                  break;
               case 19:
               case 25:
                  if (curChar == 45)
                     jjCheckNAdd(18);
                  break;
               case 20:
                  if (curChar == 33 && kind > 63)
                     kind = 63;
                  break;
               case 21:
               case 28:
                  if (curChar == 45)
                     jjCheckNAdd(20);
                  break;
               case 22:
                  if (curChar == 60)
                     jjAddStates(8, 9);
                  break;
               case 23:
                  if (curChar == 45 && kind > 63)
                     kind = 63;
                  break;
               case 24:
               case 27:
                  if (curChar == 45)
                     jjCheckNAdd(23);
                  break;
               case 26:
                  if (curChar == 33)
                     jjAddStates(6, 7);
                  break;
               case 29:
                  if (curChar == 45)
                     jjAddStates(3, 5);
                  break;
               case 30:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(31);
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(31);
                  break;
               case 32:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(33, 1);
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(33, 1);
                  break;
               case 34:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddStates(0, 2);
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 61)
                     kind = 61;
                  jjCheckNAdd(36);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(37, 38);
                  break;
               case 38:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 62)
                     kind = 62;
                  jjCheckNAddTwoStates(38, 40);
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
               case 10:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 61)
                     kind = 61;
                  jjCheckNAddStates(12, 14);
                  break;
               case 41:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(37, 38);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 61)
                        kind = 61;
                     jjCheckNAdd(36);
                  }
                  break;
               case 3:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(15, 16);
                  break;
               case 8:
                  jjAddStates(17, 18);
                  break;
               case 12:
                  jjAddStates(19, 20);
                  break;
               case 15:
                  jjAddStates(21, 22);
                  break;
               case 36:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 61)
                     kind = 61;
                  jjCheckNAdd(36);
                  break;
               case 37:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(37, 38);
                  break;
               case 39:
               case 40:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 62)
                     kind = 62;
                  jjCheckNAddTwoStates(38, 40);
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
               case 8:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(17, 18);
                  break;
               case 12:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(19, 20);
                  break;
               case 15:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(21, 22);
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
      if ((i = jjnewStateCnt) == (startsAt = 41 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   31, 33, 1, 30, 32, 0, 27, 28, 24, 25, 19, 21, 36, 37, 38, 4, 
   5, 8, 9, 12, 13, 15, 16, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\50", "\51", 
"\141\144\144", "\46\46", "\141\164\164\162\151\142\165\164\145", 
"\141\165\164\157\154\141\171\157\165\164", "\142\145\147\151\156", "\143\150\141\156\147\145", 
"\143\162\145\141\164\145", "\143\165\162\162\145\156\164", "\144\145\154", "\145\144\147\145", 
"\145\154\145\155\145\156\164", "\145\156\144", "\145\166\145\156\164\163", "\146\151", "\146\151\154\145", 
"\146\157\162", "\146\157\162\145\141\143\150", "\146\162\157\155", 
"\147\145\156\145\162\141\164\157\162", "\147\162\141\160\150", "\151\146", "\151\156", 
"\155\141\164\143\150\151\156\147", "\156\145\170\164", "\157\146", "\157\146\146", "\157\156", 
"\157\160\145\156", "\174\174", "\156\145\167", "\156\157\144\145", "\162\145\141\144", 
"\162\145\155\157\166\145", "\162\165\156", "\163\145\164", "\163\151\156\153", 
"\163\157\165\162\143\145", "\163\164\145\160", "\163\164\162\145\141\155", "\164\145\163\164", 
"\164\150\145\156", "\164\157", "\165\163\151\156\147", "\167\151\164\150", "\145\170\151\164", 
"\165\156\163\145\164", "\147\145\164", "\144\151\163\160\154\141\171", "\73", null, null, null, null, 
"\173", "\54", "\175", "\75", "\100", "\76", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffffffffff61L, 0x3fL, 
};
static final long[] jjtoSkip = {
   0x1eL, 0x0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[41];
private final int[] jjstateSet = new int[82];
protected char curChar;
/** Constructor. */
public CLIParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public CLIParserTokenManager(SimpleCharStream stream, int lexState){
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
   for (i = 41; i-- > 0;)
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

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
