
public interface OthelloUI 
{
	public void print(Board board);
	public int[] makeMove(Player player);
	
	public void setErrorMessage(boolean b);
	public boolean isClick();
	
	/**
	 * Sets the checks if is click.
	 *
	 * @param click the new checks if is click
	 */
	public void setIsClick(boolean click);
	public void errorSpaceMessage();
	public void errorOutMessage();
}
