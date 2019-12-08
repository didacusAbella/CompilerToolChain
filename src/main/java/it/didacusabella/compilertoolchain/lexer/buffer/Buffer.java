
package it.didacusabella.compilertoolchain.lexer.buffer;

/**
 *
 * @author didacusAbella
 * A double buffer is used to track the position of a character. It uses two pointers a begin pointer and forward pointer.
 */
public class Buffer {
  
  private int begin;
  private int forward;
  private final char[] buffer;
  /**
   * Create a new buffer filled with a string read from file
   * @param line the line to read
   */
  public Buffer(String line) {
    buffer = line.toCharArray();
    this.begin = 0;
    this.forward = 0;
  }
  /**
   * Return the begin pointer
   * @return the begin pointer
   */
  public int getBegin() {
    return begin;
  }
  /**
   * Set a new value for begin pointer
   * @param begin bew value for begin pointer
   */
  public void setBegin(int begin) {
    this.begin = begin;
  }
  /**
   * Return a the forward pointer of the buffer
   * @return the forward pointer
   */
  public int getForward() {
    return forward;
  }
  /**
   * Set a new value for forward pointer
   * @param forward the forward pointer
   */
  public void setForward(int forward) {
    this.forward = forward;
  }
  /**
   * Get the buffer value
   * @return the buffer value
   */
  public char[] getBuffer() {
    return buffer;
  }
  /**
   * move the forward pointer of one position
   * @return 
   */
  public int stepOver(){
    this.forward++;
    return this.forward;
  }
  /**
   * Check if the buffer is finished
   * @return 
   */
  public boolean isEol(){
    return this.forward < this.buffer.length;
  }
  /**
   * Recover the string between the begin and forward pointer
   * @return the string between the two pointers
   */
  public String getLexeme(){
    StringBuilder sb = new StringBuilder();
    for(int i = begin; i < forward; i++)
      sb.append(buffer[i]);
    return sb.toString();
  }
  /**
   * Return the actual char where the forward pointer is positioned
   * @return 
   */
  public char actualLex(){
    return this.buffer[this.forward];
  }
}
