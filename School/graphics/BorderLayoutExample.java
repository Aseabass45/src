package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class BorderLayoutExample {

	public static void main(String[] args) {
		new BorderLayoutExample();
		
	}

	BorderLayoutExample(){
		//setup jframe
		JFrame window = new JFrame ("Border Layout Example");
		window.setSize(900, 700);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelW = new JPanel();
		panelW.setBackground(Color.orange);
		panelW.add(new JLabel("WEST PANEL"));
		window.add(panelW, BorderLayout.WEST);
		
		JPanel panelE = new JPanel();
		panelE.setBackground(Color.red);
		panelE.add(new JLabel("EAST PANEL"));
		window.add(panelE, BorderLayout.EAST);
		
		JPanel panelN = new JPanel();
		panelN.setBackground(Color.green);
		panelN.add(new JLabel("NORTH PANEL"));
		window.add(panelN, BorderLayout.NORTH);
		
		JPanel panelS = new JPanel();
		panelS.setBackground(Color.pink);
		panelS.add(new JLabel("SOUTH PANEL"));
		window.add(panelS, BorderLayout.SOUTH);
		
		JPanel panelC = new JPanel();
		panelC.setBackground(Color.yellow);
		panelC.setLayout(new GridLayout(3,15, 20, 35));
		for(int i = 1; i <= 6; i++) {
			panelC.add(new JButton("num " + i));
		}
		//panelC.add(new JLabel("CENTER PANEL"));
		window.add(panelC, BorderLayout.CENTER);
		
		window.setVisible(true);
	}
}
