package Assignment;

import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {

                System.out.println("WELCOME TO YOUR NOKIA 33:10,\n" +
                        "press: 1 for phone book \n" +
                        "press: 2 for messages\n" +
                        "press: 3 for chat\n" +
                        "press: 4 for call register\n" +
                        "press: 5 for tone \n" +
                        "press: 6 for settings\n" +
                        "press: 99 to switch off phone");
                int phone = input.nextInt();
if (phone == 99){
    break;
}

                switch (phone) {

                    case 1:
                        System.out.println("*PHONE\n\n" +
                                "1: Search " +
                                "\n2: Service Nos. " +
                                "\n3: Add name " +
                                "\n4: Erase \n5: Edit\n6:Assign tone\n7:Send b'card\n8: Option \n   1. type of view\n" +
                                "   2.Memory status  " +
                                "\n9: Speed dials\n10: Voice tags\n\npress: 90  to go back to main menu ");

                                int responds = input.nextInt();
                                if ( responds == 90){
                                    continue;
                                }


                    case 2:
                        System.out.println("*MESSAGE\n\n" +
                                "1: Write messages:" +
                                "\n2: Inbox\n3: Outbox" +
                                "\n4: Picture messages\n" +
                                "5: Templates\n6: Smileys\n7: Message settings" +
                                "\n  1.Set 1*" +
                                "\n     1.Message centre number    " +
                                " \n     2.Message sent as\n     " +
                                "3.Message validity\n  " +
                                "2. Common\n     1. Delivery reports" +
                                "\n     2. Reply via same centre\n     " +
                                "3. Character support\n8: Info service\n" +
                                "9: Voice mailbox number\n" +
                                "10: Service command editor\n\npress 90: to go back to the main menu");
int sam = input.nextInt();
if (sam == 90){
    continue;
}
                    case 3:
                        System.out.println("CHAT\n\nService unavaliabe......." +
                                "\n\n press: 90 to go back to the main menu ");
                        int rat = input.nextInt();
                        if (rat == 90){
                            continue;
                        }

                    case 4:
                        System.out.println("*CALL REGISTER\n\n1: Missed calls " +
                                "\n2: Received calls\n3: Dialled number" +
                                "\n4: Erase recent call lists\n" +
                                "5: Show call duration" +
                                "\n   1. Last call duration\n   " +
                                "2. All call's duration\n   3. Received call's duration" +
                                "\n   4. Dialled call's duration\n" +
                                "   5. Clear timers \n6: Show call costs" +
                                "\n   1. Last call cost\n   2. All calls' cost" +
                                "\n   3. Call counters\n7: Call cost settings\n" +
                                "   1. call cost limit\n   2.Show costs in\n8: prepaid credit" +
                                "\n\n press: 90 to go back to the main menu ");
                        int goat = input.nextInt();
                        if (goat == 90){
                            continue;
                        }



                    case 5:
                        System.out.println("*Tones\n1: Ringing tone" +
                                "\n2: Ringing Volume\n3: Incoming call alert \n4: Composer " +
                                "\n5: Message alart tone\n6: Keypad tones\n7: Warning and game tones\n" +
                                "8: Vibrating alert\n9: Screen saver" +
                                "\n\n press: 90 to go back to the main menu");
                        int yellow = input.nextInt();
                        if (yellow == 90){
                            continue;
                        }



                    case 6:
                        System.out.println("*Settings \n1: Call setting\n   " +
                                "1. Automatic redial\n   2. Speed dialling\n   3. Call waiting options" +
                                "\n   4. Own number sending\n   5. Phone line in use\n" +
                                "   6. Automatic answer\n2: Phone settings\n   " +
                                "1. Language\n   2. Cell info display\n  " +
                                " 3. Welcome note\n   4. Network selection\n   5. Lights\n   6. Confirm SIM service actions\n" +
                                "3: Security settings\n   1. Pin code request\n " +
                                "  2. Call barring service\n   3. Fixed dialling\n   " +
                                "4. Closed user  group\n   5. Phone security\n   6. Change access codes\n4: Restore factory settings\n" +
                                "   7. Call divert\n   8. Games\n   9. Calculator\n   10. Reminders\n  " +
                                " 11. Clock\n    1. Alarm clock\n    2. Clock settings\n    3. Date setting\n    " +
                                "4. Stopwatch\n    5. Countdown timer\n    6. Auto update" +
                                "and time\n   12. Profiles\n   13. SIM services\n" +
                                "\n\n press: 90 to go back to the main menu ");
                        int daf = input.nextInt();
                        if (daf == 90){
                            continue;
                        }
                    case 99:
                        break;





                    default:

                }



            }
        }
    }
