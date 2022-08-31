import java.util.Scanner;

import javax.swing.text.Position;

import java.util.Random;

public class Lab2p1 {
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: mulTest();
                    break;
                case 2: Scanner inputs = new Scanner(System.in);
                    System.out.print("m = ");
                    int m = inputs.nextInt();
                    System.out.print("n = ");
                    int n = inputs.nextInt();
                    int quotient =divide(m,n);
                    System.out.println(m + "/" + n + " = " + quotient);
                    break;
                case 3: Scanner inputs1 = new Scanner(System.in);
                    System.out.print("m = ");
                    int k = inputs1.nextInt();
                    System.out.print("n = ");
                    int l = inputs1.nextInt();
                    int modulus1 =modulus(k,l);
                    System.out.println(k + "%" + l + " = " + modulus1);
                    break;
                case 4: Scanner inputs2 = new Scanner(System.in);
                    System.out.print("n : ");
                    String a = inputs2.nextLine();
                    try {  
                        Integer.parseInt(a);  
                      } catch(NumberFormatException e){  
                        System.out.println("Error Input!!");
                        break; 
                      }  
                    int i = Integer.parseInt(a);
                    if (i<0){
                        System.out.println("Error Input!!");
                        break;
                    }
                    int d = countDigits(i);
                    System.out.println("n : " + i + " - count = " + d);
                    break;
                case 5:
                    Scanner inputs3 = new Scanner(System.in);
                    System.out.print("n : ");
                    int s = inputs3.nextInt();
                    System.out.print("Digit: ");
                    int digit = inputs3.nextInt();
                    int pos = position(s, digit);
                    System.out.println("postion = " + pos);
                    break;
                case 6:
                    Scanner inputs4 = new Scanner(System.in);
                    System.out.print("n : ");
                    long f = inputs4.nextLong();
                    if (f<0){
                        System.out.println("Error Input!!");
                        break;
                    }
                    long g = extractOddDigits(f);
                    System.out.println("oddDigits = " + g);
                    break;
                case 7: System.out.println("Program terminating ….");
            }
        } while (choice < 7);
    }
    public static void mulTest(){
        Scanner inputs = new Scanner(System.in);
        int correct = 0;
        for (int i = 0; i < 5; i++){
            Random rand = new Random();
            int num1 = rand.nextInt(10); 
            int num2 = rand.nextInt(10);
            System.out.println("How much is " + num1 + " times " + num2 + "?");
            int answer = inputs.nextInt();
            if(answer == num1 * num2){
                correct++;
            }
        }
        System.out.println(correct + " out of 5 answers are correct");

    }

    public static int divide(int m, int n){
        int quotient = 0;
        while(m>=n){
            m = m - n;
            quotient++;
        }
        return quotient;
    }

    public static int modulus(int m, int n){
        int quotient = 0;
        while(m>=n){
            m = m - n;
            quotient++;
        }
        return m;
    }

    public static int countDigits(int n){
        int d = String.valueOf(n).length();
        return d;
    }

    public static int position(int n, int digit){
        String num = Integer.toString(n);
        String dig = Integer.toString(digit);
        String rev = "";
        char ch;
        for (int i=0; i<num.length(); i++) {
            ch= num.charAt(i); //extracts each character
            rev= ch+rev;
        }
        int pos = 0;
        for(int i = 0; i<num.length(); i++){
            if(rev.charAt(i)==dig.charAt(0)){
                pos = i + 1;
                break;
            }
            else{
                pos = -1;
            }
        }
        return pos;
    }

    public static long extractOddDigits(long n){
        String string_n = Long.toString(n);
        String oddn = "";
        for (int i = 0; i < string_n.length(); i++){
            char c = string_n.charAt(i);
            int t = Character.getNumericValue(c);
            if (t%2 != 0){
                oddn = oddn + t;
            }
        }
        if (oddn.length() == 0){
            oddn = "-1";
        }
        long final_n = Long.parseLong(oddn);
        return final_n;
    }
}