//This program will calculate the area of a rectangle
package formulas.areaCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("This program will calculate the area of a rectangle...\n");

        System.out.print("Length: ");
        float length = Float.parseFloat(sc.nextLine());

        System.out.print("Width : ");
        float width = Float.parseFloat(sc.nextLine());

        //calculate the area
        float area = length * width;

        System.out.println("Area of the rectangle: " + df.format(area));

        sc.close();
    }
}