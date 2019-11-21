package Bai2;

public class Moto extends Vehicle {
	public int Pk;

	public Moto() {
		super();
	}

	public Moto(String nhanhieu, int namsx, String hang, int pk) {
		super(nhanhieu, namsx, hang);
		Pk = pk;
	}

	public int getPk() {
		return Pk;
	}

	public void setPk(int pk) {
		Pk = pk;
	}

	@Override
	public String toString() {
		return "Moto [Pk=" + Pk + ", Nhanhieu=" + Nhanhieu + ", Namsx=" + Namsx + ", Hang=" + Hang + "]";
	}
	
}
