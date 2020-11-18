package com.basicConcept;

class Calculation{
	void fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("Factorial : "+fact);
	}
	
	float recursionFact(int n) {
		if(n==1) {
			return 1;
		}else {
			return(n*recursionFact(n-1));
		}
	}
}

public class Factorial {
	public static void main(String[] args) {
		new Calculation().fact(5);//calling method with anonymous object  
		Calculation c1=new Calculation();
		
		float result=c1.recursionFact(5);
		System.out.println("Factorial is : "+ result);
	}
}
