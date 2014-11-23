class ArrayCopier {

	public static void copy(int[] source, int[] destination) {
		for (int i = 0; i < destination.length - 1; i++) {
			if (source.length - 1 >= i) {
				destination[i] = source[i];
			} else {
				destination[i] = 0;
			}
		}
	}
}