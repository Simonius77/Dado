//importamos un random
import java.util.Random;
/** programa que lanza un dado y da una puntuacion segun el resultado **/
public class Dado{
	/**entrada al programa**/
	public static void main ( String[] args){
	/** inicializamos  el random**/
		Random generadorAleatorio = new Random();
		/** le asignamos valos del random a la variable dado y le marcamos el limite de valores **/
		int dado=generadorAleatorio.nextInt(6) + 1;
		/** iniocializamos las variables**/
		int puntos=0;
		/** aplicamos las condiciones para asignar los puntos en funcion del valor del dado**/
		if((dado==1)||(dado==6)){
			puntos=puntos+2;
		}
		else if(dado %2==0){
			puntos=puntos+1;
		} else { 
			puntos=puntos-1;
			}	
		/** imprimimos el resultado del dado e imprimimos el resultado de puntos **/
		System.out.println("El dado a sacado:" + dado);
		System.out.println("Tus puntos son:" + puntos);			
	}		
}		
		