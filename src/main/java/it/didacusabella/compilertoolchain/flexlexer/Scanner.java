/* The following code was generated by JFlex 1.7.0 */

/*Definition of my language*/
package it.didacusabella.compilertoolchain.flexlexer;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>/home/didacus/Documents/CompilerToolChain/src/main/resources/it/didacusabella/compilertoolchain/flexlexer/mylanguage.jflex</tt>
 */
public class Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\15\1\3\1\2\1\63\1\64\1\1\16\15\4\0\1\3\1\50"+
    "\1\61\1\4\1\14\1\57\1\51\1\62\1\36\1\37\1\55\1\53"+
    "\1\41\1\54\1\20\1\56\1\16\11\17\1\0\1\40\1\46\1\5"+
    "\1\47\2\0\32\14\1\42\1\21\1\43\1\60\1\14\1\0\1\30"+
    "\1\6\1\32\1\13\1\7\1\22\1\10\1\24\1\11\1\14\1\31"+
    "\1\25\1\14\1\12\1\33\2\14\1\27\1\26\1\23\1\34\1\14"+
    "\1\35\3\14\1\44\1\52\1\45\1\0\6\15\1\65\32\15\2\0"+
    "\4\14\4\0\1\14\2\0\1\15\7\0\1\14\4\0\1\14\5\0"+
    "\27\14\1\0\37\14\1\0\u01ca\14\4\0\14\14\16\0\5\14\7\0"+
    "\1\14\1\0\1\14\21\0\160\15\5\14\1\0\2\14\2\0\4\14"+
    "\1\0\1\14\6\0\1\14\1\0\3\14\1\0\1\14\1\0\24\14"+
    "\1\0\123\14\1\0\213\14\1\0\5\15\2\0\246\14\1\0\46\14"+
    "\2\0\1\14\6\0\51\14\6\0\1\14\1\0\55\15\1\0\1\15"+
    "\1\0\2\15\1\0\2\15\1\0\1\15\10\0\33\14\4\0\4\14"+
    "\15\0\6\15\5\0\1\14\4\0\13\15\1\0\1\15\3\0\53\14"+
    "\37\15\4\0\2\14\1\15\143\14\1\0\1\14\10\15\1\0\6\15"+
    "\2\14\2\15\1\0\4\15\2\14\12\15\3\14\2\0\1\14\17\0"+
    "\1\15\1\14\1\15\36\14\33\15\2\0\131\14\13\15\1\14\16\0"+
    "\12\15\41\14\11\15\2\14\4\0\1\14\2\0\1\15\30\14\4\15"+
    "\1\14\11\15\1\14\3\15\1\14\5\15\22\0\31\14\3\15\4\0"+
    "\13\14\65\0\25\14\1\0\10\14\25\0\61\15\66\14\3\15\1\14"+
    "\22\15\1\14\7\15\12\14\2\15\2\0\12\15\1\0\20\14\3\15"+
    "\1\0\10\14\2\0\2\14\2\0\26\14\1\0\7\14\1\0\1\14"+
    "\3\0\4\14\2\0\1\15\1\14\7\15\2\0\2\15\2\0\3\15"+
    "\1\14\10\0\1\15\4\0\2\14\1\0\3\14\2\15\2\0\12\15"+
    "\4\14\7\0\2\14\1\0\1\15\2\0\3\15\1\0\6\14\4\0"+
    "\2\14\2\0\26\14\1\0\7\14\1\0\2\14\1\0\2\14\1\0"+
    "\2\14\2\0\1\15\1\0\5\15\4\0\2\15\2\0\3\15\3\0"+
    "\1\15\7\0\4\14\1\0\1\14\7\0\14\15\3\14\1\15\13\0"+
    "\3\15\1\0\11\14\1\0\3\14\1\0\26\14\1\0\7\14\1\0"+
    "\2\14\1\0\5\14\2\0\1\15\1\14\10\15\1\0\3\15\1\0"+
    "\3\15\2\0\1\14\17\0\2\14\2\15\2\0\12\15\1\0\1\14"+
    "\7\0\1\14\6\15\1\0\3\15\1\0\10\14\2\0\2\14\2\0"+
    "\26\14\1\0\7\14\1\0\2\14\1\0\5\14\2\0\1\15\1\14"+
    "\7\15\2\0\2\15\2\0\3\15\10\0\2\15\4\0\2\14\1\0"+
    "\3\14\2\15\2\0\12\15\1\0\1\14\20\0\1\15\1\14\1\0"+
    "\6\14\3\0\3\14\1\0\4\14\3\0\2\14\1\0\1\14\1\0"+
    "\2\14\3\0\2\14\3\0\3\14\3\0\14\14\4\0\5\15\3\0"+
    "\3\15\1\0\4\15\2\0\1\14\6\0\1\15\16\0\12\15\11\0"+
    "\1\14\6\0\5\15\10\14\1\0\3\14\1\0\27\14\1\0\20\14"+
    "\3\0\1\14\7\15\1\0\3\15\1\0\4\15\7\0\2\15\1\0"+
    "\3\14\5\0\2\14\2\15\2\0\12\15\20\0\1\14\3\15\1\0"+
    "\10\14\1\0\3\14\1\0\27\14\1\0\12\14\1\0\5\14\2\0"+
    "\1\15\1\14\7\15\1\0\3\15\1\0\4\15\7\0\2\15\7\0"+
    "\1\14\1\0\2\14\2\15\2\0\12\15\1\0\2\14\15\0\4\15"+
    "\1\0\10\14\1\0\3\14\1\0\51\14\2\15\1\14\7\15\1\0"+
    "\3\15\1\0\4\15\1\14\5\0\3\14\1\15\7\0\3\14\2\15"+
    "\2\0\12\15\12\0\6\14\2\0\2\15\1\0\22\14\3\0\30\14"+
    "\1\0\11\14\1\0\1\14\2\0\7\14\3\0\1\15\4\0\6\15"+
    "\1\0\1\15\1\0\10\15\6\0\12\15\2\0\2\15\15\0\60\14"+
    "\1\15\2\14\7\15\4\0\10\14\10\15\1\0\12\15\47\0\2\14"+
    "\1\0\1\14\1\0\5\14\1\0\30\14\1\0\1\14\1\0\12\14"+
    "\1\15\2\14\11\15\1\14\2\0\5\14\1\0\1\14\1\0\6\15"+
    "\2\0\12\15\2\0\4\14\40\0\1\14\27\0\2\15\6\0\12\15"+
    "\13\0\1\15\1\0\1\15\1\0\1\15\4\0\2\15\10\14\1\0"+
    "\44\14\4\0\24\15\1\0\2\15\5\14\13\15\1\0\44\15\11\0"+
    "\1\15\71\0\53\14\24\15\1\14\12\15\6\0\6\14\4\15\4\14"+
    "\3\15\1\14\3\15\2\14\7\15\3\14\4\15\15\14\14\15\1\14"+
    "\17\15\2\0\46\14\1\0\1\14\5\0\1\14\2\0\53\14\1\0"+
    "\u014d\14\1\0\4\14\2\0\7\14\1\0\1\14\1\0\4\14\2\0"+
    "\51\14\1\0\4\14\2\0\41\14\1\0\4\14\2\0\7\14\1\0"+
    "\1\14\1\0\4\14\2\0\17\14\1\0\71\14\1\0\4\14\2\0"+
    "\103\14\2\0\3\15\40\0\20\14\20\0\126\14\2\0\6\14\3\0"+
    "\u026c\14\2\0\21\14\1\0\32\14\5\0\113\14\3\0\13\14\7\0"+
    "\15\14\1\0\4\14\3\15\13\0\22\14\3\15\13\0\22\14\2\15"+
    "\14\0\15\14\1\0\3\14\1\0\2\15\14\0\64\14\40\15\3\0"+
    "\1\14\3\0\2\14\1\15\2\0\12\15\41\0\4\15\1\0\12\15"+
    "\6\0\131\14\7\0\5\14\2\15\42\14\1\15\1\14\5\0\106\14"+
    "\12\0\37\14\1\0\14\15\4\0\14\15\12\0\12\15\36\14\2\0"+
    "\5\14\13\0\54\14\4\0\32\14\6\0\12\15\46\0\27\14\5\15"+
    "\4\0\65\14\12\15\1\0\35\15\2\0\13\15\6\0\12\15\15\0"+
    "\1\14\10\0\16\15\102\0\5\15\57\14\21\15\7\14\4\0\12\15"+
    "\21\0\11\15\14\0\3\15\36\14\15\15\2\14\12\15\54\14\16\15"+
    "\14\0\44\14\24\15\10\0\12\15\3\0\3\14\12\15\44\14\2\0"+
    "\11\14\7\0\53\14\2\0\3\14\20\0\3\15\1\0\25\15\4\14"+
    "\1\15\6\14\1\15\2\14\3\15\1\14\5\0\300\14\72\15\1\0"+
    "\5\15\u0116\14\2\0\6\14\2\0\46\14\2\0\6\14\2\0\10\14"+
    "\1\0\1\14\1\0\1\14\1\0\1\14\1\0\37\14\2\0\65\14"+
    "\1\0\7\14\1\0\1\14\3\0\3\14\1\0\7\14\3\0\4\14"+
    "\2\0\6\14\4\0\15\14\5\0\3\14\1\0\7\14\16\0\5\15"+
    "\30\0\1\63\1\63\5\15\20\0\2\14\23\0\1\14\13\0\5\15"+
    "\1\0\12\15\1\0\1\14\15\0\1\14\20\0\15\14\3\0\40\14"+
    "\20\0\15\15\4\0\1\15\3\0\14\15\21\0\1\14\4\0\1\14"+
    "\2\0\12\14\1\0\1\14\3\0\5\14\6\0\1\14\1\0\1\14"+
    "\1\0\1\14\1\0\4\14\1\0\13\14\2\0\4\14\5\0\5\14"+
    "\4\0\1\14\21\0\51\14\u0a77\0\57\14\1\0\57\14\1\0\205\14"+
    "\6\0\4\14\3\15\2\14\14\0\46\14\1\0\1\14\5\0\1\14"+
    "\2\0\70\14\7\0\1\14\17\0\1\15\27\14\11\0\7\14\1\0"+
    "\7\14\1\0\7\14\1\0\7\14\1\0\7\14\1\0\7\14\1\0"+
    "\7\14\1\0\7\14\1\0\40\15\57\0\1\14\u01d5\0\3\14\31\0"+
    "\11\14\6\15\1\0\5\14\2\0\5\14\4\0\126\14\2\0\2\15"+
    "\2\0\3\14\1\0\132\14\1\0\4\14\5\0\53\14\1\0\136\14"+
    "\21\0\33\14\65\0\20\14\u0200\0\u19b6\14\112\0\u51f0\14\20\0\u048d\14"+
    "\103\0\56\14\2\0\u010d\14\3\0\20\14\12\15\2\14\24\0\57\14"+
    "\1\15\4\0\12\15\1\0\37\14\2\15\120\14\2\15\45\0\11\14"+
    "\2\0\147\14\2\0\65\14\2\0\5\14\60\0\13\14\1\15\3\14"+
    "\1\15\4\14\1\15\27\14\5\15\20\0\1\14\7\0\64\14\14\0"+
    "\2\15\62\14\22\15\12\0\12\15\6\0\22\15\6\14\3\0\1\14"+
    "\1\0\2\14\13\15\34\14\10\15\2\0\27\14\15\15\14\0\35\14"+
    "\3\0\4\15\57\14\16\15\16\0\1\14\12\15\6\0\5\14\1\15"+
    "\12\14\12\15\5\14\1\0\51\14\16\15\11\0\3\14\1\15\10\14"+
    "\2\15\2\0\12\15\6\0\27\14\3\0\1\14\3\15\62\14\1\15"+
    "\1\14\3\15\2\14\2\15\5\14\2\15\1\14\1\15\1\14\30\0"+
    "\3\14\2\0\13\14\5\15\2\0\3\14\2\15\12\0\6\14\2\0"+
    "\6\14\2\0\6\14\11\0\7\14\1\0\7\14\1\0\53\14\1\0"+
    "\14\14\10\0\163\14\10\15\1\0\2\15\2\0\12\15\6\0\u2ba4\14"+
    "\14\0\27\14\4\0\61\14\u2104\0\u016e\14\2\0\152\14\46\0\7\14"+
    "\14\0\5\14\5\0\1\14\1\15\12\14\1\0\15\14\1\0\5\14"+
    "\1\0\1\14\1\0\2\14\1\0\2\14\1\0\154\14\41\0\u016b\14"+
    "\22\0\100\14\2\0\66\14\50\0\15\14\3\0\20\15\20\0\20\15"+
    "\3\0\2\14\30\0\3\14\31\0\1\14\6\0\5\14\1\0\207\14"+
    "\2\0\1\15\4\0\1\14\13\0\12\15\7\0\32\14\4\0\1\14"+
    "\1\0\32\14\13\0\131\14\3\0\6\14\2\0\6\14\2\0\6\14"+
    "\2\0\3\14\3\0\2\14\3\0\2\14\22\0\3\15\4\0\14\14"+
    "\1\0\32\14\1\0\23\14\1\0\2\14\1\0\17\14\2\0\16\14"+
    "\42\0\173\14\105\0\65\14\210\0\1\15\202\0\35\14\3\0\61\14"+
    "\17\0\1\15\37\0\40\14\15\0\36\14\5\0\46\14\5\15\5\0"+
    "\36\14\2\0\44\14\4\0\10\14\1\0\5\14\52\0\236\14\2\0"+
    "\12\15\6\0\44\14\4\0\44\14\4\0\50\14\10\0\64\14\234\0"+
    "\u0137\14\11\0\26\14\12\0\10\14\230\0\6\14\2\0\1\14\1\0"+
    "\54\14\1\0\2\14\3\0\1\14\2\0\27\14\12\0\27\14\11\0"+
    "\37\14\101\0\23\14\1\0\2\14\12\0\26\14\12\0\32\14\106\0"+
    "\70\14\6\0\2\14\100\0\1\14\3\15\1\0\2\15\5\0\4\15"+
    "\4\14\1\0\3\14\1\0\35\14\2\0\3\15\4\0\1\15\40\0"+
    "\35\14\3\0\35\14\43\0\10\14\1\0\34\14\2\15\31\0\66\14"+
    "\12\0\26\14\12\0\23\14\15\0\22\14\156\0\111\14\67\0\63\14"+
    "\15\0\63\14\15\0\44\14\4\15\10\0\12\15\u01c6\0\35\14\12\0"+
    "\1\14\10\0\26\14\13\15\217\0\27\14\11\0\3\15\65\14\17\15"+
    "\37\0\12\15\17\0\4\15\55\14\13\15\2\0\1\15\17\0\1\15"+
    "\2\0\31\14\7\0\12\15\6\0\3\15\44\14\16\15\1\0\12\15"+
    "\4\0\1\14\2\15\11\0\43\14\1\15\2\0\1\14\11\0\3\15"+
    "\60\14\16\15\4\14\4\0\4\15\3\0\12\15\1\14\1\0\1\14"+
    "\43\0\22\14\1\0\31\14\14\15\6\0\1\15\101\0\7\14\1\0"+
    "\1\14\1\0\4\14\1\0\17\14\1\0\12\14\7\0\57\14\14\15"+
    "\5\0\12\15\6\0\4\15\1\0\10\14\2\0\2\14\2\0\26\14"+
    "\1\0\7\14\1\0\2\14\1\0\5\14\1\0\2\15\1\14\7\15"+
    "\2\0\2\15\2\0\3\15\2\0\1\14\6\0\1\15\5\0\5\14"+
    "\2\15\2\0\7\15\3\0\5\15\213\0\65\14\22\15\4\14\5\0"+
    "\12\15\4\0\1\15\1\14\40\0\60\14\24\15\2\14\1\0\1\14"+
    "\10\0\12\15\246\0\57\14\7\15\2\0\11\15\27\0\4\14\2\15"+
    "\42\0\60\14\21\15\3\0\1\14\13\0\12\15\46\0\53\14\15\15"+
    "\1\14\7\0\12\15\66\0\33\14\2\0\17\15\4\0\12\15\306\0"+
    "\54\14\17\15\145\0\100\14\12\15\25\0\1\14\240\0\10\14\2\0"+
    "\47\14\7\15\2\0\7\15\1\14\1\0\1\14\1\15\33\0\1\14"+
    "\12\15\50\14\7\15\1\14\4\15\10\0\1\15\10\0\1\14\13\15"+
    "\56\14\20\15\3\0\1\14\42\0\71\14\u0107\0\11\14\1\0\45\14"+
    "\10\15\1\0\10\15\1\14\17\0\12\15\30\0\36\14\2\0\26\15"+
    "\1\0\16\15\111\0\7\14\1\0\2\14\1\0\46\14\6\15\3\0"+
    "\1\15\1\0\2\15\1\0\7\15\1\14\1\15\10\0\12\15\6\0"+
    "\6\14\1\0\2\14\1\0\40\14\5\15\1\0\2\15\1\0\5\15"+
    "\1\14\7\0\12\15\u0136\0\23\14\4\15\346\0\4\14\37\0\u039a\14"+
    "\146\0\157\14\21\0\304\14\u0abc\0\u042f\14\1\0\11\15\u0fc7\0\u0247\14"+
    "\u21b9\0\u0239\14\7\0\37\14\1\0\12\15\146\0\36\14\2\0\5\15"+
    "\13\0\60\14\7\15\11\0\4\14\14\0\12\15\11\0\25\14\5\0"+
    "\23\14\u02b0\0\100\14\200\0\113\14\4\0\1\15\1\14\67\15\7\0"+
    "\4\15\15\14\100\0\2\14\1\0\1\14\34\0\u17f8\14\10\0\u02f3\14"+
    "\u250d\0\u011f\14\61\0\3\14\21\0\4\14\10\0\u018c\14\u0904\0\153\14"+
    "\5\0\15\14\3\0\11\14\7\0\12\14\3\0\2\15\1\0\4\15"+
    "\u14c1\0\5\15\3\0\26\15\2\0\7\15\36\0\4\15\224\0\3\15"+
    "\u01bb\0\125\14\1\0\107\14\1\0\2\14\2\0\1\14\2\0\2\14"+
    "\2\0\4\14\1\0\14\14\1\0\1\14\1\0\7\14\1\0\101\14"+
    "\1\0\4\14\2\0\10\14\1\0\7\14\1\0\34\14\1\0\4\14"+
    "\1\0\5\14\1\0\1\14\3\0\7\14\1\0\u0154\14\2\0\31\14"+
    "\1\0\31\14\1\0\37\14\1\0\31\14\1\0\37\14\1\0\31\14"+
    "\1\0\37\14\1\0\31\14\1\0\37\14\1\0\31\14\1\0\10\14"+
    "\2\0\62\15\u0200\0\67\15\4\0\62\15\10\0\1\15\16\0\1\15"+
    "\26\0\5\15\1\0\17\15\u0550\0\7\15\1\0\21\15\2\0\7\15"+
    "\1\0\2\15\1\0\5\15\325\0\55\14\3\0\7\15\7\14\2\0"+
    "\12\15\4\0\1\14\u0171\0\54\14\16\15\5\0\1\14\u0500\0\305\14"+
    "\13\0\7\15\51\0\104\14\7\15\1\14\4\0\12\15\u0356\0\1\14"+
    "\u014f\0\4\14\1\0\33\14\1\0\2\14\1\0\1\14\2\0\1\14"+
    "\1\0\12\14\1\0\4\14\1\0\1\14\1\0\1\14\6\0\1\14"+
    "\4\0\1\14\1\0\1\14\1\0\1\14\1\0\3\14\1\0\2\14"+
    "\1\0\1\14\2\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14"+
    "\1\0\1\14\1\0\2\14\1\0\1\14\2\0\4\14\1\0\7\14"+
    "\1\0\4\14\1\0\4\14\1\0\1\14\1\0\12\14\1\0\21\14"+
    "\5\0\3\14\1\0\5\14\1\0\21\14\u1144\0\ua6d7\14\51\0\u1035\14"+
    "\13\0\336\14\2\0\u1682\14\16\0\u1d31\14\u0c1f\0\u021e\14\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\15\36\0\140\15\200\0\360\15\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\2\1\1\2\1\3\4\4\2\5\1\6\3\4"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\2\0\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\2\32\1\0\1\33\2\2"+
    "\1\34\1\0\2\4\1\35\1\0\3\4\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\0\2\4\1\54\3\4"+
    "\1\0\1\4\1\55\1\56\2\4\1\0\1\57\1\4"+
    "\1\60\1\0\1\4\3\0\1\4\2\0\1\61\3\0"+
    "\1\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[96];
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
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\u0144\0\u017a"+
    "\0\u01b0\0\u01e6\0\u021c\0\u0252\0\242\0\u0288\0\u02be\0\u02f4"+
    "\0\242\0\242\0\242\0\242\0\242\0\242\0\242\0\242"+
    "\0\u032a\0\u0360\0\u0396\0\u03cc\0\u0402\0\242\0\242\0\242"+
    "\0\242\0\242\0\242\0\242\0\u0438\0\u046e\0\242\0\u04a4"+
    "\0\242\0\u04da\0\242\0\242\0\u0510\0\u0546\0\u057c\0\u01b0"+
    "\0\u05b2\0\u05e8\0\u061e\0\u0654\0\242\0\242\0\242\0\242"+
    "\0\242\0\242\0\242\0\242\0\242\0\242\0\242\0\242"+
    "\0\242\0\242\0\u068a\0\u06c0\0\u06f6\0\u05b2\0\u072c\0\u0762"+
    "\0\u0798\0\u07ce\0\u0804\0\u01b0\0\u01b0\0\u083a\0\u0870\0\u08a6"+
    "\0\u01b0\0\u08dc\0\u01b0\0\u0912\0\u0948\0\u097e\0\u09b4\0\u09ea"+
    "\0\u0a20\0\u0a56\0\u0a8c\0\u01b0\0\u0ac2\0\u0af8\0\u0b2e\0\u0912";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[96];
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
    "\1\0\1\3\2\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\3\11\1\0\1\13\1\14\1\15\1\0\1\11"+
    "\1\16\6\11\1\17\2\11\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\2\0\1\4\1\0\1\45\1\46\1\47\16\45"+
    "\1\50\37\45\1\51\4\45\2\0\1\4\151\0\1\5"+
    "\1\52\1\53\63\5\5\0\1\54\1\55\65\0\12\11"+
    "\2\0\5\11\1\56\6\11\27\0\1\11\6\0\12\11"+
    "\2\0\3\11\1\57\10\11\27\0\1\11\6\0\12\11"+
    "\2\0\14\11\27\0\1\11\6\0\12\11\2\0\1\60"+
    "\13\11\27\0\1\11\20\0\1\61\63\0\2\14\1\61"+
    "\53\0\12\11\2\0\2\11\1\62\11\11\27\0\1\11"+
    "\6\0\12\11\2\0\11\11\1\63\2\11\27\0\1\11"+
    "\6\0\12\11\2\0\2\11\1\64\11\11\27\0\1\11"+
    "\5\0\1\65\65\0\1\66\65\0\1\67\131\0\1\70"+
    "\66\0\1\71\13\0\1\45\2\0\16\45\1\0\37\45"+
    "\1\0\4\45\2\0\1\47\63\0\1\72\2\0\3\72"+
    "\1\73\3\72\1\74\6\72\1\75\1\76\1\77\3\72"+
    "\1\100\31\72\1\101\1\102\5\0\1\53\72\0\1\103"+
    "\64\0\1\11\1\104\10\11\2\0\14\11\27\0\1\11"+
    "\6\0\12\11\2\0\4\11\1\105\7\11\27\0\1\11"+
    "\16\0\2\106\54\0\1\11\1\107\10\11\2\0\14\11"+
    "\27\0\1\11\6\0\4\11\1\110\5\11\2\0\14\11"+
    "\27\0\1\11\6\0\3\11\1\111\6\11\2\0\14\11"+
    "\27\0\1\11\10\0\1\112\63\0\12\11\2\0\6\11"+
    "\1\113\5\11\27\0\1\11\6\0\1\11\1\114\10\11"+
    "\2\0\14\11\27\0\1\11\6\0\4\11\1\115\5\11"+
    "\2\0\14\11\27\0\1\11\6\0\12\11\2\0\1\11"+
    "\1\116\12\11\27\0\1\11\6\0\12\11\2\0\3\11"+
    "\1\117\10\11\27\0\1\11\11\0\1\120\62\0\12\11"+
    "\2\0\7\11\1\121\4\11\27\0\1\11\6\0\3\11"+
    "\1\122\6\11\2\0\14\11\27\0\1\11\6\0\1\11"+
    "\1\123\10\11\2\0\14\11\27\0\1\11\12\0\1\124"+
    "\61\0\4\11\1\125\5\11\2\0\14\11\27\0\1\11"+
    "\1\124\1\126\1\127\2\124\1\130\60\124\6\0\12\11"+
    "\2\0\12\11\1\131\1\11\27\0\1\11\2\0\1\127"+
    "\2\0\1\132\65\0\1\132\60\0\1\124\1\126\1\127"+
    "\2\124\1\130\1\124\1\133\56\124\6\0\1\11\1\134"+
    "\10\11\2\0\14\11\27\0\1\11\7\0\1\135\56\0"+
    "\1\124\1\126\1\127\2\124\1\130\4\124\1\136\53\124"+
    "\12\0\1\137\53\0\1\124\1\126\1\127\2\124\1\130"+
    "\5\124\1\140\52\124\13\0\1\53\52\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2916];
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
    "\2\0\1\1\1\11\10\1\1\11\3\1\10\11\3\1"+
    "\2\0\7\11\2\1\1\11\1\0\1\11\1\1\2\11"+
    "\1\0\3\1\1\0\3\1\16\11\1\0\6\1\1\0"+
    "\5\1\1\0\3\1\1\0\1\1\3\0\1\1\2\0"+
    "\1\1\3\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[96];
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
  StringBuilder lexeme = new StringBuilder();

  private Symbol generateToken(int type){
    return new Symbol(type, yyline+1, yycolumn+1);
  }

  private Symbol generateToken(int type, Object value){
    return new Symbol(type, yyline+1, yycolumn+1, value);
  }
  


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
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
    while (i < 3596) {
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
  public Symbol next_token() throws java.io.IOException {
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

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
              {
                return generateToken(Symbol.EOF);
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /*Ignore Whitespaces*/
            } 
            // fall through
          case 50: break;
          case 2: 
            { /*Ignore Comments*/
            } 
            // fall through
          case 51: break;
          case 3: 
            { return generateToken(Symbol.EQ);
            } 
            // fall through
          case 52: break;
          case 4: 
            { return generateToken(Symbol.IDENTIFIER, yytext());
            } 
            // fall through
          case 53: break;
          case 5: 
            { return generateToken(Symbol.INT_LITERAL, new Integer(yytext()));
            } 
            // fall through
          case 54: break;
          case 6: 
            { return generateToken(Symbol.DOT);
            } 
            // fall through
          case 55: break;
          case 7: 
            { return generateToken(Symbol.LPAR);
            } 
            // fall through
          case 56: break;
          case 8: 
            { return generateToken(Symbol.RPAR);
            } 
            // fall through
          case 57: break;
          case 9: 
            { return generateToken(Symbol.SEMICOLON);
            } 
            // fall through
          case 58: break;
          case 10: 
            { return generateToken(Symbol.COMMA);
            } 
            // fall through
          case 59: break;
          case 11: 
            { return generateToken(Symbol.LBRACE);
            } 
            // fall through
          case 60: break;
          case 12: 
            { return generateToken(Symbol.RBRACE);
            } 
            // fall through
          case 61: break;
          case 13: 
            { return generateToken(Symbol.LBRACK);
            } 
            // fall through
          case 62: break;
          case 14: 
            { return generateToken(Symbol.RBRACK);
            } 
            // fall through
          case 63: break;
          case 15: 
            { return generateToken(Symbol.LT);
            } 
            // fall through
          case 64: break;
          case 16: 
            { return generateToken(Symbol.GT);
            } 
            // fall through
          case 65: break;
          case 17: 
            { return generateToken(Symbol.NOT);
            } 
            // fall through
          case 66: break;
          case 18: 
            { return generateToken(Symbol.PLUS);
            } 
            // fall through
          case 67: break;
          case 19: 
            { return generateToken(Symbol.MINUS);
            } 
            // fall through
          case 68: break;
          case 20: 
            { return generateToken(Symbol.MUL);
            } 
            // fall through
          case 69: break;
          case 21: 
            { return generateToken(Symbol.DIV);
            } 
            // fall through
          case 70: break;
          case 22: 
            { return generateToken(Symbol.MOD);
            } 
            // fall through
          case 71: break;
          case 23: 
            { return generateToken(Symbol.EXP);
            } 
            // fall through
          case 72: break;
          case 24: 
            { yybegin(STRING); lexeme.setLength(0);
            } 
            // fall through
          case 73: break;
          case 25: 
            { lexeme.append( yytext());
            } 
            // fall through
          case 74: break;
          case 26: 
            { throw new RuntimeException("Unterminated string at end of line");
            } 
            // fall through
          case 75: break;
          case 27: 
            { yybegin(YYINITIAL); return generateToken(Symbol.STRING_LITERAL, lexeme.toString());
            } 
            // fall through
          case 76: break;
          case 28: 
            { return generateToken(Symbol.EQEQ);
            } 
            // fall through
          case 77: break;
          case 29: 
            { return generateToken(Symbol.IF);
            } 
            // fall through
          case 78: break;
          case 30: 
            { return generateToken(Symbol.LTE);
            } 
            // fall through
          case 79: break;
          case 31: 
            { return generateToken(Symbol.GTE);
            } 
            // fall through
          case 80: break;
          case 32: 
            { return generateToken(Symbol.NEQ);
            } 
            // fall through
          case 81: break;
          case 33: 
            { return generateToken(Symbol.AND);
            } 
            // fall through
          case 82: break;
          case 34: 
            { return generateToken(Symbol.OR);
            } 
            // fall through
          case 83: break;
          case 35: 
            { throw new RuntimeException("Illegal escape sequence \""+yytext()+"\"");
            } 
            // fall through
          case 84: break;
          case 36: 
            { lexeme.append( '\b' );
            } 
            // fall through
          case 85: break;
          case 37: 
            { lexeme.append( '\n' );
            } 
            // fall through
          case 86: break;
          case 38: 
            { lexeme.append( '\\' );
            } 
            // fall through
          case 87: break;
          case 39: 
            { lexeme.append( '\f' );
            } 
            // fall through
          case 88: break;
          case 40: 
            { lexeme.append( '\t' );
            } 
            // fall through
          case 89: break;
          case 41: 
            { lexeme.append( '\r' );
            } 
            // fall through
          case 90: break;
          case 42: 
            { lexeme.append( '\"' );
            } 
            // fall through
          case 91: break;
          case 43: 
            { lexeme.append( '\'' );
            } 
            // fall through
          case 92: break;
          case 44: 
            { return generateToken(Symbol.DOUBLE_LITERAL, new Double(yytext()));
            } 
            // fall through
          case 93: break;
          case 45: 
            { return generateToken(Symbol.ELSE);
            } 
            // fall through
          case 94: break;
          case 46: 
            { return generateToken(Symbol.THEN);
            } 
            // fall through
          case 95: break;
          case 47: 
            { return generateToken(Symbol.BREAK);
            } 
            // fall through
          case 96: break;
          case 48: 
            { return generateToken(Symbol.WHILE);
            } 
            // fall through
          case 97: break;
          case 49: 
            { return generateToken(Symbol.CONTINUE);
            } 
            // fall through
          case 98: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}