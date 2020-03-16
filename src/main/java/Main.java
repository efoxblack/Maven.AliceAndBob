import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    static int counter = 1;
    public static void main(String[] args ){
        Scanner userInput = new Scanner(System.in);
        boolean runAgain = false;
        boolean exitLoop = false;


        do {

            System.out.println("Enter a name, try to find two specific names.");
            String name = userInput.nextLine();

            if (name.equalsIgnoreCase("Alice")) {
                System.out.println("Welcome " + name);
                exitLoop = true;
            } else if (name.equalsIgnoreCase("Bob")) {
                System.out.println("Welcome " + name);
                exitLoop = true;
            } else {
                System.out.println("This is your #" + counter + " try.");
                counter++;
                runAgain = true;
            }

            if (exitLoop) {
                break;
            }
        } while (runAgain);

//        switch (name) {
//                case name.equalsIgnoreCase("Alice"):
//                    System.out.println("Welcome Alice");
//                    exitLoop = true;
//                    break;
//                case name.equalsIgnoreCase("Bob"):
//                    System.out.println("Welcome Bob");
//                    exitLoop = true;
//                    break;
//                default:
//                    System.out.println("This is your #" + counter + " try.");
//                    counter++;
//                    runAgain = true;
//                    break;
//            }

    }
}
