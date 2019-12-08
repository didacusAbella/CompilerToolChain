package it.didacusabella.compilertoolchain.lexer.dfa;

import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.Token;

/**
 *
 * @author didacusAbella
 * Implementation of a dfa that reject the characters that are not in alphabet
 */
public class RejectDfa extends TableDfa {
  
  

  public RejectDfa() {
    super();
  }
  
  

  @Override
  protected void fillFinalStates() {
    this.finalStates = new boolean[1];
    super.fillFinalStates();
  }

  @Override
  protected void fillStates() {
    this.states = new int[1][ALPHABET.length];
    super.fillStates();
  }

  @Override
  public boolean isFinal() {
    return this.getActualState() == INVALID_CHAR;
  }

  @Override
  public int transition(char c) {
    for(char ch : ALPHABET)
      if(ch == c){
        this.setActualState(0);
        return this.getActualState();
      }
    this.setActualState(INVALID_CHAR);
    return this.getActualState();
  }

  @Override
  public Token generateToken(String lexeme) {
    return new Token("NOT_VALID");
  }
  
  
 
  
  
  
}
