package B3;

import java.util.Scanner;

public class Bai1 {
	static Scanner in = new Scanner(System.in);

	public static void nhap(int[] a, int n) {
		System.out.println("Nhap cac phan tu cua mang: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = in.nextInt();
		}
	}
	
	public static void xuli(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int tg = a[i];
					a[i] = a[j];
					a[j] = tg;
				}
			}
		}
		System.out.println("So can tim la: " + a[2]);
	}
	public static void xuat(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.print("\t"+a[i]);
		}
	}
	public static void main(String[] args) {
		System.out.print("Nhap n: ");
		int n = in.nextInt();
		if(n<3) {
			System.out.println("Không có số lớn thứ 3 :)");
			return;
		}
		int[] a = new int[n];
		nhap(a,n);
		xuli(a);
		xuat(a);
	}
}
