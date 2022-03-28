package lesson3;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static final Scanner scanner = new Scanner(System.in);

    private static void start() {
        welcomeMenu();
        double number1 = getNumber();
        char operation = getOperation();
        double number2 = getNumber();
        double result = count(number1, number2, operation);
        System.out.println("Сalculation result = " + result);
        resumeExit();

    }

    public static void welcomeMenu() {
        System.out.println("Welcome to Calculator 5.0");
        System.out.println();
        System.out.println("Enter an expression in the format: Number, Operation sign, Number.");
        System.out.println();
    }

    public static double getNumber() {
        System.out.println("Enter the number:");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("The number entered is incorrect. Enter the number.");
            scanner.next();
            num = scanner.nextDouble();
        }
        return num;
    }

    private static char getOperation() {
        System.out.println("Enter operation sign: </> or <*> or <-> or <+>.");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Input Error. Please enter operation sign.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    private static double count(double operand1, double operand2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("The operation is not correct. Please try again.");
                result = count(operand1, operand2, getOperation());
        }
        return result;
    }

    private static void resumeExit() {
        System.out.println();
        System.out.println("Press <<Space bar>> then <<Enter>> to continue");
        System.out.println();
        System.out.println("Type <<exit>> then <<Enter>> to end the program.");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (!Objects.equals(answer, "exit")) {
            start();
        } else {
            System.out.println("Have a nice day!");
        }
        input.close();
    }

    public static void main(String[] args) {

       Calculator count = new Calculator();
        start();
    }
}




