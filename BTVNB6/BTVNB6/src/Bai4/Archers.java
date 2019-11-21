package Bai4;


public class Archers {
	private int HP=200;
	private int MP=90;
	private int armor=10;
	public void hit(Monster x) {
	x.setHP(x.getHP()-(30-x.getArmor()));
	}
	public void aim(Monster x) {
		this.MP-=30;
		x.setHP(x.getHP()-(100-x.getArmor()));
		x.setArmor(x.getArmor()-10);
	}
	public void getDame() {
		
	}
	public boolean Die() {
		if(this.HP<=0) {
			return true;
		}
		else return false;
	}
	public void Showskill(){
		System.out.println("Archer's HP: "+this.HP+"\nArcher's MP: "+this.MP+"\nArcher's Armor: "+this.armor);
		System.out.println("--------Hero's skill---------");
		System.out.println("0 - hit(mana=0,dame=30)");
		System.out.println("1 - aim(mana=30,dame=100,-10arm)");
	}
	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int mP) {
		MP = mP;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
}
