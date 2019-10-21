package Bai3;

import java.util.Scanner;

public class Student {
	static Scanner in = new Scanner(System.in);
	private String name;
	private String code;
	private int age;
	public void InputInfo() {
		System.out.print("Nhập mã sv: ");
		code = in.nextLine();
		System.out.print("Nhập tên: ");
		name = in.nextLine();
		System.out.print("Nhập tuổi: ");
		age = in.nextInt();
		in.nextLine();
	}
	public void ShowInfo() {
		System.out.print("[Tên: " + name + ", Mã sv: " + code + ", Tuổi: " + age + "]\n");
	}
	
}
