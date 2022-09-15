package Assignment;

import java.util.Scanner;
public class ContinuesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        boolean stop = true;
        int sum;
        while (counter > 0) {


            System.out.println("enter the numer you want to calculate");
            int number1 = input.nextInt();

            System.out.println("enter the second number");
            int number2 = input.nextInt();

            sum = (number1 + number2);
            System.out.println(" ");
            System.out.println(sum + " \n " + "  should we try this again?" +" \n"+ "if yes. enter any number to continue,  else enter 00");
            int end = input.nextInt();

if (end == 00 ){
    break;
}
        }
    }
}
