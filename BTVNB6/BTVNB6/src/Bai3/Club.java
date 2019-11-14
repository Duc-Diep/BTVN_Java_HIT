package Bai3;

public class Club {
	private Leader A;
	private Support B;
	private Member[] C;
	
	public Club(Leader a, Support b, Member[] c) {
		super();
		A = a;
		B = b;
		C = c;
	}

	public void ShowInfo() {
		A.ShowInfo();
		B.ShowInfo();
		System.out.println();
		int i=1;
		System.out.println("Danh sach thanh vien: ");
		for(Member m : C) {
			System.out.print(i);
			m.ShowInfo();
			i++;
		}
	}
}
