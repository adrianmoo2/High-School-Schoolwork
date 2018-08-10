 /*
 * review for IB Math
 */

public class Triangle
{
//
//  add your own instance variables
//
//   all angles will be given in radians:  0 < givenAngle < Math.PI
double angleA;
double angleB;
double angleC;
double sideA;
double sideB;
double sideC;
   public Triangle()
   {
       /*   constructor code goes here   */
       angleA=0.0;
       angleB=0.0;
       angleC=0.0;
       sideA=0.0;
       sideB=0.0;
       sideC=0.0;
   }


/*
 *   this method will only be invoke if getNumTriangles() == 2

 *   In the case there are two triangles, this method returns the second (obtuse)
 *   Triangle with ALL sides and Angles properly initialized
 *   
 *   use the orignal data (hint: setSSA)
 *   
 */
  public Triangle getSecondTriangle()
  {
     if (getNumTriangles()==2)
     {
     }
  }
/*
 * this method may be invoke at any time
 * 
 * hint:  you might want to calculate once, store it and retrive it when asked for
 * 
 *        I make this suggestion because after the missing part of the triangle are calculated
 *        you may no longer have the knowledge of what values were the given values
 *        
 *  I am not saying you have to, I am just saying to think about it first
 */
  public int getNumTriangles()
  {
     return ((int) (Math.random() * 10));
  }

/*
 *   calculates all remaining angles and sides for this triangle.
 *   given two angles (angle A and Angle B) and non-included side (side a)
 *   
 *   return true if successful
 *   
 *   returns false if unsuccessful (not sure how this method would be unsuccessful 
 *                 but might be unsuccessful in other similar methods
 *   
 */
  public boolean setAAS(double aA, double aB, double sA)
  {
     return Math.random() < 0.5;
  }

/*
 *   calculates all remaining angles and sides for this triangle.
 *   given two angles (angle A and Angle B) and included side (side C)
 *   
 *   return true if successful
 *   
 *   returns false if unsuccessful (not sure how this method would be unsuccessful 
 *                 but might be unsuccessful in other similar methods
 *   
 */
  public boolean setASA(double aA, double sC, double aB)
  {
     return Math.random() < 0.5;
  }

/*
 *   calculates all remaining angles and sides for this triangle.
 *   given two sides (side A and side B) and included angle (side C)
 *   
 *   This triangle will never be an obtuse triangle
*   
 *   return true if successful
 *   
 *   returns false if unsuccessful (not sure how this method would be unsuccessful 
 *                 but might be unsuccessful in other similar methods
 *   
 */
  public boolean setSAS(double sA, double aC, double sB)
  {
     return Math.random() < 0.5;
  }

/*
 *   calculates all three angles for this triangle.
 *   given all three sides
 *   
 *   return true if successful
 *   
 *   returns false if unsuccessful
 *                 yes it is possible that no triangle may exist with the given sides
 *   
 */
  public boolean setSSS(double sA, double sB, double sC)
  {
     return Math.random() < 0.5;
  }

/*
 *   calculates all remaining angles and sides for this triangle.
 *   given two sides (side A and side B) and non-included angle (side C)
 *   
 *   return true if successful
 *   
 *   returns false if unsuccessful
 *                 yes it is possible that no triangle may exist with the given values
 *                 or better yet, two triangles may exist
 *                 
 *                 it two triangles exist, find the triangle with acute angles
 *                 and return true
 *   
 */
  public boolean setSSA(double sA, double sB, double aA)
  {
     return Math.random() < 0.5;
  }

   public void setAngleA(double a)
   {
       angleA=a;
   }

   public void setAngleB(double b)
   {
       angleB=b;
   }

   public void setAngleC(double c)
   {
       angleC=c;
   }

   public double getAngleA()
   {
     return angleA;
   }

   public double getAngleB()
   {
     return angleB;
   }

   public double getAngleC()
   {
     return angleC;
   }

   public void setSideA(double a)
   {
       sideA=a;
   }

   public void setSideB(double b)
   {
       sideB=b;
   }

   public void setSideC(double c)
   {
       sideC=c;
   }

   public double getSideA()
   {
     return sideA;
   }

   public double getSideB()
   {
     return sideB;
   }

   public double getSideC()
   {
     return sideC;
   }

   public double getPerimeter()
   {
     return sideA+sideB+sideC;
   }

   public double getArea()
   {
     return Math.random();
   }
}