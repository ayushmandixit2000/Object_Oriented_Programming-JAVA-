public class Circle
{
    private double rad;  // radius of circle
    private static final double PI = 3.14159;
    // constructor 
    public Circle(){
        this(1.0);
    }
    public Circle( double rad) {
        this.rad = rad;
    }
    // mutator method - set radius 
    public void setRadius (double rad){
        this.rad = rad;
    }
    // accessor method
    public double getRadius(){
        return rad ;
    }
    // calculate area
    public double area(){
        return PI * (this.rad * this.rad);
    }
    // calculate perimeter
    public double circumference(){
        return 2 * PI * this.rad;
    }
    // print area
    public void printArea(){
        System.out.println(" Area is " + this.area() );
    }
    //print circumference
    public void printCircumference(){
        System.out.println(" Circumference is " + this.circumference() );
    }
}

