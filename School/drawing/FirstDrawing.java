package drawing;

import java.awt.*;

import javax.swing.*;

class FirstDrawing {

	public static void main(String[] args) {
		new FirstDrawing();
	}
	
	//global variales
	int panW = 800, panH = 800;
	FirstDrawing(){
		//setup JFrame
		JFrame window = new JFrame("Drawing on JPanel");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DrawingPanel panel = new DrawingPanel();
		window.add(panel);
		window.pack(); //sets optimum size
		window.setLocationRelativeTo(null); //centres on screen
		window.setVisible(true);
	}
	class DrawingPanel extends JPanel {
		
		DrawingPanel() {
			this.setPreferredSize(new Dimension(panW, panH));
			this.setBackground(Color.decode("#221177"));
			
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.YELLOW);
			Graphics2D g2 = (Graphics2D) g; 
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			//Color c=new Color(1f,0f,0f,.1f);
			g.fillRect(300,400,100,150);
			g.drawOval(10, 10, 100, 100);
			g2.drawOval(10, 10, 100,100);
			g2.fillOval(10, 10, 100,100);
			g2.setStroke(new BasicStroke(6));
			g.drawRect(400, 400, 100, 50);
			g.setColor(Color.GREEN);
			
			//turn on antialias
		
			
			//g2.fillRect(50 , 20, 50, 50);
			
			//how to make a thicker line
			
			g.drawOval(100, 100, 100, 100);
			//why does this work if I use g and not g2?
			g.drawLine(0,300,100,300);
			g.drawRect(300, 100, 100, 50);
			g.setColor(new Color (100, 30, 150, 127));
			//g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 5 * 0.1f));
			g.fillRect(400, 400, 100, 50);

			g2.setColor(Color.decode("#c71c55"));
			g2.setStroke(new BasicStroke(10));
			g2.setFont(new Font ("arial", Font.BOLD, 24));
			g.drawString("Hello", 500, 600);
		} 
	}
	

}
