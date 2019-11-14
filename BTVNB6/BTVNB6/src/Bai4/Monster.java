package Bai4;

public class Monster {
	private int HP=500;
	private int MP=0;
	private int armor=20;

	public void fireblow(Archers x) {
		x.setHP(x.getHP()-(30-x.getArmor()));
	}
	public void fireblow(Knight x) {
		x.setHP(x.getHP()-(30-x.getArmor()));
	}
	public boolean Die() {
		if(this.HP<=0) {
			return true;
		}
		else return false;
	}
	public void Showskill() {
		System.out.println("Tiger's HP: "+this.HP+"\nTiger's MP: "+this.MP+"\nTigher's Armor: "+this.armor);
		System.out.println("--------Monster's skill---------");
		System.out.println("0-hit(dame=30,mana=0)");
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
