package org.comit.course._06_practice;

public class Person {
	private String name;
    private int age;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	  public void displayPersonInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
    
}
