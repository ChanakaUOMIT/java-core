package com.basicConcept;

public class HelloWorld {
	Integer instanceVariable=10;
	
	 void nonStaticTest() {
		Integer localVariable=20;
		System.out.println("non-static-method");
	}
	
	public static void staticTest() {
		System.out.println("static-methods");
	}
	
	public static void main(String[] args) {
		HelloWorld helloWorldObject = new HelloWorld();
		System.out.println("Hello Java Come back..!");
		
		helloWorldObject.nonStaticTest();
		staticTest();
	}

}
