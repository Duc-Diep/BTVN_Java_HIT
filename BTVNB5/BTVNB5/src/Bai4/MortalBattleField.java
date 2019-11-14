package Bai4;

import java.util.Random;
import java.util.Scanner;

import Bai3.Human;

public class MortalBattleField {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner in = new Scanner(System.in);
		Human bot1 = new Human();
		Human bot2 = new Human();
		System.out.println("Nhập tên bot1: ");
		bot1.setName(in.nextLine());
		System.out.println("Nhập tên bot2: ");
		bot2.setName(in.nextLine());
		int count = 0;
		while (bot1.CanContinousToFight()&&bot2.CanContinousToFight()) {
			bot1.setDame(rd.nextInt(20));
			bot2.setDame(rd.nextInt(20));
			bot1.Attack(bot2);
			count++;
			System.out.println("\t\t====Lần đánh thứ " + count + "====");
			bot1.ShowInfo();
			bot2.ShowInfo();
			
			if(!bot1.CanContinousToFight()||!bot2.CanContinousToFight()) {
				break;
			}
			System.out.println();
			bot2.Attack(bot1);
			count++;
			System.out.println("\t\t====Lần đánh thứ " + count + "====");
			bot1.ShowInfo();
			bot2.ShowInfo();
			System.out.println();
			if(!bot1.CanContinousToFight()||!bot2.CanContinousToFight()) {
				break;
			}
			
			
			//if (bot1.getHP() <= 0 && bot2.getHP() <= 0) {
			//	System.out.println("Cả 2 đều chết :v");
			//	return;
			//}
			
		}
		System.out.println();
		if (bot1.getHP() <= 0) {
			System.out.println("Do nhân phẩm quá tồi tàn nên...");
			System.out.println("\t\t" + bot1.getName() + " đã chết, " + bot2.getName() + " thắng");
		} else if (bot2.getHP() <= 0) {
			System.out.println("Do nhân phẩm quá tồi tàn nên...");
			System.out.println("\t" + bot2.getName() + " đã chết, " + bot1.getName() + " win");
		}
	}
}
