package Q2;

public class Cone extends Circle implements threedim {

	private int height;
	
	public Cone(int radius, int height) {
		super(radius);
		this.height = height;
	}
	
	public double volume() {
		return (1.0 / 3.0) * Math.PI * super.getRadius() * super.getRadius() * this.height;
	}
	
	public double surfacearea() {
		return Math.PI * super.getRadius() 
				* (super.getRadius() + Math.sqrt(Math.pow(this.height, 2) + Math.pow(super.getRadius(), 2)));
	}
	
}
