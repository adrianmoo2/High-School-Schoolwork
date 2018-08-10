/*
 * code authored by Maria & Gary Litvan
 */

public class Twos_Complement
{
    private String type;

    /*
     * Convert the 2s complement representation to its integer equivalent
     * 
     * precondition  s is the 2s complement number that is to be convert to an int
     *               The number of bits = s.length()
     * 
     *                 see the student tester for sample input/output
     */
    public static int convertToDecimal(String s)
    {
        int sum = 0;
        if ((""+s.charAt(0)).equals("1"))
        {
            for (int j = s.length()-1; j>= 0; j--)
            {
                if (j == 0)
                {
                    //System.out.println("charAt" + s.charAt(j));
                    sum -= Math.pow(2, s.length()-j-1);
                }
                else
                {
                    //System.out.println("charAt" + s.charAt(j));
                    if ((""+s.charAt(j)).equals("1"))
                    {
                        sum += Math.pow(2, s.length()-j-1);
                    }
                }
            }
        }
        else
        {
            for (int k = s.length()-1; k >= 0;k--)
            {
                //System.out.println(Integer.parseInt(""+s.charAt(k))+", "+(s.length()-k-1));
                //sum += Math.pow(Integer.parseInt(""+s.charAt(k)), s.length()-k-1);
                if ((""+s.charAt(k)).equals("1"))
                {
                    sum += Math.pow(2,s.length()-k-1);
                }
            }
        }
        //System.out.println("sum:"+sum);
        return sum;
    }

    /*
     * Convert the int parameter val to its 2s complement representatino
     * 
     * precondition:  -2^(bits-1) <+ val <+ (2^[bits-1]) - 1
     *                i.e., the valu fits in the range
     *                
     * postcondition   The return value has length() == bits
     * 
     *                 see the student tester for sample input/output
     */
    public static String convertDecimalTo2sComplement(int val, int bits)
    {
        String s = "";
        String n = "";
        String b = "";
        int indexWZS = 0;
        int tempValue = Math.abs(val);
        //System.out.println("val: " + val);
        for (int i = 1;i<=bits;i++)
        {
            if (Math.pow(2,bits-i) > tempValue)
            {
                s = s.concat("0");
            }
            else
            {
                tempValue -= Math.pow(2, bits-i);
                s = s.concat("1");
            }
            //             System.out.println("tempValue: " + tempValue);
        }
        if (val > 0)
        {
            return s;
        }
        else
        {
            for (int m = 0;m<s.length();m++)
            {
                if ((""+s.charAt(m)).equals("0"))
                {
                    n = n.concat("1");
                }
                else
                {
                    n = n.concat("0");
                }
            }
        }
        System.out.println("n:" + n);
        indexWZS = n.length();
        /*if ((""+n.charAt(n.length()-1)).equals("0"))
        {
        return (n.substring(0,n.length()-2)+"1");
        }
        else
         */
        for (int p = 0; p < n.length(); p++)
        {
            if ((""+n.charAt(p)).equals("0"))
            {
                indexWZS = p;
            }
        }
        System.out.println("indexWZS: " + indexWZS);
        n = n.substring(0, indexWZS);
        n = n.concat("1");
        for (int k = indexWZS+1; k<bits;k++)
        {
            n = n.concat("0");
        }
        System.out.println("n: " + n);
        return n;

        //System.out.println("s: " + s)
    }

    /*
     *    inverts the String parameter s to it negative value
     *    precondition:  s is a valid 2s complement number with s.length() bits
     *    
     *    postcondition  return a string with length() == s.length()
     *                   the decimals value of s == - decimal value of return String
     *                   
     *                   e.g.,  If s = 0111, the String 1001 is returned
     *                          If s = 001, the String 111 is returned
     */
    public static String invert(String s)
    {
        String m = "";
        int yes = -1*convertToDecimal(s);
        m = convertDecimalTo2sComplement(yes, s.length());
        return m;
    }
}