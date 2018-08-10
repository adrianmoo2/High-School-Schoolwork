import java.util.*;
import java.util.Collections.*;
public class MiningCenter 
{
   private ArrayList<Site> mines;
   
/*
 *    precondition: m.size() > 0
 */
   public MiningCenter(ArrayList<Site> m)
   {
       mines = m;
   }

   public Site getCenter()
   {
       int sumOfDistances = 0;
       int j = Integer.MAX_VALUE;
       int smallestX=Integer.MAX_VALUE;
       ArrayList<Integer> sums = new ArrayList<Integer>();
       ArrayList<Site> sites = new ArrayList<Site>();
      for (int k = -10;k<10;k++)
      {
          for (int l = -10;l<10;l++)
          {
              sums.add(sumOfDistanceFromSites(new Site(k, l)));
          }
      }
      for (int i=0;i<sums.size();i++)
      {
          if (sums.get(i) < j)
          {
              j=sums.get(i);
            }
      }
      System.out.println("sums: " + sums);
      System.out.println("j: " + j);
      for (int k = -10;k<10;k++)
      {
          for (int s=-10;s<10;s++)
          {
              if (sumOfDistanceFromSites(new Site(k,s))==j)
              {
                  sites.add(new Site(k,s));
                }
           }
        }
        System.out.println("sites: " + sites);
      for (int i=0;i<sites.size();i++)
      {
          
      }
      return sites.get(0);
   }
   public int sumOfDistanceFromSites(Site p)
   {
       int sum=0;
       for (int k=0;k<mines.size();k++)
       {
          sum += Math.abs(p.getX()-mines.get(k).getX()) + Math.abs(p.getY()-mines.get(k).getY());
       }
       return sum;
    }
   
}