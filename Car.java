package Assignment;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {

        int sam = 0;
        Scanner input = new Scanner(System.in);
       boolean counter = true;
        int track = 0;

        while (counter == true) {
            System.out.println("enter mile driven");
            int mile = input.nextInt();
            System.out.println("enter gallon ");
            int gallon = input.nextInt();
            double perGallo = mile/ gallon;
            System.out.println("mile driven is"+"  "+mile);
            System.out.println("gallon used is"+" "+ gallon);
            System.out.println("The gallon per trip is  " +" "+ perGallo);

            System.out.println("do you have another trip to calculate? if yes enter number else 00");
            int stop = input.nextInt();

            track += perGallo;


            if (stop == 00){
                break;

            }else continue;

        }

        System.out.println("history of your calculation "+track);




    }

}