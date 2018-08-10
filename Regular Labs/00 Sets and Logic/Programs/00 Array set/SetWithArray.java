import java.util.*;

 /*
 * code authored by Maria & Gary Litvan
 */

public class SetWithArray
{
  private int[] x;

  public SetWithArray(int[] num)
  {
    x = num;
  }

/*
 * returns an Set (array) containing all elements in x OR y
 */
  public int[] union(int[] y)
  {
      return new int[5];
  }

/*
 * returns an Set (array) containing all elements in x AND y
 */
  public int[] intersection(int[] y)
  {
      return new int[5];
  }

/*
 * returns an Set (array) containing all elements in x that are not in y
 */
  public int[] difference(int[] y)
  {
      return new int[5];
  }

/*
 * returns true if all elements of x are contained in y
 */
  public boolean isSubSetOf(int[] y)
  {
      for (int i=0;i<x.length;i++)
      {
          boolean contains=false;
          int temp = x[i];
          for (int m=0;m<y.length;m++)
          {
              if (temp==y[m])
              {
                  contains = true;
              }
          }
          if (!contains)
          {
              return false;
            }
      }
      return true;
  }
  
  public boolean isSubSetOf2(int[] y)
  {
      for (int i=0;i<y.length;i++)
      {
          boolean contains=false;
          int temp = y[i];
          for (int m=0;m<x.length;m++)
          {
              if (temp==x[m])
              {
                  contains = true;
              }
          }
          if (!contains)
          {
              return false;
            }
      }
      return true;
  }

/*
 * returns true if all elements in y are contained in x
 *              and if all elements in x are contained in y
 */
  public boolean isEqualTo(int[] y)
  {
      return (isSubSetOf(y) && isSubSetOf2(y));
  }

  /*
 * returns the set of elements which are in one of the set
 *         that is:  (x - y) union (y - x)
 */
  public int[] symmetricDifference(int[] y)
  {
      ArrayList<Integer> temp1 = new ArrayList<Integer>();
      ArrayList<Integer> temp2 = new ArrayList<Integer>();
      ArrayList<Integer> temp3 = new ArrayList<Integer>();
      for (int i=0;i<x.length;i++)
      {
          boolean intersect=false;
          for (int m=0;m<y.length;m++)
          {
              if (x[i]==y[m])
              {
                  intersect=true;
              }
          }
          if (!intersect)
          {
              temp1.add(x[i]);
          }
      }
            for (int i=0;i<y.length;i++)
      {
          boolean intersect=false;
          for (int m=0;m<x.length;m++)
          {
              if (y[i]==x[m])
              {
                  intersect=true;
              }
          }
          if (!intersect)
          {
              temp2.add(y[i]);
          }
      }
      for (int i=0;i<temp1.size()-1;i++)
      {
          temp3.add(temp1.get(i));
      }
            for (int i=0;i<temp2.size()-1;i++)
      {
          temp3.add(temp2.get(i));
      }
      int [] ans = new int[temp3.size()-1];
      for (int i=0;i<temp3.size()-1;i++)
      {
          ans[i]=temp3.get(i);
        }
        System.out.println("ans: " + Arrays.toString(ans));
        return ans;
  }

/*
 * returns true if all the collection sets in s form a partition of x
 *         you may assume that x is a universal set.
 *         
 *         You might have to look up the definition of a partition and 
 *            use the Set API to figure out how to use a Set
 */
  public boolean isPartition(Set<int[]> s)
  {
      return Math.random() < 0.5;
  }
}