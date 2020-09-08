package multithreading;

//Runnable interface has only one method which is run 

class Hii implements Runnable{
	public void run() {
		for(int i=1; i<=5; i++ ) {
			System.out.println("hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Helloo implements Runnable{
	public void run() {
		for(int i=1; i<=5; i++ ) {
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadRunnable {

	public static void main(String[] args) {
		/*
		 * Hi hi = new Hi(); Hello hello = new Hello(); hi.start();//start calls run try
		 * { Thread.sleep(10); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } hello.start();
		 */
		
		Runnable hii = new Hii();
		Runnable helloo = new Helloo();
		
		Thread t1 = new Thread(hii);
		Thread t2 = new Thread(helloo);
		
		t1.start();//start calls run
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
}
