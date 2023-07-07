package Inheritance;

class Animal{
	void eat() {};
	void sleep() {};
}

class Canine extends Animal{
	@Override
	void eat() {};
	void roam() {};
}

class Dog extends Canine{
	@Override
	void  eat() {};
	@Override
	void sleep() {};
	void bark() {};
}

class Maridog extends Dog{
	@Override
	void roam() {};
	void play() {};
}

public class InheritanceMethodCalls {
	
	
	public static void main(String[] args) {		
		/**
		 * 1 . parent reference can point to a child object
		 * */	
		Dog dog1 = new Maridog();
		
		/**
		 * 2 . using parent reference you can only call parent methods
		 * 
		 * */
		Dog dog2 = new Maridog();
		dog2.eat(); // this works
//		dog2.play(); // this do not work 
		
		/**
		 * 3. no matter which method you call, what body is picked is NOT dependaent
		 * on reference data type, it only depends on type of object 
		 * */
		Dog dog3 = new Maridog();
		dog3.eat(); // Dog
		dog3.sleep(); // Dog
		dog3.roam(); // MariDog
		dog3.bark(); // Dog
		
	}
	
	
	/**
	 * Oracle reference statement:
	 * 
	 * https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html
	 * 
	 *  The Java virtual machine (JVM) calls the appropriate method for the object 
	 *  that is referred to in each variable. It does not call the method that is 
	 *  defined by the variable's type. This behavior is referred to as virtual 
	 *  method invocation and demonstrates an aspect of the important polymorphism
	 *   features in the Java language
	 * */
}




