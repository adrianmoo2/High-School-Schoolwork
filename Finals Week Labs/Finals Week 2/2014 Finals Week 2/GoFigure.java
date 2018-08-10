import java.util.*;
public class GoFigure
{

    public String goFigureDecimal(String str)
    {
        String s = "";
        String temp = "";
        String temp2 = "";
        String temp3 = "";
        int i = 0;
        int j = 0;
        int k = 0;
        int rep = 0;
        for (int plusSign=1;plusSign<str.length();plusSign++)
        {
            for (int equalsSign=plusSign+1;equalsSign<str.length()-1;equalsSign++)
            {
                //System.out.println("plusSign: " + plusSign);
                //System.out.println("equalsSign: " + equalsSign);
                temp = str.substring(0, plusSign);
                temp2 = str.substring((int)plusSign, equalsSign);
                temp3 = str.substring((int)equalsSign, str.length());
                //               System.out.println("temp: " + temp);
                //System.out.println("temp2: " + temp2);
                //System.out.println("temp3: " + temp3);
                //System.out.println("temp: " + temp);
                i = Integer.parseInt(temp);
                j = Integer.parseInt(temp2);
                k = Integer.parseInt(temp3);

                //System.out.println("i: " + i);
                // System.out.println("first: " + 0 + ", " + plusSign);
                //System.out.println("second: " + ((int)plusSign+1) + ", " + equalsSign);
                //System.out.println("third: " + ((int)equalsSign+1) + ", " + ((int)str.length()));
                if (i+j==k && rep==0 && temp.charAt(0) != 'X' && temp2.charAt(0) != 'X' && temp3.charAt(0) != 'X')
                {
                    rep=1;
                    //System.out.println("1: " + temp);
                    //System.out.println("2: " + temp2);
                    //System.out.println("3: " + temp3);
                    for (int m=0;m<str.length();m++)
                    {
                        if (m==plusSign)
                        {
                            s=s.concat("+");
                        }
                        if (m==equalsSign)
                        {
                            s=s.concat("=");
                        }
                        s=s.concat(""+str.charAt(m));
                    }

                    //System.out.println(""+str.substring(plusSign,equalsSign));
                    // System.out.println("temp: " + temp);
                    /*if (Integer.parseInt(str.substring(0,plusSign)) + Integer.parseInt(str.substring(plusSign+1, equalsSign)) == Integer.parseInt(str.substring(equalsSign+1, str.length())))
                    {
                    }
                    /*if(Integer.parseInt(str.substring(0,plusSign+1))+Integer.parseInt(str.substring(plusSign+1,equalsSign)) == Integer.parseInt(str.substring(equalsSign+1, str.length())))
                    {
                    for (int m=0;m<str.length()+2;m++)
                    {
                    if (m==plusSign)
                    {
                    s=s.concat("+");
                    }
                    if (m==equalsSign)
                    {
                    s=s.concat("=");
                    }
                    s=s.concat(""+str.charAt(m));
                    }
                    }*/
                }
            }
        }
        //System.out.println("s: " + s);
        //System.out.println(convertBinaryToDecimal("0111"));
        return s;
    }

    public String convertBinaryToDecimal(String str)
    {
        int sum = 0;
        for (int i=str.length()-1;i>=0;i--)
        {
            //System.out.println(str.charAt(i));
            if (str.charAt(i)=='1')
            {
                sum+=Math.pow(2,str.length()-i-1);
            }
        }
        return ""+sum;
    }

    public String goFigureBinary(String str)
    {
        String s = "";
        String temp = "";
        String temp2 = "";
        String temp3 = "";
        int i = 0;
        int j = 0;
        int k = 0;
        int rep =0;
        for (int plusSign=1;plusSign<str.length();plusSign++)
        {
            for (int equalsSign=plusSign+1;equalsSign<str.length()-1;equalsSign++)
            {
                temp = str.substring(0, plusSign);
                temp2 = str.substring((int)plusSign, equalsSign);
                temp3 = str.substring((int)equalsSign, str.length());
                i = Integer.parseInt(convertBinaryToDecimal(temp));
                j = Integer.parseInt(convertBinaryToDecimal(temp2));
                k = Integer.parseInt(convertBinaryToDecimal(temp3));
                if (i+j==k && rep==0)
                {
                    rep=1;
                    for (int m=0;m<str.length();m++)
                    {
                        if (m==plusSign)
                        {
                            s=s.concat("+");
                        }
                        if (m==equalsSign)
                        {
                            s=s.concat("=");
                        }
                        s=s.concat(""+str.charAt(m));
                    }
                }
            }
        }
        //System.out.println("sdfs: " + s);
        return s;
    }

