package pack;

import java.util.ArrayList;
import java.util.Random;


public class ProgramaPrincipalCienHilos {

	public static void main(String[] args) {
//PROGRAMA PRINCIPAL QUE LANZA 100 HILOS
		ArrayList<Thread> arrayThreads = new ArrayList<Thread>();
		Random ale = new Random();
		
		//Creo 100 hilos
		for(int x = 0; x<100; x++) {
			int dado1 = ale.nextInt(5) + 1;
			dado1 = dado1 * 1000;			//Milisegundos
			Hilo hilo1 = new Hilo(x, dado1);
			
			Thread thread1 = new Thread(hilo1);
			
			arrayThreads.add(thread1);
		}
		
		//Arranca el hilo
		for(int x = 0; x<100; x++) {
			arrayThreads.get(x).start(); //Creas el hilo y lo arrancas.	
		}
		
	}

}
