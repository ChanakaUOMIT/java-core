package com.basicConcept;

class Student{
	int id;
	String name;
}

class Student_1{
	int rollno;
	String name;
	
	void insertRecord(int r, String n) {
		rollno=r;
		name=n;
	}
	void displayInformation(){
		System.out.println(rollno+" "+name);
	}  
}

public class ObjectAndClass {
	
	public static void main(String args[]) {
		Student s1=new Student();
		//Initialization through reference
		s1.id=101;
		s1.name="Java";
		System.out.println(s1.id+" "+s1.name);
		
		//Initialization through method
		Student_1 s2=new Student_1();
		Student_1 s3=new Student_1();  
		s2.insertRecord(111,"Karan");  
		s3.insertRecord(222,"Aryan");  
		s2.displayInformation();  
		s3.displayInformation();  
	}

}
