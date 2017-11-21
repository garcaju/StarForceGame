package main;
//h
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JOptionPane;

import animaciones.*;
import main.entidades.Colision;
import main.entidades.EntidadAlly;
import main.entidades.*;
import java.awt.Rectangle;
@SuppressWarnings("unused")
public class Pilot extends GameObject implements EntidadAlly {
						
		//private double x;
		//private double y;
		
		private int velX = 0;
		private int velY = 0;
		
		Control control;
		Enemy enemy;
		Game game;
		
		
		
			//private BufferedImage pilot;
			private Texture tex;
		
			public Pilot (int x, int y, Texture tex, Control control, Game game){
				
				//this.x = x;
				//this.y = y;
				
				super(x,y);
				this.tex = tex;
				this.control = control;
				this.game = game;
				
				//SpriteSheet ss = new SpriteSheet(game.getSpriteSheet());
				//pilot = ss.grabImage(1,1,32,32);
			}
			public void tick(){
				
				x += velX;
				y += velY;
				
				// Límites de movimiento de la nave dentro de los limites de la ventana de juego
				
				if(x < 20) {	//Límite por el margen izquierdo 
												
												x = 20;
				}
				if( x > (Game.WIDTH * Game.ESCALE) - 32 ){ //Límite por el margen derecho	
												velX = 0;// La nave frena
												x = (Game.WIDTH * Game.ESCALE) - 32; //La nave se queda en posicion del margen derecho ( -32 por que la nave es de 32 pixeles)
				}
				if ( y < 0) { //Límite por el margen superior
												y = 0;
				}									
				if( y > (Game.HEIGHT * Game.ESCALE) - 32){ //Límite por el margen inferior
												velY = 0;// La nave frena
												y = (Game.HEIGHT * Game.ESCALE) - 32;//La nave se queda en posicion del margen inferior ( -32 por que la nave es de 32 pixeles)
				}
				
				for(int i = 0; i < game.entiE.size(); i++){
				EntidadEnemy temporalEntidad = game.entiE.get(i);
				
					if (Colision.impact(this, temporalEntidad)){
					
						System.out.println("ha colisionadao la nave!");
						control.removeEntidadEnemiga(temporalEntidad);
						game.setEnemydown(game.getEnemydown()+1);
						game.SALUD -= 50;
			}
		}
					
				
			}
			public void render(Graphics g){
				
				//g.drawImage(pilot,(int)x,(int)y, null);
				g.drawImage(tex.pilot,(int) x,(int) y, null);
								
			}
			
			public Rectangle getBounds(){
				
				return new Rectangle ((int) x, (int) y, 32,32);
			}
			
			
			public double getX(){
				
				return x;
			}
			public double getY(){
				
				return y;
			}
			public void setX (int x){
				
				this.x = x;
			}
			
			public void setY (int y){
				
				this.y = y;
			}

			public void setVelX (double x){
				
				this.x = x;
			}

			public void setVelX(int speedX) {
				velX = speedX;
				
			}
			public void setVelY(int speedY) {
				velY = speedY;
				
			}
			
			public void setVelY (double y){
				
				this.y = y;
			}
			
																
}
