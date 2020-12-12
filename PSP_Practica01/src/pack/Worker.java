package pack;

import java.util.Random;

public class Worker implements Runnable{
	
	private int id;
	private Cartera wallet;
	private Random ale = new Random();
	private boolean infinito = true;
		
//CONSTRUCTOR	
	public Worker(int id, Cartera wallet) {
		this.id = id;
		this.wallet = wallet;
	}

	public void run() {
		try {	
			while(infinito) {
				Thread.sleep(1000);
				int dadoMoney = ale.nextInt(100);
				wallet.decrementarMoney(dadoMoney);
				System.out.println("Se han reducido " + dadoMoney + "€ de tu cartera de worker con id " + id +
						".\nAhora tienes " + wallet.mostrarMoney() + "€ en tu cartera de worker con id " + id + ".");
			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}

}
