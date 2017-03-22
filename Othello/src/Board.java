
public class Board 
{
	private Player[][] board;
	public int size =9;
	public boolean[] error= new boolean[2];
	
	public Board()
	{
		board = new Player[size][size];
		reset();
	}

	public void reset() 
	{
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				board[i][j]= Player.Empty;
			}
		}
		
		board[3][3]=Player.Black;
		board[4][4]=Player.Black;
		board[3][4]=Player.White;
		board[4][3]=Player.White;
		System.out.println("sssdfs"+board[3][3]);
		// TODO Auto-generated method stub
		
	}
	public Player getPlayerWithIndex(int x, int y)
	{
		return board[x][y];
	}
	public boolean setValue(int x, int y, Player value)
	{
		boolean result=false;
		if(board[x][y]== Player.Empty)
		{
//			if((x+1)>size )
//			{
//				
//			}
			board[x][y] = value;
			result = true;
		}
		else
		{
		 result = false;
		 error[0]= true;
		}
		return result;
	}
	public boolean getErrorIndex(int i)
	{
		return error[i];
	}
	

}
