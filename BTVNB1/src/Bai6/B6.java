package Bai6;

import java.util.Scanner;

public class B6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập số nguyên n1: ");
		int n1 = in.nextInt();
		System.out.print("Nhập số nguyên m1: ");
		int m1 = in.nextInt();
		System.out.print("Nhập số thực n2: ");
		float n2 = in.nextFloat();
		System.out.print("Nhập số thực m2: ");
		float m2 = in.nextFloat();
		System.out.println("Tổng 2 số nguyên n1+m1 là: " + (m1 + n1));
		System.out.println("Tổng của 2 số thực n2+m2 là: " + (n2 + m2));
		System.out.println("Tổng của n1+n2 là : " + (n1 + n2));
	}

}
