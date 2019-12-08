package it.didacusabella.compilertoolchain.lexer.lexeranalyzer;

import it.didacusabella.compilertoolchain.lexer.dfa.IdentifierDfa;
import it.didacusabella.compilertoolchain.lexer.dfa.MathDfa;
import it.didacusabella.compilertoolchain.lexer.dfa.NumberDfa;
import it.didacusabella.compilertoolchain.lexer.dfa.RelopDfa;
import it.didacusabella.compilertoolchain.lexer.dfa.SeparatorDfa;
import it.didacusabella.compilertoolchain.lexer.dfa.StringLiteralDfa;
import it.didacusabella.compilertoolchain.lexer.dfa.TableDfa;
import it.didacusabella.compilertoolchain.lexer.buffer.Buffer;
import it.didacusabella.compilertoolchain.lexer.dfa.RejectDfa;
import it.didacusabella.compilertoolchain.lexer.symboltable.SymbolTable;
import java.util.List;

/**
 *
 * @author didacusAbella.
 */
public class SimpleLexerAnalyzer implements LexerAnalyzer {

  private final SymbolTable table;
  private final List<Token> tokens;
  private static final TableDfa[] COMPACT_DFA = {
    new RejectDfa(), new SeparatorDfa(), new MathDfa(), new RelopDfa(), new NumberDfa(), 
    new StringLiteralDfa(), new IdentifierDfa()
  };
  private Buffer buffer;
  private int innerState;

  public SimpleLexerAnalyzer(SymbolTable table, List<Token> tokens) {
    this.table = table;
    this.tokens = tokens;
    this.innerState = 0;
  }

  @Override
  public Token nextToken(String line) {
    this.buffer = new Buffer(line);
    while(this.buffer.isEol()){
      /*Ignore whitespaces*/
      while(this.buffer.actualLex() == ' '){
        buffer.stepOver();
        buffer.setBegin(buffer.getForward());
      }  
      COMPACT_DFA[this.innerState].transition(this.buffer.actualLex());
      while(COMPACT_DFA[this.innerState].isFinal()){
        this.buffer.stepOver();
        if(!this.buffer.isEol()){
          createToken();
          break;
        }
        COMPACT_DFA[this.innerState].transition(this.buffer.actualLex());
        if(!COMPACT_DFA[this.innerState].isFinal()){
          createToken();
          this.buffer.setBegin(this.buffer.getForward());
          resetAllDfa();
          this.innerState = -1;
          break;
        }
      }
      this.innerState++;
    }
    resetAllDfa();
    this.buffer.setForward(0);
    this.buffer.setBegin(0);
    this.innerState = 0;
    return new Token("EOL");
  }

  private void createToken() {
    String lexeme = buffer.getLexeme();
    /*Remove last dot for case number.*/
    if(this.innerState == 4 && lexeme.endsWith("."))
      lexeme = lexeme.substring(0, lexeme.length() -1);
    /*Check if is yet in table*/
    if (table.isInTable(lexeme)) {
      tokens.add(this.table.tokenOf(lexeme));
    } else {
      Token tok = COMPACT_DFA[this.innerState].generateToken(lexeme);
      this.table.addToken(lexeme, tok);
      tokens.add(tok);
    }
  }
  
  private void resetAllDfa(){
    for(TableDfa t : COMPACT_DFA)
      t.setActualState(0);
  }

}
