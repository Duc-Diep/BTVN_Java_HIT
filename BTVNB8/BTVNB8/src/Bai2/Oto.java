package Bai2;

public class Oto extends Vehicle {
	
	public int Sochongoi;
	public int Dungtich;
	public Oto() {
		super();
	}
	public Oto(String nhanhieu, int namsx, String hang, int sochongoi, int dungtich) {
		super(nhanhieu, namsx, hang);
		Sochongoi = sochongoi;
		Dungtich = dungtich;
	}
	public int getSochongoi() {
		return Sochongoi;
	}
	public void setSochongoi(int sochongoi) {
		Sochongoi = sochongoi;
	}
	public int getDungtich() {
		return Dungtich;
	}
	public void setDungtich(int dungtich) {
		Dungtich = dungtich;
	}
	@Override
	public String toString() {
		return "Oto [Sochongoi=" + Sochongoi + ", Dungtich=" + Dungtich + ", Nhanhieu=" + Nhanhieu + ", Namsx=" + Namsx
				+ ", Hang=" + Hang + "]";
	}
}
