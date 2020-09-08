package innerClasses;


/**
 * 
 * if a functionality of a class is closely associated with interface then it is highly recommended to declare class inside interface
 *
 */
public class ClassInsideInterface {

}

interface EmailService{
	void sendEmail( EmailDetails e);
	
	//it is a class recommended to be declared inside the interface as it is only req in this interface
	class EmailDetails{
		String to_list;
		String from_list;
		String subject;
		String body;
	}
}
