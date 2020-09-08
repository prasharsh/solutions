package innerClasses;

/**
 * We can also define a class inside interface to provide a default implementation for that interface
 */

import innerClasses.InterfaceInsideClass.vehicle;

public class InterfaceDefaultImplemetation {
	public static void main(String[] args) {
		Vehicle.DefaultVehicle v1 = new Vehicle.DefaultVehicle();
		System.out.println(v1.getNoOfWheels());
		
		Bus b = new Bus();
		System.out.println(b.getNoOfWheels());
	}
}


interface Vehicle{
	public int getNoOfWheels();
	
	class DefaultVehicle implements Vehicle{

		@Override
		public int getNoOfWheels() {
			// TODO Auto-generated method stub
			return 2;
		}
		
	}
}

class Bus implements vehicle{

	@Override
	public int getNoOfWheels() {
		// TODO Auto-generated method stub
		return 6;
	}
	
}