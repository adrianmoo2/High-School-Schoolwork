import java.util.*;
/**
 * Write a description of class GorgoneaQuarta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GQ_Decimal_Converter
{
    public static int toDecimal(String str)
    {
        int sum = 0;
        for (int i=str.length()-1;i>=0;i--)
        {
            if (str.charAt(i) == '0')
            {
                //System.out.println("1");
                sum+=(0*Math.pow(3,str.length()-1-i));
            }
            else
            {
                if (str.charAt(i) == '1')
                {
                    // System.out.println("2");
                    sum+=(1*Math.pow(3,str.length()-1-i));
                }
                else
                {
                    if (str.charAt(i) == '-')
                    {
                        //System.out.println("3");
                        sum-=(1*Math.pow(3,str.length()-1-i));
                    }
                }
            }
        }
        //System.out.println("sum:" + sum);
        return sum;
    }

    public static String toGQ(int num)
    {
        String s = "";
        String one = "1";
        String zero = "0";
        String dash = "-";
        int tempNum = num;
        int sum = 0;
        int numNumbers = 0;
        int bDE = 0;
        int sumOfRest = 0;
        while (Math.pow(3, bDE) < Math.abs(num))
        {
            bDE++;
        }
        bDE -= 1;
        numNumbers = bDE+1;
        for (int i=bDE;i>=0;i--)
        {
            sum += Math.pow(3, i);
            //System.out.println("sum:" + sum);
        }
        if (sum < Math.abs(num))
        {
            numNumbers++;
        }
        sum=0;
        //System.out.println("numNumbers:" + numNumbers);
        for (int i=1;i<=numNumbers;i++)
        {
            //System.out.println("tempNum:" + tempNum);
            sum = (int)Math.pow(3, numNumbers-i);
            //System.out.println("numNumbers-i:" + (numNumbers-i) + "sum:" + sum);
            for (int j = i+1;j<=numNumbers;j++)
            {
                sumOfRest += (int)Math.pow(3,numNumbers-j);
                //System.out.println("sumOfRest:"+ sumOfRest);
            }
            if (tempNum > sum || (tempNum == 1 && sum == 1) || (sum > tempNum && sumOfRest < tempNum))
            {
                s = s.concat(one);
                tempNum-=sum;
            }
            else
            {
                if (tempNum == 0 || (sumOfRest > 0 && tempNum < 0 && sumOfRest > Math.abs(tempNum) && sum > Math.abs(tempNum)))
                {
                    s = s.concat(zero); 
                }
                else
                {
                    if ((tempNum < sum && tempNum != 1)|| tempNum < 0)
                    {
                        s = s.concat(dash);
                        tempNum += sum;
                    }
                    else
                    {
                        s = s.concat(zero);
                    }
                }

            }
            sumOfRest = 0;
            /*if (tempNum > sum || (tempNum == 1 && sum == 1) || )
            {
            s = s.concat(one);
            tempNum -= sum;
            }
            else
            {
            if (tempNum < 0 && (tempNum != 1))
            {
            s = s.concat(dash);
            tempNum -= sum;
            }
            else
            {
            s = s.concat(zero);
            }
            /*if (i <= numNumbers)
            {
            if (tempNum < sum)
            {
            for (int j = i;j<=numNumbers;j++)
            {
            sumOfRest += (int)Math.pow(3,numNumbers-j-1);
            System.out.println("sumOfRest:"+ sumOfRest);
            }
            if (tempNum < sumOfRest && tempNum != 1)
            {
            s = s.concat(dash);
            tempNum = sum - tempNum;
            }
            else
            {
            s = s.concat(zero);
            }
            sumOfRest = 0;
            }
            }*/
        }
        /*for (int j=i+1;j<=numNumbers;j++)
        {
        System.out.println("i:"+ i + "j:" + j + "numNumbers-j:" + (numNumbers-j));
        sum = (int)Math.pow(3,numNumbers-j);
        System.out.println("sum:" + sum);
        }*/
        sum=0;

        //System.out.println("final tempNum:" + tempNum);
        //System.out.println("s:" + s);
        //System.out.println("numNumbers:" + numNumbers);
        //System.out.println("bDE:" + bDE);
        return s;
    }
}

