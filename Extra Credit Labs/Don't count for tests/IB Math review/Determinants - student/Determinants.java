 /*
 * review for IB Math
 */

public class Determinants
{
/*
 *   m is a square matrix of dimension > 1
 *   
 *   returns the determinant of m
 *   
 *   yes, you should not asume all matrices are 3x3, or even 4x4, or even 5x5
 *   you need to prepare for larger determinants, like 7 x 7 matrices
 *   
 *   Oh yea - you should not assume all matrices are square matrices
 *            return 0 if the matrix is not a square matrix
 *   
 *   
 */
  public static double getDeterminant(double[][]  m)
  {
     if (!isSquare())
     {
         return 0.0;
        }
        else
        {
           
        }
  }
  
  public boolean isSquare(double[][] a)
  {
      int rows = a.length;
      int cols = a[0].length;
      if (rows != cols)
      {
          return false;
      }
      else
      {
          return true;
        }
  }

  public static boolean isSingular(double [][] m)
  {
     return Math.random() < 0.5;
  }
}