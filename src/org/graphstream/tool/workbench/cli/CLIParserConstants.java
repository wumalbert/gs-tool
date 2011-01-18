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


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface CLIParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int INT = 5;
  /** RegularExpression Id. */
  int REAL = 6;
  /** RegularExpression Id. */
  int EOL = 7;
  /** RegularExpression Id. */
  int COMMENT = 8;
  /** RegularExpression Id. */
  int LPAREN = 9;
  /** RegularExpression Id. */
  int RPAREN = 10;
  /** RegularExpression Id. */
  int ADD = 11;
  /** RegularExpression Id. */
  int AND = 12;
  /** RegularExpression Id. */
  int ATTRIBUTE = 13;
  /** RegularExpression Id. */
  int AUTOLAYOUT = 14;
  /** RegularExpression Id. */
  int BEGIN = 15;
  /** RegularExpression Id. */
  int CHANGE = 16;
  /** RegularExpression Id. */
  int CREATE = 17;
  /** RegularExpression Id. */
  int CURRENT = 18;
  /** RegularExpression Id. */
  int DEL = 19;
  /** RegularExpression Id. */
  int EDGE = 20;
  /** RegularExpression Id. */
  int ELEMENT = 21;
  /** RegularExpression Id. */
  int END = 22;
  /** RegularExpression Id. */
  int EVENTS = 23;
  /** RegularExpression Id. */
  int FI = 24;
  /** RegularExpression Id. */
  int FILE = 25;
  /** RegularExpression Id. */
  int FOR = 26;
  /** RegularExpression Id. */
  int FOREACH = 27;
  /** RegularExpression Id. */
  int FROM = 28;
  /** RegularExpression Id. */
  int GENERATOR = 29;
  /** RegularExpression Id. */
  int GRAPH = 30;
  /** RegularExpression Id. */
  int IF = 31;
  /** RegularExpression Id. */
  int IN = 32;
  /** RegularExpression Id. */
  int MATCHING = 33;
  /** RegularExpression Id. */
  int NEXT = 34;
  /** RegularExpression Id. */
  int OF = 35;
  /** RegularExpression Id. */
  int OFF = 36;
  /** RegularExpression Id. */
  int ON = 37;
  /** RegularExpression Id. */
  int OPEN = 38;
  /** RegularExpression Id. */
  int OR = 39;
  /** RegularExpression Id. */
  int NEW = 40;
  /** RegularExpression Id. */
  int NODE = 41;
  /** RegularExpression Id. */
  int READ = 42;
  /** RegularExpression Id. */
  int REMOVE = 43;
  /** RegularExpression Id. */
  int RUN = 44;
  /** RegularExpression Id. */
  int SET = 45;
  /** RegularExpression Id. */
  int SINK = 46;
  /** RegularExpression Id. */
  int SOURCE = 47;
  /** RegularExpression Id. */
  int STEP = 48;
  /** RegularExpression Id. */
  int STREAM = 49;
  /** RegularExpression Id. */
  int TEST = 50;
  /** RegularExpression Id. */
  int THEN = 51;
  /** RegularExpression Id. */
  int TO = 52;
  /** RegularExpression Id. */
  int USING = 53;
  /** RegularExpression Id. */
  int WITH = 54;
  /** RegularExpression Id. */
  int EXIT = 55;
  /** RegularExpression Id. */
  int UNSET = 56;
  /** RegularExpression Id. */
  int GET = 57;
  /** RegularExpression Id. */
  int DISPLAY = 58;
  /** RegularExpression Id. */
  int EOI = 59;
  /** RegularExpression Id. */
  int STRING = 60;
  /** RegularExpression Id. */
  int WORD = 61;
  /** RegularExpression Id. */
  int CLASS = 62;
  /** RegularExpression Id. */
  int STREAM_OP = 63;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "<INT>",
    "<REAL>",
    "<EOL>",
    "<COMMENT>",
    "\"(\"",
    "\")\"",
    "\"add\"",
    "\"&&\"",
    "\"attribute\"",
    "\"autolayout\"",
    "\"begin\"",
    "\"change\"",
    "\"create\"",
    "\"current\"",
    "\"del\"",
    "\"edge\"",
    "\"element\"",
    "\"end\"",
    "\"events\"",
    "\"fi\"",
    "\"file\"",
    "\"for\"",
    "\"foreach\"",
    "\"from\"",
    "\"generator\"",
    "\"graph\"",
    "\"if\"",
    "\"in\"",
    "\"matching\"",
    "\"next\"",
    "\"of\"",
    "\"off\"",
    "\"on\"",
    "\"open\"",
    "\"||\"",
    "\"new\"",
    "\"node\"",
    "\"read\"",
    "\"remove\"",
    "\"run\"",
    "\"set\"",
    "\"sink\"",
    "\"source\"",
    "\"step\"",
    "\"stream\"",
    "\"test\"",
    "\"then\"",
    "\"to\"",
    "\"using\"",
    "\"with\"",
    "\"exit\"",
    "\"unset\"",
    "\"get\"",
    "\"display\"",
    "\";\"",
    "<STRING>",
    "<WORD>",
    "<CLASS>",
    "<STREAM_OP>",
    "\"{\"",
    "\",\"",
    "\"}\"",
    "\"=\"",
    "\"@\"",
    "\">\"",
  };

}
