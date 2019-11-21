package Bai3;

public class SinhVien extends Nguoi {
	public int code;
	public String nganh;
	public int khoa;
	public SinhVien(String hoten, String ngaysinh, String quequan, int code, String nganh, int khoa) {
		super(hoten, ngaysinh, quequan);
		this.code = code;
		this.nganh = nganh;
		this.khoa = khoa;
	}
	public SinhVien() {
		super();
	}
	@Override
	public void nhap() {
		System.out.print("Nhập mã sv: ");
		this.code=in.nextInt();
		System.out.print("Nhập họ tên: ");
		in.nextLine();
		this.Hoten=in.nextLine();
		System.out.print("Nhập ngày sinh: ");
		this.Ngaysinh=in.nextLine();
		System.out.print("Nhập quê quán: ");
		this.Quequan=in.nextLine();
		System.out.print("Nhập ngành: ");
		this.nganh=in.nextLine();
		System.out.print("Nhập khóa: ");
		this.khoa=in.nextInt();
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public int getKhoa() {
		return khoa;
	}
	public void setKhoa(int khoa) {
		this.khoa = khoa;
	}
	@Override
	public String toString() {
		return ".[Mã sv=" + code + ", Họ tên=" + Hoten + ", Ngành=" + nganh + ", Khóa=" + khoa 
				+ ", Ngày sinh=" + Ngaysinh + ", Quê quán=" + Quequan + "]";
	}
	
}
