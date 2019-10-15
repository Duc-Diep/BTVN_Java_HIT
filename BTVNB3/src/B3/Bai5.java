package B3;

import java.math.BigInteger;
import java.util.Scanner;

public class Bai5 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Nhập A: ");
	String a = in.nextLine();
	System.out.print("Nhập B: ");
	String b = in.nextLine();
	BigInteger s1 = new BigInteger(a);
	BigInteger s2 = new BigInteger(b);
	BigInteger c = s1.add(s2);
	System.out.println("C="+c);
}
}
