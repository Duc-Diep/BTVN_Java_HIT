package Bai2;

import java.util.Scanner;

public class RunMain {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	MayTinh computer = new MayTinh();
	float[] a= new float[5];
	System.out.println(computer.TinhTong(5f, 4f));
	System.out.println(computer.TinhTong(4f, 5f, 6f));
	System.out.println("Nhap mang a:");
	for(int i=0;i<a.length;i++) {
		System.out.print("a["+i+"]=");
		a[i]=in.nextFloat();
	}
	System.out.println(computer.TinhTong(a));
}
}
