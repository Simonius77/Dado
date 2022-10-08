//importamos un random
import java.util.Random;
/** programa que lanza un dado y da una puntuacion segun el resultado **/
public class DadoSwitch{
	/**entrada al programa**/
	public static void main ( String[] args){
	/** inicializamos  el random**/
		Random generadorAleatorio = new Random();
		/** le asignamos valos del random a la variable dado y le marcamos el limite de valores **/
		int dado=generadorAleatorio.nextInt(6) + 1;
		/** iniocializamos las variables**/
		int puntos=0;
		/** hacemos el switch con los casos en funcion del resultado y le asignamos los puntos**/
		switch(dado){
			case 1,6: puntos=puntos+2;
				break;
			case 2,4: puntos=puntos+1;
				break;
			default: puntos=puntos-1;
		}	
		/** imprimimos el resultado del dado e imprimimos el resultado de puntos **/
		System.out.println("El dado a sacado:" + dado);
		System.out.println("Tus puntos son:" + puntos);			
	}		
}		
		
		
		
		
		
		








