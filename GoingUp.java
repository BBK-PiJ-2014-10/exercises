class GoingUp {
    // Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. At that point, print ”Yes”
    // if the numbers were consecutive and increasing and ”No” otherwise. Sequences ”1,2,3,4,-1” and ”5,6,7,8,9,10,11,-1”
    // should output ”Yes”, but ”2,3,5,6,7,-1”, ”10,9,8,7,-1”, and ”1,1,2,3,4,5,-1” should output ”No”.

    public static void main(String[] args) {
        int input = Integer.parseInt(System.console().readLine("Enter first integer:"));
        int last = input;
        int counter = 0;
        boolean increasingAndConsecutive = true;
        String result;
        while (input != -1) {
            counter ++;
            if (counter != 1) {
                if (input - 1 != last) {
                    increasingAndConsecutive = false;
                }
                last = input;
                System.out.print(last);
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