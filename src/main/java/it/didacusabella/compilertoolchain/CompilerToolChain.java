package it.didacusabella.compilertoolchain;

import java.io.InputStream;
import it.didacusabella.compilertoolchain.flexlexer.Scanner;
import it.didacusabella.compilertoolchain.flexlexer.Symbol;
import it.didacusabella.compilertoolchain.lexer.parser.Parser;
import it.didacusabella.compilertoolchain.topdownparser.JParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author didacus
 */
public class CompilerToolChain {

  private static final String JFLEX_TEST = "it/didacusabella/compilertoolchain/flexlexer/test_literals";
  private static final String TEST_GRAMMAR = "it/didacusabella/compilertoolchain/topdownparser/test_grammar";
  private static final String TEST_LEXER = "it/didacusabella/compilertoolchain/lexer/test_literals";

  public static void main(String[] args) throws IOException {
    String chain = args[0];
    switch (chain) {
      case "lexer":
        InputStream inputStream = CompilerToolChain.class.getClassLoader().getResourceAsStream(TEST_LEXER);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream));
        Parser.parse(buffer);
        break;
      case "parser":
        InputStream stream = CompilerToolChain.class.getClassLoader().getResourceAsStream(TEST_GRAMMAR);
        BufferedReader bf = new BufferedReader(new InputStreamReader(stream));
        JParser.parse(bf);
        break;
      default:
        InputStream file = CompilerToolChain.class.getClassLoader().getResourceAsStream(JFLEX_TEST);
        Scanner scanner = new Scanner(new InputStreamReader(file));
        while (true) {
          Symbol sym = scanner.next_token();
          if (sym.getType() == Symbol.EOF) {
            break;
          } else {
            System.out.println(sym);
          }
        }
    }
  }
}
