package Bai2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double money;
		do {
		System.out.print("Nhập số điện anh Tú dùng để xem phim SIÊU NHÂN HEO: ");
		n= sc.nextInt();
		if(n<0) {
			System.out.println("Nhập lại tiền mà là số âm à -_-");
		}
		}while(n<0);
		if(n<=50) {
			money = 4000*n;
		}
		else if(n<=100) {
			money = 4000*50+3000*(n-50);
		}
		else {
			money = 4000*50+3000*50+(n-100)*(3000-(n-100)*10);
		}
		Locale local =new Locale("vi","VN");
		NumberFormat numberFormat = NumberFormat.getInstance(local);
		String tong = numberFormat.format(money);
		//System.out.printf("%10s",money+"VNĐ");
		System.out.printf("Tổng số tiền anh Tú phải trả là: "+tong+"VNĐ");
	}
}
