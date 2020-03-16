import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner userInput = new Scanner(System.in);
        boolean runAgain = false;
        boolean exitLoop = false;


        do {

            System.out.println("Enter a name, try to find two specific names.");
            String name = userInput.nextLine();

            switch (name) {
                case "Alice":
                    System.out.println("Welcome Alice");
                    exitLoop = true;
                    break;
                case "Bob":
                    System.out.println("Welcome Bob");
                    exitLoop = true;
                    break;
                default:
                    System.out.println("Try a different name");
                    runAgain = true;
                    break;
            }
            if (exitLoop) {
                break;
            }
        } while (runAgain);
//        if (name.equals("Alice")) {
//            System.out.println("Welcome " + name);
//        } else if (name.equals("Bob")) {
//            System.out.println("Welcome " + name);
//        } else {
//            System.out.println("Try a different name.");
//        }

    }
}
