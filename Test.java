package com.chintha.java.mainmethod;
/*Main method is used to check by the jvm at runtime with out main we can compile but run exception it shows
 * In the declaration of main method we need to some strict rules define main method ,rules are:
 * public, we need to declare with public other wise it shows error and jvm purpose only we need to define y? JVM will call from any where
 * If there is object reference we need to define the static y? JVM will call this static method
 * void won't return to JVM so we use the void as return type
 * main it is the which configure inside JVM, so we need use main in main method
 * String[] args is command line args
 * In the replace of args we can use our name instead of args as:String[] chintha
 * 
 * 
 * */

public class Test {
	
	static {
		System.out.println("Static method");
		
	}
// JVM will check first main method will declared or not ,then it goes to another method to execute
	//Before 1.6 version it will print static block first ,then it checks main method or not
	//	public static void main(String... args) var arg parameter are used in command line args
	public static void main(String[] args) {
		
		System.out.println("String args method");

	}
//public static final synchronized strictfp void main(String[] args) { // this the one way only we declare the main method ther is other way to declare main method
	// with small changes any kind of changes
//		
//		System.out.println("String args method");
//
//	}
//	 static public void main(String... args) {
//	
//	System.out.println("Main method");
//
//}
public static void main(int[] args) {
		// By explicitly we need call the this method this process is known as method overloading
		System.out.println(" int args method");

	}

}
