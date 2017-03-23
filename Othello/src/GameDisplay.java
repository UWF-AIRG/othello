import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;


public class GameDisplay implements OthelloUI
{
	private volatile boolean isClick;
	public Scanner in = new Scanner(System.in);
	private volatile boolean errorMessage =false;
	 private int MainROW=8;
	 private int MainCOL=8;
	   private volatile boolean buttonPressed = false;
	   private volatile int xCordinate;
	   private volatile int yCordinate;
	 private JButton[][] buttons = new JButton[MainCOL][MainROW];
	
	public GameDisplay()
	{
		buttons = new JButton[MainCOL][MainROW];

	      
	      setFrame();
	}
	
	   public void setFrame()
	   {
	      JFrame frame = new JFrame();

	         JPanel panel = new JPanel(new BorderLayout());

	       
	         panel.setBackground(Color.BLUE);
	         frame.add(allPanel());

	         frame.setTitle("AIRG Othello Game");
	         frame.setVisible(true);;
	         frame.setSize(900,900);
	         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

	   }
	   public JPanel allPanel()
	   {
	      JPanel panel = new JPanel( new BorderLayout());

	     

	      

	      //panel.add(bottomMessage, BorderLayout.SOUTH);
	      panel.add(addButtonToPanel(), BorderLayout.CENTER);

	      return panel;
	   }
	   private class ButtonsClick implements ActionListener
	   {
	      @Override public void actionPerformed(ActionEvent e)
	      {
	         String newValue= ((JButton)e.getSource()).getText();
	         
	         Point p = getPressedButton(e);
	         xCordinate = p.x;
	         yCordinate = p.y;
	         isClick = true;
	         
	      }
	   }
	   
	   private Point getPressedButton(ActionEvent evt){
		    Object source = evt.getSource();
		    for(int i = 0; i < MainCOL; i++){
		        for(int j = 0; j < MainROW; j++){
		            if(buttons[i][j] == source)
		                return new Point(i,j);
		        }
		    }
		    return null;
		  }
	   private Panel addButtonToPanel()
	   {
	      Panel panel = new Panel();
	      panel.setLayout(new GridLayout(MainCOL, MainROW,2,2));
	      Font font = new Font("Courier", Font.BOLD, 20);
	      panel.setBackground(Color.LIGHT_GRAY);
	      for (int i = 0; i <MainCOL ; i++)
	      {
	         for (int j = 0; j < MainROW; j++)
	         {

	            buttons[i][j] = new JButton();

	            panel.add(buttons[i][j]);
	            buttons[i][j].addActionListener(new ButtonsClick());

	            buttons[i][j].setPreferredSize(new Dimension(5, 5));
	            buttons[i][j].setForeground(Color.BLACK);
	            buttons[i][j].setBackground(Color.GRAY);

	            buttons[i][j].setFont(font);



	         }
	      }
	      return panel;
	   }
	public void print(Board board)
	{
		for ( int i=0; i<board.size; i++)
	      {
	         for( int j=0; j<board.size; j++)
	         {  
	                     

	                      if(board.getPlayerWithIndex(i, j)==Player.Empty)
	                     {
	                    	 buttons[i][j].setBackground(Color.GREEN);
	                     }
	                     else if(board.getPlayerWithIndex(i, j)==Player.Black)
	                     {
	                    	 buttons[i][j].setBackground(Color.black); 
	                     }
	                     else if(board.getPlayerWithIndex(i, j)==Player.White)
	                     {
	                    	 buttons[i][j].setBackground(Color.WHITE); 
	                     }
	         }
	      }
	}
	public void setErrorMessage(boolean b)
	{
		errorMessage = b;
	}
	public boolean isClick()
	{
		return isClick;
	}
	public void setIsClick(boolean click)
	{
		isClick = click;
	}
	public void errorSpaceMessage()
	{
		if(errorMessage)
		{
			System.out.println("Space is Ocupy");
		}
	}
	
	public void errorOutMessage()
	{
		if(errorMessage)
		{
			System.out.println("Please place the piece in a close Range, stupid");
		}
	}
	
	public int[] makeMove(Player player)
	{
		

		System.out.println("Enter a value for "+ player+" player");
		int[] move =  new int[]{xCordinate,yCordinate};
//		move[0]=in.nextInt();
//		move[1]=in.nextInt();
		
		return move;
//		  public int[] getUserMove()
//		   {
//		      int[] temp= new int[]{xCordinate,yCordinate};
//		      return temp;
//		   }
	}
	
}
