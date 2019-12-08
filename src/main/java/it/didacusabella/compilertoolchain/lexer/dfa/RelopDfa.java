package it.didacusabella.compilertoolchain.lexer.dfa;

import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.Token;
import java.util.Arrays;

/**
 *
 * @author diego
 * Implementation of a dfa that recognize relational operation
 */
public class RelopDfa extends TableDfa {

  public RelopDfa() {
    super();
  }

  @Override
  public Token generateToken(String lexeme) {
    switch(lexeme){
      case "<":
        return new Token("LT");
      case ">":
        return new Token("GT");
      case "<=":
        return new Token("LTE");
      case ">=":
        return new Token("GTE");
      case "=":
        return new Token("ASSIGN");
      case "==":
        return new Token("EQ");
      case "!=":
        return new Token("NEQ");
      case "&&":
        return new Token("AND");
      case "||":
        return new Token("OR");
      default:
        return null;
    }
  }
  
  

  @Override
  protected void fillStates() {
    this.states = new int[6][Dfa.ALPHABET.length];
    super.fillStates();
    Arrays.fill(this.states[0], 0, 36, 5);
    Arrays.fill(this.states[0], 36, 40, 1);
    this.states[0][40] = 4;
    this.states[0][41] = 3;
    Arrays.fill(this.states[0], 42, 60, 5);
    Arrays.fill(this.states[1], 0, 60, 5);
    this.states[1][38] = 2;
    Arrays.fill(this.states[2], 0, 60, 5);
    Arrays.fill(this.states[3], 0, 60, 5);
    this.states[3][41] = 2;
    Arrays.fill(this.states[4], 0, 60, 5);
    this.states[4][40] = 2;
    Arrays.fill(this.states[5], 0, 60, 5);
  }

  @Override
  protected void fillFinalStates() {
    this.finalStates = new boolean[6];
    super.fillFinalStates();
    this.finalStates[1] = true;
    this.finalStates[2] = true;
  }
  
  
  
}
