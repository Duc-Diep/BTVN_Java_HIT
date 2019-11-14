package Bai1;

public class ConHeo {
	private String name;
	private float weight;
	private int age;
	public ConHeo(String name, float weight, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	@Override
	public String toString() {
		return ".[name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}
	
}
