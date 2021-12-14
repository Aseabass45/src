package drawing;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEvents implements MouseMotionListener, MouseListener{

	public static void main(String[] args) {
		new MouseEvents();
	}

	//Global variables
	int panW = 800, panH = 800;
	Rectangle box = new Rectangle(50,50,100,100);
	DrawingPanel panel;
	int mx, my;
	
	
	MouseEvents(){
		//setup JFrame
		JFrame window = new JFrame("Drawing on JPanel");		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new DrawingPanel();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		window.add(panel);
		window.pack(); 		//sets optimum size
		window.setLocationRelativeTo(null);  //centre on screen
		window.setVisible(true);
	}
	
	class DrawingPanel extends JPanel {
		
		DrawingPanel() {
			//this controls the size ***
			this.setPreferredSize(new Dimension(panW, panH));
			this.setBackground(Color.decode("#221177"));
		}
		
		//all drawing goes in here
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g); //clear and set BGcolor
			
			g.setColor(Color.YELLOW);
			g.fillRect(box.x, box.y, box.width, box.height);
			g.drawLine(panW/2, panH/2, mx, my);
			
			g.drawOval(150, 10, 100,100);
			//turn on antialias
			Graphics2D g2 = (Graphics2D) g; 
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
					
			g2.drawOval(10, 10, 100,100);
			//how to make a thicker line
			g2.setStroke(new BasicStroke(4));
			//why does this work if I use g and not g2?
			g.drawLine(0,300,100,300);
			
		}
		
	}	
	
	//this is where the first point of the rectangle is drawn
	@Override
	public void mouseClicked(MouseEvent e) {
	
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
	
		
		if(box.contains(e.getPoint())) {
			panel.setBackground(Color.BLACK);
			box.x += (int) (Math.random() * 100)+ 1;
			box.y += (int) (Math.random() * 70)+ 1;
			panel.repaint();
		}
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {

		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
	
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		mx = e.getX();
		my = e.getY();
		panel.repaint();
		
	}
}
