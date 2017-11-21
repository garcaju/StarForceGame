package main;

import java.*;
import java.util.Random;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import menus.Keyboard;

import animaciones.*;
import main.entidades.Colision;
import main.entidades.EntidadAlly;
import main.entidades.EntidadEnemy;

import java.util.LinkedList;

@SuppressWarnings({ "serial", "unused" })
public class Game extends Canvas implements Runnable {

	// attributes
	public static final int WIDTH = 350;
	public static final int HEIGHT = WIDTH / 11 * 11;
	public static final int ESCALE = 2;
	public final String TITLE = "Staff Force";
	
	private boolean running = false;
	private boolean pause = true;
	private Thread thread;
	
	private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	private BufferedImage spriteSheet = null;

	private BufferedImage background = null;
	private boolean shooting = false;
	
	private int enemycont = 1;
	private int enemydown = 0;
	
	Random r = new Random();
	
	private Pilot pilot;
	private Enemy enemy;
	private Control control;
	private Texture tex;
	private MainMenu mainMenu;
	
	public LinkedList<EntidadAlly> entiA;
	public LinkedList<EntidadEnemy> entiE;
	
	public static int SALUD = 672;
	public static int SCORE = 0;
	
	public static enum STATUS{
		
		MENU,
		JUEGO,
		PAUSE
		
	};
	
	public static STATUS Status = STATUS.MENU; 
	
	private int oldScore=0;
	private long timeScore=0;
	
	
	// methods
	public void init() {
		
		requestFocus();
		BufferedImageLoader loader = new BufferedImageLoader();
		
		try {
			background = loader.loadImage("/background.jpg");
			spriteSheet = loader.loadImage("/sprite_sheet.png");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		addKeyListener(new Keyboard(this));
		this.addMouseListener(new Mouse());
		
		tex = new Texture(this);
	
		
		control = new Control(tex, this);
		control.añadeEnemigo(enemycont);
		pilot = new Pilot (350, 620, tex , control,this);
		enemy = new Enemy (350, 620, tex , control,this);
		mainMenu = new MainMenu();
		
		entiA = control.getEntidadAliada();
		entiE = control.getEntidadEnemiga();
	}
	
	// @Override
	private synchronized void start() {
		if (running)
			return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
		System.out.println("Start Game");
		
	}	
	
	private synchronized void stop() {
		if (!running)
			return;
		
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(1);
	}	
	
	
	// @Override
	public void run() {
		
		init();
		long lastTime = System.nanoTime();
		final double amountTicks = 50.0;
		double ns = 1000000000 / amountTicks;
		double delta = 0;

		int update = 0;
		int frames = 0;

		long refInstant = System.nanoTime();
		
		
		while(running) {
			
			// loop game
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			
			if (delta >= 1) {
				tick();
				update++;
				delta--;
			}
			render();
			frames++;
			
			
			if (System.nanoTime() - refInstant > 1000000000) {
				System.out.println(update + " Ticks, Frames per second " + frames);
				update = 0;
				frames = 0;
				refInstant = System.nanoTime();
			}
		}
		stop();
		
	}
	


	private void tick() {
		
		if (Status == STATUS.JUEGO){
		
		oldScore = SCORE;	
			
		pilot.tick();
		control.tick();
		}
		
		if (enemydown >= enemycont){
			
			enemycont += 1;
			enemydown = 0;
			control.añadeEnemigo(enemycont);
		}
		if (SALUD <= 0) {
			
			Status = STATUS.PAUSE;
			
			
		}
	}
	
	
	private void render() {

		BufferStrategy bs = this.getBufferStrategy();
		
		if (bs == null) {
			createBufferStrategy(4);
			return;
		}
		// dumping Graphics to Buffer
		Graphics g = bs.getDrawGraphics();
		
		// painting the game from buffer
		
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);	
		g.drawImage(background, 0, 0, null);
		
		if (Status == STATUS.JUEGO){
		pilot.render(g);	
		control.render(g);
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(2, 2, 16, 678);
		
		g.setColor(Color.RED);
		g.fillRect(5, 5, 10, 672);
		
		g.setColor(Color.GREEN);
		g.fillRect(5, 5, 10, SALUD);
		
		System.out.println("render" + Enemy.puntua );
				
		
		if (Enemy.puntua == true){
			
			System.out.println("Game.entrando TRUE" + Enemy.puntua );
			
			Font font1 = new Font("Bauhaus 93", Font.ITALIC, 44);
			g.setFont(font1);
			g.setColor(Color.red);
			g.drawString(Integer.toString(Game.SCORE), Game.WIDTH -130,30);
			
			if(SCORE > oldScore)timeScore = System.currentTimeMillis();
			
			if(timeScore + 250 < System.currentTimeMillis()){
				Enemy.puntua = false;
				timeScore = 0;
			}
			
			
		} else {
			
			Font font = new Font("Bauhaus 93", Font.ITALIC, 24);
			g.setFont(font);
			g.setColor(Color.ORANGE);
			g.drawString(Integer.toString(Game.SCORE), Game.WIDTH -130,30);
				
		}
		
		Font font2 = new Font("OCR A Extended", Font.BOLD, 30);
		g.setFont(font2);
		g.setColor(Color.yellow);
		g.drawString("SCORE: ", Game.WIDTH -320,29);
		}else if (Status == STATUS.MENU){
			
			mainMenu.render(g);
		}
		
		if (Status == STATUS.PAUSE){
			
			Font font3 = new Font("OCR A Extended", Font.BOLD, 70);
			g.setFont(font3);
			g.setColor(Color.CYAN);
			g.drawString("PAUSE", Game.WIDTH - 120, Game.HEIGHT);
			
		}

		//
		// end painting from buffer
		
		g.dispose();	// clear Graphics
		bs.show();		// print buffer
	}
	
	
	

