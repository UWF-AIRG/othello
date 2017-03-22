
public enum Player 
{
	Black, White,Empty;
	
	public char getPlayer()
	{
		char letter=' ';
		switch(this)
		{
			case White:;
			letter='W';
			case Black:;
			letter='B';
			case Empty:;
			letter='E';
			default:
		}
		
		return letter;
	}
	public char getOtherPlayer()
	{
		char letter=' ';
		switch(this)
		{
			case White:;
			letter='B';
			case Black:;
			letter='W';
			default:
		}
		
		return letter;
	}
}
