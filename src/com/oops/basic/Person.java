package com.oops.basic;

public class Person {
	// Data members
	
	private String name;
	private int age;
	// constructor
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	// method
	public void displayDetails() {
		System.out.println("The Name is: "+name );
		System.out.println("The Age is :" +age);
	}

	public static void main(String[] args) {
		//object creation
		Person p1=new Person("nish",18); // parameterised constructor
		
		p1.displayDetails();

	}

}


 // output
 

    //The Name is: nish
    //The Age is :18








