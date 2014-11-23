class d05e01dMcCarthy91 {
    public static int mcCarthy91(int n) {
		System.out.println(n);
        if (n > 100) {
            return n - 10;
        } else {
            return mcCarthy91(mcCarthy91(n + 11));
        }
    }
    public static void main(String[] args) {
        System.out.println(mcCarthy91(98));
    }
}