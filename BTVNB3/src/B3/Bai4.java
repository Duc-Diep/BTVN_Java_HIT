package B3;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String s = in.nextLine();
		if (test(s)) {
			System.out.println("Yes");
		} else
			System.out.println("No");
	}

	public static boolean test(String s) {
		int h = s.indexOf('h');
		int e = s.indexOf('e', h + 1);
		int l1 = s.indexOf('l', e + 1);
		int l2 = s.indexOf('l', l1 + 1);
		int o = s.indexOf('o', l2 + 1);
		if (h != -1 && e != -1 && l1 != -1 && l2 != -1 && o != -1) {
			return true;
		} else
			return false;
	}
}
