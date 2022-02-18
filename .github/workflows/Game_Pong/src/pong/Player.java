package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

	public boolean left,right;
	// velocidade 1 2 3 4 5 (o usuario)
	public int x,y;
	public int width, height;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
	}
	
	
	public void tick() {
		if(right) {
			x++;
		} else if(left) {
			x--;
		}
		// para colis�o do lado direitp
		if (x+width > Game.WIDTH) {
			x = Game.WIDTH - width;
		} 
		// para colis�o do lado esquerdo
		else if (x < 0) {
			x = 0;
		}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 40, 5);
	}
}
