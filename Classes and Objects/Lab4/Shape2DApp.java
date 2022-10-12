


import java.util.Scanner;

import Q2.*;


public class Shape2DApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int NoShapes = 0;
        int x;
        int y;
        double totalArea = 0;

        System.out.print("Please key in the number of shapes: ");
        NoShapes = sc.nextInt();
            for(int i = 0; i < NoShapes; i++){
                x = 0;
                System.out.println("Select Shape : ");
                System.out.println("1 for Circle \n2 for Rectangle \n3 for Square \n4 for Triangle");
                do{
                    x = sc.nextInt();
                    switch(x){
                        case 1:
                        System.out.print("Enter radius: ");
                        int radius = sc.nextInt();
                        Circle userCircle = new Circle(radius);
                        totalArea += userCircle.area();
                        break;
    
                        case 2:
                        System.out.print("Enter length: ");
                        int length = sc.nextInt();
                        System.out.print("Enter breadth: ");
                        int breadth = sc.nextInt();
                        Rectangle userRect = new Rectangle(length, breadth);
                        totalArea += userRect.area();
                        break;
    
                        case 3:
                        System.out.print("Enter length: ");
                        int side = sc.nextInt();
                        Square userSquare = new Square(side);
                        totalArea+= userSquare.area();
                        break;

                        case 4:
                        System.out.print("Triangle Chosen. Enter base: ");
                        int base = sc.nextInt();
                        System.out.print("Enter height: ");
                        int height = sc.nextInt();
                        Triangle userTriangle = new Triangle(base, height);
                        totalArea+= userTriangle.area();
                        break;

                        default:
                        x = 0;
                    }
                }
                while(x == 0);
            }

            System.out.printf("The total area of the shape is %f.", totalArea).println();
        sc.close();
        System.out.println("End of program.");
    }
    
}
