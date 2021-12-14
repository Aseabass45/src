package drawing;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/***********************************************
 This is the skeleton for a TicTacToe game using Swing.

 Look over this and see if you have any questions so far.

 We're going to start with just the graphics part.
 But we're also going to store the data. The data will be stored as a grid 
 or 2D array of integers. 

 For TicTacToe, it make sense to have empty = 0, and then X and O be +/- 1
 We'll see why later.
 */

public class TicTacToe {

	//CONSTANTS
	final static int GRID = 3;		//size of board & grid
	/*** you can set this to any size, but the winning only works for the top 3x3 corner ***/


	final static Color COLOURGRID = new Color(140, 140,140);	
	final static Color COLOURBACK = new Color(240, 240, 240);

	final static int XX = 1;
	final static int OO = -1;
	final static int EMPTY = 0;
	//GLOBAL VARIABLES
	JFrame frame = new JFrame("TicTacToe");		
	boolean turns = true;
	boolean win = false;
	int colWinner = 0;
	int rowWinner = 0;
	int diagLeftWin =0;
	int diagRightWin =0;
	boolean tie = false;


	int[][] board = new int [GRID][GRID];
	public static void main(String[] args) {
		new TicTacToe();
	}

	TicTacToe() {	
		createAndShowGUI();

		//board [0][0] = XX;
		//board [0][1] = OO;
	}

	//This will reset the board if you want to play again.
	//It will be called from the method that checks if you win. If the game is over, reset and then play again
	void createAndShowGUI() {

		Container content = frame.getContentPane();
		content.setBackground(Color.BLUE);
		content.setLayout(new BorderLayout(2,2));

		//setup top label & panel						


		//make main panel
		DrawingPanel gridPanel = new DrawingPanel();
		content.add(gridPanel, BorderLayout.CENTER);

		//finish setting up the frame
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize(500, 450);		
		frame.setLocationRelativeTo(null);  //must be AFTER setSize		
		frame.setVisible(true);

		//Once the panel is visible, initialize the graphics. 
		//*** This is no longer needed here since it's at the beginning of paintComponent()
		//gridPanel.initGraphics();

	}

	void printBoard() {
		for(int row=0; row<GRID; row++) {
			for(int col=0; col<GRID; col++){
				System.out.printf("%3d", board[row][col]);

			}
			System.out.println();
		}
		//System.out.println("=========="); //print out dividing line of the correct length
		for (int i = 0; i < GRID*3 +2; i++) System.out.print("=");System.out.println();		
	}

	private class DrawingPanel extends JPanel implements MouseListener{


		//instance variables
		int jpanW, jpanH;	//size of JPanel
		int boxW, boxH;	//size of each square		

		//** Because the panel size variables don't get initialized until the panel is displayed,
		//** we can't do a lot of graphics initialization here in the constructor.
		DrawingPanel() {
			this.addMouseListener(this);
			setBackground(COLOURBACK);
		}

