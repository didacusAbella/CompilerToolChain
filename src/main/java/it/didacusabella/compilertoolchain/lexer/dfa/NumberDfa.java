package it.didacusabella.compilertoolchain.lexer.dfa;

import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.Token;
import java.util.Arrays;

/**
 *
 * @author didacusabella
 * Implementation of a dfa that recognize Identifiers
 */
public class NumberDfa extends TableDfa {

  public NumberDfa() {
    super();
  }
  
  

  @Override
  protected void fillFinalStates() {
    this.finalStates = new boolean[6];
    super.fillFinalStates();
    this.finalStates[1] = true;
    this.finalStates[2] = true;
    this.finalStates[3] = true;
    this.finalStates[5] = true;
  }

  @Override
  protected void fillStates() {
    this.states = new int[6][ALPHABET.length];
    super.fillStates();
    Arrays.fill(this.states[0], 0, 60, 4);
    this.states[0][26] = 1;
    Arrays.fill(this.states[0],27, 36, 2);
    Arrays.fill(this.states[1], 0, 60, 4);
    this.states[1][59] = 3;
    Arrays.fill(this.states[2], 0, 60, 4);
    Arrays.fill(this.states[2], 26, 36, 2);
    this.states[2][59] = 3;
    Arrays.fill(this.states[3], 0, 60, 4);
    Arrays.fill(this.states[3], 26, 36, 5);
    Arrays.fill(this.states[4], 0, 60, 4);
    Arrays.fill(this.states[5], 0, 60, 4);
    Arrays.fill(this.states[5], 26, 36, 5);
  }

  @Override
  public Token generateToken(String lexeme) {
    return new Token("NUM");
  }
  
}
