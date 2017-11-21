package menus;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import main.Game;

public class Keyboard extends KeyAdapter {
	
	Game game;
	 
	public Keyboard (Game game){
		
		this.game = game;
	}
	
	public void keyPressed(KeyEvent e){
		
		game.keyPressed(e);
	}
	public void keyReleased(KeyEvent e){
		
		game.keyReleased(e);
	}

}
