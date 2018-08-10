import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2010 programming contest
 */
public class FinalsWeek2014Part1StudentTest extends junit.framework.TestCase
{
   public void testLongestPalindrome01()
   {
      LongestPalindrome pal = new LongestPalindrome("racecar");
      assertEquals("racecar", pal.getLongestPalindrome());

      pal = new LongestPalindrome("dsffsdg kjab %Bkj.  abcbabCdcbaqwerewq.");
      assertEquals("abCdcba", pal.getLongestPalindrome());

      pal = new LongestPalindrome("Madam, I'm Adam");
      assertEquals("MadamImAdam", pal.getLongestPalindrome());
   }

   public void testClimbThis01()
   {
      ClimbThis ladder = new ClimbThis( );
      ArrayList<String> words = new ArrayList<String>();
      words.add("BOY");
      words.add("TOY");
      words.add("TOE");
      assertEquals(true, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("HEAD");
      words.add("HEAL");
      words.add("VEAL");
      words.add("VEIL");
      words.add("VAIL");
      words.add("TAIL");
      assertEquals(true, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("CAME");
      words.add("CARE");
      words.add("CANT");
      words.add("WENT");
      assertEquals(false, ladder.isLadder(words));
   }

   public void testKnightMoves01()
   {
      ChessLocation temp = new ChessLocation(4, "d");
      ChessLocation corner = new ChessLocation(8, "a");
      assertEquals(new ChessLocation(6, "e"), KnightMoves.forwardTwoThenRight(temp));
      assertEquals(new ChessLocation(6, "c"), KnightMoves.forwardTwoThenLeft(temp));
      assertEquals(new ChessLocation(5, "f"), KnightMoves.forwardOneThenRightTwo(temp));
      assertEquals(new ChessLocation(5, "b"), KnightMoves.forwardOneThenLeftTwo(temp));

      assertEquals(new ChessLocation(2, "e"), KnightMoves.backwardTwoThenRight(temp));
      assertEquals(new ChessLocation(2, "c"), KnightMoves.backwardTwoThenLeft(temp));
      assertEquals(new ChessLocation(3, "f"), KnightMoves.backwardOneThenRightTwo(temp));
      assertEquals(new ChessLocation(3, "b"), KnightMoves.backwardOneThenLeftTwo(temp));

      assertEquals(null, KnightMoves.forwardOneThenLeftTwo(corner));
      assertEquals(null, KnightMoves.forwardTwoThenRight(corner));

      KnightMoves game = new KnightMoves(new ChessLocation(1, "a"));
      assertEquals(1, game.minimumNumMovesTo(new ChessLocation(2, "c")));
      assertEquals(4, game.minimumNumMovesTo(new ChessLocation(2, "b")));
   }
}