//This program will calculate the area of a square
package formulas.areaCalculator;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaOfSquare {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("This program will calculate the area of a square...\n");

        System.out.print("Enter the value of the side of square: ");
        float side = Float.parseFloat(sc.nextLine());

        //calculate the area
        float area = side * side;

        System.out.println("Area of the Square: " + df.format(area));
        sc.close();
    }
}