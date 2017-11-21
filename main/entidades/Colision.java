package main.entidades;

import main.GameObject;
import java.util.LinkedList;


public class Colision {

	public static boolean impact (EntidadAlly entA, EntidadEnemy entE){
			
			if(entA.getBounds().intersects(entE.getBounds())){
				
				System.out.println("Enemigo impactado.");
				
				return true;
			}
			return false;
		}
	public static boolean impacto (EntidadEnemy entE, EntidadAlly entA){
			
			
			if(entE.getBounds().intersects(entA.getBounds())){
				
				System.out.println("Enemigo eliminado.");
				
				return true;
		}
		return false;
	}
}
