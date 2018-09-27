package lec10.v6;

public interface Animal {
	
	int getID();
	Point3D getLocation();
	void move(Point3D destination);
	void speak();
}