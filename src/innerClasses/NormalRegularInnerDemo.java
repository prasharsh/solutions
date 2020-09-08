package innerClasses;

/**
 * If we are declaring any named class directly inside a class w/o a static modifier is a normal/regular inner class
 * 2 class files gets created.
 * one is outer class file -- outer.class
 * inner class as --- outer$Inner.class
 * 
 * during execution the outer class if no main method: nosuchmethodError main() 
 * during execution the outer$inner.class if no main method: nosuchmethodError main()
 * 
 */

public class NormalRegularInnerDemo {

	//static cannot be declared including main method
	//The method main cannot be declared static; static methods can only be declared in a static or top level type
	class InnerClass{
		public void m1() {
			System.out.println("inner class method");
		}
		/*
		 * public static void main(String[] args) { System.out.println("inner class"); }
		 */
	}

	public void m2() {
		//because m2 can only be accessed through the outer class instance object, so we can call inner directly 
		InnerClass inner = new InnerClass();
		System.out.println("inside m2");
		inner.m1();
		
	}
	public static void main(String[] args) {
		//case 1
		NormalRegularInnerDemo outer = new NormalRegularInnerDemo();
		NormalRegularInnerDemo.InnerClass inner = outer.new InnerClass();
		inner.m1();
		//end case 1
		
		//case 2
		NormalRegularInnerDemo.InnerClass i = new NormalRegularInnerDemo().new InnerClass();
		i.m1();
		//end case 2
		
		//case 3
		new NormalRegularInnerDemo().new InnerClass().m1();
		//end case 3
		//call inner class member from m2 
		outer.m2();
		
	}

}


class Main{
	public static void main(String[] args) {
		new NormalRegularInnerDemo().new InnerClass().m1();
		new NormalRegularInnerDemo().m2();
	}
}