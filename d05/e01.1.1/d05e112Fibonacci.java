class d05e112Fibonacci {
    public static int fib(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        }
	    int result = fib(n-1) + fib(n-2);
	    return result;
    }
    public static void main(String[] args) {
	    System.out.println(fib(1));
    }
}
