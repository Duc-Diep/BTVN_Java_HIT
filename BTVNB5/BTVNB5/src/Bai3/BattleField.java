package Bai3;

import java.util.Random;
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
		int count=0;
		Random rd = new Random();
		bot1.setDame(5+rd.nextInt(15));
		bot2.setDame(5+rd.nextInt(10));
		System.out.println(bot1.getName() +": [dame="+bot1.getDame()+",HP="+bot1.getHP()+"]");
		System.out.println(bot2.getName()+": [dame="+bot2.getDame()+",HP="+bot2.getHP()+"]");
		//4round
		for(int i=1;i<=4;i++) {
			bot1.Attack(bot2);
			count++;
			System.out.println();
			System.out.println("\t-----Lượt đánh thứ "+count+"-----");
			bot1.ShowInfo();
			bot2.ShowInfo();
		}
		//5round
		for(int i=1;i<=5;i++) {
			bot2.Attack(bot1);
			count++;
			System.out.println();
			System.out.println("\t-----Lượt đánh thứ "+count+"-----");
			bot1.ShowInfo();
			bot2.ShowInfo();
		}
		if(bot1.getHP()>bot2.getHP()) {
			System.out.println(bot1.getName()+" thắng");
			return;
		}
		else {
			System.out.println(bot2.getName()+" thắng");
			return;
		}
	}

}
