package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Bolinha {
	public double x,y;
	public int width, height;
	
	public double dx,dy;
	public double speed =2.0;
	
	// int x é do método, o this.x é da classe ;D
	public Bolinha (int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 4;
		this.height = 4;
		
		int angle = new Random().nextInt(1) +89;
		dx = Math.cos(Math.toRadians(angle));
		dy = Math.sin(Math.toRadians(angle));
	}
	// toda a logica do jogo
	public void tick() {
		
		if(x+(dx*speed) + width >= Game.WIDTH) {
			dx*=-1;
		} else if (x + (dx*speed) < 0) {
			dx*=-1;
		}
		
		
		if (y >= Game.HEIGHT) {
			System.out.println("Ponto do Inimigo!");
			// reseta o game
			new Game();
			return;
		} else if (y < 0) {
			System.out.println("Ponto Nosso!!");	
			// reseta o game
			new Game();
			return;			
			}
		
		Rectangle bounds = new Rectangle((int) (x+(dx*speed)),(int)(y+(dy*speed)), width, height);
		
		Rectangle boundsPlayer = new Rectangle(Game.player.x,Game.player.y,Game.player.width,Game.player.height);
		Rectangle boundsEnemy = new Rectangle((int)Game.enemy.x,(int)Game.enemy.y,Game.enemy.width,Game.enemy.height);
		
		if(bounds.intersects(boundsPlayer)) {
			int angle = new Random().nextInt(120 - 45) +80 + 1;
			dx = Math.cos(Math.toRadians(angle));
			dy = Math.sin(Math.toRadians(angle));
			if(dy > 0) {
			dy*=-1;
			}
		} else if (bounds.intersects(boundsEnemy)) {
			int angle = new Random().nextInt(120 - 45) + 80 + 1;
			dx = Math.cos(Math.toRadians(angle));
			dy = Math.sin(Math.toRadians(angle));
			if(dy < 0) {
			dy*=-1;
			}
		}
		
		y+=dy*speed;
		x+=dx*speed;
	}
	
	// toda a renderização (Graficos do jogo)
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect((int)x,(int)y, width, height);
	}
}
