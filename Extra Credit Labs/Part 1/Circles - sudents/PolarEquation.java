
/**
 * Write a description of class PolarEquation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PolarEquation
{
    // instance variables - replace the example below with your own
    private double radius;
    private double distanceCenterToOrigin;
    private double phi;
    
    /**
     * Constructor for objects of class PolarEquation
     */
    public PolarEquation(double r, double d, double angle)
    {
       radius = r;
       distanceCenterToOrigin = d;
       phi = angle;
    }

    public double getA()
    {
        return radius;
    }

    public double getRo()
    {
        return distanceCenterToOrigin;
    }

    public double getPhi()
    {
        return phi;
    }
}