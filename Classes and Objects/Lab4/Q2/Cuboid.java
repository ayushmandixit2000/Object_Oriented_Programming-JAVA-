package Q2;

public class Cuboid extends Rectangle implements threedim {

	private int height;
	
	public Cuboid(int length, int breadth, int height) {
		super(length, breadth);
		this.height = height;
	}
	
	public double volume() {
		return super.getLength() * super.getBreadth() * this.height;
	}

	public double surfacearea() {
		return super.getBreadth() * super.getLength() *2 + super.getBreadth()*height*2+ super.getLength()*height*2;
	}
}