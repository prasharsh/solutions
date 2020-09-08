package innerClasses;

import innerClasses.InnerClass.InnerClassChild;

// class within a class
/* used in a scenario where one object cannot exist without another type of object
 * such as in the case of university class and department classes have such a relation 
 * university is the outer class, department is the inner class
 * 
 * same in car and engine
 * same in the case of map and entry object. Interface entry is inside Interface Map ******** 
 * 
 * There are 3 types of inner classes, based on position of declaration and the behavior :
 * 1. member (normal or regular inner classes) 
 * 2. static nested classes 
 * 3. method local inner class
 * 4. anonymous
 * 
 * 
 * in java 1.1 to fix gui bugs inner concept concepts came into light which then extended to the regular coding also
 * 
 * relation between outer and inner class is a HAS-A relation (composition / aggregation) 
 * 
 */

public class InnerClass {

	int i;
	class InnerClassChild{
		int j;
	}
}

class c{
	public static void main(String[] args) {
		
	}
}