package Bai3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//a
		//Inf Hacker1
		Hacker Hacker1 = new Hacker();
		System.out.print("Nhập tên: ");
		Hacker1.setName(sc.nextLine());
		System.out.print("Nhập năm sinh: ");
		Hacker1.setYear(sc.nextInt());
		sc.nextLine();
		System.out.print("Nhập địa chỉ: ");
		Hacker1.setAddress(sc.nextLine());
		System.out.print("Nhập sở thích: ");
		Hacker1.setHobby(sc.nextLine());
		System.out.println("a)Hacker1:\n Tên: "+Hacker1.getName());
		System.out.println(" Năm sinh: "+Hacker1.getYear());
		System.out.println(" Địa chỉ: "+Hacker1.getAddress());
		System.out.println(" Sở thích: "+Hacker1.getHobby());
		//Inf Hacker2
		Hacker Hacker2 = new Hacker("Điệp", 2000, "Hà Nội", "Xem anime");
		System.out.println("Hacker2"+Hacker2.toString());
		//b
		
		Hacker[] list = new Hacker[5];
		list[0]=new Hacker("Doan", 2001, "Nam Định", "Xem anime");
		list[1]=new Hacker("Khánh", 2001, "Nam Định", "Chơi game");
		list[2]=new Hacker("Sơn", 2001, "Nam Định", "Chích");
		list[3]=new Hacker("Tú", 2001, "Nam Định", "Nghịch Xà phòng");
		list[4]=new Hacker("Thụ", 2001, "Nam Định", "Ăn sandwich");
		System.out.println("Danh sách hacker đủ 18 tuổi là:");
		for(int i=0;i<list.length;i++) {
			if(2019-list[i].getYear()==18) {
				System.out.println(list[i].toString());
			}
		}
		System.out.println("Danh sách hacker có tên bắt đầu bằng chữ T");
		for(int i=0;i<list.length;i++) {
			if(list[i].getName().indexOf('T')==0) {
				System.out.println(list[i].toString());
			}
		}
	}
}
