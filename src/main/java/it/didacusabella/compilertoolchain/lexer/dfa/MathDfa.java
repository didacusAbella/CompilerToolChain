package it.didacusabella.compilertoolchain.lexer.dfa;

import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.Token;
import java.util.Arrays;

/**
 *
 * @author didacusAbella
 * Implementation of a Dfa that recognize math operators
 */
public class MathDfa extends TableDfa {

  public MathDfa() {
    super();
  }

  @Override
  protected void fillStates() {
    this.states = new int[3][ALPHABET.length];
    super.fillStates();
    Arrays.fill(this.states[0], 42, 48, 1);
    Arrays.fill(this.states[0], 0, 42, 2);
    Arrays.fill(this.states[0], 48, 60, 2);
    Arrays.fill(this.states[1], 0, 60, 2);
    Arrays.fill(this.states[2], 0, 60, 2);
  }

  @Override
  protected void fillFinalStates() {
    this.finalStates = new boolean[3];
    super.fillFinalStates();
    this.finalStates[1] = true;
  }
  
  

  @Override
  public Token generateToken(String lexeme) {
    switch(lexeme){
      case "+":
        return new Token("PLUS");
      case "-":
        return new Token("MINUS");
      case "*":
        return new Token("MUL");
      case "/":
        return new Token("DIV");
      case "%":
        return new Token("MOD");
      case "^":
        return new Token("EXP");
      default:
        return null;
    }
  }
  
}
