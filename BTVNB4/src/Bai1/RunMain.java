package Bai1;

public class RunMain {

	public static void main(String[] args) {
		Person Son = new Person();
		Person Tu = new Person();
		Son.setAge(20);
		Son.setHobby("Play game");
		Son.setName("Son");
		Son.setSex("Nam");
		Tu.setAge(20);
		Tu.setHobby("Play game");
		Tu.setName("Tu");
		Tu.setSex("Nam");
		System.out.println(Son.toString());
		System.out.println(Tu.toString());
	}

}
