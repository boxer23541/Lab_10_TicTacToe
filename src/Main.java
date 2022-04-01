import java.util.Scanner;

public class Main
{
    private static final int ROW = 3;
    private static final int COL = 3;
    private static String board [][] = new String[ROW][COL];

    public static void main(String[] args)
    {
        boolean finished = false;
        boolean playing = true;
        Scanner in = new Scanner(System.in);
        String player = "X";
        int turnCount = 0;
        int row = -1;
        int col = -1;
        final int WIN_MOVES = 5;
        final int TIE_MOVES = 7;

        do //loop program
        {
            //new game
            player = "X";
            playing = true;
            turnCount = 0;
            clearBoard();

            do //loop game
            {
                //get a move
                do
                {
                    display();
                    System.out.println("Enter move for " + player);
                    row = SafeInput.getRangedInt(in, "Enter Row [1-3]", 1, 3);
                    col = SafeInput.getRangedInt(in, "Enter Column [1-3]", 1, 3);
                    row--; col--;
                }
            }
        }
    }
    private static void clearBoard()
    {
        //set board to spaces
        for(int row = 0; row < ROW; row++)
        {
            for (int col = 0; col < COL; col++)
            {
                board[row][col] = " ";
            }
        }
    }

    private static void display()
    {
        //Show the game
        for (int row = 0; row < ROW; row++)
        {
            System.out.print("| ");
            for (int col = 0; col < COL; col++)
            {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
