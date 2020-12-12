package pack;

public class Cartera {

	private double money;	
	
	public Cartera(double money) {
		super();
		this.money = money;
	}

//METODOS
	public synchronized void incrementarMoney(double amount) {
		money = money + amount;
	}
	
	public synchronized void decrementarMoney(double amount) {
		money = money - amount;
	}
	
	public synchronized double mostrarMoney() {
		return money;
	}
	
	
}
