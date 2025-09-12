// Distance Converter: km <-> miles
package converter.distance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KilometersToMiles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nThis program will convert distance in kilometers to miles and vice-versa.");

        boolean keepRunning = true;
        while (keepRunning) {
            try {
                System.out.print("Select your preferred option: \n1 - km to miles \n2 - miles to km \n0 - Exit\nUnit to convert: ");
                int choice = input.nextInt();
                double km;
                double miles;

                switch (choice) {
                    case 1:
                        System.out.print("\nDistance in km: ");
                        km = input.nextDouble();
                        if (km >= 0) {
                            miles = km / 1.6;
                            System.out.println("Distance in miles: " + miles + "\n");
                        } else {
                            System.out.println("\nPlease enter a valid distance!");
                        }
                        break;

                    case 2:
                        System.out.print("\nDistance in miles: ");
                        miles = input.nextDouble();
                        if (miles >= 0) {
                            km = miles * 1.6;
                            System.out.println("Distance in km: " + km + "\n");
                        } else {
                            System.out.println("\nPlease enter a valid distance!");
                        }
                        break;

                    case 0:
                        System.out.println("Exiting program...");
                        keepRunning = false;
                        break;

                    default:
                        System.out.println("\nInvalid choice! Please input 1, 2, or 0 to exit.");
                }

            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input! Please enter numbers only.");
                input.nextLine(); // clear wrong input
            }
        }

        input.close();
    }
}
