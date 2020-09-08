package innerClasses;
/*
 * anonymous inner class implements interface
 * 	Runnable r = new Runnable(){//Runnable is an interface, we are using an instance to provide a inner class 
 * 	};
 *  can extend only one class at a time
 *  Anonymous class can only implement only one interface at a time 
 *  cannot implement and extend simultaneously
 *  cannot write any constructor (not applicable as there is no name)
 */

public class AnonymousInnerClassInterface {

	public static void main(String[] args) throws InterruptedException {
		//implemented class object
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for (int i=0; i<=10; i++) {
					System.out.println("child thread");
				}
				
			}
		};
		Thread t = new Thread(r);
		t.start();
		t.join();
		for (int i=0; i<=10; i++) {
			System.out.println("main thread");
		}

	}
}
