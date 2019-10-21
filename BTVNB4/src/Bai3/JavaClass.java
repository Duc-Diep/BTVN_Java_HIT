package Bai3;

import java.util.Scanner;

public class JavaClass {
	static Scanner in = new Scanner(System.in);
	private String leader;
	private Student stdList[];
	private int ratingStar;
	private void InputStudent() {
		System.out.print("Nhập số thành viên trong lớp: ");
		int n=in.nextInt();
		stdList= new Student[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhập thông tin sv thứ "+(i+1));
			stdList[i]= new Student();
			stdList[i].InputInfo();
		}
	}
	private void ShowStudent() {
		int i=1;
		for(Student x: stdList) {
			System.out.print(i+".");
			x.ShowInfo();
			i++;
		}
	}
	public void InputClassInfo() {
		System.out.print("Nhập tên leader: ");
		leader = in.nextLine();
		System.out.print("Đánh giá ratingStar: ");
		ratingStar = in.nextInt();
		InputStudent();
	}
	public void ShowClassInfo() {
		System.out.println("Tên leader: "+ leader);
		System.out.println("RatingStar: "+ratingStar+"*");
		System.out.println("Danh sách sinh viên trong lớp: ");
		ShowStudent();
	}
}
