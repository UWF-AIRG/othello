
public interface OthelloUI 
{
	public void print(Board board);
	public int[] makeMove();
	
	public void setErrorMessage(boolean b);
	public boolean isClick();
	public void setIsClick(boolean click);
	public void errorSpaceMessage();
	public void errorOutMessage();
}