	public static void main (String args[]) {
		
		Game game = new Game();
		
		game.setPreferredSize(new Dimension (WIDTH * ESCALE, HEIGHT * ESCALE));
		game.setMaximumSize(new Dimension (WIDTH * ESCALE, HEIGHT * ESCALE));
		game.setMinimumSize(new Dimension (WIDTH * ESCALE, HEIGHT * ESCALE));
		
		JFrame frame = new JFrame(game.TITLE);
		
		frame.add(game);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		
		game.start();
	}
	
	public BufferedImage getSpriteSheet() {
		
		return spriteSheet;
	}
	
	public int getEnemycont() {
		return enemycont;
	}

	public void setEnemycont(int enemycont) {
		this.enemycont = enemycont;
	}

	public int getEnemydown() {
		return enemydown;
	}

	public void setEnemydown(int enemydown) {
		this.enemydown = enemydown;
	}

	
	
	//  keyBoard Listeners
	
	public void keyPressed (KeyEvent e) {
		int key = e.getKeyCode();
		
		if (Status == STATUS.JUEGO){
			
		if (key == KeyEvent.VK_RIGHT) {
		
			pilot.setVelX(8);
		} 
		
		if (key == KeyEvent.VK_LEFT) {
			
			pilot.setVelX(-8);	
		}
		
		if (key == KeyEvent.VK_UP) {
			
			pilot.setVelY(-6);	
		}
		
		if (key == KeyEvent.VK_DOWN) {
			
			pilot.setVelY(6);
		}
		
		
		
		if (key == KeyEvent.VK_SPACE) {
			shooting = true;
			control.addEntidadAliada(new Bullets(pilot.getX(), pilot.getY(), tex, this, control));
		 }
		}
		
		if (key == KeyEvent.VK_P && pause == true){
			
			Status = STATUS.PAUSE;
			pause = false;
			
		} else {
			Status = STATUS.JUEGO;
			pause = true;
		}
	}
	
	public void keyReleased (KeyEvent e) {
		int key = e.getKeyCode();
		
		
		if (key == KeyEvent.VK_RIGHT) {

			pilot.setVelX(0);
			
		} else if (key == KeyEvent.VK_LEFT) {
			
			pilot.setVelX(0);
			
		} else if (key == KeyEvent.VK_UP) {
			
			pilot.setVelY(0);
			
		} else if (key == KeyEvent.VK_DOWN) {
		
			pilot.setVelY(0);
		
		} else if (key == KeyEvent.VK_SPACE) {
			shooting = false;
		}
	}
	
	
}
