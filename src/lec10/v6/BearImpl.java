package lec10.v6;

abstract public class BearImpl extends AnimalImpl implements Bear {

	BearImpl(int id, Point3D location) {
		super(id, location);
	}
	
	abstract public String getColor();

	private void lumber(Point3D destination) {
		System.out.println(getID() + " is lumbering to " + destination.toString());
	}

	private void trek(Point3D destination) {
		System.out.println(getID() + " is trekking to " + destination.toString());
	}

	@Override
	public void move(Point3D destination) {
		if (destination.getZ() > 0) {
			throw new RuntimeException("Bears can't fly");
		}
		
		if (getLocation().distanceTo(destination) < 10) {
			lumber(destination);
		} else {
			trek(destination);
		}
		super.move(destination);
	}
	
	public void speak() {
		System.out.println(getID() + " says 'Growl!'");
	}


}
