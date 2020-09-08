package multithreading;

public class MultiThreadRunnableLamda {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(()->{
			for(int i=1; i<=5; i++ ) {
				//current thread refers to the current thread
				System.out.println("hi"+ Thread.currentThread().getPriority());
				try {	Thread.sleep(1000);} catch (Exception e) {}
			}}, "hi");
		Thread t2 = new Thread(()->{
			for(int i=1; i<=5; i++ ) {
				System.out.println("hello");
				try {	Thread.sleep(1000);} catch (Exception e) {}
			}});
		//priority is 1 (least) to 10(highest)
		//t1.setPriority(1);
		t1.setPriority(Thread.MAX_PRIORITY);
		//t2.setPriority(10);	
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();//start calls run
		//t1.setName("Hi");
		try {	Thread.sleep(10);} catch (Exception e) {}
		t2.start();
		t2.setName("Hello");
		//it will wait for the threads to complete their work 
		t1.join();
		t2.join();
		//tells you if the thread is alive or not

		System.out.println(t1.getName()+t1.isAlive()+"priority:"+ t1.getPriority()+"===="+t2.getName()+t2.isAlive()+"priority:"+ t2.getPriority());
		System.out.println("bbye");
	}
}
