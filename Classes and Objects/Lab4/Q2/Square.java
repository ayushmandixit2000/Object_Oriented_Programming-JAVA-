package Q2;

public class Square extends Rectangle {

    public Square(int length){
        super(length,length);
    }

    public int getLength(){
        return super.getLength();
    }

    public void setLength(int length){
        super.setLength(length);
        super.setBreadth(length);
    }
    
}

