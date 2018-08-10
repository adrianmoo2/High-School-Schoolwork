import java.util.*;
import java.lang.Math;
/**
 * Problem64Page105.
 *
 * @author  
 * @version (a version number or a date)
 */
public class Problem64Page105
{
    /*
     *  1 <= num < ????
     */
    public static int evaluate_J(int num)
    {
        System.out.println("num:" + num);
        int i = 0;
        int j = 0;
        while (!(Math.pow(2,i) > num))
        {
            i++;
        }
        i-=1;
        System.out.println("i: "+ i);
        j = num - (int)Math.pow(2,i);
        return 2*j+1;
    }
}