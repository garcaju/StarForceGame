package main;

import java.awt.image.BufferedImage;

public class SpriteSheet {

	private BufferedImage image;
	
	public SpriteSheet (BufferedImage image) {
		this.image = image;
		
	}
	
	public BufferedImage grabImage(int col, int fil, int width, int height) {
		
		BufferedImage img = image.getSubimage((col * 32) - 32, (fil * 32) - 32, width, height);
		return img;
	}
}
