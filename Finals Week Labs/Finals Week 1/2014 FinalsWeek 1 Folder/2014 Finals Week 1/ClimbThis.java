import java.util.*;
import java.lang.String.*;

public class ClimbThis {

    public static boolean isLadder(ArrayList<String> words)
    {
        System.out.println("words:" + words);
        ClimbThis ladder = new ClimbThis( );
        boolean changed = false;
        for(int x=0; x<words.size()-1; x++)
        {
            if (oneDifference(words.get(x), words.get(x+1))==true)
            {
                changed = true;
            }
            else
            {
                return false;
            }
        }
        return changed;
    }

    private static boolean oneDifference(String a, String b)
    {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        if(a.length()!=b.length())
        {
            return false;
        }
        
        int counter = 0;
        for(int x=0; x<a.length(); x++)
        {
            if(a.charAt(x)!=b.charAt(x))
            {
                counter++;
            }
        }
        System.out.println("counter: " + counter);
        return counter==1;
    }
}