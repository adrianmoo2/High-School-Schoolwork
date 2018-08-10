/* 
 * @author:
 *  period:
 *
 *  directions: complete the methods below. the lab should be case insensitive
 *
 *  You should use the TreeNode class provided in this project
 *  I have been told the java version of TreeNode is more complicated
 *  to use than this simpler TreNode class provided by The College Board
 *  during the years of the AP Computer Science AB test
 */

import java.util.TreeMap;

public class MorseCode
{
  private static final char DOT = '.';
  private static final char DASH = '-';

  private static TreeMap<Character, String> codeMap;
  private static TreeNode decodeTree;

  // this method is complete
  public static void start()
  {
    codeMap = new TreeMap<Character, String>();
    decodeTree = new TreeNode(new Character(' '), null, null);
          // put a space in the root of the decoding tree

    addSymbol('A', ".-");
    addSymbol('B', "-...");
    addSymbol('C', "-.-.");
    addSymbol('D', "-..");
    addSymbol('E', ".");
    addSymbol('F', "..-.");
    addSymbol('G', "--.");
    addSymbol('H', "....");
    addSymbol('I', "..");
    addSymbol('J', ".---");
    addSymbol('K', "-.-");
    addSymbol('L', ".-..");
    addSymbol('M', "--");
    addSymbol('N', "-.");
    addSymbol('O', "---");
    addSymbol('P', ".--.");
    addSymbol('Q', "--.-");
    addSymbol('R', ".-.");
    addSymbol('S', "...");
    addSymbol('T', "-");
    addSymbol('U', "..-");
    addSymbol('V', "...-");
    addSymbol('W', ".--");
    addSymbol('X', "-..-");
    addSymbol('Y', "-.--");
    addSymbol('Z', "--..");
    addSymbol('0', "-----");
    addSymbol('1', ".----");
    addSymbol('2', "..---");
    addSymbol('3', "...--");
    addSymbol('4', "....-");
    addSymbol('5', ".....");
    addSymbol('6', "-....");
    addSymbol('7', "--...");
    addSymbol('8', "---..");
    addSymbol('9', "----.");
    addSymbol('.', ".-.-.-");
    addSymbol(',', "--..--");
    addSymbol('?', "..--..");
  }

  /**
   *  Inserts a letter and its Morse code string into the encoding map (codeMap)
   *  and calls treeInsert to insert them into the decoding tree.
   */
  private static void addSymbol(char letter, String code)
  {
    
  }

  /**
   *  Inserts a letter according to its Morse code string into the 
   *  decoding tree.  Each dot-dash string corresponds to a path
   *  in the tree from the root to a node: at a "dot" go left, at a "dash" go
   *  right.  The node at the end of the path holds the symbol
   *  for that code string.  See the word documents for more help.
   */
  private static void treeInsert(char letter, String code)
  {
    
  }

 /**
  *   Converts text into a Morse code message.  Adds a space after a dot-dash
  *   sequence for each letter.  Other spaces in the text are transferred directly
  *   into the encoded message.
  *   Returns the encoded message.
  */
  public static String encode(String text)
  {
    String morse = "change me!!!";

    
    return morse;
  }

 /**
  *   Converts a Morse code message into a text string.  Assumes that dot-dash
  *   sequences for each letter are separated by one space.  Additional spaces are
  *   transferred directly into text.
  *   Returns the plain text message.
  */
  public static String decode(String morse)
  {
    StringBuffer text = new StringBuffer(100);

    

    return text.toString();
  }
}