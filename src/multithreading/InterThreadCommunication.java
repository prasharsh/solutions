package multithreading;
//the wait and notify will acknowledge the sleep and work in sync
/******
 * thread calls these methods on any method (wait, notify, notifyAll)
 * @author Lenovo
 *
 */
class Q {
	int num;
	boolean isValueSet= false;
	//wait works with sync
	public synchronized void put(int num) {
		while(isValueSet) {
			//wait will stop and wait for notify
			//wait and notify belong to the Object class
			try{wait();} catch(Exception e) {}
		}
		System.out.println("put: "+ num);
		this.num = num;
		isValueSet = true;
		notify();
	}
	public synchronized void get() {
		while(!isValueSet) {
			//wait will stop and wait for notify
			try{wait();} catch(Exception e) {}
		}
		System.out.println("get: "+num);
		isValueSet = false;
		notify();
	}
}
class Producer implements Runnable{

	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
			try {Thread.sleep(1000);}catch (Exception e) {}
		}
	}

}


class Consumer implements Runnable{

	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}
	@Override
	public void run() {
		while(true) {
			q.get();
			try {Thread.sleep(1000);}catch (Exception e) {}
		}

	}

}
public class InterThreadCommunication {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}
