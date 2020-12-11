package pack;

import javax.management.monitor.Monitor;

public class Hilo implements Runnable{
	private int x, seg;

	//public static Monitor monitor;
	
//CONSTRUCTOR
	public Hilo(int x, int seg) {
		this.x = x;
		this.seg = seg;
	}

	@Override
	public void run() {
		try {			
			System.out.println("Soy hilo " + x + " y me pongo a dormir " + seg + " segundos.");
			Thread.sleep(seg);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("Soy hilo " + x + " y he terminado de dormir.");
	}

//	@Override
//	public void run() {
//		synchronized(monitor) {
//			System.out.println(x + " Hola ");
//			if(x==19) {
//				monitor.notifyAll();
//			}else {
//				try {
////					partA();
//					monitor.wait();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				
//				System.out.println(x + " Adios ");
//			}
//		}
		
//	}
			

}
