package Bai4;

public class Knight {
	private int HP=150;
	private int MP=100;
	private int armor=10;
	public void hit(Monster x) {
	x.setHP(x.getHP()-(40-x.getArmor()));;
	}
	public void shield(Monster x) {
		this.MP-=50;
		x.setHP(x.getHP()-(100-x.getArmor()));
		x.setArmor(x.getArmor()-30);
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
		System.out.println("Knight's HP: "+this.HP+"\nKnight's MP: "+this.MP+"\nKnight's Armor: "+this.armor);
		System.out.println("--------Hero's skill---------");
		System.out.println("0 - hit(mana=0,dame=40)");
		System.out.println("1 - shield(mana=50,dame=100,-30arm)");
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
