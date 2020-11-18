package com.basicConcept;

public class ThisKeywordTest {
	int id;
	String name;
	int age;
	
	ThisKeywordTest(int id, String name){
		id=id;
		name=name;
	}
	
	ThisKeywordTest(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("ID : "+id+" Name : "+name+" Age : "+age);
	}
	
	public static void main(String[] args) {
		ThisKeywordTest c1=new ThisKeywordTest(111, "Chanaka");
		c1.display();
		
		ThisKeywordTest c2=new ThisKeywordTest(111, "Chanaka", 26);
		c2.display();
	}

}
