package it.didacusabella.compilertoolchain.flexlexer;
/**
 * Symbol
 */
public class Symbol {

  /* Keywords*/
  public static final int IF = 0;
  public static final int ELSE = 1;
  public static final int WHILE = 2;
  public static final int BREAK = 3;
  public static final int CONTINUE = 4;
  public static final int THEN = 5;
  /* Operators */
  public static final int LT = 6;
  public static final int GT = 7;
  public static final int EQ = 8;
  public static final int NOT = 9;
  public static final int AND = 10;
  public static final int LTE = 11;
  public static final int GTE = 12;
  public static final int EQEQ = 13;
  public static final int NEQ = 14;
  public static final int OR = 15;
  public static final int PLUS = 16;
  public static final int MINUS = 17;
  public static final int MUL = 18;
  public static final int DIV = 19;
  public static final int MOD = 20;
  public static final int EXP = 21;
  /* Separators */
  public static final int LPAR = 22;
  public static final int RPAR = 23;
  public static final int LBRACE = 24;
  public static final int RBRACE = 25;
  public static final int LBRACK = 26;
  public static final int RBRACK = 27;
  public static final int SEMICOLON = 28;
  public static final int COMMA = 29;
  public static final int DOT = 30;
  public static final int STRING_LITERAL = 31;
  public static final int INT_LITERAL = 32;
  public static final int DOUBLE_LITERAL = 33;
  public static final int IDENTIFIER = 34;
  public static final int EOF = -1;

  private int type;
  private int lineValue;
  private int colValue;
  private Object value;

  public Symbol(int type, int line, int col) {
    this.type = type;
    this.lineValue = line;
    this.colValue = col;
    this.value = null;
  }

  public Symbol(int type, int line, int col, Object value){
    this.type = type;
    this.lineValue = line;
    this.colValue = col;
    this.value = value;
  }

  public int getType(){
    return this.type;
  }

  public int getLineValue(){
    return this.lineValue;
  }

  public int getColValue(){
    return this.colValue;
  }

  public Object getValue(){
    return this.value;
  }

  @Override
  public String toString(){
    String str = (this.value == null) ? String.format("<%d,%d,%d>", this.type, this.lineValue, this.colValue) : String.format("<%d,%d,%d,%s>", this.type, this.lineValue, this.colValue, this.value);
    return str;
  }
  
}