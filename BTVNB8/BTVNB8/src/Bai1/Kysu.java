package Bai1;

import java.util.Scanner;

public class Kysu extends Person {
	Scanner in = new Scanner(System.in);
	public String Nganh;
	public int NamTN;
	public Kysu(String hoten, String ngaysinh, String quequan, String nganh, int namTN) {
		super(hoten, ngaysinh, quequan);
		Nganh = nganh;
		NamTN = namTN;
	}
	public Kysu() {
		super();
	}
	public void nhap() {
		System.out.print("Nhập họ tên: ");
		this.Hoten=in.nextLine();
		System.out.print("Nhập ngày sinh: ");
		this.Ngaysinh=in.nextLine();
		System.out.print("Nhập quê quán: ");
		this.Quequan=in.nextLine();
		System.out.print("Nhập ngành: ");
		this.Nganh=in.nextLine();
		System.out.print("Nhập năm TN: ");
		this.NamTN=in.nextInt();
	}
	@Override
	public String toString() {
		return ".[Nganh=" + Nganh + ", NamTN=" + NamTN + ", Hoten=" + Hoten + ", Ngaysinh="
				+ Ngaysinh + ", Quequan=" + Quequan + "]";
	}
	
}
