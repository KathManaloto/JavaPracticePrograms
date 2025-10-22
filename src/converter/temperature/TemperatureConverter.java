//This is a temperature converter program. 
package converter.temperature;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double convertedTemp;
        int choice;

        System.out.println("\nSelect the number that corresponds to the temperature that you wish to convert...");
        System.out.println(" 1 : Celsius to Fahrenheit \n 2 : Celsius to Kelvin");
        System.out.println(" 3 : Fahrenheit to Celsius \n 4 : Fahrenheit to Kelvin");
        System.out.println(" 5 : Kelvin to Celsius     \n 6 : Kelvin to Fahrenheit");
        System.out.println(" 0 : Exit program");


        System.out.print("ENTER YOUR CHOICE: ");
        choice = Integer.parseInt(sc.nextLine());

        switch(choice){

            case 1:
                message("Celsius","Fahrenheit");
                System.out.print("Enter degrees Celsius: ");
                convertedTemp = celsiusToFahrenheit(Double.parseDouble(sc.nextLine()));
                System.out.println("Converted temperature: " + convertedTemp + " degrees Fahrenheit");
                break;
            case 2:
                message("Celsius","Kelvin");
                System.out.print("Enter degrees Celsius: ");
                convertedTemp = celsiusToKelvin(Double.parseDouble(sc.nextLine()));
                System.out.println("Converted temperature: " + convertedTemp + " degrees Kelvin");
                break;
            case 3:
                message("Fahrenheit","Celsius");
                System.out.print("Enter degrees Fahrenheit: ");
                convertedTemp = fahrenheitToCelsius(Double.parseDouble(sc.nextLine()));
                System.out.println("Converted temperature: " + convertedTemp + " degrees Celsius");
                break;
            case 4:
                message("Fahrenheit","Kelvin");
                System.out.print("Enter degrees Fahrenheit: ");
                convertedTemp = fahrenheitToKelvin(Double.parseDouble(sc.nextLine()));
                System.out.println("Converted temperature: " + convertedTemp + " degrees Kelvin");
                break;
            case 5:
                message("Kelvin","Celsius");
                System.out.print("Enter degrees Kelvin: ");
                convertedTemp = kelvinToCelsius(Double.parseDouble(sc.nextLine()));
                System.out.println("Converted temperature: " + convertedTemp + " degrees Celsius");
                break;
            case 6:
                message("Kelvin","Fahrenheit");
                System.out.print("Enter degrees Kelvin: ");
                convertedTemp = kelvinToFahrenheit(Double.parseDouble(sc.nextLine()));
                System.out.println("Converted temperature: " + convertedTemp + " degrees Fahrenheit");
                break;
        }

        sc.close();
    }

    static void message(String input, String output){
        System.out.println("You selected " + input + " to " + output + " converter...");
    }
    public static double celsiusToFahrenheit(double c){
        return (c * 9/5) + 32;
    }
    public static double celsiusToKelvin(double c){
        return c + 273.15;
    }
    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5/9;
    }
    public static double fahrenheitToKelvin(double f){
        return  (f - 32) * 5 / 9 + 273.15;
    }
    public static double kelvinToCelsius(double k){
        return k - 273.15;
    }
    public static double kelvinToFahrenheit(double k){
        return  (k - 273.15) * 9/5 + 32;
    }
}