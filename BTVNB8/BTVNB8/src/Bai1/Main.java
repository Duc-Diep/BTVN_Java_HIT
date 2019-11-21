package Bai1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Nhập số kỹ sư: ");
		n=in.nextInt();
		Kysu[] kysu = new Kysu[n];
		//Nhập thông tin
		for(int i=0;i<kysu.length;i++) {
			System.out.println("Nhập thông tin kỹ sư thứ "+(i+1));
			kysu[i]=new Kysu();
			kysu[i].nhap();
		}
		//Xuất thông tin all kỹ sư
		int stt=1;
		for(Kysu x : kysu) {
			System.out.println(stt+x.toString());
			stt++;
		}
		//Tìm các kĩ sư có năm tốt nghiệp lớn nhất
		int max = kysu[0].NamTN;
		for(int i=1;i<kysu.length;i++) {
			if(kysu[i].NamTN>max) {
				max=kysu[i].NamTN;
			}
		}
		//Xuất thông tin
		System.out.println("Các kỹ sư có năm tốt nghiệp gần đây nhất là: ");
		stt=1;
		for(int i=0;i<kysu.length;i++) {
			if(kysu[i].NamTN==max) {
			System.out.println(stt+kysu[i].toString());
			stt++;
			}
		}
	}

}
