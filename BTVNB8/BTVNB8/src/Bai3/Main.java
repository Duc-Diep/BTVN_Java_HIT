package Bai3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Nhập thông tin của lớp học
		
		System.out.println("Nhập thông tin lớp học: ");
		System.out.print("Nhập mã lớp: ");
		int newcode = in.nextInt();
		System.out.print("Nhập tên lớp: ");
		in.nextLine();
		String newname = in.nextLine();
		System.out.print("Nhập ngày mở: ");
		String newwdate=in.nextLine();
		System.out.print("Nhập giáo viên: ");
		String newteacher = in.nextLine();
		System.out.print("Nhập số sinh viên: ");
		int number =in.nextInt();
		SinhVien[] sv = new SinhVien[number];
		for(int i=0;i<sv.length;i++) {
			System.out.println("Nhập thông tin sv thứ "+(i+1));
			sv[i]=new SinhVien();
			sv[i].nhap();
		}
		LopHoc hi = new LopHoc(newcode, newname, newwdate, newteacher, number, sv);
		//Hiển thị thông tin của lớp học
		
		System.out.println("Thông tin của lớp học: ");
		System.out.println("Mã lớp học: "+hi.MaLH);
		System.out.println("Tên lớp: "+hi.TenLH);
		System.out.println("Ngày mở: "+hi.NgayMo);
		System.out.println("Giáo viên: "+hi.GiaoVien);
		System.out.println("Danh sách sinh viên trong lớp: ");
		int count=1;
		for(SinhVien x : sv ) {
			System.out.println(count+x.toString());
			count++;
		}
		//Kiểm tra xem có bao nhiêu sv khóa 11
		int countsv=0;
		for(int i=0;i<sv.length;i++) {
			if(sv[i].khoa==11) {
				countsv++;
			}
		}
		System.out.println("Có "+countsv+" sinh viên khóa 11");
		//Sắp xếp danh sách sv theo chiều tăng dần của khóa học
		SinhVien temp = new SinhVien();
		for(int i=0;i<sv.length;i++) {
			for(int j=i+1;j<sv.length;j++) {
				if(sv[i].khoa>sv[j].khoa) {
					temp = sv[i];
					sv[i]=sv[j];
					sv[j]=temp;
				}
			}
		}
		//Hiển thị lại danh sách
		System.out.println("Danh sách sinh viên sau khi sắp xếp: ");
		count=1;
		for(SinhVien x : sv ) {
			System.out.println(count+x.toString());
			count++;
		}
	}

}
