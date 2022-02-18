package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy {

	// como vai ser IA, as vezes a velocidade do inimigo pode alterar, por isso o double
	// velocidade de 1.2 1.5 (fica mais REAL [ mas pode usar int se quiser ] )
	public double x,y;
	public int width, height;
	public boolean left,right;
	
	public Enemy (int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
	}
	// toda a logica do jogo
	public void tick() {
		x+= (Game.bolinha.x - x - 6) *0.05;

	}
	
	// toda a renderização (Graficos do jogo)
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect((int)x,(int)y, width, height);
		
	}
}
