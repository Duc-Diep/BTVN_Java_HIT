package Bai4;

public class CustomerPhone {
	private String name;
	private int age;
	private String phone;
	
	public CustomerPhone() {
		super();
	}

	public CustomerPhone(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void ShowInfo() {
		System.out.println("[Tên=" + name + ", Tuổi=" + age + ", Phone=" + phone + "]");
	}
	
}
