package Assignment;
    import java.util.Scanner;
public class WhileLoopAndIfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int SamuelShola = 70;

        int counter = 1;



    while (counter > 0){
        System.out.println("try to guess what number i have with me");
        int goat = input.nextInt();

    if (goat < SamuelShola){
        System.out.println("nah. well you tried sha, but your guess is low sha");
        System.out.println(" ");
       }

    else if (goat > SamuelShola) {
            System.out.println("nah!!!!!, you guess is actuall higher than what i have with me");
            System.out.println(" ");

        }

    else if ( goat == SamuelShola  ){
    System.out.println("actuall you're right"+ "let's do this some other time");
           break;
        }
    }
    }


}
