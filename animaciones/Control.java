package animaciones;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;

import main.Bullets;
import main.Enemy;
import main.Game;
import main.entidades.EntidadAlly;
import main.entidades.EntidadEnemy;

@SuppressWarnings("unused")
public class Control {
	
	private LinkedList <EntidadAlly> entAliada = new LinkedList<EntidadAlly> ();
	private LinkedList <EntidadEnemy> entEnemiga = new LinkedList<EntidadEnemy> ();
	
	EntidadAlly entA;
	EntidadEnemy entE;
	
	private Game game;
	
	Random r = new Random();
	
	private Texture tex;
	
	public Control (Texture tex ,Game game){
		
		this.tex = tex;
		this.game = game;
	}

		public void añadeEnemigo (int enemycont){
			
			for (int i = 0; i < enemycont; i++){
				addEntidadEnemiga(new Enemy(r.nextInt(Game.WIDTH),10,tex,this, game));
			}
		}
	
	
	
	public void tick(){
		
		for(int i = 0; i < entAliada.size(); i++){
			
			entA = entAliada.get(i);
			entA.tick();
			
		}
		
		for(int i = 0; i < entEnemiga.size(); i++){
			
			entE = entEnemiga.get(i);
			entE.tick();
		}
	}

	public void render(Graphics g){
		
		for(int i = 0; i < entAliada.size(); i++){
			
			
			entA = entAliada.get(i);
			entA.render(g);
		}
		for(int i = 0; i < entEnemiga.size(); i++){
			
			entE = entEnemiga.get(i);
			entE.render(g);
		}
	}
	
	
	public void addEntidadAliada(EntidadAlly enti){
		
		entAliada.add(enti);
	}
	public void removeEntidadAliada(EntidadAlly enti){
		
		entAliada.remove(enti);
	}
	public void addEntidadEnemiga(EntidadEnemy enti){
		
		entEnemiga.add(enti);
	}
	public void removeEntidadEnemiga(EntidadEnemy enti){
		
		entEnemiga.remove(enti);
	}
	public LinkedList<EntidadAlly> getEntidadAliada(){
		
		return entAliada;	
	}
	public LinkedList<EntidadEnemy> getEntidadEnemiga(){
		
		return entEnemiga;	
	}
}	
