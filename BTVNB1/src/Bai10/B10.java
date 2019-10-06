package Bai10;

import java.util.Scanner;

public class B10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Giải phương trình bậc 2 ax2+bx+c=0\n");
		System.out.print("Nhập hệ số a: ");
		float a = in.nextFloat();
		if (a == 0) {
			System.out.println("Không phải phương trình bậc 2 vì hệ số a =0");
			return;
		}
		System.out.print("Nhập hệ số b: ");
		float b = in.nextFloat();
		System.out.print("Nhập hệ số c: ");
		float c = in.nextFloat();
		float delta = b*b-4*a*c;
		if(delta<0) {
			System.out.println("Phương trình vô nghiệm!");
			return;
		}
		else if(delta==0) {
			System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b/2*a));
			return;
		}
		else {
			System.out.println("Phương trình có 2 nghiệm phân biệt  là: \n x1 = "+ ((-b-Math.sqrt(delta))/(2*a))+"\n x2 = " + ((-b+Math.sqrt(delta))/(2*a)));
		}
	}
}
