package graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Event1 {

	public static void main(String[] args) {
		new Event1();
	}
	JFrame window;
	JPanel panel;

	Event1(){
		window = new JFrame ("Event demo");
		window.setSize(400,400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		JButton button = new JButton("Yes");
		button.addActionListener(new MyAL()); // step 1

		panel.add(button);
		window.add(panel);


		window.setVisible(true);
	}
	// inner class
	//"implements ..." means "use the interface..."
	class MyAL implements ActionListener {
		int numCLicks = 0;
		@Override
		public void actionPerformed(ActionEvent ev) {
			//change background colour 
			panel.setBackground(Color.pink);

			numCLicks++;
			window.setTitle( numCLicks + " clicks");

		}



	}
}
