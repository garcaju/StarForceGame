package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		int mouseX = e.getX();
		int mouseY = e.getY();
		
		if(mouseX >= Game.WIDTH/4 + 10 && mouseX <= Game.WIDTH /4 + 195){
			
			if (mouseY >= 250 && mouseY <= 300){
				
				Game.Status = Game.Status.JUEGO;
			}
		}
		if(mouseX >= Game.WIDTH/4 + 10 && mouseX <= Game.WIDTH /4 + 195){
			
			if (mouseY >= 450 && mouseY <= 500){
				
				System.exit(1);
			}
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
