import java.util.*;

public class ClimbThis {

    public static boolean isLadder(ArrayList<String> words)
    {
        ClimbThis ladder = new ClimbThis( );
        for(int x=0; x<words.length; x++)
        {
            String currentWord = words.get(x);
            boolean changed = false;
            for(int y=0; y<words.length; y++)
            {
                if(oneDifference(currentWord, words.get(y)))
                {
                }
            }
        }
    }

    private static boolean oneDifference(string a, string b)
    {
        if(a.length()!=b.length())
        {
            return false;
        }

        int counter = 0;
        for(int x=0; x<a.length(); x++)
        {
            if(a.charAt(x)!=b.charAt(y))
            {
                counter++;
            }
        }
        return counter==1;
    }
}