package main;

import java.awt.Rectangle;

public class GameObject {
	
	public double x,y;
	
	public GameObject (double x, double y){
		
		this.x = x;
		this.y = y;
		
	}
	
	public Rectangle getBounds(int ancho, int alto){
		
		return new Rectangle ((int) x, (int) y, 32,32 );
		
	}
}
