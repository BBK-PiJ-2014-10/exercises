class RecursiveSO {
    public static String buggyMethod(Integer n) {
        if (n == 0) {
           return "";
        }
		return n.toString() + " " + buggyMethod(n - 2);
    }
	public static void main(String[] args) {
		System.out.println(buggyMethod(-2));
	}
}