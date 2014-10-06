class HighLow {
    // Modify your former program so that it outputs ”Yes” when the numbers are consecutive, regardless of whether they
    // go up or down. For example, both ”2,3,4,5,6,-1” and ”10,9,8,7,-1” should now result in ”Yes”.

    public static void main(String[] args) {
        int input = Integer.parseInt(System.console().readLine("Enter first integer:"));
        int last = input;
        int counter = 0;
        boolean increasingAndConsecutive = true;
        String result;
        while (input != -1) {
            counter ++;
            if (counter != 1) {
                if (input + 1 != last) {
                    if (input - 1 != last) {
                        increasingAndConsecutive = false;
                        System.out.print("increasingAndConsecutive: ");
                        System.out.println(increasingAndConsecutive);
                    }
                }
                last = input;
            }
            input = Integer.parseInt(System.console().readLine("Enter first integer:"));
        }
        if (increasingAndConsecutive) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}