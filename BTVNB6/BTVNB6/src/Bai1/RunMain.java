package Bai1;

public class RunMain {


	public static void main(String[] args) {
		ConHeo[] x= new ConHeo[5];
		x[0]= new ConHeo("A", 10, 0);
		x[1]= new ConHeo("B", 20, 1);
		x[2]= new ConHeo("C", 30, 2);
		x[3]= new ConHeo("D", 40, 3);
		x[4]= new ConHeo("E", 50, 4);
		int i=1;
		for(ConHeo hi: x) {
			System.out.println(i+hi.toString());
		}
	}

}
