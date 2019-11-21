package Bai2;

public class Vehicle {
	public String Nhanhieu;
	public int Namsx;
	public String Hang;
	public Vehicle() {
		super();
	}
	
	public Vehicle(String nhanhieu, int namsx, String hang) {
		super();
		Nhanhieu = nhanhieu;
		Namsx = namsx;
		Hang = hang;
	}

	public String getNhanhieu() {
		return Nhanhieu;
	}
	public void setNhanhieu(String nhanhieu) {
		Nhanhieu = nhanhieu;
	}
	public int getNamsx() {
		return Namsx;
	}
	public void setNamsx(int namsx) {
		Namsx = namsx;
	}
	public String getHang() {
		return Hang;
	}
	public void setHang(String hang) {
		Hang = hang;
	}
	
}
