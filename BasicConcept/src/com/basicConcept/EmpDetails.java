package com.basicConcept;
//Aggregation

 class Address {  
String city,state,country;  
  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
  
}  

public class EmpDetails {
	int id;  
	String name;  
	Address address;  
	  
	public EmpDetails(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  
	public static void main(String[] args) {  
	Address address1=new Address("gzb","UP","india");  
	Address address2=new Address("gno","UP","india");  
	  
	EmpDetails e=new EmpDetails(111,"varun",address1);  
	EmpDetails e2=new EmpDetails(112,"arun",address2);  
	      
	e.display();  
	e2.display();  
	}

}
