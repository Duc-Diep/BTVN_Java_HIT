package Bai9;

import java.util.Scanner;

public class B9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Giải phương trình bậc nhất ax+b=0\n");
		System.out.print("nhập hệ số a: ");
		float a = in.nextFloat();
		if (a == 0) {
			System.out.println("Không phải phương trình bậc nhất vì hệ số a=0");
			return;
		} else {
			System.out.print("Nhập hệ số b: ");
			float b = in.nextFloat();
			System.out.println("Nghiệm của phương trình là x = " + (-b / a));
		}
	}
}
