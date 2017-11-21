package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import animaciones.Texture;
import main.entidades.Colision;
import main.entidades.EntidadAlly;
import main.entidades.EntidadEnemy;
import animaciones.Animaciones;
import animaciones.Control;
import main.Game;
import main.Bullets;

import javax.swing.*;
//h  
public class Enemy extends GameObject implements EntidadEnemy{

	
	private Texture tex;
	public static boolean puntua = false;
	
	Random r = new Random();
	private int speed = r.nextInt(3)+4;
	private Game game;
	private Control control;
	private Bullets bullet;
	Animaciones anim;
	
	
	public Enemy(double x, double y,Texture tex, Control control, Game game){
		
		super (x,y);
		this.tex = tex;
		this.control = control;
		this.game = game;
		anim = new Animaciones (5,tex.enemy[0],tex.enemy[1],tex.enemy[2],tex.enemy[3],tex.enemy[4]);
		
	}
	public void tick(){
		
		y += speed;
		
		if (y>(Game.WIDTH * Game.ESCALE)) {
				
			y = 0;
			x = r.nextInt(Game.WIDTH * Game.ESCALE);		
		
		}
		
		for(int i = 0; i < game.entiA.size(); i++){
		
			EntidadAlly temporalEntidad = game.entiA.get(i);
			
		if (Colision.impacto(this,temporalEntidad)){
			
			System.out.println("entrando");
			
			puntua = true;
			control.removeEntidadAliada(temporalEntidad);
			control.removeEntidadEnemiga(this);
			game.setEnemydown(game.getEnemydown()+1);
			game.SCORE = game.SCORE + 10;
			 
			}
			
			
			System.out.println("SCORE: " + game.SCORE);
			
			control.removeEntidadAliada(bullet);
			
			if (y>(Game.WIDTH * Game.ESCALE)) {
						
				control.removeEntidadEnemiga(this);
			}
		}
		
		if(x < 20) {	
			x = 20;
		}
		if( x > (Game.WIDTH * Game.ESCALE) - 32 ){ 	
			
			x = (Game.WIDTH * Game.ESCALE) - 32; 
		}
		anim.runAnimacion();
		
	}
	public void render(Graphics g){
		
		anim.drawAnimation(g, x, y, 0);
		
		
	}
	
	public Rectangle getBounds(){

		return new Rectangle ((int) x + 15, (int) y + 10, 1,1);

	}
	
	public double getY(){
		
		return y;
	}
	public void setY(double y){
		
		this.y = y;
	}
	@Override
	public double getX() {
		
		return 0;
	}
}
