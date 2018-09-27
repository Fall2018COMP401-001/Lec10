package lec10.v6;

public class PolarBear extends BearImpl {

	PolarBear(int id, Point3D location) {
		super(id, location);
	}
		
	public String getColor() {
		return "white";
	}

}
