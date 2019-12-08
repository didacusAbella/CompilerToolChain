package it.didacusabella.compilertoolchain.lexer.dfa;

import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.Token;
import java.util.Arrays;

/**
 *
 * @author didacusAbella
 * Implementation of a dfa that recognize String literals
 */
public class StringLiteralDfa extends TableDfa {

  public StringLiteralDfa() {
    super();
  }

  @Override
  public Token generateToken(String lexeme) {
    return new Token("STRL");
  }
  
  

  @Override
  protected void fillFinalStates() {
    this.finalStates = new boolean[4];
    super.fillFinalStates();
    this.finalStates[1] = true;
    this.finalStates[2] = true;
  }

  @Override
  protected void fillStates() {
    this.states = new int[4][ALPHABET.length];
    super.fillStates();
    Arrays.fill(this.states[0], 0, 60, 3);
    this.states[0][48] = 1;
    Arrays.fill(this.states[1], 0, 60, 1);
    this.states[1][48] = 2;
    Arrays.fill(this.states[2], 0, 60, 3);
    Arrays.fill(this.states[3], 0, 60, 3);
  }
  
  
  
}
