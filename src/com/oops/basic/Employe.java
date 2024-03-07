package com.oops.basic;

public class Employe extends Person1 {
// data members
	
private int id;
private double salary;

 // constructor creation

public Employe(String name,int age, int id,double salary) {
	super(name, age); // access from parent class
	this.id =id;
	this.salary=salary;
	
 }	// method 

   

public void displayDetails() {
	super.displayDetails();
	System.out.println("the id is:" +id);
    System.out.println("the salary is:" +salary);
}
}