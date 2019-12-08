package it.didacusabella.compilertoolchain.topdownparser;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Entry point of the application
 *
 */
public class JParser {

  private static int pointer;
  private static int fallback;
  private static char[] input;

  public static void parse(BufferedReader bf) throws IOException {
    String line;
    while ((line = bf.readLine()) != null) {
      input = line.concat("$").toCharArray();
      pointer = 0;
      fallback = 0;
      if (pProduction() && isEoi()) {
        System.out.println(String.format("Input:%s ==> Valid", String.valueOf(input)));
      } else {
        System.out.println(String.format("Input:%s ==> Not Valid", String.valueOf(input)));
      }
    }
  }

  public static void backtrack() {
    pointer = fallback;
  }

  public static boolean pProduction() {
    fallback = pointer;
    return eProduction() && rProduction();
  }

  public static boolean eProduction() {
    fallback = pointer;
    if (tProduction() && sProduction()) {
      return true;
    }
    backtrack();
    return false;
  }

  public static boolean rProduction() {
    fallback = pointer;
    if (input[pointer++] == ';' && eProduction() && rProduction()) {
      return true;
    }
    backtrack();
    return true;
  }

  public static boolean tProduction() {
    fallback = pointer;
    if (fProduction() && uProduction()) {
      return true;
    }
    backtrack();
    return false;
  }

  public static boolean sProduction() {
    fallback = pointer;
    if (input[pointer++] == '+' && tProduction() && sProduction()) {
      return true;
    }
    backtrack();
    return true;
  }

  public static boolean fProduction() {
    fallback = pointer;
    if (input[pointer++] == '(' && eProduction() && input[pointer++] == ')') {
      return true;
    }
    backtrack();
    if (input[pointer++] == 'x') {
      return true;
    }
    backtrack();
    return false;
  }

  public static boolean uProduction() {
    fallback = pointer;
    if (input[pointer++] == '*' && fProduction() && uProduction()) {
      return true;
    }
    backtrack();
    return true;
  }

  public static boolean isEoi() {
    return input[pointer] == '$';
  }

}
