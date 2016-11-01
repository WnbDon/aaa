package test.cn;

import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	private double age; 
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	} 
}
