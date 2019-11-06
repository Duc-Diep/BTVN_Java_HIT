package Bai2;

public class Knight {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int HP;
	private int MP;
	
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

	public void Heal() {
		MP-=50;
		HP+=30;
	}

	@Override
	public String toString() {
		return "[HP=" + HP + ", MP=" + MP + "]";
	}

	
}
