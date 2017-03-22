import java.util.Scanner;

public class GameDisplay implements OthelloUI
{
	private volatile boolean isClick;
	public Scanner in = new Scanner(System.in);
	
	public GameDisplay()
	{
		
	}
	public void print(Board board)
	{
		for(int i=0; i<board.size; i++)
		{
			for(int j=0; j<board.size; j++)
			{
				System.out.print(board.getPlayerWithIndex(i, j).getPlayer());
			}
			System.out.println();
		}
	}
	public int[] makeMove()
	{
		int[] move = new int[2];
		System.out.println("Enter a value ");
		
		move[0]=in.nextInt();
		move[1]=in.nextInt();
		
		return move;
	}
	
}
