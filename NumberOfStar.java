package Assignment;

import java.util.Scanner;

public class NumberOfStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of stars");
        int ghost = input.nextInt();

        for (int counter = 1; counter < ghost; counter++) {
            for (int sam = 1; sam < counter; sam++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}