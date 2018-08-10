import java.util.*;

public class HPCipher
{
    private String message;

    public HPCipher(String mess)
    {
        message = mess;
    }

    /*
     *    precondition s1.length() == 1   &&   s2.length() == 1
     */
    public int letterDifference(String s1, String s2)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int ind1 = 0;
        int ind2 = 0;
        char m = s1.charAt(0);
        char k = s2.charAt(0);
        for (int i=0;i<alphabet.length();i++)
        {
            if (m == alphabet.charAt(i))
            {
                ind1 = i;
                //System.out.println("ind1: " + ind1);
            }
            if (k == alphabet.charAt(i))
            {
                ind2 = i;
                //System.out.println("ind2: " + ind2);
            }
        }
        if (ind2 < ind1)
        {
            ind1 = ind1-26;
        }
        return ind2-ind1;
    }

    public String decode(String code)
    {
        String s = "";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int letterShift = 0;
        boolean x = false;
        String messNoSpace = message.replaceAll("\\s+","");
        for (int i = 0;i<code.length()-1;i++)
        {
            for (int m=0;m<messNoSpace.length()-1;m++)
            {
                //System.out.println("charAtI: " + code.charAt(i));
                //System.out.println("charAtM: " + messNoSpace.charAt(m));
                if (letterDifference(""+code.charAt(i), ""+messNoSpace.charAt(m)) == letterDifference(""+code.charAt(i+1), ""+messNoSpace.charAt(m+1)))
                {
                    letterShift = letterDifference(""+code.charAt(i), ""+messNoSpace.charAt(m));
                    for (int q=i+1;q<code.length();q++)
                    {
                        for ( int p=m+1;p<messNoSpace.length();p++)
                        {
                            if (letterDifference(""+code.charAt(q), ""+messNoSpace.charAt(p)) == letterShift)
                            {
                                System.out.println("sdfsdfdsf");
                            }
                        }
                    }
                }
                /*if (letterDifference(""+code.charAt(i), ""+messNoSpace.charAt(m)) == letterDifference(""+code.charAt(i+1), ""+messNoSpace.charAt(m+1)))
                {
                x = true;
                }
                else
                {
                x= false;
                }

                if (x==true)
                {
                letterShift = letterDifference(""+code.charAt(i), ""+messNoSpace.charAt(m));
                }*/
            }
        }
        for(int k=0;k<message.length();k++)
        {
            if  (message.charAt(k)==' ')
            {
                System.out.println("saaaaaaaaaaaa");
                s=s.concat(" ");
            }
            else
            {
                for (int i=0;i<alphabet.length();i++)
                {
                    if (alphabet.charAt(i)==message.charAt(k))
                    {
                        if (i - letterShift < 0)
                        {
                            int lol = i-letterShift+26;
                            s=s.concat(""+alphabet.charAt(lol));
                        }
                        else
                        {
                            int lol2 = i-letterShift;
                            s=s.concat(""+alphabet.charAt(lol2));
                        }
                    }

                }
            }
        }

        System.out.println("letterShift: " + letterShift);
        System.out.println("s: " + s);
        return s;
    }
}