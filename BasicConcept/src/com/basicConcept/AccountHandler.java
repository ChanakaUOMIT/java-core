package com.basicConcept;

class Account{
	int acc_no;
	String name;
	float amount;
	
	void insert(int a, String n, float amt) {
		acc_no=a;
		name=n;
		amount=amt;
	}
	
	void deposit(float amt) {
		amount+=amt;
		System.out.println(amt+" deposited. now your balance is "+amount);
	}
	
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("Insuffient Balance");
		}else {
			amount-=amt;
			System.out.println(amt+" withdrawn, Now your balance is "+amount);
		}
	}
	
	void checkBalance() {
		System.out.println("Your balance is "+ amount);
	}
	
	void display() {
		System.out.println(acc_no + " "+ name + " " + amount);
	}
}
public class AccountHandler {
	public static void main(String[] args) {
		Account a1=new Account();
		a1.insert(832345,"Ankit",1000);  
		a1.display();  
		a1.checkBalance();  
		a1.deposit(40000);  
		a1.checkBalance();  
		a1.withdraw(15000);  
		a1.checkBalance(); 
		a1.withdraw(400000);  
	}
	

}
