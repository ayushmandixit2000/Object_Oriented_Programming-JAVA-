package Q2;

public class Sphere extends Circle implements threedim{

	public Sphere(int radius) {
		super(radius);
	}
	
	public double volume() {
		return (4.0 / 3.0) * Math.PI * super.getRadius() * super.getRadius() * super.getRadius();
	}

	public double surfacearea() {
		return 4 * Math.PI * super.getRadius() * super.getRadius();
	}
}
