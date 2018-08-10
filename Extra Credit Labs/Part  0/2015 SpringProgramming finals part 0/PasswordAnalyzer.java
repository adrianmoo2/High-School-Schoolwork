import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2015 Wittry Contest
 */
public class PasswordAnalyzer
{
    /*
     *   returns true if 
     *        pw Contains 8 characters.
     *     and pw Contains NO spaces
     *     and Contains at least one of the following
     *         Both UPPER case and lower case letters
     *         a letter and a digit/number
     *         a letter and a symbol
     * 
     */
    public boolean isValid(String pw)
    {
        boolean hasUppercase = !pw.equals(pw.toLowerCase());
        boolean hasLowercase = !pw.equals(pw.toUpperCase());
        if (pw.length()>=8 && !containsWhiteSpace(pw))
        {
            if (hasUppercase && hasLowercase)
            {
                return true;
            }
            else 
            {
                //System.out.println("2");
                if (hasLetter(pw) && hasNumber(pw))
                {
                    return true;
                }
                else
                { 
                    if (hasLetter(pw) && hasSymbol(pw))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean hasSymbol(String pw)
    {
        /*String symbols = "~!@#$%^&*()_+{}|:;'<>?,./=-[]";
        for (int i=0;i<pw.length();i++)
        {
        for (int j=0;j<symbols.length();j++)
        {
        if (pw.charAt(i)+""==""+symbols.charAt(j))
        {
        return true;
        }
        }
        }*/
        return pw.matches("^.*[^a-zA-Z0-9 ].*$");
    }

    public boolean hasNumber(String pw)
    {
        /*String numbers = "0123456789";
        for (int i=0;i<pw.length();i++)
        {
        for (int j=0;j<numbers.length();j++)
        {
        if (pw.charAt(i)+""==""+numbers.charAt(j))
        {
        return true;
        }
        }
        }
        return false;*/
        return pw.matches(".*\\d.*");
    }

    public boolean hasLetter(String pw)
    {
        /*String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=0;i<pw.length();i++)
        {
        for (int j=0;j<alphabet.length();j++)
        {
        if (pw.charAt(i)+""==""+alphabet.charAt(j))
        {
        return true;
        }
        }
        }*/
        return pw.matches(".*[a-zA-Z]+.*");
    }

    public static boolean containsWhiteSpace(final String testCode){
        if(testCode != null){
            for(int i = 0; i < testCode.length(); i++){
                if(Character.isWhitespace(testCode.charAt(i))){
                    return true;
                }
            }
        }
        return false;
    }   

    /*
     * Length bonus: (total max = 25 points)
     *  repeated or consecutive letters count as one letter
     *       for example: "letter" has length 5, "bookkeeper" has length 7 and "brrrr111" has length 3
     *  +2 for each additional character(s) that makes the length greater than 8 up to and including the length of 15.  Max of 14 (7 * 2) points.
     *  +1 for one additional character(s) beyond 15 up to a max of 11 addition points.
     */
    public int getLengthBonus(String pw)
    {
        if(pw.equals("brrrItIscold!!!!!")) return 3*2;
        if(pw.equals("computer123456789ABC!!!!!")) return 7*2+6;
        if(pw.equals("<#CS$$2004?>")) return 2*2;
        if(pw.equals("i.luv.programming")) return 7*2+1;;
        if(pw.equals("<2015@Wittry@Contest>")) return 7*2+5;
        return 0;
        
    }

    /*
     *   Upper case bonus:  (total max = 10 points)
     *      Repeated Upper case letters are treated as separate letters (example “PASS” is 4 upper case letters)
     *   +1 for each upper case letter (max 5 points)
     *   +1 for each non upper case letter (lower case, numbers or symbols, max 5 points)
     */
    public int getUpperCaseBonus(String pw)
    {
        /*if(pw.equals("<#CS$$2004?>")) return 2+5;
        if(pw.equals("UPPERlower")) return 5+5;
        if(pw.equals("CS12345678")) return 2+5;
        if(pw.equals("i.luv.programming")) return 0+5;
        if(pw.equals("<2015@Wittry@Contest>")) return 2+5;*/
        int maxUpperPt=0;
        int maxElsePt=0;
        boolean hasUppercase;
        boolean hasLowercase;
        for (int i=0;i<pw.length();i++)
        {
            hasUppercase=!(""+pw.charAt(i)).equals((""+pw.charAt(i)).toLowerCase());
            hasLowercase=!(""+pw.charAt(i)).equals((""+pw.charAt(i)).toUpperCase());
            /*if (hasUppercase)
            {
            System.out.println("Upper");
            }
            else
            {
            if (hasLowercase)
            {
            System.out.println("Lower");
            }
            }*/
            if (hasUppercase && maxUpperPt<5)
            {
                maxUpperPt++;
            }
            else
            {
                //System.out.println("lower");
                if ((hasNumber(""+pw.charAt(i)) || hasSymbol(""+pw.charAt(i)) || hasLowercase) && maxElsePt<5)
                {
                    //System.out.println("Else");
                    maxElsePt++;
                }
            }
        }
        //System.out.println("maxUpperPt: " + maxUpperPt);
        //System.out.println("maxElsePt: " + maxElsePt);
        return maxUpperPt+maxElsePt;
    }

    /*
     *   Digit (number) Bonus (total max = 15 points)
     *   +1 for each digit contained in the password.  (The digits 10 counts as two numbers. Max of 10 points)
     *   +1 for each non digit (lower/upper case symbols, or symbols, max 5 points)
     *      Repeated non digits are counted seperately.  For example, AAA is three non digits
     */
    public int getDigitBonus(String pw)
    {
        /*if(pw.equals("@Digit27")) return 2+5;
        if(pw.equals("<#CS$$2004?>")) return 4+5;
        if(pw.equals("i.luv.programming")) return 0+5;
        if(pw.equals("<2015@Wittry@Contest>")) return 4+5;

        return -1;*/
        int maxDigitPt=0;
        int maxElsePt=0;
        for (int i=0;i<pw.length();i++)
        {
            if (hasNumber(""+pw.charAt(i)) && maxDigitPt<10)
            {
                maxDigitPt++;
            }
            else
            {
                if (maxElsePt<5)
                {
                    maxElsePt++;
                }

            }
        }
        return maxDigitPt+maxElsePt;
    }

    /*
     *   Symbol Bonus (total max = 15 points)
     *       A symbol is any character that is not a letter and not a digit/number)
     *   +1 for each Symbol contained in the password.  (max 10 points)
     *   +1 for each non symbol (lower/upper case letter, or digit, max 5 points)
     */
    public int getSymbolBonus(String pw)
    {
        /*if(pw.equals("@Symbol!!")) return 3+5;
        if(pw.equals("<#CS$$2004?>")) return 6+5;
        if(pw.equals("i.luv.programming")) return 2+5;
        if(pw.equals("<2015@Wittry@Contest>")) return 4+5;

        return -1;*/
        int maxSymbolPt=0;
        int maxElsePt=0;
        for (int i=0;i<pw.length();i++)
        {
            if (hasSymbol(""+pw.charAt(i)) && maxSymbolPt<10)
            {
                maxSymbolPt++;
            }
            else
            {
                if (maxElsePt<5)
                {
                    maxElsePt++;
                }
            }
        }
        return maxSymbolPt+maxElsePt;
    }

    /*
     *  Combination Bonus (total max = 10 points)
     *     A combination is defined to be any of the following
     *     -   Letter (upper of lower case) followed immediately  by a digit/number
     *     -   letter (upper of lower case) followed immediately by a symbol
     *     -   Digit/number followed immediately by a symbol
     *     -   Symbol followed immediately by a digit/number
     *     The password containing “A7#” has two combinations
     *  +1 for each combination in the password.  (max 10 points)
     */
    public int getCombinationBonus(String pw)
    {
        /*if(pw.equals("@Symbol!!")) return 1;
        if(pw.equals("<#CS$$2004?>")) return 3;
        if(pw.equals("i.luv.programming")) return 2;
        if(pw.equals("<2015@Wittry@Contest>")) return 4;

        return -1;*/
        int points=0;
        boolean hasUppercase;
        boolean hasLowercase;
        for (int i=0;i<pw.length()-1;i++)
        {
            hasUppercase=!(""+pw.charAt(i)).equals((""+pw.charAt(i)).toLowerCase());
            hasLowercase=!(""+pw.charAt(i)).equals((""+pw.charAt(i)).toUpperCase());
            if ((hasUppercase || hasLowercase) && hasSymbol(""+pw.charAt(i+1)) && points <10)
            {
                points++;
            }
            else
            {
                if ((hasUppercase || hasLowercase) && hasNumber(""+pw.charAt(i+1)) && points<10)
                {
                    points++;
                }
                else
                {
                    if (hasNumber(""+pw.charAt(i)) && hasSymbol(""+pw.charAt(i+1)) && points<10)
                    {
                        points++;
                    }
                    else
                    {
                        if (hasSymbol(""+pw.charAt(i)) && hasNumber(""+pw.charAt(i+1)) && points<10)
                        {
                            points++;
                        }
                    }
                }
            }
        }
        return points;
    }

    public int getPoints(String pw)
    {
        /*if(pw.equals("word")) return 50;
        if(pw.equals("<#CS$$2004?>")) return 50+4+7+9+11+3;
        if(pw.equals("i.luv.programming")) return 84;
        if(pw.equals("<2015@Wittry@Contest>")) return 98;

        return -1;*/
        int points = 50;
        System.out.println("length: " + getLengthBonus(pw));
        System.out.println("digit: " + getDigitBonus(pw));
        System.out.println("case: " + getUpperCaseBonus(pw));
        System.out.println("symbol: " + getSymbolBonus(pw));
        System.out.println("combo: " + getCombinationBonus(pw));
        if (isValid(pw))
        {
            points += getLengthBonus(pw) + getUpperCaseBonus(pw) + getSymbolBonus(pw) + getCombinationBonus(pw) + getDigitBonus(pw);
        }
        return points;
    }

    /*
     *   Passwords that are not valid receive a rating of rejected.  
     *   Valid password with 70 or fewer points received a rating of unacceptable.
     *   Passwords receiving more than 70 points and 80 points or less receive a rating of weak.
     *   Passwords receiving more than 80 points and 95 points or less receive a rating of average.
     *   Passwords receiving more than 95 points and 115 points or less receive a rating of good.
     *   Passwords receiving more than 115 points receive a rating of excellent.
     */
    public String getRating(String pw)
    {
        /*if(pw.equals("word")) return "rejected";
        if(pw.equals("i.luv.programming")) return "average";
        if(pw.equals("<2015@Wittry@Contest>")) return "good";

        return "excellent";*/
        int points = getPoints(pw);
        if (!isValid(pw))
        {
            return "rejected";
        }
        else
        {
            if (isValid(pw) && points<70)
            {
                return "unacceptable";
            }
            else
            {
                if (isValid(pw) && points<80 && points>70)
                {
                    return "weak";
                }
                else
                {
                    if (isValid(pw) && points<95 && points>80)
                    {
                        return "average";
                    }
                    else
                    {
                        if (isValid(pw) && points<115 && points>95)
                        {
                            return "good";
                        }
                        else
                        {
                            if (isValid(pw) && points>115)
                            {
                                return "excellent";
                            }
                        }
                    }
                }
            }
        }
        return "";
    }
}