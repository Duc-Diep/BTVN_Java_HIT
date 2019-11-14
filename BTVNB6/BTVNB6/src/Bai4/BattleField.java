package Bai4;

import java.util.Scanner;

public class BattleField {
	private Knight Hiepsi;
	private Archers Cungthu;
	private Monster Tiger;
	Scanner in = new Scanner(System.in);
	public BattleField(Archers cung, Monster tiger) {
		super();
		Cungthu = cung;
		Tiger = tiger;
	}
	
	public BattleField(Knight hiepsi, Monster tiger) {
		super();
		Hiepsi = hiepsi;
		Tiger = tiger;
	}

	public void fight(Archers x, Monster y) {
		boolean heroturn=true;
		int turn;
		do {
		System.out.println("0 - Hero's turn first");
		System.out.println("1 - Monster's turn first");
		System.out.println("Choose turn: ");
		turn =in.nextInt();
		switch(turn) {
		case 0: heroturn = true;break;
		case 1: heroturn = false; break;
		default: System.out.println("Invalid selection!");
		}
		}while(turn!=0&&turn!=1);
		while(!x.Die()&&!y.Die()) {
			if(heroturn) {
				System.out.println(">>>>>>>>>>HERO's TURN<<<<<<<<<<");
				int choose;
				do {
					x.Showskill();
				System.out.println("Choose skill: ");
				choose = in.nextInt();
				switch(choose) {
				case 0: x.hit(y);break;
				case 1: if(x.getMP()>=30) {
					x.aim(y);break;
				}
				else {
					System.out.println("NOT ENOUGH MANA, CHANGE TO HIT");
					x.hit(y);
					break;
				}
				default: System.out.println("Invalid selection!");
				}
				}while(choose!=0&&choose!=1);
				heroturn=false;
			}
			else {
				System.out.println(">>>>>>>>>>MONSTER's TURN<<<<<<<<<<");
				int choose;
				do {
					y.Showskill();
					System.out.println("Choose skill: ");
					choose=in.nextInt();
					switch(choose) {
					case 0:y.fireblow(x);break;
					default: System.out.println("Invalid selection!");
					}
				}while(choose!=0);
				heroturn=true;
			}
		}
		if(x.Die()) {
			System.out.println("Monster is fucking winner");
		}
		else if(y.Die()) {
			System.out.println("Knight is fucking winner");
		}
	}
	public void fight(Knight x, Monster y) {
		boolean heroturn=true;
		int turn;
		do {
		System.out.println("0 - Hero's turn first");
		System.out.println("1 - Monster's turn first");
		System.out.println("Choose turn: ");
		turn =in.nextInt();
		switch(turn) {
		case 0: heroturn = true;break;
		case 1: heroturn = false; break;
		default: System.out.println("Invalid selection!");
		}
		}while(turn!=0&&turn!=1);
		while(!x.Die()&&!y.Die()) {
			if(heroturn) {
				System.out.println(">>>>>>>>>>HERO's TURN<<<<<<<<<<");
				int choose;
				do {
					x.Showskill();
				System.out.println("Choose skill: ");
				choose = in.nextInt();
				switch(choose) {
				case 0: x.hit(y);break;
				case 1: if(x.getMP()>=50) {
					x.shield(y);break;
				}
				else {
					System.out.println("NOT ENOUGH MANA, CHANGE TO HIT");
					x.hit(y);
					break;
				}
				default: System.out.println("Invalid selection!");
				}
				}while(choose!=0&&choose!=1);
				heroturn=false;
			}
			else {
				System.out.println(">>>>>>>>>>MONSTER's TURN<<<<<<<<<<");
				int choose;
				do {
					y.Showskill();
					System.out.println("Choose skill: ");
					choose=in.nextInt();
					switch(choose) {
					case 0:y.fireblow(x);break;
					default: System.out.println("Invalid selection!");
					}
				}while(choose!=0);
				heroturn=true;
			}
		}
		if(x.Die()) {
			System.out.println("Monster is fucking winner");
		}
		else if(y.Die()) {
			System.out.println("Knight is fucking winner");
		}
	}
	
}
