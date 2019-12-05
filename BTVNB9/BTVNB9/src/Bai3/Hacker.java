package Bai3;

public class Hacker {
	private String name;
	private int year;
	private String address;
	private String hobby;
	
	public Hacker() {
		super();
	}
	@Override
	public String toString() {
		return " [name=" + name + ", year=" + year + ", address=" + address + ", hobby=" + hobby + "]";
	}
	public Hacker(String name, int year, String address, String hobby) {
		super();
		this.name = name;
		this.year = year;
		this.address = address;
		this.hobby = hobby;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}
