package multithreading;
//threads might accessing the method at the same time may cause an issue, it should be mutually exclusive 
class Counter{
	int count;
	//to make a method is thread safe, meaning only one thread will use the method at a particular time 
	public synchronized void increment() {
		count++;
	}
}

public class MultiThreadSync {

	public static void main(String[] args) throws InterruptedException {
		Counter ctr = new Counter();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 1; i<=1000; i++) {
					ctr.increment();					
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 1; i<=1000; i++) {
					ctr.increment();					
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count : "+ctr.count);
	}
}
