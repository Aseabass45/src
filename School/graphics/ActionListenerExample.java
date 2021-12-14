package graphics;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ActionListenerExample extends JFrame implements ActionListener {

	JSlider redSlider, greenSlider, blueSlider;
	JPanel colourPanel, sliders, labels;
	JLabel redLabel, greenLabel, blueLabel;
	JButton reset, exit;

	public ActionListenerExample(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setTitle("Colour Changer");
		this.setSize(900, 400);


		redSlider = new JSlider (JSlider.HORIZONTAL, 0, 255, 0);
		greenSlider = new JSlider (JSlider.HORIZONTAL, 0, 255, 0);
		blueSlider = new JSlider (JSlider.HORIZONTAL, 0, 255, 0);

		redLabel = new JLabel ("Red = 0");
		greenLabel = new JLabel ("Green = 0"); 
		blueLabel= new JLabel ("Blue = 0");
		reset = new JButton("Reset");
		reset.addActionListener(this);
		exit = new JButton("Exit");
		MyEvent2 en = new MyEvent2 ();
		exit.addActionListener(en);

		MyEvent1 ev= new MyEvent1();
		//reset.addActionListener(ev);
		redSlider.addChangeListener(ev);
		greenSlider.addChangeListener(ev);
		blueSlider.addChangeListener(ev);

		colourPanel = new JPanel();
		colourPanel.setBackground(Color.BLACK);


		redSlider.setPaintTrack(true);
		redSlider.setPaintTicks(true);
		redSlider.setPaintLabels(true);
		redSlider.setMajorTickSpacing(50);
		redSlider.setMinorTickSpacing(5);


		greenSlider.setPaintTrack(true);
		greenSlider.setPaintTicks(true);
		greenSlider.setPaintLabels(true);
		greenSlider.setMajorTickSpacing(50);
		greenSlider.setMinorTickSpacing(5);

		blueSlider.setPaintTrack(true);
		blueSlider.setPaintTicks(true);
		blueSlider.setPaintLabels(true);
		blueSlider.setMajorTickSpacing(50);
		blueSlider.setMinorTickSpacing(5);

		colourPanel.add(redLabel);
		colourPanel.add(redSlider);
		colourPanel.add(greenLabel);
		colourPanel.add(greenSlider);
		colourPanel.add(blueLabel);
		colourPanel.add(blueSlider);
		colourPanel.add(reset);
		colourPanel.add(exit);

		this.add(colourPanel);		 
		this.setVisible(true);
	}

	public class MyEvent1 implements ChangeListener {

		/*public void actionPerformed (ActionEvent e) {
			// String action = e.getActionCommand();
			 // if (action.equals("Geeks")) {
				 reset.setBackground(Color.BLACK);
				 redSlider.setValue(0);
				 greenSlider.setValue(0);
				 blueSlider.setValue(0);

				 /*redLabel.setText("Red = 0");
				 greenLabel.setText("Green = 0");
				 blueLabel.setText("Blue = 0");
		 */




		@Override
		public void stateChanged(ChangeEvent e) {
			int r = redSlider.getValue();
			int g = greenSlider.getValue();
			int b = blueSlider.getValue();

			redLabel.setText("Red = " + r);
			greenLabel.setText("Green = " + g);
			blueLabel.setText("Blue = " + b);

			colourPanel.setBackground(new Color (r,g,b));

		}

	}
	public static void main(String args[]) {		 
		ActionListenerExample window = new ActionListenerExample();		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		redSlider.setValue(0);
		greenSlider.setValue(0);
		blueSlider.setValue(0);

	}
	public class MyEvent2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}

	

	}
}