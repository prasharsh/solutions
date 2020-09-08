package innerClasses;


/****
 * 
 *  Interface inside a class : inside a class if we require multiple implementation of an interface 
 *  and all these implementations are related to a particular class, then we can define interface inside a class
 *
 */
public class InterfaceInsideClass {

	interface vehicle{
		public int getNoOfWheels();
	}
	
	class Bus implements vehicle{

		@Override
		public int getNoOfWheels() {
			// TODO Auto-generated method stub
			return 6;
		}
		
	}
	
	class Car implements vehicle{

		@Override
		public int getNoOfWheels() {
			// TODO Auto-generated method stub
			return 4;
		}
		
	}
}
