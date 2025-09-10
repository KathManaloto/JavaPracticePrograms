//This program will calculate the area of a circle
package formulas.areaCalculator;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaOfCircle{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("This program will calculate the area of a circle...\n");
        System.out.print("What is the radius of the circle? ");

        double radius = Double.parseDouble(sc.nextLine());
        double area   = Math.PI * radius * radius;

        System.out.println("Area of the Circle: " + df.format(area));

        sc.close();
    }
}