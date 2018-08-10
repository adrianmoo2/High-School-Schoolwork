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
 * returns an array containing all elements in x OR y
 */
  public int[] union(int[] y)
  {
      return new int[5];
  }

/*
 * returns an array containing all elements in x AND y
 */
  public int[] intersection(int[] y)
  {
      return new int[5];
  }

/*
 * returns an array containing all elements in x that are not in y
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
      return Math.random() < 0.5;
  }

/*
 * returns true if all elements in y are contained in x
 *              if all elements in x are contained in y
 */
  public boolean isEqualTo(int[] y)
  {
      return Math.random() < 0.5;
  }

  /*
 * returns the set of elements which are in one of the set
 *         that is:  (x - y) union (y - x)
 */
  public int[] symmetricDifference(int[] y)
  {
      return new int[5];
  }

/*
 * returns true if all the collection sets in s form a partition of x
 *         you may assume that x is a universal set.
 *         That is, all elements in s are contained in x
 */
  public boolean isPartition(Set<int[]> s)
  {
      return Math.random() < 0.5;
  }
}