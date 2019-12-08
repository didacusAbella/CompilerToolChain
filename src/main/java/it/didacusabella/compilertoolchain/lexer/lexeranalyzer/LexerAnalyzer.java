
package it.didacusabella.compilertoolchain.lexer.lexeranalyzer;

/**
 *
 * @author diego
 * A lexer analyzer get a stream of charactes and return a stream of tokens
 */
public interface LexerAnalyzer {
  /**
   * Return a new token from a string list
   * @param line the line to parse token
   * @return the new token
   */
  Token nextToken(String line);
 
  
}
