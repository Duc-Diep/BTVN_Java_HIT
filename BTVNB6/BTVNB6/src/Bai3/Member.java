package Bai3;

public class Member {
	private String name;
	private int DayActive;
	private int DayAbsent;
	
	public Member(String name, int dayActive, int dayAbsent) {
		super();
		this.name = name;
		DayActive = dayActive;
		DayAbsent = dayAbsent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void ShowInfo() {
		System.out.println(".[name=" + name + ", DayActive=" + DayActive + ", DayAbsent=" + DayAbsent + "]"); 
	}
	
}
