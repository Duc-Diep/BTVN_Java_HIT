package Bai1;

public class RunMain {


	public static void main(String[] args) {
		ConHeo Doan1 =new ConHeo();
		ConHeo Doan2 = new ConHeo(3);
		ConHeo Doan3 = new ConHeo("Doan");
		ConHeo Doan4 = new ConHeo("Doan", 40);
		ConHeo Doan5 = new ConHeo("Doan", 40, 19);
		System.out.println(Doan1.toString()+Doan2.toString()+Doan3.toString()+Doan4.toString()+Doan5.toString());
		
	}

}
