/* The following code was generated by JFlex 1.7.0 */

import java.util.ArrayList;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>H:/homework 3/Automata/Tee/Lexical.flex</tt>
 */
class LexicalAnalyzer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\6\1\7\1\1\22\0\1\3\1\0\1\17"+
    "\5\0\1\20\1\20\1\5\1\15\1\0\1\16\1\0\1\4\1\12"+
    "\11\11\1\0\1\20\1\13\1\14\1\13\2\0\32\40\4\10\1\40"+
    "\1\10\1\36\2\40\1\31\1\25\1\22\1\40\1\24\1\21\2\40"+
    "\1\27\1\40\1\26\1\33\1\34\1\40\1\35\1\30\1\23\2\40"+
    "\1\32\3\40\12\0\1\6\44\0\1\37\12\0\1\37\4\0\1\37"+
    "\5\0\27\37\1\0\37\37\1\0\u01ca\37\4\0\14\37\16\0\5\37"+
    "\7\0\1\37\1\0\1\37\21\0\165\37\1\0\2\37\2\0\4\37"+
    "\1\0\1\37\6\0\1\37\1\0\3\37\1\0\1\37\1\0\24\37"+
    "\1\0\123\37\1\0\213\37\1\0\255\37\1\0\46\37\2\0\1\37"+
    "\7\0\47\37\11\0\55\37\1\0\1\37\1\0\2\37\1\0\2\37"+
    "\1\0\1\37\10\0\33\37\5\0\3\37\35\0\13\37\5\0\112\37"+
    "\4\0\146\37\1\0\10\37\2\0\12\37\1\0\23\37\2\0\1\37"+
    "\20\0\73\37\2\0\145\37\16\0\66\37\4\0\1\37\5\0\56\37"+
    "\22\0\34\37\104\0\25\37\1\0\10\37\26\0\16\37\1\0\201\37"+
    "\2\0\12\37\1\0\23\37\1\0\10\37\2\0\2\37\2\0\26\37"+
    "\1\0\7\37\1\0\1\37\3\0\4\37\2\0\11\37\2\0\2\37"+
    "\2\0\4\37\10\0\1\37\4\0\2\37\1\0\5\37\2\0\14\37"+
    "\17\0\3\37\1\0\6\37\4\0\2\37\2\0\26\37\1\0\7\37"+
    "\1\0\2\37\1\0\2\37\1\0\2\37\2\0\1\37\1\0\5\37"+
    "\4\0\2\37\2\0\3\37\3\0\1\37\7\0\4\37\1\0\1\37"+
    "\7\0\20\37\13\0\3\37\1\0\11\37\1\0\3\37\1\0\26\37"+
    "\1\0\7\37\1\0\2\37\1\0\5\37\2\0\12\37\1\0\3\37"+
    "\1\0\3\37\2\0\1\37\17\0\4\37\2\0\12\37\11\0\1\37"+
    "\7\0\3\37\1\0\10\37\2\0\2\37\2\0\26\37\1\0\7\37"+
    "\1\0\2\37\1\0\5\37\2\0\11\37\2\0\2\37\2\0\3\37"+
    "\10\0\2\37\4\0\2\37\1\0\5\37\2\0\12\37\1\0\1\37"+
    "\20\0\2\37\1\0\6\37\3\0\3\37\1\0\4\37\3\0\2\37"+
    "\1\0\1\37\1\0\2\37\3\0\2\37\3\0\3\37\3\0\14\37"+
    "\4\0\5\37\3\0\3\37\1\0\4\37\2\0\1\37\6\0\1\37"+
    "\16\0\12\37\20\0\4\37\1\0\10\37\1\0\3\37\1\0\27\37"+
    "\1\0\20\37\3\0\10\37\1\0\3\37\1\0\4\37\7\0\2\37"+
    "\1\0\3\37\5\0\4\37\2\0\12\37\20\0\4\37\1\0\10\37"+
    "\1\0\3\37\1\0\27\37\1\0\12\37\1\0\5\37\2\0\11\37"+
    "\1\0\3\37\1\0\4\37\7\0\2\37\7\0\1\37\1\0\4\37"+
    "\2\0\12\37\1\0\2\37\16\0\3\37\1\0\10\37\1\0\3\37"+
    "\1\0\51\37\2\0\10\37\1\0\3\37\1\0\5\37\5\0\4\37"+
    "\7\0\5\37\2\0\12\37\12\0\6\37\2\0\2\37\1\0\22\37"+
    "\3\0\30\37\1\0\11\37\1\0\1\37\2\0\7\37\3\0\1\37"+
    "\4\0\6\37\1\0\1\37\1\0\10\37\6\0\12\37\2\0\2\37"+
    "\15\0\72\37\5\0\17\37\1\0\12\37\47\0\2\37\1\0\1\37"+
    "\2\0\2\37\1\0\1\37\2\0\1\37\6\0\4\37\1\0\7\37"+
    "\1\0\3\37\1\0\1\37\1\0\1\37\2\0\2\37\1\0\15\37"+
    "\1\0\3\37\2\0\5\37\1\0\1\37\1\0\6\37\2\0\12\37"+
    "\2\0\4\37\40\0\1\37\27\0\2\37\6\0\12\37\13\0\1\37"+
    "\1\0\1\37\1\0\1\37\4\0\12\37\1\0\44\37\4\0\24\37"+
    "\1\0\22\37\1\0\44\37\11\0\1\37\71\0\112\37\6\0\116\37"+
    "\2\0\46\37\1\0\1\37\5\0\1\37\2\0\53\37\1\0\u014d\37"+
    "\1\0\4\37\2\0\7\37\1\0\1\37\1\0\4\37\2\0\51\37"+
    "\1\0\4\37\2\0\41\37\1\0\4\37\2\0\7\37\1\0\1\37"+
    "\1\0\4\37\2\0\17\37\1\0\71\37\1\0\4\37\2\0\103\37"+
    "\2\0\3\37\40\0\20\37\20\0\126\37\2\0\6\37\3\0\u026c\37"+
    "\2\0\21\37\1\0\32\37\5\0\113\37\3\0\13\37\7\0\15\37"+
    "\1\0\7\37\13\0\25\37\13\0\24\37\14\0\15\37\1\0\3\37"+
    "\1\0\2\37\14\0\124\37\3\0\1\37\4\0\2\37\2\0\12\37"+
    "\41\0\3\37\2\0\12\37\6\0\130\37\10\0\53\37\5\0\106\37"+
    "\12\0\37\37\1\0\14\37\4\0\14\37\12\0\50\37\2\0\5\37"+
    "\13\0\54\37\4\0\32\37\6\0\12\37\46\0\34\37\4\0\77\37"+
    "\1\0\35\37\2\0\13\37\6\0\12\37\15\0\1\37\10\0\17\37"+
    "\101\0\114\37\4\0\12\37\21\0\11\37\14\0\164\37\14\0\70\37"+
    "\10\0\12\37\3\0\61\37\2\0\11\37\107\0\3\37\1\0\43\37"+
    "\1\0\2\37\6\0\366\37\5\0\u011b\37\2\0\6\37\2\0\46\37"+
    "\2\0\6\37\2\0\10\37\1\0\1\37\1\0\1\37\1\0\1\37"+
    "\1\0\37\37\2\0\65\37\1\0\7\37\1\0\1\37\3\0\3\37"+
    "\1\0\7\37\3\0\4\37\2\0\6\37\4\0\15\37\5\0\3\37"+
    "\1\0\7\37\53\0\1\6\1\6\25\0\2\37\23\0\1\37\34\0"+
    "\1\37\15\0\1\37\20\0\15\37\63\0\41\37\21\0\1\37\4\0"+
    "\1\37\2\0\12\37\1\0\1\37\3\0\5\37\6\0\1\37\1\0"+
    "\1\37\1\0\1\37\1\0\4\37\1\0\13\37\2\0\4\37\5\0"+
    "\5\37\4\0\1\37\21\0\51\37\u032d\0\64\37\u0716\0\57\37\1\0"+
    "\57\37\1\0\205\37\6\0\11\37\14\0\46\37\1\0\1\37\5\0"+
    "\1\37\2\0\70\37\7\0\1\37\17\0\30\37\11\0\7\37\1\0"+
    "\7\37\1\0\7\37\1\0\7\37\1\0\7\37\1\0\7\37\1\0"+
    "\7\37\1\0\7\37\1\0\40\37\57\0\1\37\u01d5\0\3\37\31\0"+
    "\17\37\1\0\5\37\2\0\5\37\4\0\126\37\2\0\2\37\2\0"+
    "\3\37\1\0\132\37\1\0\4\37\5\0\51\37\3\0\136\37\21\0"+
    "\33\37\65\0\20\37\u0200\0\u19b6\37\112\0\u51d6\37\52\0\u048d\37\103\0"+
    "\56\37\2\0\u010d\37\3\0\34\37\24\0\63\37\1\0\12\37\1\0"+
    "\163\37\45\0\11\37\2\0\147\37\2\0\44\37\1\0\10\37\77\0"+
    "\61\37\30\0\64\37\14\0\106\37\12\0\12\37\6\0\30\37\3\0"+
    "\1\37\1\0\1\37\2\0\56\37\2\0\44\37\14\0\35\37\3\0"+
    "\101\37\16\0\13\37\6\0\37\37\1\0\67\37\11\0\16\37\2\0"+
    "\12\37\6\0\27\37\3\0\111\37\30\0\3\37\2\0\20\37\2\0"+
    "\5\37\12\0\6\37\2\0\6\37\2\0\6\37\11\0\7\37\1\0"+
    "\7\37\1\0\53\37\1\0\12\37\12\0\173\37\1\0\2\37\2\0"+
    "\12\37\6\0\u2ba4\37\14\0\27\37\4\0\61\37\u2104\0\u016e\37\2\0"+
    "\152\37\46\0\7\37\14\0\5\37\5\0\14\37\1\0\15\37\1\0"+
    "\5\37\1\0\1\37\1\0\2\37\1\0\2\37\1\0\154\37\41\0"+
    "\u016b\37\22\0\100\37\2\0\66\37\50\0\14\37\4\0\20\37\20\0"+
    "\20\37\3\0\2\37\30\0\3\37\40\0\5\37\1\0\207\37\23\0"+
    "\12\37\7\0\32\37\4\0\1\37\1\0\32\37\13\0\131\37\3\0"+
    "\6\37\2\0\6\37\2\0\6\37\2\0\3\37\43\0\14\37\1\0"+
    "\32\37\1\0\23\37\1\0\2\37\1\0\17\37\2\0\16\37\42\0"+
    "\173\37\105\0\65\37\210\0\1\37\202\0\35\37\3\0\61\37\17\0"+
    "\1\37\37\0\40\37\20\0\33\37\5\0\53\37\5\0\36\37\2\0"+
    "\44\37\4\0\10\37\1\0\5\37\52\0\236\37\2\0\12\37\6\0"+
    "\44\37\4\0\44\37\4\0\50\37\10\0\64\37\234\0\u0137\37\11\0"+
    "\26\37\12\0\10\37\230\0\6\37\2\0\1\37\1\0\54\37\1\0"+
    "\2\37\3\0\1\37\2\0\27\37\12\0\27\37\11\0\37\37\101\0"+
    "\23\37\1\0\2\37\12\0\26\37\12\0\32\37\106\0\70\37\6\0"+
    "\2\37\100\0\4\37\1\0\2\37\5\0\10\37\1\0\3\37\1\0"+
    "\33\37\4\0\3\37\4\0\1\37\40\0\35\37\3\0\35\37\43\0"+
    "\10\37\1\0\36\37\31\0\66\37\12\0\26\37\12\0\23\37\15\0"+
    "\22\37\156\0\111\37\67\0\63\37\15\0\63\37\u030d\0\107\37\37\0"+
    "\12\37\17\0\74\37\25\0\31\37\7\0\12\37\6\0\65\37\1\0"+
    "\12\37\20\0\44\37\2\0\1\37\11\0\105\37\5\0\3\37\3\0"+
    "\13\37\1\0\1\37\43\0\22\37\1\0\45\37\6\0\1\37\101\0"+
    "\7\37\1\0\1\37\1\0\4\37\1\0\17\37\1\0\12\37\7\0"+
    "\73\37\5\0\12\37\6\0\4\37\1\0\10\37\2\0\2\37\2\0"+
    "\26\37\1\0\7\37\1\0\2\37\1\0\5\37\2\0\11\37\2\0"+
    "\2\37\2\0\3\37\2\0\1\37\6\0\1\37\5\0\7\37\2\0"+
    "\7\37\3\0\5\37\213\0\113\37\5\0\12\37\46\0\106\37\1\0"+
    "\1\37\10\0\12\37\246\0\66\37\2\0\11\37\27\0\6\37\42\0"+
    "\101\37\3\0\1\37\13\0\12\37\46\0\70\37\10\0\12\37\66\0"+
    "\32\37\3\0\17\37\4\0\12\37\u0166\0\112\37\25\0\1\37\u01c0\0"+
    "\71\37\u0107\0\11\37\1\0\55\37\1\0\11\37\17\0\12\37\30\0"+
    "\36\37\2\0\26\37\1\0\16\37\u0349\0\u039a\37\146\0\157\37\21\0"+
    "\304\37\u0abc\0\u042f\37\u0fd1\0\u0247\37\u21b9\0\u0239\37\7\0\37\37\1\0"+
    "\12\37\146\0\36\37\2\0\5\37\13\0\67\37\11\0\4\37\14\0"+
    "\12\37\11\0\25\37\5\0\23\37\u0370\0\105\37\13\0\57\37\20\0"+
    "\21\37\100\0\1\37\37\0\u17ed\37\23\0\u02f3\37\u250d\0\2\37\u0bfe\0"+
    "\153\37\5\0\15\37\3\0\11\37\7\0\12\37\3\0\2\37\u14c6\0"+
    "\5\37\3\0\6\37\10\0\10\37\2\0\7\37\36\0\4\37\224\0"+
    "\3\37\u01bb\0\125\37\1\0\107\37\1\0\2\37\2\0\1\37\2\0"+
    "\2\37\2\0\4\37\1\0\14\37\1\0\1\37\1\0\7\37\1\0"+
    "\101\37\1\0\4\37\2\0\10\37\1\0\7\37\1\0\34\37\1\0"+
    "\4\37\1\0\5\37\1\0\1\37\3\0\7\37\1\0\u0154\37\2\0"+
    "\31\37\1\0\31\37\1\0\37\37\1\0\31\37\1\0\37\37\1\0"+
    "\31\37\1\0\37\37\1\0\31\37\1\0\37\37\1\0\31\37\1\0"+
    "\10\37\2\0\62\37\u0200\0\67\37\4\0\62\37\10\0\1\37\16\0"+
    "\1\37\26\0\5\37\1\0\17\37\u0550\0\7\37\1\0\21\37\2\0"+
    "\7\37\1\0\2\37\1\0\5\37\u07d5\0\305\37\13\0\7\37\51\0"+
    "\113\37\5\0\12\37\u04a6\0\4\37\1\0\33\37\1\0\2\37\1\0"+
    "\1\37\2\0\1\37\1\0\12\37\1\0\4\37\1\0\1\37\1\0"+
    "\1\37\6\0\1\37\4\0\1\37\1\0\1\37\1\0\1\37\1\0"+
    "\3\37\1\0\2\37\1\0\1\37\2\0\1\37\1\0\1\37\1\0"+
    "\1\37\1\0\1\37\1\0\1\37\1\0\2\37\1\0\1\37\2\0"+
    "\4\37\1\0\7\37\1\0\4\37\1\0\4\37\1\0\1\37\1\0"+
    "\12\37\1\0\21\37\5\0\3\37\1\0\5\37\1\0\21\37\u0274\0"+
    "\32\37\6\0\32\37\6\0\32\37\u0e76\0\ua6d7\37\51\0\u1035\37\13\0"+
    "\336\37\2\0\u1682\37\u295e\0\u021e\37\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u06ed\0"+
    "\360\37\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\2\3\1\4\2\5\3\3\1\1"+
    "\1\6\11\4\1\1\1\0\2\7\1\10\3\0\1\7"+
    "\1\11\1\7\1\12\7\4\1\10\2\7\2\0\2\7"+
    "\1\11\7\4\1\0\1\10\2\4\1\10\1\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[63];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\41\0\102\0\143\0\204\0\41\0\245\0\306"+
    "\0\347\0\u0108\0\u0129\0\u014a\0\u016b\0\41\0\u018c\0\u01ad"+
    "\0\u01ce\0\u01ef\0\u0210\0\u0231\0\u0252\0\u0273\0\u0294\0\143"+
    "\0\41\0\u02b5\0\u02d6\0\u02f7\0\u0318\0\u016b\0\u0339\0\u035a"+
    "\0\u016b\0\u037b\0\u01ad\0\u039c\0\u03bd\0\u03de\0\u03ff\0\u0420"+
    "\0\u0441\0\u0462\0\u0483\0\u04a4\0\u04c5\0\u04e6\0\u0507\0\u0528"+
    "\0\u0549\0\u0339\0\u056a\0\u058b\0\u05ac\0\u05cd\0\u05ee\0\u060f"+
    "\0\u0630\0\u0651\0\u0318\0\u0672\0\u0693\0\u04e6\0\u06b4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[63];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\1\2\1\4\1\7"+
    "\1\10\1\11\2\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\20\1\22\1\23\2\20\1\24\1\25"+
    "\1\20\1\26\1\27\1\20\1\30\1\20\1\31\3\0"+
    "\3\31\1\0\1\32\2\0\6\31\16\33\1\0\1\33"+
    "\2\0\1\4\77\0\1\31\3\0\1\34\1\35\1\31"+
    "\1\0\1\32\2\0\6\31\16\33\1\0\1\33\1\31"+
    "\3\0\3\31\1\0\1\32\2\20\6\31\16\33\1\0"+
    "\1\33\10\0\1\33\2\10\6\0\16\33\1\0\1\33"+
    "\10\0\1\33\10\0\16\33\1\0\1\33\1\31\3\0"+
    "\3\31\1\0\1\32\2\0\1\31\1\6\4\31\16\33"+
    "\1\0\1\33\1\31\3\0\3\31\1\0\1\32\2\0"+
    "\2\31\1\6\3\31\16\33\1\0\1\33\1\31\3\0"+
    "\3\31\1\0\1\32\2\0\3\31\1\6\2\31\16\33"+
    "\1\0\1\33\1\36\3\37\2\36\1\31\1\0\1\40"+
    "\2\37\4\36\1\41\1\36\16\42\1\37\1\42\10\0"+
    "\3\20\6\0\1\20\1\43\14\20\1\0\1\20\10\0"+
    "\3\20\6\0\16\20\1\0\1\20\10\0\3\20\6\0"+
    "\3\20\1\44\12\20\1\0\1\20\10\0\3\20\6\0"+
    "\5\20\1\45\1\46\7\20\1\0\1\20\10\0\3\20"+
    "\6\0\4\20\1\47\11\20\1\0\1\20\10\0\3\20"+
    "\6\0\12\20\1\43\3\20\1\0\1\20\10\0\3\20"+
    "\6\0\3\20\1\50\12\20\1\0\1\20\10\0\3\20"+
    "\6\0\14\20\1\51\1\20\1\0\1\20\10\0\3\20"+
    "\6\0\4\20\1\52\11\20\1\0\1\20\1\31\3\0"+
    "\3\31\1\0\1\32\2\33\6\31\16\33\1\0\1\33"+
    "\10\0\3\33\6\0\16\33\1\0\1\33\1\34\2\0"+
    "\1\53\2\34\1\31\1\0\1\54\2\53\6\34\16\55"+
    "\1\53\1\55\1\35\3\56\1\35\1\57\1\31\1\0"+
    "\1\60\2\56\6\35\16\61\1\56\1\61\6\37\2\0"+
    "\7\37\1\62\21\37\1\36\3\37\2\36\1\31\1\0"+
    "\1\40\2\42\4\36\1\41\1\36\16\42\1\37\1\42"+
    "\6\37\2\0\3\42\4\37\1\62\1\37\16\42\1\37"+
    "\1\42\10\0\3\20\6\0\4\20\1\63\11\20\1\0"+
    "\1\20\10\0\3\20\6\0\10\20\1\64\5\20\1\0"+
    "\1\20\10\0\3\20\6\0\7\20\1\65\6\20\1\0"+
    "\1\20\10\0\3\20\6\0\11\20\1\66\4\20\1\0"+
    "\1\20\10\0\3\20\6\0\1\67\15\20\1\0\1\20"+
    "\10\0\3\20\6\0\1\70\15\20\1\0\1\20\10\0"+
    "\3\20\6\0\15\20\1\71\1\0\1\20\1\53\2\0"+
    "\3\53\2\0\31\53\1\34\2\0\1\53\2\34\1\31"+
    "\1\0\1\54\2\55\6\34\16\55\1\53\1\55\1\53"+
    "\2\0\3\53\2\0\3\55\6\53\16\55\1\53\1\55"+
    "\5\56\1\72\2\0\31\56\1\35\3\56\1\73\1\57"+
    "\1\31\1\0\1\60\2\56\6\35\16\61\1\56\1\61"+
    "\1\35\3\56\1\35\1\57\1\31\1\0\1\60\2\61"+
    "\6\35\16\61\1\56\1\61\5\56\1\72\2\0\3\61"+
    "\6\56\16\61\1\56\1\61\10\0\3\20\6\0\5\20"+
    "\1\43\10\20\1\0\1\20\10\0\3\20\6\0\1\17"+
    "\10\20\1\25\4\20\1\0\1\20\10\0\3\20\6\0"+
    "\4\20\1\43\11\20\1\0\1\20\10\0\3\20\6\0"+
    "\6\20\1\74\7\20\1\0\1\20\10\0\3\20\6\0"+
    "\6\20\1\65\7\20\1\0\1\20\10\0\3\20\6\0"+
    "\5\20\1\75\10\20\1\0\1\20\10\0\3\20\6\0"+
    "\10\20\1\43\5\20\1\0\1\20\4\56\1\76\1\72"+
    "\2\0\31\56\10\0\3\20\6\0\1\77\15\20\1\0"+
    "\1\20\10\0\3\20\6\0\2\20\1\43\13\20\1\0"+
    "\1\20\10\0\3\20\6\0\5\20\1\65\10\20\1\0"+
    "\1\20";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1749];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\1\1\11\23\1\1\11\1\0\3\1\3\0"+
    "\16\1\2\0\12\1\1\0\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[63];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	ArrayList<String> symbolTable = new ArrayList<String>();
    	boolean checkTable(String word)
	{
		for(int i = 0; i < symbolTable.size(); i++)
		{
			if(symbolTable.get(i).equals(word))  return true;
		}
		return false;
	}	


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexicalAnalyzer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2842) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.print(yytext());
            } 
            // fall through
          case 11: break;
          case 2: 
            { 
            } 
            // fall through
          case 12: break;
          case 3: 
            { System.out.println("operator : "+yytext());
            } 
            // fall through
          case 13: break;
          case 4: 
            { if(checkTable(yytext())) 
                  System.out.printf("identifier \"%s\" already in symbol table\n",yytext());
		          else
		          {
			        symbolTable.add(yytext());
			        System.out.println("new identifier : "+yytext());
		          }
            } 
            // fall through
          case 14: break;
          case 5: 
            { System.out.println("integer : "+yytext());
            } 
            // fall through
          case 15: break;
          case 6: 
            { if(yytext().equals(";"))
			System.out.println("semicolon : "+";");
		else 
			System.out.println("parentheses : "+yytext());
            } 
            // fall through
          case 16: break;
          case 7: 
            { System.out.printf("ERROR");
		System.exit(0);
            } 
            // fall through
          case 17: break;
          case 8: 
            { //DO NOTHING
            } 
            // fall through
          case 18: break;
          case 9: 
            { System.out.println("string : "+yytext());
            } 
            // fall through
          case 19: break;
          case 10: 
            { System.out.println("keywords : "+yytext());
            } 
            // fall through
          case 20: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java LexicalAnalyzer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        LexicalAnalyzer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new LexicalAnalyzer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
