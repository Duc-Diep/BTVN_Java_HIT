package Bai3;

import java.util.Random;

public class Human {
	private String name;
	private int HP=100;
	private int dame;
	
	public Human() {
		super();
	}

	public Human(String name, int hP, int dame) {
		super();
		this.name = name;
		HP = hP;
		this.dame = dame;
	}

	public void Attack(Human x) {
		x.setHP(x.getHP()-dame);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getDame() {
		return dame;
	}

	public void setDame(int dame) {
		this.dame = dame;
	}
	public boolean CanContinousToFight() {
		if(HP>0) {
			return true;
		}
		return false;
	}
	public void ShowInfo() {
		System.out.print("\t   "+name + ": "+HP +"HP  ");
	}
}
