package Bai2;

public class Dog {
	private String name;
	private int MP=100;
	public String getName() {
		return name;
	}
	public void InputName(String name) {
		this.name = name;
	}
	public void ShowMP() {
		System.out.println("MP: "+MP);
	}
	public void setMP(int mP) {
		MP = mP;
	}
	public void Bark () {
		if(name==null) {
			System.out.println("Xin lỗi bạn chưa điền tên...");
			return;
		}
		System.out.println(name+" sủa");
		MP=MP-20;
	}
}
