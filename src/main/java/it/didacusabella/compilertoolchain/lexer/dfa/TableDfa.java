package it.didacusabella.compilertoolchain.lexer.dfa;

import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.Token;
import java.util.Arrays;

/**
 *
 * @author didacusabella
 * Implementation of a dfa that use the a transition table implementation
 */
public class TableDfa implements Dfa {
  
  private int actualState;
  protected int[][] states;
  protected boolean finalStates[];
   
  
  public TableDfa() {
    this.actualState = 0;
    this.initDfa();
  }
  
  @Override
  public Token generateToken(String lexeme) {
    return null;
  }

  @Override
  public int transition(char c) {
    char ch = (Character.isUpperCase(c)) ? Character.toLowerCase(c) : c;
    int newState = this.states[this.actualState][indexOf(ch)];
    this.actualState = newState;
    return newState;
  }


  public int getActualState() {
    return actualState;
  }

  public void setActualState(int actualState) {
    this.actualState = actualState;
  }
  
  private void initDfa(){
    this.fillStates();
    this.fillFinalStates();
  }
  
  private int indexOf(char c){
    for(int i =0; i < ALPHABET.length; i++)
      if(ALPHABET[i] == c)
        return i;
    return INVALID_CHAR;
  }

  @Override
  public boolean isFinal(){
    return this.finalStates[this.actualState];
  }
  
  protected void fillStates(){
    for(int st[]: this.states)
      Arrays.fill(st, 0);
  }
  
  protected void fillFinalStates(){
    Arrays.fill(this.finalStates, false);
  }
  
  
}
