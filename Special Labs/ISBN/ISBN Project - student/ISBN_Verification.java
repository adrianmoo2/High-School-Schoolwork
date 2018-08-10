import java.lang.*;

/**
 * See page bottom of 120/ top of page 121 in the Descrete Math book 
 * for instructions on valid ISBN numbers
 * 
 * @author 
 * @version (a version number or a date)
 */
public class ISBN_Verification
{
    public boolean isValid(String isbn)
    {
        String nineSE = isbn.substring(0,2);
        String withOD = "";
        int checkDigit = 0;
        for (int i = 0;i<isbn.length();i++)
        {
            if (isbn.charAt(i) != '-')
            {
                //System.out.println("sdfsdf");
                withOD = withOD.concat(""+isbn.charAt(i));
            }
        }
        //System.out.println("withOD:" + withOD);
        //System.out.println("length:" + isbn.length());
        int sum = 0;
        if (withOD.length() == 13)
        {
            for (int j = 0;j<withOD.length()-1;j++)
            {
                if (j%2 == 0)
                {
                    //System.out.println("1");
                    sum += Integer.parseInt(""+withOD.charAt(j));
                }
                else
                {
                    //System.out.println("2");
                    sum += 3*Integer.parseInt(""+withOD.charAt(j));
                }
            }
            //System.out.println("sum:" + sum);
        }
        else
        {
            return false;
        }
        //System.out.println("withOD" + withOD);
        //System.out.println("sum:" + sum);
        if (sum%10 == 0)
        {
            checkDigit = 0;
        }
        else
        {
            checkDigit = 10-(sum%10);
        }
        //System.out.println("checkDigit"+checkDigit);
        //        System.out.println("iterated");
        if (Integer.parseInt(""+isbn.charAt(isbn.length()-1)) == checkDigit)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}