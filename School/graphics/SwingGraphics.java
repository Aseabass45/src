package graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingGraphics {

	public static void main(String[] args) {
		new SwingGraphics(); 
	}

	//Constants
	//set the size of the drawing panel
	final static int panW = 800;
	final static int panH = 700;

	//Global variables
	GraphicsPanel panel;

	SwingGraphics(){
		JFrame window = new JFrame("Drawing on a JPanel");
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new GraphicsPanel();
		window.add(panel);  //defaults to BorderLayout.CENTER

		window.pack(); //needed in order to use the GraphicsPanel's size to set the JFrame size
		window.setLocationRelativeTo(null); //centre the window, must be after pack()

		window.setVisible(true); 	
	}

	private class GraphicsPanel extends JPanel {
		GraphicsPanel(){
			this.setBackground(Color.WHITE);
			this.setPreferredSize(new Dimension(panW, panH));
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			//Do all your drawing here
			for(int x = 0; x < panW; x++) {
				for(int y = 0; y < panH; y++) {
					/*Color r = (new Color (512*Math.sin(x/100.0),(512*Math.sin(y/100.0) );
					double e 
					double b 
					*/g.setColor(new Color(x%256, y%256, (x+y)%256));
					//g.setColor(new Color(x%256, y%256, (x+y)%256));
					//g.setColor(new Color ((x*y)%256, x%200, y%150 ));
					//g.setColor(new Color ((x*y)%256, x%200, y%150 ));
					g.drawLine(x,y, x,y);
				}
			}
		}
	}
}
