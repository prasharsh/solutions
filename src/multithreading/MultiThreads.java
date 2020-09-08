package multithreading;


class Hi extends Thread{
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

class Hello extends Thread{
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

public class MultiThreads {

	public static void main(String[] args) {
		Hi hi = new Hi();
		Hello hello = new Hello();
		hi.start();//start calls run
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hello.start();
	}
}
