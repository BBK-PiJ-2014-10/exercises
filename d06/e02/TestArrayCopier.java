class TestArrayCopier {
	
	public static boolean testCopier(int[] source, int[] destination) {
		ArrayCopier copier = new ArrayCopier();
		copier.copy(source, destination);
		
		boolean allGood = true;
		for (int i = 0; i < destination.length - 1; i++) {
			if (source.length - 1 >= i) {
				if (source[i] != destination[i]) {
					System.out.println(i + "element does not match!.");
					allGood = false;
				}
			} else {
				if (destination[i] != 0) {
					System.out.println(i + "element is not 0!");
					allGood = false;
				}
			}
		}
		return allGood;
	}
	
	public static void main(String[] args) {
		int[] source = {1, 2, 3};
		int[] destination = new int[4];
		boolean sameSizeTest = testCopier(source, destination);
		
		int[] source2 = {1, 2, 3, 4, 5};
		int[] destination2 = new int[4];
		boolean sourceLongerTest = testCopier(source2, destination2);


		int[] source3 = {1, 2};
		int[] destination3 = new int[4];
		boolean sourceShorterTest = testCopier(source3, destination3);

		if (sameSizeTest && sourceLongerTest && sourceShorterTest) {
			System.out.println("All tests passed.");
		} else {
			System.out.println("Some tests failed!");
		}
	}
}