import java.util.*;

public class Circle 
{
    // add your own instance variables
    Point point1;
    Point point2;
    Point point3;
    Point point4;
    double mr = 0.0;
    double mt = 0.0;
    public Circle (Point x, Point y, Point z)
    {   
        point1 = x;
        point2 = y;
        point3 = z;
        mr=(point2.getY()-point1.getY())/(point2.getX()-point1.getX());
        mt=(point3.getY()-point2.getY())/(point3.getX()-point2.getX());
    }

    public Point getCenter()
    {
        if (point1.getX()==point2.getX() && point1.getX()==point3.getX())
        {
            return null;
        }
        if (point1.getY()==point2.getY() && point1.getY()==point3.getY())
        {
            return null;
        }
        double x=((mr*mt)*(point3.getY()-point1.getY())+mr*(point2.getX()+point3.getX())-mt*(point1.getX()+point2.getY()))/(2*(mr-mt));
        double y = y(x);
        Point point = new Point((int)x,(int)y);
        //System.out.println("x: " + point.getX());
        //System.out.println("y: " + point.getY());
        point4 = point;
        return point;
    }

    public double y(double x)
    {
        return -(1/mt)*(x-(point2.getX()+point3.getX())/2)+(point2.getY()+point3.getY())/2;
    }

    public double getRadius()
    {
                if (point1.getX()==point2.getX() && point1.getX()==point3.getX())
        {
            return -1;
        }
        if (point1.getY()==point2.getY() && point1.getY()==point3.getY())
        {
            return -1;
        }
        double insideP = Math.pow((point2.getX()-point4.getX()),2)+Math.pow((point2.getY()-point4.getY()),2);
        double radius = Math.sqrt(insideP);
        //System.out.println("rt: " + insideP);
        //System.out.println("radius: " + radius);
        return radius;
    }

    public double getCircleArea()
    {
        double ye = Math.PI*Math.pow(getRadius(),2);
        System.out.println("area: " + ye);
        return Math.PI*Math.pow(getRadius(),2);
    }

    public double getCirclePerimeter()
    {
        return 2*Math.PI*getRadius();
    }

    public double getTriangleArea()
    {
        return Math.abs(0.5*(point1.getX()*(point2.getY()-point3.getY()) + point2.getX()*(point3.getY()-point1.getY()) + point3.getX()*(point1.getY()-point2.getY())));
    }

    public double getTrianglePerimeter()
    {
        double insideP1 = Math.pow(point2.getX()-point1.getX(),2) + Math.pow(point2.getY()-point1.getY(),2);
        double insideP2 = Math.pow(point3.getX()-point2.getX(),2) + Math.pow(point3.getY()-point2.getY(),2);
        double insideP3 = Math.pow(point3.getX()-point1.getX(),2) + Math.pow(point3.getY()-point1.getY(),2);
        double side1 = Math.sqrt(insideP1);
        double side2 = Math.sqrt(insideP2);
        double side3 = Math.sqrt(insideP3);
        return side1+side2+side3;
    }

    public PolarEquation getPolarEquation()
    {
        double d1 = Math.sqrt(Math.pow(point4.getX()-0,2) + Math.pow(point4.getY()-0,2));
        return new PolarEquation(getRadius(), d1, 0.4048917);
    }
}