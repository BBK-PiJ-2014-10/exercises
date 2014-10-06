class Multiply {
    public static void main(String[] args) {
        //  Write a program that requests two numbers from the user and then outputs its product. You cannot use the “*” operator.
        int first = Integer.parseInt(System.console().readLine("Enter first integer:"));
        int second = Integer.parseInt(System.console().readLine("Enter first integer:"));
        int result = 0;
        while (first > 0) {
            result += second;
            first = first - 1;
        }
        System.out.println(result);
    }
}