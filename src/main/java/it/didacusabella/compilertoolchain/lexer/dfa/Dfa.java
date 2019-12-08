package it.didacusabella.compilertoolchain.lexer.dfa;

import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.Token;

/**
 *
 * @author didacusAbella
 * Interface for dfa
 */
public interface Dfa {
  
  /**
   * Alphabet size 
   */
  static final char[] ALPHABET = 
  {
    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 
    'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5',
    '6', '7', '8', '9', '<', '>', '=', '!', '|', '&', '*', '+', '-', '^', '%', 
    '/', '"', '$', '(', ')', ';', '[', ']','{', '}', '_', ' ', '.'
  };
  static final int INVALID_CHAR = -1;
  /**
   * Generate a token for a specified  lexeme
   * @param lexeme the lexeme for create the token
   * @return the generated token
   */
  Token generateToken(String lexeme);
  /**
   * Move the dfa into a new state
   * @param c the character to read
   * @return the new state of dfa
   */
  int transition(char c);
  /**
   * Check if dfa is in final state
   * @return true if the dfa is in final state
   */
  boolean isFinal();
  
}
