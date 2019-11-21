package Bai1;

public class ConHeo {
	private String name;
	private float weight;
	private int age;
	
	public ConHeo() {
		super();
	}
	
	public ConHeo(int age) {
		super();
		this.age = age;
	}

	public ConHeo(String name, float weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public ConHeo(String name) {
		super();
		this.name = name;
	}

	public ConHeo(String name, float weight, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", weight=" + weight + ", age=" + age + "]\n";
	}
	
}
