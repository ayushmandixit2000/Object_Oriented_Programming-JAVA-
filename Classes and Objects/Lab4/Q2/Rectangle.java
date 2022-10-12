package Q2;

public class Rectangle implements Shape{

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(){
        return this.length;
    }

    public int getBreadth(){
        return this.breadth;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setBreadth(int breadth){
        this.breadth = breadth;
    }

    public double area(){
        return this.length * this.breadth;
    }

}
