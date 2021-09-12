package angkkoproject.person;

import java.util.ArrayList;

public class Person {
	String name;
	int age;
	ArrayList<Car> car = new ArrayList<>();
	
	
	private Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	public static void main(String[] args) {
		
	}
	
}
