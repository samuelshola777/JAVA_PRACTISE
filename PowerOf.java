package Assignment;

import java.util.Scanner;

public class PowerOf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            System.out.println("enter your number");
            int num = input.nextInt();
            System.out.println("raise to power what");
            int raise = input.nextInt();
 int powerOf =num;
        int counter = 1;
   //     int power = 0;
        while (counter < raise) {

            powerOf = powerOf * num;
            counter++;
        }
            System.out.println(powerOf);
    }
}