package Q2;

public class Triangle implements Shape{

    private int base;
    private int height;
    

    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
        
    }

    public int getBase(){
        return this.base;
    }

    public int getHeight(){
        return this.height;
    }
    
    public void setBase(int base){
        this.base = base;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public double area(){
        return (this.height * this.base *0.5);
    }
}