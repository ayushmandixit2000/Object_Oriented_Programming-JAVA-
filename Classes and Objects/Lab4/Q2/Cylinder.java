package Q2;

public class Cylinder extends Circle implements threedim {

	private int height;
	
	public Cylinder(int radius, int height) {
		super(radius);
		this.height = height;
	}
	
	public double volume() {
		return Math.PI * super.getRadius() * super.getRadius() * this.height;
	}
	
	public double surfacearea() {
		return (2 * Math.PI * super.getRadius() * this.height)
				+ (2 * Math.PI * super.getRadius() * super.getRadius());
	}
}

