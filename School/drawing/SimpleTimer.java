package drawing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class SimpleTimer {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SimpleTimer();
			}
		});
	}
	JLabel label = new JLabel("Time");
	Timer timer1 = new Timer (1000, new MyTimerAL());

	SimpleTimer(){
		JFrame window = new JFrame ("Timer Example");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(700,500);
		JPanel panel = new JPanel();
		panel.add(label);
		window.add(panel);
	
		
		window.setVisible(true);
		timer1.start();


	}
	class MyTimerAL implements ActionListener {
		int seconds =0;

		@Override
		public void actionPerformed(ActionEvent e) {
			seconds++;
			label.setText("Time : " + seconds);
			
		}
		
	}
	
} 