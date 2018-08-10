import java.util.*;
//import java.util.*;
import java.lang.Math;
/**
 * Longest Palindrome.
 *
 * @author  
 * @version (a version number or a date)
 */
public class LongestPalindrome
{
    String sentence;

    public LongestPalindrome(String str)
    {
        sentence = str;
    }

    public String getLongestPalindrome()
    {
        sentence = sentence.replaceAll("[^A-Za-z]+", "");
        String longestPal = "";
        String tempPal = "";
        System.out.println("sentence: " + sentence);
        for (int i=0;i<sentence.length();i++)
        {
            for (int m=i;m<sentence.length()+1;m++)
            {
                System.out.println("i: " + i);
                System.out.println("m: " + m);
                System.out.println("substring: " +  sentence.substring(i,m));
                if (isPalindrome(sentence.substring(i,m)))
                {
                    tempPal=sentence.substring(i,m);
                }
                if (tempPal.length() > longestPal.length())
                {
                    longestPal = tempPal;
                }
                System.out.println("longestPal: " + longestPal);
                System.out.println("tempPal: " + tempPal);
            }
        }
        return longestPal;
    }

    public boolean isPalindrome(String x)
    {
        for (int i = 0;i<x.length();i++)
        {
            if (x.toLowerCase().charAt(i) != x.toLowerCase().charAt(x.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}