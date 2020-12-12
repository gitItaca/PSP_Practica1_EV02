package pack;

import java.util.Random;

public class Client implements Runnable{

	private int id;
	private Cartera wallet;
	private Random ale = new Random();
	private boolean infinito = true;
	
//CONSTRUCTOR
	public Client(int id, Cartera wallet) {
		this.id = id;
		this.wallet = wallet;
	}

	public void run() {
		try {		
			while(infinito) {
				Thread.sleep(1000);
				int dadoMoney = ale.nextInt(100);
				wallet.incrementarMoney(dadoMoney);
				System.out.println("Se han incrementado " + dadoMoney + "€ a tu cartera de cliente con id " + id + 
						".\nAhora tienes " + wallet.mostrarMoney() + "€ en tu cartera de cliente con id " + id + ".");

			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}


	
	
}
