import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2010 programming contest
 */
public class FinalsWeek2014part2StudentTest extends junit.framework.TestCase
{
   public void testGoFigureTest01()
   {
      GoFigure gf = new GoFigure();

      assertEquals("123+123=246", gf.goFigureDecimal("123123246"));
      assertEquals("10100+1010=11110", gf.goFigureBinary("10100101011110"));
      assertEquals("MXIII+CCCLX=MCCCLXXIII", gf.goFigureRomanNumeral("MXIIICCCLXMCCCLXXIII"));
   }

   public void testReplaceMeTest01()    // all have unique solutions
   {
      int[] n = {111, 444, 777, 888};
      ReplaceMe rm = new ReplaceMe(n);

      int[] sol = {110, 44, 77, 880};
      List<Integer> solution = new ArrayList<Integer>();
      for (int s : sol)
         solution.add(new Integer(s));

      int[] temp = rm.insertFourZeros(1111);
      assertEquals(4, temp.length);
      for (int num : temp)
         assertEquals(true, solution.contains(num));

      int[] sola = {111, 444, 700, 800};
      solution = new ArrayList<Integer>();
      for (int s : sola)
         solution.add(new Integer(s));

      temp = rm.insertFourZeros(2055);
      assertEquals(4, temp.length);
      for (int num : temp)
         assertEquals(true, solution.contains(num));
   }

   public void testMiningCenter01()
   {
      ArrayList<Site> mines = new ArrayList<Site>();
      mines.add(new Site(10, 0));
      mines.add(new Site(6,7));
      mines.add(new Site(-6,8));
      mines.add(new Site(-9,-8));
      MiningCenter mc = new MiningCenter(mines);
      assertEquals(new Site(-1,-1), mc.getCenter());

      ArrayList<Site> mines1 = new ArrayList<Site>();
      mines1.add(new Site(0, 0));
      mines1.add(new Site(0, 5));
      mines1.add(new Site(5, 0));
      MiningCenter mc1 = new MiningCenter(mines1);
      assertEquals(new Site(0,0), mc1.getCenter());

      ArrayList<Site> mines2 = new ArrayList<Site>();
      mines2.add(new Site(1, -5));
      mines2.add(new Site(-10, 5));
      mines2.add(new Site(-2, 5));
      mines2.add(new Site(10, 10));
      mines2.add(new Site(5, -5));
      MiningCenter mc2 = new MiningCenter(mines2);
      assertEquals(new Site(2,5), mc2.getCenter());
   }

   public void testGameSet01()
   {
      Card c1 = new Card (1, "square" , "red", "clear");
      Card c2 = new Card (2, "square" , "red", "clear");
      Card c3 = new Card (3, "square" , "red", "clear");
      Card c4 = new Card (1, "square" , "blue", "clear");

      assertEquals(true, GameSet.isSet(c1, c2, c3));
      assertEquals(false, GameSet.isSet(c1, c2, c4));

      assertEquals(c3, GameSet.makeSet(c1, c2));

      Card[] temp = {  new Card(2, "square", "red", "dashed"),
                        new Card(2, "circle", "green", "dashed"),
                        new Card(3, "square", "red", "dashed"),
                        new Card(2, "triangle", "blue", "solid"),
                        new Card(2, "triangle", "green", "clear"),
                        new Card(3, "square", "blue", "dashed"),
                        new Card(1, "square", "blue", "dashed"),
                        new Card(3, "circle", "red", "clear"),
                        new Card(1, "triangle", "blue", "solid"),
                        new Card(1, "square", "green", "clear"),
                        new Card(3, "triangle", "green", "clear"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "square", "green", "clear"),
                        new Card(1, "square", "green", "clear") };
      assertEquals(false, GameSet.containsSet(temp));

      Card[] temp1 = {  new Card(2, "square", "red", "dashed"),
                        new Card(2, "circle", "green", "dashed"),
                        new Card(3, "square", "red", "dashed"),
                        new Card(2, "triangle", "blue", "solid"),
                        new Card(2, "triangle", "green", "clear"),
                        new Card(3, "square", "blue", "dashed"),
                        new Card(1, "square", "blue", "dashed"),
                        new Card(3, "square", "red", "clear"),
                        new Card(1, "triangle", "blue", "solid"),
                        new Card(1, "square", "green", "clear"),
                        new Card(3, "triangle", "green", "clear"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "square", "green", "clear"),
                        new Card(1, "square", "green", "clear") };
      assertEquals(true, GameSet.containsSet(temp1));
   }

   public void testHPCipher01()
   {
      HPCipher hp = new HPCipher("P JVKL AOLYLMVYL P HT");
      assertEquals(4, hp.letterDifference("A", "E"));
      assertEquals(2, hp.letterDifference("Z", "B"));
      assertEquals("I CODE THEREFORE I AM", hp.decode("IA"));
      assertEquals("I CODE THEREFORE I AM", hp.decode("DETH"));

      hp = new HPCipher("HIGSHI QI");
      assertEquals("DECODE ME", hp.decode("EM"));
      assertEquals("DECODE ME", hp.decode("DE"));
    }

}