		//** WAS called by createAndShowGUI(), now from paintComponent()
		void initGraphics() {
			jpanW = this.getSize().width;		
			jpanH = this.getSize().height;	

			
			boxW = jpanW/GRID;
			boxH= jpanH/GRID;
		}
		void restart() {
			for(int cRow = 0; cRow < GRID; cRow++) {
				for(int cCol = 0; cCol < GRID; cCol++) {
					board[cRow][cCol] = EMPTY;
				}
			}
			tie = false;
			win = false;
			colWinner = 0;
			rowWinner =0;
			diagLeftWin = 0;
			diagRightWin = 0;
			frame.setTitle("TicTacToe");

		}
		public boolean checkTie () {
			boolean tempTie = true;
			for(int cRow = 0; cRow < GRID; cRow++) {
				for(int cCol = 0; cCol < GRID; cCol++) {
					if(board[cCol][cRow] == EMPTY) {
						tempTie = false;
					}
				}
			}
			return tempTie;

		}
		public void checkWinner () {
			if(!win) {
				for (int cRow = 0; cRow < GRID; cRow++) {
					for(int cCol = 0; cCol < GRID; cCol++) {
						colWinner += board[cCol][cRow];
						rowWinner += board[cRow][cCol];
					}
					if(colWinner == GRID || colWinner == -GRID || rowWinner == GRID || rowWinner == -GRID) {
						win = true;
						break;
					}
					colWinner = 0;
					rowWinner = 0;
				}
				for(int diag = 0; diag < GRID; diag++) {
					diagLeftWin += board[(GRID -1)-diag][(GRID-1) -diag];
					diagRightWin += board[(GRID -1)-diag][diag];

				}
				if(diagLeftWin == GRID || diagLeftWin == -GRID || diagRightWin == GRID || diagRightWin == -GRID) {
					win = true;
				}
				else {
					diagLeftWin = 0;
					diagRightWin = 0;
				}

			}

		}
		@Override
		public void paintComponent(Graphics g){
			super.paintComponent(g); //needed for background colour to paint
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			initGraphics(); //needed if the window is resized.

			//TODO Draw grid
			g.setColor(COLOURGRID);	
			for (int i =1; i<GRID; i++) {
				g.drawLine(0, i*boxH, jpanW, i*boxH);
				g.drawLine(i*boxW, 0, i*boxW, jpanH);
			}




			//TODO draw all X and Os
			for(int row=0; row<GRID; row++) {
				for(int col=0; col<GRID; col++){
					if (board[row][col] == XX) {
						g.setColor(Color.RED);
						g2.setStroke(new BasicStroke(3));
						g.drawLine(col*boxW, row*boxH, (col+1)*boxW, (row+1)*boxH);
						g.drawLine((col+1)*boxW, row*boxH, col*boxW, (row+1)*boxH);


					}
					else if (board[row][col] == OO) {
						g.setColor(Color.GREEN);
						g2.setStroke(new BasicStroke(3));
						g.drawOval(col*boxW,row*boxH,boxW, boxH);

					}
				}
			}
			//Check every square in board[][] and draw an X or O there.
			//Try and resize the window while playing. Everything works. 


		}





		//******************* MouseListener methods *****************//
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();

			//calculate which square you clicked on
			int col = x/boxW;
			int row = y/boxH;

			//TODO display mouse coords and grid square in title.
			frame.setTitle(x +", " + y + "" + row + ", " + col);
			//how to check if click right mouse button
			if (e.getButton() == MouseEvent.BUTTON3) {
				//do something
			}

			/*** put these in methods, maybe one master method ***/


			//TODO Check if the square is empty
			if (board[row][col] != EMPTY) {
				return;
			}

			//TODO update board
			if(turns) {
				board[row][col] =XX;
			}
			else  {
				board[row][col]=OO;
			}
			turns =!turns;


			//TODO check for the winner
			checkWinner();
			if(colWinner == GRID || rowWinner == GRID || diagLeftWin == GRID || diagRightWin == GRID ) {
				this.repaint();
				JOptionPane.showMessageDialog(null, "X WINNER");
				frame.setTitle("X WINNER");
			}
			if(colWinner == -GRID || rowWinner == -GRID || diagLeftWin == -GRID || diagRightWin == -GRID ) {
				
				JOptionPane.showMessageDialog(null, "O WINNER");
				frame.setTitle("O WINNER");
			}

			if(win) {
				restart();

			}



			//TODO check for tie
			if(checkTie()) {
				tie = true;
				win = true;
				this.repaint();
				JOptionPane.showMessageDialog(null, "TIE");
				frame.setTitle("TIE");
				restart();
			}

			//TODO change turn


			this.repaint();
			printBoard();
		}	

		@Override
		public void mousePressed(MouseEvent e) {

		}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}

	} //end of DrawingPanel class

}