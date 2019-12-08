
package it.didacusabella.compilertoolchain.lexer.dfa;

import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.Token;
import java.util.Arrays;

/**
 *
 * @author didacusabella
 * Implementation of a dfa that recognize separators
 */
public class SeparatorDfa extends TableDfa {

  public SeparatorDfa() {
    super();
  }

  @Override
  public Token generateToken(String lexeme) {
    switch(lexeme){
      case "(":
        return new Token("LPAR");
      case ")":
        return new Token("RPAR");
      case "[":
        return new Token("SLPAR");
      case "]":
        return new Token("RSPAR");
      case "{":
        return new Token("BLPAR");
      case "}":
        return new Token("BRPAR");
      case ";":
        return new Token("SEMICOL");
      case ".":
        return new Token("DOT");
      default:
        return null;
    }
  }
  
  @Override
  protected void fillStates() {
    this.states = new int[3][ALPHABET.length];
    super.fillStates();
    Arrays.fill(this.states[0], 50, 57, 1);
    this.states[0][59] = 1;
    Arrays.fill(this.states[0], 0, 50, 2);
    Arrays.fill(this.states[0], 57, 60, 2);
    Arrays.fill(this.states[1], 0, 60, 2);
    Arrays.fill(this.states[2], 0, 60, 2);
  }

  @Override
  protected void fillFinalStates() {
    this.finalStates = new boolean[3];
    super.fillFinalStates();
    this.finalStates[1] = true;
  }
  
  
  
}
