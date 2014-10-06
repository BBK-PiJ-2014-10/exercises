class NumberPiramids {
    public static void main(String[] args) {
        int input = Integer.parseInt(System.console().readLine("Enter integer:"));
        while (input != -1) {
            for (int i = 1; i <= input; i++) {
                if (i == input) {
                    System.out.println(input);    
                } else {
                    System.out.print(input);
                }
            }
		input = Integer.parseInt(System.console().readLine("Enter integer:"));
        }
    }
}