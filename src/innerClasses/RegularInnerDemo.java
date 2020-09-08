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

public class RegularInnerDemo{
	public static void main(String[] args) {
		new OuterClass().new InnerClass().new Nested().m1();
	}
}


class OuterClass {// modifiers : public, default, final, abstract, strictfop

	int x=10;
	static int y = 20;


	//static cannot be declared including main method
	//The method main cannot be declared static; static methods can only be declared in a static or top level type


	class InnerClass{//modifiers : public, default, final, abstract, strictfop + private, protected, statis
		int x=11;
		public void m1() {
			int x= 12;
			System.out.println("x: "+x);//nearest x will be printed
			System.out.println("inner class x: "+ this.x);// to access innerclass member x
			System.out.println("outer class x: "+ OuterClass.this.x );// to access outer class member x
			//we may not declare static but still access the static/non static members of innerf class 
			System.out.println("y:"+y);

		}

		//Nesting of inner class inside inner class we can declare another inner class
		class Nested{
			public void m1() {
				System.out.println("inner inner --- nested ");
			}
		}
	}}

	



