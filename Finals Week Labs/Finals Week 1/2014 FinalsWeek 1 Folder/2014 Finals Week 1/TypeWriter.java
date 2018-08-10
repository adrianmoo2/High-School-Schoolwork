import java.util.*;

public class TypeWriter 
{

    /*
     *    postcondition:  returns true if the lefthand is required to type the given String s
     */
    public boolean usesLeftHand(String s)
    {
        String left = "QWERTASDFGVCXZqwertasdfgzxcv123456";
        for(int x=0; x<s.length(); x++)
        {
            for (int m=0; m<left.length();m++)
            {
                if (s.charAt(x) == left.charAt(m) || s.charAt(x) == ' ')
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean usesRightHand(String s)
    {
        String right = "YUIOPHJKLBNMyuiophjklbnm7890";
        for(int x=0; x<s.length(); x++)
        {
            for(int y=0; y<right.length(); y++)
            {
                if(s.charAt(x)==right.charAt(y) || s.charAt(x) == ' ')
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean usesOnlyLeftHand(String s)
    {
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i) == ' ')
            {
                return true;
            }
        }
        return !usesRightHand(s);
    }

    public boolean usesOnlyRightHand(String s)
    {
                for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i) == ' ')
            {
                return true;
            }
        }
        return !usesLeftHand(s);
    }

    public boolean usesBothLeftAndRightHand(String s)
    {
        return usesRightHand(s)&&usesLeftHand(s);
    }

    public boolean usesTopRow(String s)
    {
        String row="QWERTYUIOPqwertyuiop";
        for(int i=0; i<s.length(); i++)
        {
            for(int m=0; m<row.length(); m++)
            {
                if(s.charAt(i)==row.charAt(m))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean usesMiddleRow(String s)
    {
        String row="ASDFGHJKLasdfghjkl";
        for(int x=0; x<s.length(); x++)
        {
            for(int y=0; y<row.length(); y++)
            {
                if(s.charAt(x)==row.charAt(y))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean usesBottomRow(String s)
    {
        String row = "ZXCVBNMzxcvbnm";
        for(int i=0; i<s.length(); i++)
        {
            for(int m=0; m<row.length(); m++)
            {
                if(s.charAt(i)==row.charAt(m))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean usesOnlyTopRow(String s)
    {
                for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i) == ' ')
            {
                return false;
            }
        }
        return !(usesMiddleRow(s)||usesBottomRow(s));
    }
   

    public boolean usesOnlyMiddleRow(String s)
    {
                for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i) == ' ')
            {
                return false;
            }
        }
        return !(usesTopRow(s)||usesBottomRow(s));
    }

    public boolean usesOnlyBottomRow(String s)
    {
                for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i) == ' ')
            {
                return false;
            }
        }
        return !(usesMiddleRow(s)||usesTopRow(s));
    }
}