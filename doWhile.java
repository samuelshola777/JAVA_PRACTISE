package Assignment;

import java.util.Scanner;

//import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean again = false;
        int sam = 1;
        do {
            System.out.println("enter number to calculate");
            int goat = input.nextInt();
            System.out.println("enter second number to calculate");
            int sheep = input.nextInt();

            int sum = goat + sheep;
            System.out.println(sum + " \n\n " + "will you like to go again?" + " \n"+"\n "+"if yes enter 1"+"\n" + " \n"+"if not enter 0");
            int sambone = input.nextInt();
            if (sambone == 0) {
                break;
            } else {
                again = true;
            }
        } while (again);
    }
}
