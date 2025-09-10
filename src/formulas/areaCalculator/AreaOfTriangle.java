//This program will calculate the area of a triangle
package formulas.areaCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("This program will calculate the area of a triangle...\n");

        System.out.print("Base  : ");
        float base = Float.parseFloat(sc.nextLine());

        System.out.print("Height: ");
        float height = Float.parseFloat(sc.nextLine());

        //calculate the area
        float area = 0.5f * (base * height);

        System.out.println("Area of the Triangle: " + df.format(area));

        sc.close();
    }
}
