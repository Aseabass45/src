package graphics;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class GridLayout1 {

	public static void main(String[] args) {
		new GridLayout1(); //this will run the constructor


	}

	JFrame window;

	GridLayout1(){
		window = new JFrame("Flow Layout");
		window.setSize(800, 600);
		//closing the window should end the program
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setLayout(new GridLayout(3,5));
		for(int i = 0; i < 15; i++) {
			panel.add(new JButton("num " + i));
		}

		


		window.add(panel);

		// the last thing you do (normally)
		window.setVisible(true);
	}


}

