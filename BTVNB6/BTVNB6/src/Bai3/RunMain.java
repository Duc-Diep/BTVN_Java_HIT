package Bai3;

public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] c = new Member[4];
		c[0]= new Member("Doan", 60, 1);
		c[1]= new Member("Khánh", 60, 1);
		c[2]= new Member("Điệp", 60, 0);
		c[3] = new Member("Linh", 60, 0);
		Leader a = new Leader("Anh Sơn", 23, 60);
		Support b = new Support("Anh Tú", 23, c);
		
		Club HIT = new Club(a, b, c);
		HIT.ShowInfo();
	}

}
