package synchronization;


/*********
 * Synchronized method and block exists, no class no variable
 * RACE CONDITION -- if multiple thread try to operate simultaneously on the same object, it leads to data in-consistency problem
 * to resolve the data inconsistency problems, we use the synchronized keyword.
 * when a method or block is synchronized only one thread can operate on the method/block at a time.
 * 
 * leads to waiting time of the treads, so if there is no specific requirement please don't use synchronization
 * 
 * synchronization uses the lock concept - which is there for every object in java (managed by jvm)
 * while a thread is executing operation on an object(not method), so other threads will have to wait till the lock on the object is released
 * but unsynchronized methods could be executed even if there are multiple threads are involved
 * in every object there are 2 parts : synchronized (accessed by only 1 thread at a time) and non synchronized area (accessed by any number of threads))
 * synchronized is used in CRUD scenarios.
 * if synchronized not used, irregularity in output will occur 
 * 
 *  if 2 object instance are created which deals with synchronized method/block will end up with irregular o/p as there are 2 instances are involved and they have their own locks 
 *  
 *  if we use the static keyword along with synchronized it will require class level lock, which gets activated due to the static keyword (every class in java has a unique lock which is class level lock)
 *  if a thread has the class level lock it is allowed to use any static method of the class, post completion the lock is released
 *  "static+synchronized makes a lock" other static and non-static and only-synchronized methods could be accessed by other threads
 *  
 *  
 *  if there are a few lines of code that need to be operated by one thread at a time, we need to keep them under a synchronized block
 *  
 *  synchronized(b){//specific to the object b}
 *  
 *  to get a class level lock we do -- synchronized(B.class){//to get the class level object}
 *  
 *  lock concept applicable for object and class types but not for primitives, hence don't pass primitives
 *  
 *  
 *  
 */
//example covered under multithreading 
public class Synchronization1 {

	synchronized void m1() {
		System.out.println("in m1");

	}

	synchronized void m2() {
		System.out.println("in m2");

	}
	
	void m3() {
		System.out.println("in m3");

	}
}
