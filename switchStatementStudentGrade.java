package Assignment;

import java.util.Scanner;

public class switchStatementStudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;



        for (int counter = 0; counter < 5; counter++) {
            System.out.println("please enter grade");
            String grade = input.nextLine();
            switch (grade) {
                case "A":
                    gradeA++;
                    break;
                case "B":
                    gradeB++;
                    break;
                case "c":
                    gradeC++;
                    break;
                default:
                    gradeD++;
                    break;
            }
        }
            System.out.println("gradeA is" + "  " + gradeA + "\n  " +
                    "gradeB is"+" "+ gradeB + " \n " + "gradeC is  "+" "
                    + gradeC + "\n " + "gradeD is " + gradeD);
    }
}


