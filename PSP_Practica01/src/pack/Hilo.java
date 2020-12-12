package pack;

import javax.management.monitor.Monitor;

public class Hilo implements Runnable{
	private int x, miliSeg;

	//public static Monitor monitor;
	
//CONSTRUCTOR
	public Hilo(int x, int miliSeg) {
		this.x = x;
		this.miliSeg = miliSeg;
	}

	@Override
	public void run() {
		try {			
			System.out.println("Soy hilo " + x + " y me pongo a dormir " + (miliSeg / 1000) + " segundos.");
			Thread.sleep(miliSeg);
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
