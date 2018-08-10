import java.util.*;
import java.lang.Math;
/**
 * RunRunRunAroundNumbers.
 *
 * @author  
 * @version (a version number or a date)
 */
public class RunRunRunAroundNumbers
{
   public static boolean isRunRoundNumber(int num)
   {
       String s = "" + num;
       ArrayList<Integer> chosenIndices = new ArrayList<Integer>();
       int numChosen = 0;
       int numIndex = 0;
       int firstNum = Integer.parseInt(""+s.charAt(0));
       String temp = "";
       //chosenIndices.add(firstNum);
       //System.out.println("firstNum:" + firstNum);
       /*if (num == 13) return true;
       if (num == 81362) return true;
       if (num == 913425) return true;

       if (num == 123) return false;
       if (num == 81111) return false;
       if (num == 83333) return false;
       */
       for (int m = 0; m<s.length()-1;m++)
       {
           temp = ""+s.charAt(m);
           for (int l = m+1;l<s.length();l++)
           {
               if ((""+s.charAt(l)).equals(temp))
               {
                   return false;
                }
            }
        }
       for (int i = 0;i<=s.length();i++)
       {
           if (i==0)
           {
               numChosen = Integer.parseInt(""+s.charAt(0));
               chosenIndices.add(0);
               numIndex = 0;
           }
           else
           {
               //System.out.println("numChosen:" + numChosen);
               for (int j = numChosen; j>0;j--)
               {
                   if (numIndex < s.length()-1)
                   {
                       numIndex++;
                   }
                   else
                   {
                       numIndex = 0;
                    }
                   // System.out.println("numIndex:" + numIndex);
               }
               if (chosenIndices.contains(numIndex) && numIndex != 0)
               {
                   return false;
                }
                else
                {
                    numChosen = Integer.parseInt(""+s.charAt(numIndex));
                    chosenIndices.add(numIndex);
                }
                }
            }
       /*for (int x = 0;x<chosenIndices.size();x++)
       {
           System.out.print(chosenIndices.get(x));
        }*/
       return true;
    }
   

   public static int getNextRunAroundNumber(int seqNum)
   {
       /*
      if ( seqNum == 123) return 147;
      if ( seqNum == 81111) return 81236;
      if ( seqNum == 83333) return 83491;
      */
      while (isRunRoundNumber(seqNum) == false)
      {
          seqNum++;
      }
      return seqNum;
   }
}