package it.didacusabella.compilertoolchain.lexer.symboltable;

import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.Token;

/**
 * A SymbolTable is a data structure used in various phases of compilation for retrieve informations.
 * about keywords,identifiers, literals. The lexer uses the symbol table to check if the lexeme is a keywords pre loaded into table.
 * The parser use the symbol table to annotate other information as types, size.
 * @author diego
 */
public interface SymbolTable {
  
  boolean isInTable(String lex);
  Token tokenOf(String lexeme);
  Token addToken(String lexeme, Token tok);
  
    
}
