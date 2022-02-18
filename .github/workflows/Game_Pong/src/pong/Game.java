package pong;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable,KeyListener {

	private boolean isRunning = true;
	public static int WIDTH=240;
	public static int HEIGHT=120;
	public final int SCALE=4;
	
	public BufferedImage layer = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	
	public static Player player;
	public static Enemy enemy;
	public static Bolinha bolinha;
	
	public Game() {
		this.setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		// o height - 10 é porque o height daria a linha final da janela, o - 10 faz aparecer na tela
		player = new Player(100,HEIGHT-5);
		enemy = new Enemy(100,0);
		bolinha = new Bolinha(120,HEIGHT/2 - 1);
		//para poder mexer o personagem, tem q implementar e colocar os metodos dele
		this.addKeyListener(this);
		}
	
	public static void main (String[] args) {
		JFrame frame = new JFrame("PongBox");
		Game game = new Game();
		frame.add(game);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setVisible(true);
		
		new Thread(game).start();;
	}
	
	public void tick() {
		player.tick();
		enemy.tick();
		bolinha.tick();
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
		return;
		}
	    Graphics g = layer.getGraphics();
	    // setcolor e fill rect para o objeto player não ficar renderizando sem apagar e ficar parecendo o FLASH
	    g.setColor(Color.black);
	    g.fillRect(0, 0, WIDTH, HEIGHT);
	    enemy.render(g);
		player.render(g);
		bolinha.render(g);
		g = bs.getDrawGraphics();
		g.drawImage(layer, 0, 0, WIDTH*SCALE, HEIGHT*SCALE, null);
		// para aparecer o personagem na tela ( a linha azul )
		bs.show();
	}
	public void run() {
		// Foca automaticamente
		requestFocus();
		// game looping em 60 fps
		while(true) {
			tick();
			render();
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}


	public void keyTyped(KeyEvent e) {
		
	}


	public void keyPressed(KeyEvent e) {
		// KeyCode VK RIGHT seta direita, se apertar é true né
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.right = true;
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT)
			player.left = true;
		}

	public void keyReleased(KeyEvent e) {
		// KeyCode VK LEFT seta esqueda se desapertar é false né
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.right = false;
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT)
			player.left = false;
		}
	}
	