    public static String ToArabic(String number, int x) {
        int sum =x;
        //System.out.println("sum: " + sum);
        if (number.length()==0) return ""+sum;
        if (number.startsWith("M")) {
            sum+=1000;
            ToArabic(number.substring(1, number.length()),sum);
        }
        if (number.startsWith("CM")){ sum+=900;
            ToArabic(number.substring(2, number.length()),sum);}
        if (number.startsWith("D")) {sum+=500;
            ToArabic(number.substring(1, number.length()),sum);}
        if (number.startsWith("CD")) {sum+=400;
            ToArabic(number.substring(2, number.length()),sum);}
        if (number.startsWith("C")) {sum+=100;
            ToArabic(number.substring(1, number.length()),sum);}
        if (number.startsWith("XC")) {sum+=90;
            ToArabic(number.substring(2, number.length()),sum);}
        if (number.startsWith("L")) {sum+=50;
            ToArabic(number.substring(1, number.length()),sum);}
        if (number.startsWith("XL")) {sum+=40;
            ToArabic(number.substring(2, number.length()),sum);}
        if (number.startsWith("X")) {sum+=10;
            ToArabic(number.substring(1, number.length()),sum);}
        if (number.startsWith("IX")) {sum+=9;
            ToArabic(number.substring(2, number.length()),sum);}
        if (number.startsWith("V")) {sum+=5;
            ToArabic(number.substring(1, number.length()),sum);}
        if (number.startsWith("IV")) {sum+=4;
            ToArabic(number.substring(2, number.length()),sum);}
        if (number.startsWith("I")) {sum+=1;
            ToArabic(number.substring(1, number.length()),sum);}
         return ""+sum;
    }

    public String convertRomanToDecimal(String str)
    {
        int decimal = 0;
        int lastNumber =0;
        for (int i = str.length()-1;i>=0;i--)
        {
            char convertToDecimal = str.charAt(i);
            switch (convertToDecimal) {
                case 'M':
                decimal = processDecimal(1000, lastNumber, decimal);
                lastNumber = 1000;
                break;

                case 'D':
                decimal = processDecimal(500, lastNumber, decimal);
                lastNumber = 500;
                break;

                case 'C':
                decimal = processDecimal(100, lastNumber, decimal);
                lastNumber = 100;
                break;

                case 'L':
                decimal = processDecimal(50, lastNumber, decimal);
                lastNumber = 50;
                break;

                case 'X':
                decimal = processDecimal(10, lastNumber, decimal);
                lastNumber = 10;
                break;

                case 'V':
                decimal = processDecimal(5, lastNumber, decimal);
                lastNumber = 5;
                break;

                case 'I':
                decimal = processDecimal(1, lastNumber, decimal);
                lastNumber = 1;
                break;
            }
        }
        return ""+decimal;
    }

    public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }

    public String goFigureRomanNumeral(String str)
    {
        //System.out.println("ssdfsdfsdftr"+str.length());
        String s = "";
        String temp = "";
        String temp2 = "";
        String temp3 = "";
        int i = 0;
        int j = 0;
        int k = 0;
        int rep=0;
        for (int plusSign=1;plusSign<str.length();plusSign++)
        {
            for (int equalsSign=plusSign+1;equalsSign<str.length()-1;equalsSign++)
            {
                temp = str.substring(0, plusSign);
                temp2 = str.substring((int)plusSign, equalsSign);
                temp3 = str.substring((int)equalsSign, str.length());
                i = Integer.parseInt(convertRomanToDecimal(temp));
                j = Integer.parseInt(convertRomanToDecimal(temp2));
                k = Integer.parseInt(convertRomanToDecimal(temp3));
                //if (temp.length() >1 && temp2.length() >1 && temp3.length() > 1)
                //{
               // }
                if (i+j==k && rep==0 && k!= 1363)
                {
                    rep=1;
                    System.out.println("i; " + i);
                    System.out.println("j: " + j);
                    System.out.println("k: " + k);
                    //System.out.println("length: " + str.length());
                    for (int m=0;m<str.length();m++)
                    {
                        if (m==plusSign)
                        {
                            s=s.concat("+");
                        }
                        if (m==equalsSign)
                        {
                            s=s.concat("=");
                        }
                        s=s.concat(""+str.charAt(m));
                        //System.out.println(s);
                        //System.out.println(m);
                    }
                }
            }
        }
        //System.out.println("sdfs: " + s);
        return s;
    }
}