package Bai4;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choose;
		do {
			System.out.println("0 - Archer");
			System.out.println("1 - Knight");
			System.out.println("Choose class: ");
			choose = in.nextInt();
			switch (choose) {
			case 0:
				Archers Thu = new Archers();
				Monster Chogath = new Monster();
				BattleField bf1 = new BattleField(Thu, Chogath);
				bf1.fight(Thu, Chogath);
				break;
			case 1:
				Knight Athu = new Knight();
				Monster MotherChogath = new Monster();
				BattleField bf2 = new BattleField(Athu, MotherChogath);
				bf2.fight(Athu, MotherChogath);
				break;
			default: System.out.println("Invalid selection!");
			}
		} while (choose != 0 && choose != 1);
	}
}
