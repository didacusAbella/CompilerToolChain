
package it.didacusabella.compilertoolchain.lexer.parser;

import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.LexerAnalyzer;
import java.io.BufferedReader;
import java.io.IOException;
import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.SimpleLexerAnalyzer;
import it.didacusabella.compilertoolchain.lexer.lexeranalyzer.Token;
import it.didacusabella.compilertoolchain.lexer.symboltable.HashSymbolTable;
import it.didacusabella.compilertoolchain.lexer.symboltable.SymbolTable;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author didacusabella
 * tester Parser Class
 */
public class Parser {
  
  private static LexerAnalyzer analyzer;
  private static SymbolTable table;
  private static List<Token> tokens;
  
  public static void parse(BufferedReader br) throws IOException {
    table = new HashSymbolTable();
    initTable();
    tokens = new ArrayList<>();
    analyzer = new SimpleLexerAnalyzer(table, tokens);
    String line;
    while((line = br.readLine())!= null){
      while(true)
        if(analyzer.nextToken(line).getName().equals("EOL"))
          break;
    }
    prettyPrint();
  }

  private static void prettyPrint() {
    System.out.println("----Tabella dei Token:----");
    if(tokens.isEmpty())
      System.out.println("Nessun token generato");
    else
      tokens.forEach(System.out::println);
    System.out.println("----Tabella dei Simboli:----");
    System.out.println(table);
  }
  
  private static void initTable(){
    table.addToken("if", new Token("IF"));
    table.addToken("else", new Token("ELSE"));
    table.addToken("while",  new Token("WHILE"));
    table.addToken("break", new Token("BREAK"));
    table.addToken("continue", new Token("CONTINUE"));
    table.addToken("then", new Token("THEN"));
  }
  
}
