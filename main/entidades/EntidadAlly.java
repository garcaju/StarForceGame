package main.entidades;

import java.awt.Graphics;
import java.awt.Rectangle;
//h
public interface EntidadAlly {

	public void tick();
	public void render(Graphics g);
	public Rectangle getBounds();
	
	public double getX();
	public double getY();
	
}
