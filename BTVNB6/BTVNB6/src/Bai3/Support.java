package Bai3;

import java.util.Arrays;

public class Support {
	private String name;
	private int age;
	Member[] x;
	public Support(String name, int age, Member[] x) {
		super();
		this.name = name;
		this.age = age;
		this.x = x;
	}
	
	public void ShowInfo() {
		System.out.println("Support: [name=" + name + ", age=" + age+"]" );
		System.out.println("Danh sach members: ");
		for(Member m : x) {
			System.out.print(m.getName()+", ");
		}
	}
}
