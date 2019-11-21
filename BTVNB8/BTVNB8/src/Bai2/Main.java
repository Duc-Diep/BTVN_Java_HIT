package Bai2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Nhập thông tin ôtô
		System.out.println("Nhập thông tin cho ôtô: ");
		System.out.print("Nhập nhãn hiệu: ");
		String newnh=in.nextLine();
		System.out.print("Nhập năm sx: ");
		int newnamsx=in.nextInt();
		System.out.print("Nhập hãng: ");
		in.nextLine();
		String newhang = in.nextLine();
		System.out.print("Nhập số chỗ ngồi: ");
		int number = in.nextInt();
		System.out.print("Nhập dung tích: ");
		int newdt = in.nextInt();
		Oto xe1 = new Oto(newnh, newnamsx, newhang, number, newdt);
		//Nhập thông tin môtô
		System.out.println("Nhập thông tin cho môtô:");
		System.out.print("Nhập nhãn hiệu: ");
		in.nextLine();
		String newnh1=in.nextLine();
		System.out.print("Nhập năm sx: ");
		int newnamsx1=in.nextInt();
		System.out.print("Nhập hãng: ");
		in.nextLine();
		String newhang1 = in.nextLine();
		System.out.print("Nhập phân khối: ");
		int newpk=in.nextInt();
		Moto xe2 = new Moto(newnh1, newnamsx1, newhang1, newpk);
		System.out.println("Thông tin của mỗi xe: ");
		System.out.println(xe1.toString());
		System.out.println(xe2.toString());
	}

}
