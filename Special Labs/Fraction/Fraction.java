//  all values will be less than or equal to 1.

import java.util.*;

public class Fraction implements Comparable<Fraction>
{
    private int top;
    private int bottom;

    public Fraction(int t, int b)
    {
        top = t;
        bottom = b;
    }

    /*
     * returns
     *       a value less than 0 if this < f
     *       0 if f == this
     *       a value greater than 0 if this > f
     */
    public int compareTo(Fraction f)
    {
        if(getDecimal()<f.getDecimal()){
            return -1;
        }else if(getDecimal()>f.getDecimal()){
            return 1;
        }
        return 0;
    }

    /*
     * returns the numerator of this fraction
     */
    public int getTop()
    {
        return top;
    }

    /*
     * returns the denominator of this fraction
     */
    public int getBottom()
    {
        return bottom;
    }

    /*
     * returns the decimal value this fraction (i.e., numerator / denominator
     */
    public double getDecimal()
    {
        return (double)top/bottom;
    }

    /*
     * A static method
     * returns the simplified fraction computed by summing all fractions
     *         in it List parameter fs
     */
    public static Fraction addAllFractionsInList(List<Fraction> fs)
    {
        int initialTop = fs.get(0).getTop();
        int initialBottom = fs.get(0).getBottom();
        Fraction ans = new Fraction(initialTop, initialBottom);
        for(int k=1;k<fs.size();k++){
            ans.add(fs.get(k));
        }
        return ans;
    }

    /*
     * modifies this by subtracting the parameter f from it
     */
    public void subtract(Fraction f)
    {
        int denom1 = getBottom();
        int denom2 = f.getBottom();
        int numer1 = getTop();
        int numer2 = f.getTop();
        if(denom1==denom2){
            top=numer1-numer2;
        }else{
            int temp1 = numer1*denom2;
            int temp2 = denom1*denom2;
            int temp3 = numer2*denom1;
            int temp4 = denom2*denom1;
            top = temp1-temp3;
            bottom = temp2;
        }
        reduce();
    }

    /*
     * modifies this by adding the parameter f to it
     */
    public void add(Fraction f)
    {
        int denom1 = getBottom();
        int denom2 = f.getBottom();
        int numer1 = getTop();
        int numer2 = f.getTop();
        if(denom1==denom2){
            top=numer1+numer2;
        }else{
            int temp1 = numer1*denom2;
            int temp2 = denom1*denom2;
            int temp3 = numer2*denom1;
            int temp4 = denom2*denom1;
            top = temp1+temp3;
            bottom = temp2;
        }
        reduce();
    }

    /*
     * modifies this by multipling it by the parameter f
     */
    public void multiply(Fraction f)
    {
        top = getTop()*f.getTop();
        bottom = getBottom()*f.getBottom();
        reduce();
    }

    /*
     * returns true if the the two objects are equal.
     *         You may assume both Fractions are in simplest form
     */
    public boolean equals(Object obj)
    {
        return compareTo((Fraction)obj)==0;
    }

    /*
     * returns a string in the form
     * 
     *              "numerator / denominator"
     *         there is exactly one space on both sides of /
     *         no space infront of the numerator and no spaces after the denominator
     */
    public String toString()
    {
        return top+" / "+bottom;
    }

    public void reduce() {
        // find the larger of the numerator and denominator
        int n = top, d = bottom, largest;
        if (top < 0) {
            n = -top;
        }
        if (n > d) {
            largest = n;
        }else{
            largest = d;
        }
        // find the largest number that divide the numerator and
        // denominator evenly
        int gcd = 0;
        for (int i = largest; i >= 2; i--) {
            if (top % i == 0 && bottom % i == 0) {
                gcd = i;
                break;
            }
        }
        // divide the largest common denominator out of numerator, denominator
        if (gcd != 0) {
            top /= gcd;
            bottom /= gcd;
        }
    }
}