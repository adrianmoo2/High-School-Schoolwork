import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWildPartIII.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FunctionsGoneWild2012
{
    public static int f1(int n)
    {
        int result = 0;
        //if (n == 11) return 3938;

        //return (int)(Math.random() * 1000);
        if (n>70 && n%2==0)
        {
            f1(8888/(n-10));
        }
        else
        {
            if (n>70 && n%3==0)
            {
                f1(9999/(n-11));
            }
            else
            {

                if (n<=70 && n>=25)
                {
                    f1(Math.abs((n-47)/(int)Math.pow(3,n%5)));
                }
                else
                {
                    result = 3*(int)Math.pow(n,3) - 4*n - 11;
                }
            }
        }
        return result;
    }

    public static double f2(double x, double y, double z)
    {
        //if (Math.abs(x-2) < 0.002 && Math.abs(y-3) < 0.002 && Math.abs(z-5) < 0.002 ) return 166.000775;

        //return (Math.random() * 1000);
        double thing = 0.0;
        thing = Math.pow(Math.sqrt(2*y-x/3*z)/Math.pow(z,x+y), y/Math.abs(x-z));
        return Math.floor((4*Math.pow(z,y))/Math.pow(Math.sqrt(3),x))+thing;
    }

    public static double f3(double a, double b)
    {
        //if (Math.abs(a-3.5) < 0.002 && Math.abs(b-1.5) < 0.002) return -24.5;

        //return (Math.random() * 1000);
        double thing = 0.0;
        thing = Math.PI*Math.tan(a*b+Math.cos(Math.abs(a-b)));
        return Math.pow(Math.sin(a*b/Math.sqrt(a+b)), Math.cos(Math.pow(b,2))) + thing;
    }

    public static double f4(double a, double b, double c)
    {
        //if (Math.abs(a+5) < 0.002 && Math.abs(b) <= 0.002 && Math.abs(c- 11) < 0.002) return 6.83567;

        //return (Math.random() * 1000);
        double thing=0;
        thing = Math.pow((Math.pow(Math.E,b*Math.PI) - Math.pow(b,c))/(Math.pow(a,Math.E)+Math.E), a+b*c);
        if (Math.cos(a+b)>0)
        {
            return Math.pow(Math.PI+Math.E, Math.sin(a)) + Math.pow(Math.log(4+Math.abs(b*c)), Math.cos(b));
        }
        else 
        {
            return Math.log10(b-Math.log(1/Math.pow(a,Math.PI))) + thing;

        }
    }

    public static int f5(int a, int b, int c)
    {
        //if (a == 5 && b == 13 && c == 7) return 1734;

        //return (int)(Math.random() * 1000);
        int sumF6=0;
        for (int i=a;i<=a+b+c;i++)
        {
            sumF6 += Math.ceil(i*c/b + i*a);
        }
        return sumF6;
    }

    public static int f6(int a, int b, int c, int d)
    {
        //if (a == 1 && b == 1 && c == 2 && d == 2) return 512486;

        //return (int)(Math.random() * 1000);
        int sumF6=0;
        int thing=0;
        int thing2=0;
        for (int i=a+b;i<=c+d;i++)
        {
            thing = (int)Math.pow((a+c),(b+d)*i);
            thing2=(int)Math.floor(Math.sqrt((int)Math.pow(a-c,2*i)));
            sumF6+=Math.pow((-1),i)*(thing-thing2);
        }
        return sumF6;
    }

    public static boolean f7(boolean x, boolean y, boolean z)
    {
        //if (x && y && z) return false;

        //return Math.random() < 0.5;
        if (!x && !y && !z)
        {
            return true;
        }
        else
        {
            if (!x && !y && z)
            {
                return false;
            }
            else
            {
                if (!x && y && !z)
                {
                    return true;
                }
                else
                {
                    if (!x && y && z)
                    {
                        return false;
                    }
                    else
                    {
                        if (x && !y && !z)
                        {
                            return false;
                        }
                        else
                        {
                            if (x && !y && z)
                            {
                                return true;
                            }
                            else
                            {
                                if (x && y && !z)
                                {
                                    return true;
                                }
                                else
                                {
                                    if (x && y && z)
                                    {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        return true;           
    }

    public static boolean f8(boolean j, boolean k, boolean m, boolean n)
    {
        //if (!j && !k && !m && !n) return true;
        //return Math.random() < 0.5;
        if (!j && !k && !m && !n)
        {
            return true;
        }
        else
        {
            if (!j && !k && !m && n)
            {
                return false;
            }
            else
            {
                if (!j && !k && m && !n)
                {
                    return true;
                }
                else
                {
                    if (!j && !k && m && n )
                    {
                        return false;
                    }
                    else
                    {
                        if (!j && k && !m && !n)
                        {
                            return false;
                        }
                        else
                        {
                            if (!j && k && !m && n)
                            {
                                return false;
                            }
                            else 
                            { 
                                if (!j && k && m && !n)
                                {
                                    return true;
                                }
                                else 
                                { 
                                    if (!j && k && m && n)
                                    {
                                        return true;
                                    }
                                    else
                                    {
                                        if (j && !k && !m && !n)
                                        {
                                            return false;
                                        }
                                        else
                                        {
                                            if (j && !k && !m && n)
                                            {
                                                return true;
                                            }
                                            else
                                            {
                                                if (j && !k && m && !n)
                                                {
                                                    return true;
                                                }
                                                else
                                                {
                                                    if (j && !k && m && n)
                                                    {
                                                        return false;
                                                    }
                                                    else
                                                    {
                                                        if (j && k && !m && !n)
                                                        {
                                                            return true;
                                                        }
                                                        else 
                                                        { 
                                                            if (j && k && !m && n)
                                                            {
                                                                return true;
                                                            }
                                                            else
                                                            {
                                                                if (j && k && m && !n)
                                                                {
                                                                    return false;
                                                                }
                                                                else
                                                                {
                                                                    if (j && k && m && n)
                                                                    {
                                                                        return true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }


    public static double f9(double a, double b, double c, double d)
    {
        //if (Math.abs(a-6) < 0.002 && Math.abs(b-7) <= 0.002 && Math.abs(c-5) <= 0.002  && Math.abs(d-2) < 0.002) return -19.6234472;

        //return (Math.random() * 1000);
        return Math.PI;
    }

    public static boolean f10(boolean v, boolean w, boolean x, boolean y, boolean z)
    {
        //if (!v && !w && !x && !y && !z) return true;
        //return Math.random() < 0.5;
        return f8(!v&&f7(w&&z,y,!x||!y), v&&(z||w), w, x||!y) || f7(z, x, z || w&&y) && f7(f7(x,w,v),f7(w,x,z),f8(!x,!z||v,!x,y));
    }
}