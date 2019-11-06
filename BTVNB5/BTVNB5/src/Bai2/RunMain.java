package Bai2;

import java.util.Random;
import java.util.Scanner;

public class RunMain {
public static void main(String[] args) {
	Random rd = new Random();
	Scanner in = new Scanner(System.in);
	Knight bot = new Knight();
	System.out.println("Nhập tên bot: ");
	bot.setName(in.nextLine());
	bot.setHP(50+rd.nextInt(50));
	bot.setMP(100+rd.nextInt(50));
	int i=1;
	while(bot.getMP()>=50) {
		bot.Heal();
		System.out.println("Lần "+(i)+" :");
		i++;
		System.out.println(bot.toString());
		if(bot.getMP()<50) {
			System.out.println("không đủ MP để dùng kĩ năng (MP<50) vui lòng nạp thêm tiền để mua :v");
		}
	}
}
}
