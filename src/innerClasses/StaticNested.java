package innerClasses;


/****
 * Static nested class
 * we can declare the inner class with a static modifier, such types of inner classes are called static nested classes
 * static nested classes : 
 * 
 */

public class StaticNested {
	int x = 10;
	// is strongly associated
	class Inner{
		
	}
	// not strongly associated with the outer class
	static class Nested{
		//in normal or regular inner classes we can't declare any static member
		//but in static nested classes we can declare static members including main method, hence we can invoke static nested class directly from command prompt
		public static void main(String[] args) {
		System.out.println("nested");	
		}
		private void m1() {
			System.out.println("child thread");

		}
		
	}
	public static void main(String[] args) {
		System.out.println("outer");
		Nested n1 = new Nested();
		n1.m1();
	}
	
}

//from outside if want to create nested class object
//StaticNested.Nested n = new StaticNested.Nested();