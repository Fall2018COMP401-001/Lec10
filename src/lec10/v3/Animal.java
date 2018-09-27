package lec10.v3;

public interface Animal {
	
	int getID();
	Point3D getLocation();
	void move(Point3D destination);
	void speak();
}
