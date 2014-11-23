class UnitMatrix {
	public static void main(String[] args) {
		print();
	}
	
    int size;
    public static void setSize(int newSize) {
        this.size = newSize;
    }
    public static void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
					System.out.println("1 ");
                } else {
					System.out.println("0 ");
                }
            }
			System.out.println();
        }
    }
}