class Divide {
    // Write a program that requests two numbers from the user and then outputs the quotient and the remainder, e.g. if
    // the user enters 7 and 3, your program should ouput something like “7 divided by 3 is 2, remainder 1”. You cannot
    // use the “/” or “%” operators.

    public static void main(String[] args) {
        int first = Integer.parseInt(System.console().readLine("Enter first integer:"));
        int second = Integer.parseInt(System.console().readLine("Enter first integer:"));
        System.out.print(first);
        System.out.print(" divided by ");
        System.out.print(second);

        int quotient = 0;
        int reminder = 0;

        while (first > 0) {
            first = first - second;
            if (first == 0 || first > 0) {
                quotient ++;
                if (first < second) {
                    reminder = first;
                }
            }
        }
        System.out.print(" is ");
        System.out.print(quotient);
        System.out.print(", remainder ");
        System.out.print(reminder);
    }
}