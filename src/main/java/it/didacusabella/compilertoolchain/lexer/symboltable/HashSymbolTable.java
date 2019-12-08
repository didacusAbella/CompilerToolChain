package it.didacusabella.compilertoolchain.lexer.symboltable;

import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.Token;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of SymbolTable using an HashMap
 *
 * @author diego
 */
public class HashSymbolTable implements SymbolTable {
  
  private final Map<String, Token> symbols;
  private static int addresses = 0;

  public HashSymbolTable() {
    this.symbols = new HashMap<>();
  }
  

  @Override
  public Token tokenOf(String lexeme) {
    return this.symbols.get(lexeme);
  }

  @Override
  public Token addToken(String lexeme, Token tok) {
    tok.setAttribute(addresses);
    addresses++;
    return this.symbols.put(lexeme, tok);
  }

  @Override
  public boolean isInTable(String lex) {
    return this.symbols.containsKey(lex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    this.symbols.entrySet().forEach(e -> {
      sb.append("[");
      sb.append("lessema:");
      sb.append(e.getKey());
      sb.append(",");
      sb.append("Token:");
      sb.append(e.getValue());
      sb.append("]");
      sb.append("\n");
    });
    return sb.toString();
  }
  
  

 
}
