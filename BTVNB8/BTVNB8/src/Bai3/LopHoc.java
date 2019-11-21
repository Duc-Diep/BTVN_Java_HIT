package Bai3;

public class LopHoc {
	public int MaLH;
	public String TenLH;
	public String NgayMo;
	public String GiaoVien;
	int n;
	SinhVien[] x;
	public LopHoc() {
		super();
	}
	public LopHoc(int maLH, String tenLH, String ngayMo, String giaoVien, int n, SinhVien[] x) {
		super();
		MaLH = maLH;
		TenLH = tenLH;
		NgayMo = ngayMo;
		GiaoVien = giaoVien;
		this.n = n;
		this.x = x;
	}
	public int getMaLH() {
		return MaLH;
	}
	public void setMaLH(int maLH) {
		MaLH = maLH;
	}
	public String getTenLH() {
		return TenLH;
	}
	public void setTenLH(String tenLH) {
		TenLH = tenLH;
	}
	public String getNgayMo() {
		return NgayMo;
	}
	public void setNgayMo(String ngayMo) {
		NgayMo = ngayMo;
	}
	public String getGiaoVien() {
		return GiaoVien;
	}
	public void setGiaoVien(String giaoVien) {
		GiaoVien = giaoVien;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public SinhVien[] getX() {
		return x;
	}
	public void setX(SinhVien[] x) {
		this.x = x;
	}
	
	
}
