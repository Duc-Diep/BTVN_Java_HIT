package Bai4;

import java.util.Scanner;

public class B4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập số nguyên n: ");
		int n = in.nextInt();
		System.out.print("Nhập số thực m: ");
		float m = in.nextFloat();
		System.out.print("Nhập xâu kí tự: ");
		in.nextLine();
		String s = in.nextLine();
		System.out.println("Số n là: " + n);
		System.out.println("Số m là: " + m);
		System.out.println("Chuỗi vừa nhập là: " + s);
	}
}
