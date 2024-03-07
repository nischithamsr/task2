package com.oops.basic;

public class Account {
	//data members
	private double balance;
	private double amount;
	// creation of respective constructor for an object
	public Account() {
		System.out.println("default constructor");
	}
	 public Account(double balance,double amount) {
		this.balance=balance;
		this.amount=amount;
	 }
	// method to deposit amount
	 
	public void deposit() {
		if(amount>0) {
			// logic to deposit
		double	balance1 = balance +amount;
			System.out.println("The balance after deposit is:" +balance1);
		}else {
			System.out.println("INVALID AMOUNT");
		}
			
	}
	//Method to withdrawal amount
	 
	public void withdrawl() {
		if(balance>=0) {
			//logic to withdrawl
			double balance1 = balance-amount;
			System.out.println("The balance after withdrawl is:" +balance1);
		}else {
			System.out.println("insufficient balace");
			
			
		}
	}
	
	public static void main(String[] args) {
		Account account1=new Account();
		Account account2=new Account(1000,500);
                account2.deposit();
                account2.withdrawl();
	}
	

}
  // OUTPUT

//default constructor
//The balance after deposit is:1500.0
//The balance after withdrawl is:500.0










