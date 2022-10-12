package Q2;

public class Pyramid extends Triangle implements threedim {

	public Pyramid(int base, int height) {
		super(base, height);
	}
	
	public double volume() {
		return (1.0 / 3.0) *super.getBase() * super.getBase() * super.getHeight();
	}


	public double surfacearea() {
		return super.getBase() * super.getBase() + 2*super.getBase()*Math.sqrt(super.getBase()*0.5 * super.getBase() *0.5 + super.getHeight()*super.getHeight());
	}
}