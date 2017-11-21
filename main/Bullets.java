package main;

import java.awt.Graphics;
import java.awt.Rectangle;
//import java.awt.image.BufferedImage;

import animaciones.*;
import main.entidades.Colision;
import main.entidades.EntidadAlly;
import main.entidades.EntidadEnemy;
import animaciones.Control;
import main.Enemy;

public class Bullets extends GameObject implements EntidadAlly{
	
	private Texture tex;
	private Game game;
	private Control control;

	EntidadAlly aliado;
	EntidadEnemy enemigo;
	
	
	
	public Bullets (double x, double y, Texture tex, Game game, Control control) {

		super( x, y);
		this.tex = tex;
		this.game = game;
		this.control = control;
		
		
		//SpriteSheet ss = new SpriteSheet(game.getSpriteSheet());
		//image = ss.grabImage(4, 5, 32, 32);
	

		this.game = game;
		
		//SpriteSheet ss = new SpriteSheet(game.getSpriteSheet());
		//image = ss.grabImage(4, 5, 32, 32);

		this.game = game;	

	}
	
	
	
	public void tick() {
	
		y -= 10;
		
		if (this.y < 0){
			
			control.removeEntidadAliada(this);
		}
	}
	
	
	public void render(Graphics g) {
		g.drawImage(tex.controlBullets, (int)x, (int)y, null);
	}
	
	public Rectangle getBounds(){
		
		return new Rectangle ((int) x, (int) y, 32,32);
	}
	
	
	public double getY() {
		
		return y;
	}

	@Override
	public double getX() {
		
		return 0;
	}
}
