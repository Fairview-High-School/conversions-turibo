import java.util.Scanner;

public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("-------------------------------\n\nVery weird conversion thing\nBy: Ayden & Mr. Gesell\n\nConversion Options:\n");

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Pounds to Kilograms");
        System.out.println("8. Kilograms to Pounds");
        System.out.println("9. Miles to Kilometers");
        System.out.println("10. Kilometers to Miles");
        System.out.println("\n-------------------------------\n");

        int selection = keyboard.nextInt();
        keyboard.nextLine();  // go past the endline and be ready for more input

        if (selection == 1) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");
            System.out.println("\n-------------------------------");
        } else if (selection == 2) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            double celsius = (fahrenheit - 32) * (5.0 / 9.0);
            System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius");
            System.out.println("\n-------------------------------");
        } else if (selection == 3) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            double meters = feet * 0.3048;
            System.out.println(feet + " feet translates to " + meters + " meters");
            System.out.println("\n-------------------------------");
        } else if (selection == 4) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            double feet = meters / 0.3048;
            System.out.println(meters + " meters translates to " + feet + " feet");
            System.out.println("\n-------------------------------");
        } else if (selection == 5) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            double milliliters = ounces * 29.5735;
            System.out.println(ounces + " ounces translates to " + milliliters + " milliliters");
            System.out.println("\n-------------------------------");
        } else if (selection == 6) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Enter Milliliters: ");
            double milliliters = keyboard.nextDouble();
            double ounces = milliliters / 29.5735;
            System.out.println(milliliters + " milliliters translates to " + ounces + " ounces");
            System.out.println("\n-------------------------------");
        } else if (selection == 7) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Enter Pounds: ");
            double pounds = keyboard.nextDouble();
            double kilograms = pounds * 0.453592;
            System.out.println(pounds + " pounds translates to " + kilograms + " kilograms");
            System.out.println("\n-------------------------------");
        } else if (selection == 8) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Enter Kilograms: ");
            double kilograms = keyboard.nextDouble();
            double pounds = kilograms / 0.453592;
            System.out.println(kilograms + " kilograms translates to " + pounds + " pounds");
            System.out.println("\n-------------------------------");
        } else if (selection == 9) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Enter Miles: ");
            double miles = keyboard.nextDouble();
            double kilometers = miles * 1.60934;
            System.out.println(miles + " miles translates to " + kilometers + " kilometers");
            System.out.println("\n-------------------------------");
        } else if (selection == 10) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Enter Kilometers: ");
            double kilometers = keyboard.nextDouble();
            double miles = kilometers / 1.60934;
            System.out.println(kilometers + " kilometers translates to " + miles + " miles");
            System.out.println("\n-------------------------------");
        } else {
            System.out.println("\nInvalid choice. Please choose a valid thing.");
        }

        keyboard.close();
    }
}
