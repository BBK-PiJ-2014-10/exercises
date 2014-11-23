class RecursiveTest {
	public static String doggyMethod(Integer n) {
		if (n <= 0) {
			return "";
		}
		String result = doggyMethod(n-3).toString() + n.toString() + doggyMethod(n-2).toString();
		return result;
	}
	public static void main(String[] args) {
		System.out.println(doggyMethod(15));
	}
}