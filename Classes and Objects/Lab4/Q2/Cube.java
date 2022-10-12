package Q2;

public class Cube extends Square implements threedim {
		
	public Cube(int length) {
		super(length);
	}
	
	public double volume() {
		return super.getLength() * super.getLength() * super.getLength();
	}

	public double surfacearea() {
		return super.getLength() * super.getLength() * 6;
	}
}