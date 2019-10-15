package B3;

import java.util.Scanner;

public class Bai2 {
	static Scanner in = new Scanner(System.in);
public static void main(String[] args) {
	String s="";
	int t=0;
	System.out.println("Nhập chuỗi: ");
	s=in.nextLine();
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>'0'&&s.charAt(i)<'9') {
			t+=(int)s.charAt(i)-48;
		}
	}
	System.out.println("Tổng các kí tự số là: "+t);
}
}
