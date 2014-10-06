class IsPrime {

    public static boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
	}

	public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine("Enter Integer:"));
        if (isPrime(n) == true) {
            System.out.println("Is prime!");
        } else {
            System.out.println("Not prime!");
        }
    }
}