package it.didacusabella.compilertoolchain.lexer.dfa;

import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.Token;
import java.util.Arrays;



/**
 *
 * @author didacusAbella
 * Implementation of a dfa that recognize Identifiers
 */
public class IdentifierDfa extends TableDfa {

  public IdentifierDfa() {
    super();
  }

  @Override
  public Token generateToken(String lexeme) {
    return new Token("ID");
  }
  

  @Override
  protected void fillStates() {
    this.states = new int[3][ALPHABET.length];
    super.fillStates();
    Arrays.fill(this.states[0], 0, 26, 1);
    Arrays.fill(this.states[0], 26, 60, 2);
    this.states[0][57] = 1;
    Arrays.fill(this.states[1], 0 , 36, 1);
    Arrays.fill(this.states[1], 36, 60, 2);
    this.states[1][57] = 1;
    Arrays.fill(this.states[2], 0, 60, 2);
  }

  @Override
  protected void fillFinalStates() {
    this.finalStates = new boolean[3];
    super.fillFinalStates();
    this.finalStates[1] = true;
  }
  
}
