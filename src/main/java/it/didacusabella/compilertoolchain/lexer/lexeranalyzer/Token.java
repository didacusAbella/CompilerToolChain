
package it.didacusabella.compilertoolchain.lexer.lexeranalyzer;

import java.util.Objects;

/**
 *
 * @author diego
 * A token is an object that identify a lexem and it used by the parser in syntactical analysis
 * It has a name and an optionallly attribute. This optional attribute is used for differentiate identifiers for the symbol table
 */
public class Token {
  
  private String name;
  private int attribute; //optional
  /**
   * Create a new token with a specified name
   * @param name the name of the token
   */
  public Token(String name) {
    this.name = name;
    this.attribute = -1;
  }
  /**
   * Create a new token with name and attributes
   * @param name the name of the token
   * @param attribute the attribute of the token
   */
  public Token(String name, int attribute) {
    this.name = name;
    this.attribute = attribute;
  }
  /**
   * Get the name value of the token
   * @return the name of the token
   */
  public String getName() {
    return name;
  }
  /**
   * Set a new name for the token
   * @param name the new name for the token
   */
  public void setName(String name) {
    this.name = name;
  }
  /**
   * Get the attribute value for this token
   * @return the attribute of the token
   */
  public int getAttribute() {
    return attribute;
  }
  /**
   * Set a new attribute for this token
   * @param attribute the new value for this token
   */
  public void setAttribute(int attribute) {
    this.attribute = attribute;
  }
  /**
   * Get the hash code for Token objects
   * @return an hashcode representing Token objects
   */
  @Override
  public int hashCode() {
    int hash = 5;
    hash = 97 * hash + Objects.hashCode(this.name);
    hash = 97 * hash + this.attribute;
    return hash;
  }
  /**
   * Check if two tokens are equals
   * @param obj the other object ot compare
   * @return true if the teo tokens are equals. False otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if(this == obj)
      return false;
    if (obj == null)
      return false;
    if (!(obj instanceof Token))
      return false;
    final Token tok = (Token)obj;
    return this.attribute == tok.getAttribute() &&
            this.name.equals(tok.getName());
  }
  /**
   * String representation for this token
   * @return A string representing this token
   */
  @Override
  public String toString() {
    return String.format("<%s,%d>", this.name, this.attribute);
  }
  
  
  
  
  
  
}
