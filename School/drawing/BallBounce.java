//Bassem El-Sayed
//nov 18, 2021
package drawing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BallBounce implements ActionListener {

	public static void main(String[] args) {
		new BallBounce();

	}

	//Global variables 
	static final int PANW = 800;
	static final int PANH = 700;
	int oldvx = 0;
	DrawingPanel panel = new DrawingPanel();
	Ball ball = new Ball(300,100,40,40);
	JPanel btnPanel = new JPanel();
	JButton pause, reverse;	
	int direction = 0;

	class Ball {
		//only add this line in if you do NOT extend Rectangle
		int x, y, width, height;
		int vx = 3;
		int vy = 0;

		Ball(int x, int y, int w, int h) {
			this.x = x;
			this.y = y;
			width=w;
			height = h;
		}
	}


	BallBounce(){

		//setup Jframe
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );				
		//set JButtons 
		reverse = new JButton("Reverse");
		pause = new JButton("Pasue");
		//add ActionListner
		MyEvent1 ev= new MyEvent1();
		pause.addActionListener(ev);
		pause.setActionCommand("Pause");
		reverse.addActionListener(ev);
		reverse.setActionCommand("Reverse");
		//add buttons to panel
		btnPanel.add(pause);
		btnPanel.add(reverse);
		btnPanel.setBackground(Color.GREEN);
		//add panel to frame
		frame.add(btnPanel, BorderLayout.SOUTH);
		frame.add(panel);
		frame.pack(); //let panel set the size
		frame.setLocationRelativeTo(null);  


		frame.setVisible(true);
		//set timer
		Timer timer = new Timer(10,this);
		timer.start();

	}

	void moveBall() {
		ball.x += ball.vx;
		ball.y += ball.vy;


		// if it passes move it to the left side 
		if (ball.vx > 0 && ball.x+ball.width > PANW ) {//right wall
			ball.x = 0;
		}
		//if it passes move it to the right side
		if (ball.vx < 0 && ball.x+ball.width < 0 ) {//left wall
			ball.x = PANW;
		}
	}

	class DrawingPanel extends JPanel {
		DrawingPanel() {
			this.setPreferredSize(new Dimension (PANW, PANH));

		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.fillOval(ball.x, ball.y, ball.width, ball.height);

		}
	}

	public class MyEvent1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//if the button pause is pressed and the temp vx isnt 0 then move the oldvx over and allowing ball vx to move again
			if(e.getActionCommand().equals("Pause")) {
				if (oldvx != 0){
					pause.setText("pause");
					ball.vx = oldvx;
					oldvx = 0;
				} else {
					//if it does equal to 0 then move ball vx over and set it to 0 pausing it
					oldvx = ball.vx;
					ball.vx = 0;
					pause.setText("resume");
				}
			}
			if(e.getActionCommand().equals("Reverse")) {
				// if reverse is pressed then ball.vx is flipped 
				ball.vx = -ball.vx;
			}

		}

	}
	//this is for the TIMER
	@Override
	public void actionPerformed(ActionEvent e) {
		moveBall();
		panel.repaint();		
	}

}
