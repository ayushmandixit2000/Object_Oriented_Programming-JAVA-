import java.util.Scanner;

public class DiceApp {
    public static void main ( String[] args ){
        dice dicenew = new dice(1); //default values set to 1.0
        Scanner inputs = new Scanner(System.in);
        while(true){
            System.out.println("Press any key to roll dice");
            inputs.nextLine();
            dicenew.setDiceValue();
            int value = dicenew.getDiceValue();
            System.out.println("Current Value is " + value );
            int summ = dicenew.getSum();
            System.out.println("Current Sum is " + summ );
    
        }
    }
    
}