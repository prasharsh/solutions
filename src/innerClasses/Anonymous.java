package innerClasses;
/*
 * Inner class without name is called anonymous inner class
 * for instant use purpose we use anonymous inner class
 * there's also anonymous arrays (only 2 anonymous entities -- inner class, arrays) 
 * best use is in gui application - to implement event handling 
 * 3 types of anonymous inner class based on declaration and behaviors:
 * a. anonymous inner class extends another class
 * 	Thread t = new Thread(){
 * 	};
 * b. anonymous inner class implements interface
 * 	Runnable r = new Runnable(){//Runnable is an interface, we are using an instance to provide a inner class 
 * 	};
 * c. anonymous inner class that defines inside arguments
 */
public class Anonymous {

	public static void main(String[] args) {
		Outer a1 = new Outer() {
			public void taste() {
				System.out.println("spicy");
			}
		};
		a1.taste();
		Outer a2 = new Outer();
		a2.taste();
	}	

	
}

class Outer{
	public void taste() {
		System.out.println("salty");
	}
	
	/*//When permanent requirement then use the below approach
	 * class InnerClass extends Anonymous{
	 * 
	 * @Override public void taste() { System.out.println("spicy"); } }
	 */
	
	
}
