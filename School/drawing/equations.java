package drawing;

import java.awt.Color;
import java.awt.Graphics;

public class equations {
	int panW = 900, panH = 700;
	double xmin = -5.0; double xmax = 5.0;
	double ymin = -3.0; double ymax = 1.0;
	
	double xstep;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(Color.WHITE);
		int px -
		if (ball.vx > 0 && ball.x+ball.width > PANW ) {//right wall
			ball.vx = -ball.vx;  //reverse direction
			//undo the last move
			ball.x -= ball.vx;
			ball.y -= ball.vy;
		}
		else if (ball.vy < 0 && ball.x < 0) {//left wall
			ball.vx = -ball.vx;  //reverse direction
			//undo the last move
			ball.x -= ball.vx;
			ball.y -= ball.vy;

		}
		else if (ball.vy > 0 && ball.y+ball.height > PANH) {// bottom wall
			ball.vx = -ball.vx;  //reverse direction
			//undo the last move
			ball.x -= ball.vx;
			ball.y -= ball.vy;		

		}
		else if (ball.vy < 0 && ball.y < 0) {// bottom wall
			ball.vx = -ball.vx;  //reverse direction
			//undo the last move
			ball.x -= ball.vx;
			ball.y -= ball.vy;		

		}
		
		
	}

}
