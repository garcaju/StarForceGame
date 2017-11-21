package animaciones;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Animaciones {

	private int speed;
	private int frames;
	private int indice = 0;
	private int cont = 0;
	
	private BufferedImage img1;
	private BufferedImage img2;
	private BufferedImage img3;
	private BufferedImage img4;
	private BufferedImage img5;
	private BufferedImage img6;
	private BufferedImage img7;
	private BufferedImage img8;
	private BufferedImage img9;
	private BufferedImage img10;
	private BufferedImage img11;
	private BufferedImage img12;
	private BufferedImage img13;
	private BufferedImage img14;
	
	private BufferedImage imgNow;

	
	public Animaciones (int speed, BufferedImage img1,BufferedImage img2,BufferedImage img3,BufferedImage img4,BufferedImage img5,
						BufferedImage img6, BufferedImage img7,BufferedImage img8,BufferedImage img9,BufferedImage img10,
						BufferedImage img11,BufferedImage img12,BufferedImage img13,BufferedImage img14){
		
		this.speed = speed;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.img6 = img6;
		this.img7 = img7;
		this.img8 = img8;
		this.img9 = img9;
		this.img10 = img10;
		this.img11 = img11;
		this.img12 = img12;
		this.img13 = img13;
		this.img14 = img14;
		
		frames = 14;
	}
	
	public Animaciones (int speed, BufferedImage img1,BufferedImage img2,BufferedImage img3,BufferedImage img4,BufferedImage img5,
			BufferedImage img6, BufferedImage img7,BufferedImage img8,BufferedImage img9,BufferedImage img10,
			BufferedImage img11,BufferedImage img12,BufferedImage img13){

		this.speed = speed;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.img6 = img6;
		this.img7 = img7;
		this.img8 = img8;
		this.img9 = img9;
		this.img10 = img10;
		this.img11 = img11;
		this.img12 = img12;
		this.img13 = img13;
		
		frames = 13;
	}
	
	public Animaciones (int speed, BufferedImage img1,BufferedImage img2,BufferedImage img3,BufferedImage img4,BufferedImage img5,
			BufferedImage img6, BufferedImage img7,BufferedImage img8,BufferedImage img9,BufferedImage img10,
			BufferedImage img11,BufferedImage img12){

		this.speed = speed;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.img6 = img6;
		this.img7 = img7;
		this.img8 = img8;
		this.img9 = img9;
		this.img10 = img10;
		this.img11 = img11;
		this.img12 = img12;

		frames = 12;
	}
	
	public Animaciones (int speed, BufferedImage img1,BufferedImage img2,BufferedImage img3,BufferedImage img4,BufferedImage img5,
			BufferedImage img6, BufferedImage img7,BufferedImage img8,BufferedImage img9,BufferedImage img10,
			BufferedImage img11){

		this.speed = speed;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.img6 = img6;
		this.img7 = img7;
		this.img8 = img8;
		this.img9 = img9;
		this.img10 = img10;
		this.img11 = img11;
		
		frames = 11;
	}
	
	public Animaciones (int speed, BufferedImage img1,BufferedImage img2,BufferedImage img3,BufferedImage img4,BufferedImage img5,
			BufferedImage img6, BufferedImage img7,BufferedImage img8,BufferedImage img9,BufferedImage img10){

		this.speed = speed;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.img6 = img6;
		this.img7 = img7;
		this.img8 = img8;
		this.img9 = img9;
		this.img10 = img10;

		frames = 10;
	}
	
	public Animaciones (int speed, BufferedImage img1,BufferedImage img2,BufferedImage img3,BufferedImage img4,BufferedImage img5,
			BufferedImage img6, BufferedImage img7,BufferedImage img8,BufferedImage img9){

		this.speed = speed;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.img6 = img6;
		this.img7 = img7;
		this.img8 = img8;
		this.img9 = img9;

		frames = 9;
	}
	
	public Animaciones (int speed, BufferedImage img1,BufferedImage img2,BufferedImage img3,BufferedImage img4,BufferedImage img5,
			BufferedImage img6, BufferedImage img7,BufferedImage img8){

		this.speed = speed;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.img6 = img6;
		this.img7 = img7;
		this.img8 = img8;

		frames = 8;
	}
	
	public Animaciones (int speed, BufferedImage img1,BufferedImage img2,BufferedImage img3,BufferedImage img4,BufferedImage img5,
			BufferedImage img6, BufferedImage img7){

		this.speed = speed;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.img6 = img6;
		this.img7 = img7;
		
		frames = 7;
	}
	
	public Animaciones (int speed, BufferedImage img1,BufferedImage img2,BufferedImage img3,BufferedImage img4,BufferedImage img5,
			BufferedImage img6){

		this.speed = speed;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.img6 = img6;
		
		frames = 6;
	}
	
	public Animaciones (int speed, BufferedImage img1,BufferedImage img2,BufferedImage img3,BufferedImage img4,BufferedImage img5){

		this.speed = speed;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		
		frames = 5;
	}
	
	public Animaciones (int speed, BufferedImage img1,BufferedImage img2,BufferedImage img3,BufferedImage img4){

		this.speed = speed;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		
		frames = 4;
	}
	
	public Animaciones (int speed, BufferedImage img1,BufferedImage img2,BufferedImage img3){

		this.speed = speed;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		
		frames = 3;
	}
	
	public Animaciones (int speed, BufferedImage img1,BufferedImage img2){

		this.speed = speed;
		this.img1 = img1;
		this.img2 = img2;
		
		frames = 2;
	}

	public void runAnimacion (){
		
		indice ++;
		
		if (indice > speed){
			indice = 0;
			nextFrame();
		}
	}
	
	public void nextFrame(){
		switch (frames){
		case 2:
			if (cont == 0)
				imgNow = img1;
			
			if (cont == 1)
				imgNow = img2;
			
			cont++;
			
			if (cont > frames){
			cont = 0;
		    }
			
			break;
			
		case 3:
			if (cont == 0)
				imgNow = img1;
			
			if (cont == 1)
				imgNow = img2;
			
			if (cont == 2)
				imgNow = img3;

			cont++;
			
			if (cont > frames){
			cont = 0;
		    }

			break;
			
		case 4:
			if (cont == 0)
				imgNow = img1;
			
			if (cont == 1)
				imgNow = img2;
			
			if (cont == 2)
				imgNow = img3;
			
			if (cont == 3)
				imgNow = img4;

			cont++;
			
			if (cont > frames){
			cont = 0;
		    }
			
			break;
			
		case 5:
			if (cont == 0)
				imgNow = img1;
			
			if (cont == 1)
				imgNow = img2;
			
			if (cont == 2)
				imgNow = img3;
			
			if (cont == 3)
				imgNow = img4;
			
			if (cont == 4)
				imgNow = img5;
		
			cont++;
			
			if (cont > frames){
			cont = 0;
		    }
			
			break;
			
		case 6:
			if (cont == 0)
				imgNow = img1;
			
			if (cont == 1)
				imgNow = img2;
			
			if (cont == 2)
				imgNow = img3;
			
			if (cont == 3)
				imgNow = img4;
			
			if (cont == 4)
				imgNow = img5;
			
			if (cont == 5)
				imgNow = img6;
			
			cont++;
			
			if (cont > frames){
			cont = 0;
		    }
			
			break;
			
		case 7:
			if (cont == 0)
				imgNow = img1;
			
			if (cont == 1)
				imgNow = img2;
			
			if (cont == 2)
				imgNow = img3;
			
			if (cont == 3)
				imgNow = img4;
			
			if (cont == 4)
				imgNow = img5;
			
			if (cont == 5)
				imgNow = img6;
			
			if (cont == 6)
				imgNow = img7;
			
			cont++;
			
			if (cont > frames){
			cont = 0;
		    }
			
			break;
			
		case 8:
			if (cont == 0)
				imgNow = img1;
			
			if (cont == 1)
				imgNow = img2;
			
			if (cont == 2)
				imgNow = img3;
			
			if (cont == 3)
				imgNow = img4;
			
			if (cont == 4)
				imgNow = img5;
			
			if (cont == 5)
				imgNow = img6;
			
			if (cont == 6)
				imgNow = img7;
			
			if (cont == 7)
				imgNow = img8;
			
			cont++;
			
			if (cont > frames){
			cont = 0;
		    }
			
			break;	
			
		case 9:
			if (cont == 0)
				imgNow = img1;
			
			if (cont == 1)
				imgNow = img2;
			
			if (cont == 2)
				imgNow = img3;
			
			if (cont == 3)
				imgNow = img4;
			
			if (cont == 4)
				imgNow = img5;
			
			if (cont == 5)
				imgNow = img6;
			
			if (cont == 6)
				imgNow = img7;
			
			if (cont == 7)
				imgNow = img8;
			
			if (cont == 8)
				imgNow = img9;
			
			cont++;
			
			if (cont > frames){
			cont = 0;
		    }
			
			break;
			
		case 10:
			if (cont == 0)
				imgNow = img1;
			
			if (cont == 1)
				imgNow = img2;
			
			if (cont == 2)
				imgNow = img3;
			
			if (cont == 3)
				imgNow = img4;
			
			if (cont == 4)
				imgNow = img5;
			
			if (cont == 5)
				imgNow = img6;
			
			if (cont == 6)
				imgNow = img7;
			
			if (cont == 7)
				imgNow = img8;
			
			if (cont == 8)
				imgNow = img9;
			
			if (cont == 9)
				imgNow = img10;
			
			cont++;
			
			if (cont > frames){
			cont = 0;
		   }
			
			break;
			
		case 11:
			if (cont == 0)
				imgNow = img1;
			
			if (cont == 1)
				imgNow = img2;
			
			if (cont == 2)
				imgNow = img3;
			
			if (cont == 3)
				imgNow = img4;
			
			if (cont == 4)
				imgNow = img5;
			
			if (cont == 5)
				imgNow = img6;
			
			if (cont == 6)
				imgNow = img7;
			
			if (cont == 7)
				imgNow = img8;
			
			if (cont == 8)
				imgNow = img9;
			
			if (cont == 9)
				imgNow = img10;
			
			if (cont == 10)
				imgNow = img11;
			
			cont++;
			
			if (cont > frames){
			cont = 0;
		    }
			
			break;
			
		case 12:
			if (cont == 0)
				imgNow = img1;
			
			if (cont == 1)
				imgNow = img2;
			
			if (cont == 2)
				imgNow = img3;
			
			if (cont == 3)
				imgNow = img4;
			
			if (cont == 4)
				imgNow = img5;
			
			if (cont == 5)
				imgNow = img6;
			
			if (cont == 6)
				imgNow = img7;
			
			if (cont == 7)
				imgNow = img8;
			
			if (cont == 8)
				imgNow = img9;
			
			if (cont == 9)
				imgNow = img10;
			
			if (cont == 10)
				imgNow = img11;
			
			if (cont == 11)
				imgNow = img12;
			
			cont++;
			
			if (cont > frames){
			cont = 0;
		    }
			
			break;
			
		case 13:
			if (cont == 0)
				imgNow = img1;
			
			if (cont == 1)
				imgNow = img2;
			
			if (cont == 2)
				imgNow = img3;
			
			if (cont == 3)
				imgNow = img4;
			
			if (cont == 4)
				imgNow = img5;
			
			if (cont == 5)
				imgNow = img6;
			
			if (cont == 6)
				imgNow = img7;
			
			if (cont == 7)
				imgNow = img8;
			
			if (cont == 8)
				imgNow = img9;
			
			if (cont == 9)
				imgNow = img10;
			
			if (cont == 10)
				imgNow = img11;
			
			if (cont == 11)
				imgNow = img12;
			
			if (cont == 12)
				imgNow = img13;
			
			cont++;
			
			if (cont > frames){
			cont = 0;
		    }
			
			break;
			
		case 14:
			if (cont == 0)
				imgNow = img1;
			
			if (cont == 1)
				imgNow = img2;
			
			if (cont == 2)
				imgNow = img3;
			
			if (cont == 3)
				imgNow = img4;
			
			if (cont == 4)
				imgNow = img5;
			
			if (cont == 5)
				imgNow = img6;
			
			if (cont == 6)
				imgNow = img7;
			
			if (cont == 7)
				imgNow = img8;
			
			if (cont == 8)
				imgNow = img9;
			
			if (cont == 9)
				imgNow = img10;
			
			if (cont == 10)
				imgNow = img11;
			
			if (cont == 11)
				imgNow = img12;
			
			if (cont == 12)
				imgNow = img13;
			
			if (cont == 13)
				imgNow = img14;
			
			cont++;
			
			if (cont > frames){
			cont = 0;
		    }
			
			break;
			
		}
	}

	public void drawAnimation(Graphics g, double x, double y, int offset){
		
		g.drawImage(imgNow , (int)x - offset, (int)y, null);
	}
	
	//GETTERS & SETTERS
	
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public int getCont(){
		return cont;
	}
	
	public void setSpeed (int speed){
		this.speed = speed;
	}
	
	public int getSpeed(){
		return speed;
	}
}
