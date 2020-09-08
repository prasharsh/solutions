package innerClasses;

/**
 * 
 * Interface inside an interface: Map is an interface and map has the entry interface.
 * we can declare interface inside interface
 * A map is a group of key value pairs and each key value pair is called an entry 
 * w/o existence of map object there won't be an entry object. Hence interface entry is defined map interface
 * 
 * Every interface present inside interface is always public and static even if one doesn't declare it. 
 * Hence we can implement inner interface directly w/o implementing outer interface 
 * similarly, when we are implementing outer interface we are not required to implement inner interface
 * that is we can implement outer and inner interfaces independently
 * 
 */

public class InterfaceInsideInterface{
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.m1();
		
		Test2 t2 = new Test2();
		t2.m2();
	}
}


class Test1 implements  OuterInterface{

	@Override
	public void m1() {
		System.out.println("outer interface m1()");
		
	}
	
}


class Test2 implements OuterInterface.Inner{

	
	@Override
	public void m2() {
		System.out.println("outer.inner interface m2()");
	}
	
}

interface OuterInterface {
	public void m1();
	interface Inner{
		public void m2();
	}
	
}

