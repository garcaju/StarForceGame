package animaciones;

import java.awt.image.BufferedImage;

import main.Game;
import main.SpriteSheet;

public class Texture {

	public BufferedImage pilot,pilotLeft, pilotRight, controlBullets, bullets;
	private SpriteSheet ssexplosion, ss;
	public BufferedImage [] enemy = new BufferedImage[5];
	
	public BufferedImage[] explosion = new BufferedImage[16];
	
	public Texture (Game game) {
		
		
		
		ss = new SpriteSheet(game.getSpriteSheet());
		ssexplosion = new SpriteSheet(game.getSpriteSheet());
		
		getTexture();
		
	}
	
	
	private void getTexture() {
		
		pilot = ss.grabImage(1, 1, 32, 32);
		pilotLeft = ss.grabImage(2, 1, 32, 32);
		pilotRight = ss.grabImage(3, 1, 32, 32);
	/*	
		explosion[0] =  ssexplosion.grabImage(1, 1, 32, 32);
		explosion[1] =  ssexplosion.grabImage(2, 1, 32, 32);
		explosion[2] =  ssexplosion.grabImage(3, 1, 32, 32);
		explosion[3] =  ssexplosion.grabImage(4, 1, 32, 32);
		explosion[4] =  ssexplosion.grabImage(5, 1, 32, 32);
		explosion[5] =  ssexplosion.grabImage(6, 1, 32, 32);
		explosion[6] =  ssexplosion.grabImage(7, 1, 32, 32);
		explosion[7] =  ssexplosion.grabImage(8, 1, 32, 32);
		explosion[8] =  ssexplosion.grabImage(9, 1, 32, 32);
		explosion[9] =  ssexplosion.grabImage(10, 1, 32, 32);
		explosion[10] = ssexplosion.grabImage(11, 1, 32, 32);
		explosion[11] = ssexplosion.grabImage(12, 1, 32, 32);
		explosion[12] = ssexplosion.grabImage(13, 1, 32, 32);
		explosion[13] = ssexplosion.grabImage(14, 1, 32, 32);
		explosion[14] = ssexplosion.grabImage(15, 1, 32, 32);
		explosion[15] = ssexplosion.grabImage(16, 1, 32, 32);
		explosion[16] = ssexplosion.grabImage(17, 1, 32, 32);
	*/
		controlBullets = ss.grabImage(1, 3, 32, 32);
		
		enemy[0] = ss.grabImage(4, 1, 32, 32);
		enemy[1] = ss.grabImage(1, 2, 32, 32);
		enemy[2] = ss.grabImage(2, 2, 32, 32);
		enemy[3] = ss.grabImage(3, 2, 32, 32);
		enemy[4] = ss.grabImage(4, 2, 32, 32);
	}
}
