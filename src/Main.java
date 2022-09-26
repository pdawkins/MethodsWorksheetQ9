import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char option;
        do{
            option = mainMenu();
            if (option == '1')
                celsiusToFahrenheit();
            else if (option == '2')
                fahrenheitToCelsius();
            else if (option == '9') {
                System.out.println(" Good bye");
                break;
            }
        }while( option != '9');
    }

    public static void celsiusToFahrenheit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Celsius to Fahrenheit");
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9*celsius)/5 + 32;
        System.out.println(celsius + " degrees Celsius is "+ fahrenheit + " fahrenheit\n\n");
    }

    public static void fahrenheitToCelsius(){
        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit to Celsius");
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = 5*(fahrenheit - 32) / 9;
        System.out.println(fahrenheit + " fahrenheit is "+ celsius + " degrees Celsius\n\n");
    }

    public static char mainMenu(){
        Scanner input = new Scanner(System.in);

        System.out.println("You have the following option:");
        System.out.println("1] Celsius to Fahrenheit");
        System.out.println("2] Fahrenheit to Celsius");
        System.out.println("9] Quit");
        System.out.print("--> ");

        char option = input.next().charAt(0);
        return option;
    }
}