// Write a program that reads a text representing a mathematical operation (one of the four basic ones) with two operands, and then execute it.

public class CmdCalculator {
    public static Double getResult(String choice, Double input1, Double input2) {
        Double result = 0.0;

        switch (choice) {
            case "+":
                result = input1 + input2;
                break;
            case "-":
                result = input1 - input2;
                break;
            case "*":
                result = input1 * input2;
                break;
            case "/":
                result = input1 / input2;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Double input1 = Double.parseDouble(args[0]);
        String choice = args[1];
        Double input2 = Double.parseDouble(args[2]);
        System.out.println(getResult(choice, input1, input2));
    }
}