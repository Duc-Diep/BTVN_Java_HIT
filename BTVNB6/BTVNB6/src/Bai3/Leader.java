package Bai3;

public class Leader {
	private String name;
	private int age;
	private int Leadingday;
	public Leader(String name, int age, int leadingday) {
		super();
		this.name = name;
		this.age = age;
		Leadingday = leadingday;
	}
	public void ShowInfo() {
		System.out.println("Leader [name=" + name + ", age=" + age + ", Leadingday=" + Leadingday + "]"); 
	}
	
}
