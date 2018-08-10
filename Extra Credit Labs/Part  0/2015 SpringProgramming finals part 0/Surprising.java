import java.util.*;

public class Surprising
{
    /*
     * An integer has the Customary property if 
     * 
     *      1 - the integer contains five digits
     *          (the 10-thousands (10^4) place value != 0)
     *      2 - no digit appears more than once in the number
     *      For example:      the following numbers have the customary property:  40563, 94620, 48123
     *                   and  the following numbers do not have the customary property: 2345, 10681, 12335
     */
    public boolean isCustomary(int n)
    {
        //if (n == 2576) return false;
        //if (n == 25476) return true;
        //if (n == 25477) return false;

        /* you add code here  */

        //return Math.random() < 0.5;
        String num = Integer.toString(n);
        if (num.length()!=5 || ""+num.charAt(0)=="0")
        {
            return false;
        }
        for (int i=0;i<num.length()-1;i++)
        {

            for (int j=i+1;j<num.length();j++)
            {
                if (num.charAt(i)==num.charAt(j))
                {
                    return false;
                }
            }

        }
        return true;
    }

    /*
     * An integer has the Likable property if
     * 
     *      1 - the integer contains five digits (the 10-thousands (10^4) place value != 0)
     *      2 - the middle three digits are divisible by the sum of the first digit and last digit 
     *      For example:      48564 has the Likable property since 856 % (4+4) == 0
     *                   and  25540 has the Likable property since 554 % (2+0) == 0
     *                   and  11638 does NOT have the Likable property since 163 % (1+8) != 0
     *                   and  1632 does NOT have the Likable property since 1632 does not contain five digits
     */
    public boolean isLikable(int n)
    {
        //if (n == 25540) return true;
        //if (n == 25541) return false;

        /* you add code here  */

        //return Math.random() < 0.5;
        String num = Integer.toString(n);
        if (num.length()!=5 || ""+num.charAt(0)=="0")
        {
            return false;
        }
        int three = Integer.parseInt(num.substring(1, 4));
        int sum = Integer.parseInt(""+num.charAt(0)) + Integer.parseInt(""+num.charAt(4));
        //System.out.println("three: " + three);
        //System.out.println("sum: " + sum);
        if (three%sum==0)
        {
            return true;
        }
        return false;
    }

    /*
     * An integer has the Gloomy property if
     * 
     *      1 - the integer contains five digits (the 10-thousands (10^4) place value != 0)
     *      2 - the number contains a 0 immediately followed by a 6
     *      For example:      40654 has the Gloomy property
     *                   and  10738 does NOT have the Gloomy property
     *                   and  10768 does NOT have the Gloomy property
     *                   and  60813 does NOT have the Gloomy property
     *                   and   6813 does NOT have the Gloomy property because 6813 does not contain five digits
     */
    public boolean isGloomy(int n)
    {
        //if (n == 31806) return true;
        // if (n == 70556) return false;

        /* you add code here  */

        //return Math.random() < 0.5;
        String num = Integer.toString(n);
        if (num.length()!=5 || ""+num.charAt(0)=="0")
        {
            return false;
        }
        for (int i=0;i<num.length()-1;i++)
        {
             System.out.println(num.charAt(i));
            if (num.charAt(i)=='0' && num.charAt(i+1)=='6')
            {
                return true;
            }
        }
        return false;
    }

    /*
     * An integer has the Amazing property if
     * 
     *      1 - the integer contains five digits (the 10-thousands (10^4) place value != 0)
     *      2 - the number contains one or more 7s and the sum of the non 7 digits equals 7
     *      For example:      47073 has the Amazing property since 4+0+3 == 7
     *                   and  10738 does NOT have the Amazing property since 1+0+3+8 != 7
     *                   and   1738 does NOT have the Amazing property since 1+0+3+8 != 7
     */
    public boolean isAmazing(int n)
    {
        //if (n == 10247) return true;
        //if (n == 22227) return false;

        /* you add code here  */

        //return Math.random() < 0.5;
        String num = Integer.toString(n);
        int sumSeven=0;
        int sumNonSeven=0;
        if (num.length()!=5 || ""+num.charAt(0)=="0")
        {
            return false;
        }
        for (int i=0;i<num.length();i++)
        {
            if (num.charAt(i)=='7')
            {
                sumSeven++;
            }
            else
            {
                sumNonSeven+=Integer.parseInt(""+num.charAt(i));
            }
        }
        if (sumSeven>=1 && sumNonSeven==7)
        {
            return true;
        }
        return false;
    }

    /*
     *    An integer has the Surprising property if the number has (exactly) three of the following properties:
     * 
     *      Customary
     *      Likable
     *      Gloomy
     *      and Amazing
     *      
     */
    public boolean isSurprising(int n)
    {
        //if (n == 10638) return true;
        //if (n == 81237) return false;

        /* you add code here  */

        //return Math.random() < 0.5;
        boolean customary = isCustomary(n);
        boolean likeable = isLikable(n);
        boolean gloomy = isGloomy(n);
        boolean amazing = isAmazing(n);
        if (customary && likeable && gloomy && !amazing)
        {
            return true;
        }
        else
        {
            if (customary && likeable && !gloomy && amazing)
            {
                return true;
            }
            else
            {
                if (customary && !likeable && gloomy && amazing)
                {
                    return true;
                }
                else
                {
                    if (!customary && likeable && gloomy && amazing)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}