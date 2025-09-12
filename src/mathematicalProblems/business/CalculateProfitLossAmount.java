//Calculate Profit and Loss Amount
package mathematicalProblems.business;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateProfitLossAmount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nThis program will calculate the shop's profit/loss amount.");

        try {
            System.out.print("Enter selling price: ");
                double sellingPrice = input.nextDouble();
            System.out.print("Enter cost price: ");
                double costPrice = input.nextDouble();

            double profitLoss = sellingPrice - costPrice;
            System.out.println("Profit/Loss amount of the shop: " + profitLoss);

        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid input.");
        }

        input.close();
    }
}
