
public class TheGame 
{
	Board board = new Board();
	OthelloUI display = new GameDisplay();
	
	public void playGame()
	{
		while(true)
		{
			
			makeMoves(Player.Black);
			makeMoves(Player.White);
			
			
		}
	}

	private void makeMoves(Player player) 
	{
		boolean keepGoing= false;
		do{
			display.setErrorMessage(false);
			int[] move;
			display.print(board);
			move = display.makeMove();
			keepGoing = board.setValue(move[0], move[1], player);
			if(!keepGoing)
			{
				display.setErrorMessage(true);
				if(board.getErrorIndex(0))
				{
					display.errorSpaceMessage();
				}
				else
				{
					display.errorOutMessage();
				}
			}
		}while(!keepGoing);
		
	}
	

}
