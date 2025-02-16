// Kaden Jain
// Computer Programming 1 - Spring 2025
/* As people pass through an entry kiosk at the theater,
they are prompted to enter their age. If they are 21 or
older, they get a paper wristband. Code a logic program
that asks the user to enter their age and then if they are
21 or over displays a message that they get a wristband.
Note that the program does nothing if they are not 21 or over…
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // declare variables
        Scanner in = new Scanner(System.in);
        int userAge = 0;
        String trash = "";

        // input validation if/else
        System.out.println("Welcome to the theater! Please enter your age in years: ");
        if (in.hasNextInt()) {
            userAge = in.nextInt();
            in.nextLine();

            // determine age if/else
            if (userAge >= 21){

                System.out.println("You are 21 or older. You get a wristband.");

            }
            else {

                System.out.println("Thank you, please proceed.");

            }

        }
        else {
            trash = in.nextLine();
            System.out.println("You entered an invalid input: " + trash);
            System.out.println("Please run the program again");
            System.exit( 0);
        }

    }
}