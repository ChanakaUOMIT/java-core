package com.basicConcept;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	  //Traversing list through for-each loop  
	    for(String fruit:cars)    
	      System.out.println(fruit);    
	  }

}
