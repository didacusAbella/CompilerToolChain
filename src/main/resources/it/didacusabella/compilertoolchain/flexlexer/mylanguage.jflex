/*Definition of my language*/
package it.didacusabella.compilertoolchain.flexlexer;

%%
%class Scanner
%public
%unicode
%line
%column
%function next_token
%type Symbol

%{
  StringBuilder lexeme = new StringBuilder();

  private Symbol generateToken(int type){
    return new Symbol(type, yyline+1, yycolumn+1);
  }

  private Symbol generateToken(int type, Object value){
    return new Symbol(type, yyline+1, yycolumn+1, value);
  }
  
%}
/*Regular definition for my language*/

LineTerminator = \r|\n|\r\n 
InputCharacter = [^\r\n] /*All except carriage return*/
WhiteSpace = {LineTerminator} | [ \t\f] /*White space can be a line terminator and must be ignored*/

/*Handle comments*/
Comment = {InlineComment} | {MultilineComment}
InlineComment = "#" {InputCharacter}* {LineTerminator}?
MultilineComment = "=begin" {InputCharacter}* {LineTerminator}? "=end"
Identifier = [:jletter:] [:jletterdigit:]* /*idetifier must start with a letter*/
DecLiteral = 0 | [1-9][0-9]* /*Decimal number is 0 or start with a number that not is zero followed by 0 or plus digits*/
DoubleLiteral = (0 | [1-9][0-9]*)\.[0-9]+
/*String literal*/
StringLiteral = [^\r\n\"\\] 

%state STRING

%%

<YYINITIAL>{

  /*Keywords*/
  "if"  { return generateToken(Symbol.IF); }
  "then" { return generateToken(Symbol.THEN); }
  "else" { return generateToken(Symbol.ELSE); }
  "break" { return generateToken(Symbol.BREAK); }
  "continue" { return generateToken(Symbol.CONTINUE); }
  "while" { return generateToken(Symbol.WHILE); }
  /*Separators*/
  "(" { return generateToken(Symbol.LPAR); }
  ")" { return generateToken(Symbol.RPAR); }
  ";" { return generateToken(Symbol.SEMICOLON); }
  "," { return generateToken(Symbol.COMMA); }
  "." { return generateToken(Symbol.DOT); }
  "[" { return generateToken(Symbol.LBRACE); }
  "]" { return generateToken(Symbol.RBRACE); }
  "{" { return generateToken(Symbol.LBRACK); }
  "}" { return generateToken(Symbol.RBRACK); }
  /*operators*/
  "<" { return generateToken(Symbol.LT); }
  ">" { return generateToken(Symbol.GT); }
  "=" { return generateToken(Symbol.EQ); }
  "!" { return generateToken(Symbol.NOT); }
  "&&" { return generateToken(Symbol.AND); }
  "<=" { return generateToken(Symbol.LTE); }
  ">=" { return generateToken(Symbol.GTE); }
  "==" { return generateToken(Symbol.EQEQ); }
  "!=" { return generateToken(Symbol.NEQ); }
  "||" { return generateToken(Symbol.OR); }
  "+" { return generateToken(Symbol.PLUS); }
  "-" { return generateToken(Symbol.MINUS); }
  "*" { return generateToken(Symbol.MUL); }
  "/" { return generateToken(Symbol.DIV); }
  "%" { return generateToken(Symbol.MOD); }
  "^" { return generateToken(Symbol.EXP); }

  {Identifier} { return generateToken(Symbol.IDENTIFIER, yytext()); }
  {DecLiteral} { return generateToken(Symbol.INT_LITERAL, new Integer(yytext())); }
  {DoubleLiteral} { return generateToken(Symbol.DOUBLE_LITERAL, new Double(yytext())); }

  /*When found " start state string*/
  \" { yybegin(STRING); lexeme.setLength(0); }
  {Comment} { /*Ignore Comments*/}
  {WhiteSpace} { /*Ignore Whitespaces*/ }

}
/*Handle String state*/
<STRING> {
\" { yybegin(YYINITIAL); return generateToken(Symbol.STRING_LITERAL, lexeme.toString()); }
/* escape sequences */
  {StringLiteral}+ { lexeme.append( yytext()); }
  "\\b" { lexeme.append( '\b' ); }
  "\\t" { lexeme.append( '\t' ); }
  "\\n" { lexeme.append( '\n' ); }
  "\\f" { lexeme.append( '\f' ); }
  "\\r" { lexeme.append( '\r' ); }
  "\\\"" { lexeme.append( '\"' ); }
  "\\'" { lexeme.append( '\'' ); }
  "\\\\" { lexeme.append( '\\' ); }
  \\. { throw new RuntimeException("Illegal escape sequence \""+yytext()+"\""); }
  {LineTerminator} { throw new RuntimeException("Unterminated string at end of line"); }
}
/*Handle End of File*/
<<EOF>>  { return generateToken(Symbol.EOF); }



