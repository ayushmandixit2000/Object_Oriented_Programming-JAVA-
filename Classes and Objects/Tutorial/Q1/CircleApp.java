import java.util.Scanner;

public class CircleApp {
    public static void main ( String[] args ){
        Circle circ = new Circle(1.0); //default values set to 1.0
        loop: while(true){
            System.out.println("==== Circle Computation =====");
            System.out.println("|1.  Create a new circle    |");
            System.out.println("|2.  Print Area             |");
            System.out.println("|3.  Print Circumference    |");
            System.out.println("|4.  Quit                   |");
            System.out.println("=============================");
            System.out.println(" Choose Option (1-3)");
            Scanner inputs = new Scanner(System.in);
            int inputNum = inputs.nextInt();
        
            switch (inputNum){
                case 1: 
                    System.out.println("Enter the radius to cpmute the area and circumference"); //copy object if you want to retain previous circle
                    double radiusC = inputs.nextInt();
                    circ.setRadius(radiusC);
                    System.out.println(" A new circle has been created ");
                    System.out.println(" Choose Option (1-3)");
                    break;

                case 2: 
                    System.out.println("Area of Circle");
                    double rad = circ.getRadius();
                    System.out.println("Radius: " + rad);
                    float area1 = (float)circ.area();
                    System.out.println("Area: " + area1);
                    System.out.println(" Choose Option (1-3)");
                    break;

                case 3:
                    System.out.println("Circumference of Circle");
                    double radi = circ.getRadius();
                    System.out.println("Radius: " + radi);
                    float circum = (float)circ.circumference();
                    System.out.println("Circumference: " + circum);
                    System.out.println(" Choose Option (1-3)");
                    break;

                case 4:
                    System.out.println("Thank you");
                    break loop;

                default:
                    System.out.println("iNVALID INPUT");

            }

    
        }
    
    }

    
}