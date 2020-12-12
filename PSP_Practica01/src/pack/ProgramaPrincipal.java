package pack;

import java.util.ArrayList;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		ArrayList<Thread> threads= new ArrayList<Thread>();
				
		for(int x = 0; x < 10; x++) {
			Cartera carteraVacia = new Cartera(0);
			Cartera carteraLlena = new Cartera(500000);
			
			Client clienteNuevo = new Client(x, carteraVacia);
			Thread threadClienteNuevo = new Thread(clienteNuevo);
			threads.add(threadClienteNuevo);
			
			Worker workerNuevo = new Worker(x, carteraLlena);
			Thread threadWorkerNuevo = new Thread(workerNuevo);
			threads.add(threadWorkerNuevo);
			
		}
		
		for(Thread thread : threads) {
			thread.start();		
		}
				
		
	}

}
