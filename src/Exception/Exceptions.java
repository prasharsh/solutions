package Exception;

/**
 * Exception: An unwanted unexpected event that disturbs the normal flow of the program
 * exception handling is highly recommended, so that the flow doesn't break, or even a graceful termination 
 * 
 * the method where the exception occurs is responsible to create the exception object
 * default exception handling in java works with jvm, which provides the stackTrace which has the call stack
 * the jvm maintains the runtime call stack 	
 * 
 * 'cuz of abnormal termination we may loose resources
 *  risk prone code inside try block
 *  inside catch block we need to write the handling code
 *  
 *  
 */

/***
 * Control flow in try-catch block
 * 
 * throwable has the below methods to help user handle the exception
 * e.stacktrace: internally prints the name, description of the error followed by the stacktrace
 * sop(e) || sop(e.toString()): prints the name and description of the error
 * sop(e.getMessage): prints the description of the error 
 * 
 * Use specific catch blocks to provide specific alternate flows 
 * 
 * child first parent last, if not then there is an exception 
 * 
 * the clean-up code which is to be executed always is to be included under the finally block 
 * no statements after finally block will be executed in case of an abnormal termination
 * 
 * if we shutdown jvm explicitly - using system.exit(0) -- in this case finally block won't be executed
 * 0 is a status code , where 0 means normal termination
 * non zero is abnormal termination
 */


/****
 * best reason for the throw keyword is to use a custom exception object
 * throw only for throwable types
 */

/****
 * Throwable "class" acts as the root for java exception hierarchy
 * It has 2 child classes 
 * a. Exception: most of the time exception are caused by the program. they are mostly recoverable (programmer is responsible).  	
 * b. Error: mostly not caused by the program, it isn't recoverable. are caused due to lack of system resources
 * 
 * a1. Runtime exception: Arithmetic exception, null point, class cast , index out of bound, string out of bound, illegalArgument 	
 * a2. IOException: EOF Exception, file not found 
 * a3. Interrupt Exception:  
 * a4. Remote Exception
 * 
 * 
 * b1. VM Error: stackoverflowError, outofmememory error
 * b2. linkage error:
 * b3. assertion error
 * b4. exception in initialize error
 * 
 * ====================================================
 * checked and unchecked are all runtime 
 * * exception which are checked by the compiler for the smooth running of the program is called checked exception 
 * unreported exceptions must be caught or declared to be thrown, such as FileNotFound
 * 
 * *Exceptions that are not checked by compiler is called unchecked exception. Like arithmetic exception
 * 
 * errors are non recoverable -- unchecked 
 * all errors are by default are unchecked
 * runtime and its child classes are unchecked exception
 * 
 * 
 * Partial checked exception: Parent completely checked, child not. Throwable & Exception are the only 2 partially checked exception 
 * Full checked exception: Both parent and child is fully checked
 * 
 */
public class Exceptions {

	public static void main(String[] args) {
	

		try {
			//risky code
			int i =0/0;
		}
		catch (Exception e) {
			// alternate code
			
		}
		finally {
			//cleanup code
			
		}
	}
}
