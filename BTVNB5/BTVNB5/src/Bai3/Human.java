package Bai3;

import java.util.Random;

public class Human {
	private String name;
	private int HP=100;
	private int dame;
	
	public void Attack(Human x) {
		int count=0;
		Random rd = new Random();
		dame =5+rd.nextInt(15);
		x.dame=5+rd.nextInt(10);
		System.out.println(name+": [dame="+dame+",HP="+HP+"]");
		System.out.println(x.getName()+": [dame="+x.getDame()+",HP="+x.getHP()+"]");
			for(int i=1;i<=4&&x.getHP()>0;i++) {
				x.setHP(x.getHP()-dame);
				count++;
				System.out.println();
				System.out.println("\t-----Lượt đánh thứ "+count+"-----");
				System.out.print("\t   "+name + ": "+HP +"HP vs ");
				System.out.println(x.name + ": "+x.getHP() +"HP");
			}
			for(int i=1;i<=5&&HP>0;i++) {
				HP-=x.dame;
				count++;
				System.out.println();
				System.out.println("\t-----Lượt đánh thứ "+count+"-----");
				System.out.print("\t   "+name + ": "+HP +"HP vs ");
				System.out.println(x.name + ": "+x.getHP() +"HP");
			}
		
		if(HP>x.getHP()) {
			System.out.println(name+" thắng");
			return;
		}
		else {
			System.out.println(x.getName()+" thắng");
			return;
		}
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

	
}
