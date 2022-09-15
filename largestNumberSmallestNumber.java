package Assignment;

import java.util.Scanner;

public class largestNumberSmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int minNum = 0;
        int maxNum = 0;

        while (counter > 0) {
            System.out.println("enter a random number" + " " + "or enter 00 to exit ");
            int reciever = input.nextInt();

            if (reciever == 00) {

                break;
            }


            if (counter == 1) {
                minNum = reciever;
                maxNum = reciever;
            } else {
                if (reciever < minNum){
                    minNum = reciever;
                }
                if (reciever >  maxNum) {
                    maxNum = reciever;
                }
            }

            counter++;
        }
        System.out.println("you higher number is "+" "+maxNum);
        System.out.println("your lowest number is"+" "+minNum);

    }
}