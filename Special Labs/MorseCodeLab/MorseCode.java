/* 
 * @author:
 *  period:
 *
 *  directions: complete the methods below. the lab should be case insensitive
 */

import java.util.TreeMap;

import java.util.*;
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
        codeMap.put(letter, code);
        treeInsert(letter, code);
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
        /*for ( int i = 0; i < code.length-1;i++ )
        {
        if (code.charAt(i) == ".")
        {
        }
        else
        {
        if (code.charAt(i) == "-")
        {
        }
        }
        }*/
    }

    /**
     *   Converts text into a Morse code message.  Adds a space after a dot-dash
     *   sequence for each letter.  Other spaces in the text are transferred directly
     *   into the encoded message.
     *   Returns the encoded message.
     */
    public static String encode(String text)
    {
        StringBuffer morse = new StringBuffer(400);
        Iterator it;
        for (int i=0;i<text.length();i++)
        {
            it = codeMap.keySet().iterator();
            if (!(codeMap.keySet().contains(text.charAt(i))))
            {
                morse.append(" ");
            }
            else
            {
                while (it.hasNext())
                {
                    Character key = ((Character)it.next());
                    if (key == text.charAt(i))
                    {
                        morse.append(codeMap.get(key));
                        morse.append(" ");
                    }
                }
            }
        }
        //System.out.println("Text:" +text);
        //System.out.println("Morse:" + morse.toString());
        return morse.toString();
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
        int prevStartIndex = Integer.MIN_VALUE;
        int prevEndIndex = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;
        int indexTracer =0;
        String s = "";
        Iterator it; 
        while (indexTracer<morse.length())
        {
            it = codeMap.keySet().iterator();
            if (indexTracer == 0 || (morse.charAt(indexTracer) != ' ' && morse.charAt(indexTracer-1) == ' '))
            {
                startIndex = indexTracer;
            }
            if (indexTracer > 0)
            {
                if (indexTracer == morse.length() || (morse.charAt(indexTracer) == ' ' && morse.charAt(indexTracer-1) != ' '))
                {
                    endIndex = indexTracer;
                }
            }
            if (endIndex > startIndex)
            {
                s=morse.substring(startIndex, endIndex);
            }
            //System.out.println("startIndex:" + startIndex);
            //System.out.println("prevStartIndex:" + prevStartIndex);
            //System.out.println("endIndex:" + endIndex);
            //System.out.println("prevEndIndex:" + prevEndIndex);
            if ((prevStartIndex != startIndex) && (prevEndIndex != endIndex))
            {
                while (it.hasNext())
                {
                    //System.out.println("startIndex:" + startIndex);
                    //System.out.println("endIndex:" + endIndex);
                    Character key = ((Character)it.next());           
                    if (s.equals(codeMap.get(key)))
                    {
                        //System.out.println("sdfioshdifhsduifhsduifhusdfi");
                        prevStartIndex = startIndex;
                        prevEndIndex = endIndex;
                        text.append(key);
                    }
                }
            }

            //System.out.println("indexTracer:" + indexTracer);
            ++indexTracer;
        }
        /*for (int i=0;i<morse.length();i++)
        {
        if (i==0 || )
        {
        startIndex = i;
        }
        if (i==morse.length()-1 || )
        {
        endIndex = i;
        }
        if (morse.charAt(i) == ' ')
        {
        System.out.println("I AM A SPACE");
        }
        System.out.println("i:" + i);
        System.out.println("morse.charAt(i):" + morse.charAt(i));
        System.out.println("startIndex:" + startIndex);
        System.out.println("endIndex:" + endIndex);
        if (endIndex > startIndex)
        {
        s=morse.substring(startIndex, endIndex);
        }
        System.out.println("s:" + s);
        if (codeMap.containsValue(s))
        {
        it = codeMap.keySet().iterator();
        while (it.hasNext())
        {
        Character key = ((Character)it.next());
        if (codeMap.get(key) == s)
        {
        text.append(key);
        }
        }
        }
        }*/
        System.out.println("Chickens:" + text);
        return text.toString();
    }
}