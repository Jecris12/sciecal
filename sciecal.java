import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Available operations: +, -, *, /, sqrt, sin");
        System.out.println("To exit, enter 'e' as the operator.");

        while (true) {
            double num1, num2, result;

            System.out.print("Enter the first number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
                scanner.nextLine(); 
                continue;
            }
            num1 = scanner.nextDouble();

            System.out.print("Enter the operator: ");
            String operator = scanner.next();

            if (operator.equalsIgnoreCase("e")) {
                System.out.println("Exiting the calculator. Thank you for using it.!");
                break;
            }

            switch (operator.toLowerCase()) {
                case "s":
                    result = Math.sqrt(num1);
                    break;
                case "sin":
                    result = Math.sin(Math.toRadians(num1));
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    System.out.print("Enter the second number: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Error: Invalid input. Please enter a valid number.");
                        scanner.nextLine(); 
                        continue;
                    }
                    num2 = scanner.nextDouble();

                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                System.out.println("Syntax Error.");
                                continue;
                            }
                            break;
                        default:
                            result = 0; 
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
