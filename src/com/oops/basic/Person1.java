package com.oops.basic;


public class Person1 { // parent class
//data member
	private String name;
	private int age;
	// creating constructor 
	public Person1(String name,int age) {
		this.name=name;
		this.age=age;
	}

 // method
  public void displayDetails() {
	  System.out.println("the name is:" +name);
	  System.out.println("the age is:" +age);
  }
}