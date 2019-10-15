package B3;

import java.util.Scanner;

public class Bai3 {
	static Scanner in = new Scanner(System.in);
	static int n;
	static int []a=new int[n+100];
	public static void main(String[] args) {
		do {
		System.out.println("---------------MENU------------------");
		System.out.println("1.Tạo và nhập mảng với n số nguyên.");
		System.out.println("2.Hiển thị mảng vừa tạo");
		System.out.println("3.Thêm 1 phần tử vào vị trí k");
		System.out.println("4.Xóa 1 phần tử tại vị trí k");
		System.out.println("5.Đảo ngược mảng");
		System.out.println("6.Hiển thị số a[1] và số chai hết cho a[1]");
		System.out.println("7.Exit");
		
			
			System.out.print("Nhập lựa chọn của bạn: ");
			int op = in.nextInt();
			switch (op) {
			case 1:
				System.out.print("Nhập số nguyên n: ");
				n = in.nextInt();
				Func1(a,n);
				break;
			case 2:
				Func2(a,n);
				break;
			case 3:
				Func3(a,n);
				break;
			case 4:
				Func4(a,n);
				break;
			case 5:
				Func5(a,n);
				break;
			case 6:
				Func6(a,n);
				break;
			case 7:
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ");
			}
		} while (true);
	}

	public static void Func1(int []a,int n) {
		System.out.println("Nhập các phần tử của mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = in.nextInt();
		}
	}

	public static void Func2(int []a,int n) {
		System.out.println("Mảng là: ");
		for(int i=0;i<n;i++) {
			System.out.print("\t"+a[i]);
		}
		System.out.println();
	}

	public static void Func3(int []a,int n) {
		System.out.print("Nhập số cần chèn: ");
		int k=in.nextInt();
		System.out.print("Nhập vị trí : ");
		int vt=in.nextInt();
		if(vt>n) {
			System.out.println("Vị trí không hợp lệ!");
			return;
		}
		n++;
		for(int i=n;i>=vt-1;i--) 
			a[i]=a[i-1];
			a[vt-1]=k;
		System.out.println("Mảng sau khi chèn là: ");
		for(int i=0;i<n;i++) {
			System.out.print("\t"+a[i]);
		}
		System.out.println();
	}

	public static void Func4(int []a,int n) {
		System.out.println("Nhập vị trí cần xóa: ");
		int vt=in.nextInt();
		if(vt>n) {
			System.out.println("vị trí không hợp lệ!");
			return;
		}
		for(int i=vt-1;i<n-1;i++) {
			a[i]=a[i+1];
		}
		n--;
		System.out.println("Mảng sau khi xóa phần tử ở vị trí k là: ");
		for(int i=0;i<n;i++) {
			System.out.print("\t"+a[i]);
		}
		System.out.println();
	}

	public static void Func5(int []a,int n) {
		System.out.println("Mảng dảo ngược: ");
		for(int i=n-1;i>=0;i--) {
			System.out.print("\t"+a[i]);
		}
		System.out.println();
	}

	public static void Func6(int []a,int n) {
		System.out.println("a[1]="+a[1]);
		System.out.println("Các số chia hết cho a[1] là: ");
		for(int i=0;i<n;i++) {
			if(a[i]%a[1]==0) {
				System.out.print(a[i]+"\t");
			}
		}
		System.out.println();
	}
}
