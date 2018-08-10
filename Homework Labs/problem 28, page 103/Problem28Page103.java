import java.util.*;
import java.lang.Math;
/**
 * RunRunRunAroundNumbers.
 *
 * @author  
 * @version (a version number or a date)
 */
public class Problem28Page103
{
/*
 *  1 <= num < ????
 */
   public static double evaluate(int num)
   {
       double x = 0.0;
       for (int i=0;i<=num;i++)
       {
           if (i!=0)
           {
               double p = (double)i;
               double k = (double)(i+1);
               x+= 1/(p*k);
            }
       }
       return x;
   }
}