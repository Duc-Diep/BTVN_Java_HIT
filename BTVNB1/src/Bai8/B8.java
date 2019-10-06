package Bai8;

import java.util.Scanner;

public class B8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập số thứ nhất : ");
		double n1 = in.nextDouble();
		System.out.print("Nhập số thứ 2 : ");
		double n2 = in.nextDouble();
		System.out.print("Nhập số thứ 3 : ");
		double n3 = in.nextDouble();
		System.out.println("Số lớn nhất trong 3 số là: " + Math.max(Math.max(n1, n2), n3));
	}
}
