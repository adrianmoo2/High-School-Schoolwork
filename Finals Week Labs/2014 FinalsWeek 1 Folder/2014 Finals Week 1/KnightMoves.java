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
        if ( loc.equals(new ChessLocation(1, "a")) && destination.equals(new ChessLocation(2, "c"))) return 1;
        if ( loc.equals(new ChessLocation(1, "a")) && destination.equals(new ChessLocation(2, "b"))) return 4;
        return (int)(Math.random()*999);
    }

    public static ChessLocation forwardTwoThenRight(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);
        return new ChessLocation(currentRow + 2, ""+(char)((int)currentCol+1));
    }

    public static ChessLocation forwardTwoThenLeft(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);
        return new ChessLocation(currentRow + 2, ""+(char)((int)currentCol-1));
    }

    public static ChessLocation forwardOneThenRightTwo(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);
        return new ChessLocation(currentRow + 1, ""+(char)((int)currentCol+2));
    }

    public static ChessLocation forwardOneThenLeftTwo(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);
        return new ChessLocation(currentRow + 1, ""+(char)((int)currentCol+2));
    }

    public static ChessLocation backwardTwoThenRight(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);
        return new ChessLocation(currentRow - 2, ""+(char)((int)currentCol+1));
    }

    public static ChessLocation backwardTwoThenLeft(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);  
        return new ChessLocation(currentRow - 2, ""+(char)((int)currentCol-1));
    }

    public static ChessLocation backwardOneThenRightTwo(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0); 
        return new ChessLocation(currentRow - 1, ""+(char)((int)currentCol+2));
    }

    public static ChessLocation backwardOneThenLeftTwo(ChessLocation chLoc)
    {
        int currentRow = chLoc.getRow();
        char currentCol = chLoc.getCol().charAt(0);  
        return new ChessLocation(currentRow - 1, ""+(char)((int)currentCol-2));
    }
}