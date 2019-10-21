package Bai1;

public class Person {
	private String name;
	private int age;
	private String hobby;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "[Tên=" + name + ", Tuổi: " + age + ", Sở thích: " + hobby + ", Giới tính: " + sex + "]";
	}
}
