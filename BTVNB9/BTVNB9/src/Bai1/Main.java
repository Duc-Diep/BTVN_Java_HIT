package Bai1;

public class Main {
	public static int TinhTong(int a,int b,int c) {
		return a+b+c;
	}
	public static int TinhTheoCongThuc(int a,int b,int c) {
		return ((a / b)-c)/2;
	}
	public static String ChuyenThanhString(int a,int b,int c) {
		String s="";
		s+=a;
		s+=b;
		s+=c;
		return s;
	}
	public static void HienThiHam(int a,int b,int c) {
		System.out.println("TinhTong="+TinhTong(a, b, c));
		System.out.println("TinhTheoCongThuc="+TinhTheoCongThuc(a, b, c));
		System.out.println("ChuyenThanhString="+ChuyenThanhString(a, b, c));
	}
	public static void main(String[] args) {
		HienThiHam(1, 2, 3);
	}

}
