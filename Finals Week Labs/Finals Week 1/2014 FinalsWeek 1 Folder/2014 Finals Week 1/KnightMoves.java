import java.util.*;

public class KnightMoves
{
    private ChessLocation loc;
    public KnightMoves(ChessLocation cl)
    {
        loc = cl;
    }

    /*
     *   precondition: ChessLocation is a valid
     *   
     *   returns a value greater tahn or equal to 0 which represents
     *           the minimum number of moves for the knight to move from its curernt location to destination
     */
    public int minimumNumMovesTo(ChessLocation destination)
    {
        ChessLocation loc2 = loc;
        int currentRow = loc2.getRow();
        char currentCol = loc2.getCol().charAt(0);
        Set<ChessLocation> h = new HashSet<ChessLocation>();
        //while (!h.contains(destination))
        //{
        //}
        /*if (currentRow+2<=destination.getRow() && (char)((int)currentCol+1)<=destination.getCol().charAt(0))
        {
        loc = forwardTwoThenRight(loc);
        System.out.println("forwardTwoThenRight");
        numMoves++;
        }
        else
        {
        if (currentRow+2 <= destination.getRow() && (char)((int)currentCol-1)>= destination.getCol().charAt(0))
        {
        loc = forwardTwoThenLeft(loc);
        System.out.println("forwardTwoThenLeft");
        numMoves++;
        }
        else
        {
        if (currentRow+1 <= destination.getRow() && (char)((int)currentCol+2)<= destination.getCol().charAt(0))
        {
        loc = forwardOneThenRightTwo(loc);
        System.out.println("forwardOneThenRightTwo");
        numMoves++;
        }
        else
        {
        if (currentRow+1 <= destination.getRow() && (char)((int)currentCol-2) >= destination.getCol().charAt(0))
        {
        loc = forwardOneThenLeftTwo(loc);
        System.out.println("forwardOneThenLeftTwo");
        numMoves++;
        }
        else
        {
        if (currentRow-2 >= destination.getRow() && (char)((int)currentCol+1) <= destination.getCol().charAt(0))
        {
        loc = backwardTwoThenRight(loc);
        System.out.println("backwardTwoThenRight");
        numMoves++;
        }
        else
        {
        if (currentRow-2 >= destination.getRow() && (char)((int)currentCol-1) >= destination.getCol().charAt(0))
        {
        loc = backwardTwoThenLeft(loc);
        System.out.println("backwardTwoThenLeft");
        numMoves++;
        }
        else
        {
        if (currentRow-1 >= destination.getRow() && (char)((int)currentCol+2) <= destination.getCol().charAt(0))
        {
        loc = backwardOneThenRightTwo(loc);
        System.out.println("backwardOneThenRightTwo");
        numMoves++;
        }
        else
        {
        if (currentRow-1 >= destination.getRow() && (char)((int)currentCol-2) >= destination.getCol().charAt(0))
        {
        loc = backwardOneThenLeftTwo(loc);
        System.out.println("backwardOneThenLeftTwo");
        numMoves++;
        }
        }
        }                               
        }
        }
        }
        }
        }
        System.out.println("currentRow: " + loc.getRow());
        System.out.println("currenCol: " + loc.getCol());
        System.out.println("numMoves: " + numMoves);

        return numMoves;*/
        return 1;
    }

    public static boolean notValidCol(char col)
    {
        if (col=='a' || col=='b' || col=='c' || col=='d' || col=='e' || col=='f' || col=='g' || col=='h')
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static ChessLocation forwardTwoThenRight(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);
        if (currentRow+2 > 8 || notValidCol((char)((int)currentCol+1))) 
        {
            return null;
        }
        return new ChessLocation(currentRow + 2, ""+(char)((int)currentCol+1));
    }

    public static ChessLocation forwardTwoThenLeft(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);
        if (currentRow+2 > 8 || notValidCol((char)((int)currentCol-2))) 
        {
            return null;
        }
        return new ChessLocation(currentRow + 2, ""+(char)((int)currentCol-1));
    }

    public static ChessLocation forwardOneThenRightTwo(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);
        if (currentRow+1 > 8 || notValidCol((char)((int)currentCol+2))) 
        {
            return null;
        }
        return new ChessLocation(currentRow + 1, ""+(char)((int)currentCol+2));
    }

    public static ChessLocation forwardOneThenLeftTwo(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);
        if (currentRow+1 > 8 || notValidCol((char)((int)currentCol-2))) 
        {
            return null;
        }
        return new ChessLocation(currentRow + 1, ""+(char)((int)currentCol-2));
    }

    public static ChessLocation backwardTwoThenRight(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);
        if (currentRow-2 > 8 || notValidCol((char)((int)currentCol+1))) 
        {
            return null;
        }
        return new ChessLocation(currentRow - 2, ""+(char)((int)currentCol+1));
    }

    public static ChessLocation backwardTwoThenLeft(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);  
        if (currentRow-2 > 8 || notValidCol((char)((int)currentCol-1))) 
        {
            return null;
        }
        return new ChessLocation(currentRow - 2, ""+(char)((int)currentCol-1));
    }

    public static ChessLocation backwardOneThenRightTwo(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0); 
        if (currentRow-1 > 8 || notValidCol((char)((int)currentCol+2))) 
        {
            return null;
        }
        return new ChessLocation(currentRow - 1, ""+(char)((int)currentCol+2));
    }

    public static ChessLocation backwardOneThenLeftTwo(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);  
        if (currentRow-1 > 8 || notValidCol((char)((int)currentCol-2))) 
        {
            return null;
        }
        return new ChessLocation(currentRow - 1, ""+(char)((int)currentCol-2));
    }
}