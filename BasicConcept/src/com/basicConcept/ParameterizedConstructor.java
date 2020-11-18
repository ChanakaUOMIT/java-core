package com.basicConcept;

public class ParameterizedConstructor {
	int id;
	String name;
	int age;
	
	ParameterizedConstructor(int i, String n){
		id=i;
		name=n;
	}
	
	ParameterizedConstructor(int i, String n, int a){
		id=i;
		name=n;
		age=a;
	}
	
	void display() {
		System.out.println("ID : "+id+" Name : "+name+" Age : "+age);
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor c1=new ParameterizedConstructor(111, "Chanaka");
		c1.display();
		
		ParameterizedConstructor c2=new ParameterizedConstructor(111, "Chanaka", 26);
		c2.display();
	}

}
