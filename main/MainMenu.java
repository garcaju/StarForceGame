package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class MainMenu {
	
	public Rectangle playButton = new Rectangle(Game.WIDTH/4 +10,250,185,50);
	public Rectangle helpButton = new Rectangle(Game.WIDTH/4 +10,350,185,50);
	public Rectangle exitButton = new Rectangle(Game.WIDTH/4 +10,450,185,50);
	
	public void render (Graphics g){
		
		Graphics2D g2d = (Graphics2D)g;
		
		Font font = new Font ("OCR A Extended", Font.BOLD, 42);
		g.setFont (font);
		g.setColor(Color.YELLOW);
		g.drawString("STAFF GALAXY DEFENSE", Game.HEIGHT/ 4, 100);
	
		Font fontPlay = new Font ("Magneto", Font.BOLD, 22);
		g.setFont(fontPlay);
		g.setColor(Color.CYAN);
		g.drawString("DESPEGUE", playButton.x + 18, playButton.y + 30);
		
		Font fontHelp = new Font ("Magneto", Font.BOLD, 22);
		g.setFont(fontHelp);
		g.setColor(Color.PINK);
		g.drawString("AYUDA", helpButton.x + 36, helpButton.y + 30);
		
		Font fontExit = new Font ("Magneto", Font.BOLD, 22);
		g.setFont(fontExit);
		g.setColor(Color.WHITE);
		g.drawString("SALIR", exitButton.x + 36, exitButton.y + 30);
		
		
		g2d.draw(playButton);
		g2d.draw(helpButton);
		g2d.draw(exitButton);
	}

}
