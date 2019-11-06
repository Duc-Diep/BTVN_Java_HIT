package Bai1;

import java.util.Scanner;

public class Club {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập số thành viên: ");
		int n;
		do {
			n = in.nextInt();
			if (n<=0) System.out.print("Số thành viên phải lớn hơn 0: ");
		} while (n<=0);
		Student[] HITClub = new Student[n];
		for (int i = 0; i < HITClub.length; i++) {
			System.out.println("\t==Nhập thành viên thứ "+(i+1)+" ==");
			HITClub[i] = new Student();
			HITClub[i].inputStudent();
		}
		System.out.print("Các thành viên của CLB: \n");
		for (int i = 0; i < HITClub.length; i++) {
			System.out.println((i+1)+". "+HITClub[i].toString());
		}
	}

}
