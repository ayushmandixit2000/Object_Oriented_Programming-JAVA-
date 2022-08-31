import java.util.Random;

public class dice
{
    private int num;
    private static int sum = 0; 
    
    public dice(int num) {
        this.num = num;
    }
    public void setDiceValue (){
        Random rand = new Random();
        int num = rand.nextInt(5); 
        num += 1;
        this.num = num;
        this.sum = sum + num;
    }
    // accessor method
    public int getDiceValue(){
        return num ;
    }
    // print value
    public void printDiceValue(){
        System.out.println(" Value is " + this.getDiceValue() );
    }

    public int getSum(){
        return sum;
    }

}

