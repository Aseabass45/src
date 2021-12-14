package graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Event2 implements ActionListener{

	public static void main(String[] args) {
		new Event2();
	}
	JFrame window;
	JPanel panel;
	int numClicks = 0;
	JButton button;

	Event2(){
		window = new JFrame ("Event demo");
		window.setSize(400,400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		button = new JButton("Yes");
		button.addActionListener(this); // step 1
		JButton buttonExit = new JButton("Exit");
		buttonExit.addActionListener(this); // step 1

		panel.add(button);
		panel.add(buttonExit);
		window.add(panel);


		window.setVisible(true);
	}
	public void actionPerformed(ActionEvent ev) {
	if(ev.getActionCommand().equals("Exit")) {
		window.dispose();
		//System.exit(0);
	}
	if (ev.getSource() == button) {
	panel.setBackground(Color.pink);

		numClicks++;
		window.setTitle( numClicks + " clicks");
	}
	}
}
