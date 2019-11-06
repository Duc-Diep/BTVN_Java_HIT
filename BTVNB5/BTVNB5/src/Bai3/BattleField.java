package Bai3;

import java.util.Scanner;

public class BattleField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	in = new Scanner(System.in);
		Human bot1 = new Human();
		Human bot2 = new Human();
		System.out.println("Nhập tên bot1: ");
		bot1.setName(in.nextLine());
		System.out.println("Nhập tên bot2: ");
		bot2.setName(in.nextLine());
		bot1.Attack(bot2);
	}

}
