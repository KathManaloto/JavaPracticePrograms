//This program will calculate the shape selected by the user. 
package formulas.areaCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaCalculatorMultipleShapes {

    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");

    public static void main(String[] args) {

        while(true){
            System.out.println("\nChoose the number that corresponds to the shape...");
            System.out.println(" 1 - Circle \n 2 - Square \n 3 - Rectangle \n 4 - Triangle");

            int numShape;

            while(true){
                try{
                    System.out.print("Enter number here: ");

                    numShape = Integer.parseInt(sc.nextLine());
                    if( numShape < 1 ||  numShape > 4){
                        System.out.println("Invalid input! Please choose a number between 1 to 4.");
                    } else break;
                } catch(NumberFormatException e){
                    System.out.println("Invalid input! Please choose a number between 1 to 4.");
                }
            }

            switch(numShape){
                case 1:
                    printHeader("Circle");
                    calculateAreaCircle();
                    break;
                case 2:
                    printHeader("Square");
                    calculateAreaSquare();
                    break;
                case 3:
                    printHeader("Rectangle");
                    calculateAreaRectangle();
                    break;
                case 4:
                    printHeader("Triangle");
                    calculateAreaTriangle();
                    break;
            }
            System.out.print("\nWould you like to calculate another area? (yes to restart the program | any other keys to exit): ");
            String repeat = sc.nextLine();
            if (!repeat.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for using the Area Calculator!");
                break;
            }
        }
    }
    static void calculateAreaCircle(){
        double radius = getPositiveInput("Enter radius: ");
        double area   = Math.PI * radius * radius;
        System.out.println("Area of the Circle: " + df.format(area));
    }
    static void calculateAreaSquare(){
        double side   = getPositiveInput("Enter side length: ");
        double area   = side * side;
        System.out.println("Area of the Square: " + df.format(area));
    }
    static void calculateAreaRectangle(){
        double length = getPositiveInput("Enter length: ");
        double width  = getPositiveInput("Enter width: ");
        double area   = length * width;
        System.out.println("Area of the Rectangle: " + df.format(area));
    }
    static void calculateAreaTriangle(){
        double base   = getPositiveInput("Enter base: ");
        double height = getPositiveInput("Enter height: ");
        double area   = 0.5 * base * height;
        System.out.println("Area of the Triangle: " + df.format(area));
    }
    static void printHeader(String shapeName){
        System.out.println("\nAwesome! You selected " + shapeName + "...\n");
        System.out.println("Please enter the required measurements to calculate its area.");
    }
    static double getPositiveInput(String prompt){
        double value;

        while(true){
            System.out.print(prompt);

            try{
                value = Double.parseDouble(sc.nextLine());
                if(value > 0){
                    return value;
                } else System.out.println("Invalid input! Please enter a valid number.");

            } catch(NumberFormatException e){
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }
}     