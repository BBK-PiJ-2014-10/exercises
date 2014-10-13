// Write a program that reads two numbers from the user and then offers a menu with the four basic operations: addition, subtraction, multiplication, and division. Once the user has selected an operation from the menu, the calculator performs the operation.
// Hint: In the same way that there exists an Integer.parseInt() method to parse integers, there is a Dou- ble.parseDouble() method to parse real numbers.

public class Calculator {
    public static String calculate(int choice, Double input1, Double input2) {
        Double result = 0.0;
        String operation = "";
        String resultString;

        switch (choice) {
            case 1:
                operation = "addition";
                result = input1 + input2;
                break;
            case 2:
                operation = "subtraction";
                result = input1 - input2;
                break;
            case 3:
                operation = "multiplication";
                result = input1 * input2;
                break;
            case 4:
                operation = "division";
                result = input1 / input2;
                break;
        }
        resultString = "Result of " + operation + " between " + input1 + " and " + input2 + " is: " + result;
        return resultString;
    }

    public static void main(String[] args) {
        Double input1 = Double.parseDouble(System.console().readLine("Enter first number:"));
        Double input2 = Double.parseDouble(System.console().readLine("Enter second number:"));
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        int choice = Integer.parseInt(System.console().readLine("Enter your choice:"));
        System.out.println(calculate(choice, input1, input2));        
    }
}