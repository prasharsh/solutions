package innerClasses;


/*
 *  Nested method concept is not allowed in java *** so one can create a class inside a method :) 
 *  within that class we can create a method. 
 * 
 *  helps us with : to define method specific repeated required functionality
 * sometimes we can declare inner class inside a method - method local inner class
 * in the case of a requirement of nested method functionality wiz is not allowed in java, so use method local inner class concpet
 *  
 *  
 */
public class MethodLocalInnerClasses {

	int a = 10;
	static int b = 20;

	//instance method
	public void m1() {
		int z= 10;
		//the scope of menthod inner classes inside a method only, so its very rare
		//we can declare method local inner class inside both instance and static methods, 
		//instance method inner class: works fine with both static/non-static variable of the outer class from the inner class 
		//static method inner class: non static variable can't be referenced from a static context  (gives a compile time error for non static variable a cannot be referenced from a static context)
		class InnerClass{

			
			public void sum(int x, int y) {
				System.out.println(a);
				System.out.println(b);
				System.out.println(z);
				System.out.println("x+y="+(x+y));
			}
			
		}
		InnerClass inner = new InnerClass();
		inner.sum(2, 4);
		inner.sum(22, 44);
		inner.sum(222, 422);
	}
	public static void main(String[] args) {
		MethodLocalInnerClasses outer = new MethodLocalInnerClasses();
		outer.m1();
	}

}
