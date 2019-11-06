package Bai1;

import java.util.Scanner;

public class Student {
	private String maSV;
	private String name;
	private int age;
	private String lop;

	public void inputStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã sv: ");
		maSV = sc.nextLine();
		System.out.print("Nhập tên: ");
		name = sc.nextLine();
		System.out.print("Nhập tuổi:");
		age = sc.nextInt();
		System.out.print("Nhập lớp: ");
		sc.nextLine();
		lop = sc.nextLine();
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

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

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	@Override
	public String toString() {
		return "Mã sv: " + maSV + ", Tên: " + name + ", Tuổi: " + age + ", Lớp: " + lop;
	}

}
