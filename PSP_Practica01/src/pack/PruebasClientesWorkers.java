package pack;

public class PruebasClientesWorkers {

	public static void main(String[] args) {
		
//PROGRAMA DE PRUEBAS
		Cartera carteraVacia = new Cartera(0);
		Cartera carteraLlena = new Cartera(198760);
		
		Client clienteNuevo = new Client(1, carteraVacia);
		Worker workerNuevo = new Worker(1, carteraLlena);
		
		Thread threadClient = new Thread(clienteNuevo);
		Thread threadWorker = new Thread(workerNuevo);
		threadClient.start();
		threadWorker.start();

	}

}
