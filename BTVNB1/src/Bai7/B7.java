package Bai7;

import java.util.Scanner;

public class B7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập số thứ nhất : ");
		double n1 = in.nextDouble();
		System.out.print("Nhập số thứ 2 : ");
		double n2 = in.nextDouble();
		System.out.println("Số lớn nhất trong 2 số là: " + Math.max(n1, n2));
	}
}
