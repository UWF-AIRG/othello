
public class TheGame 
{
	Board board = new Board();
	OthelloUI display = new GameDisplay();
	
	public void playGame()
	{
		while(true)
		{
			display.print(board);
			int[] move = display.makeMove();
			board.setValue(move[0], move[1], Player.Black);
			
			display.print(board);
		    move = display.makeMove();
			board.setValue(move[0], move[1], Player.White);
			
			
		}
	}
	

}
