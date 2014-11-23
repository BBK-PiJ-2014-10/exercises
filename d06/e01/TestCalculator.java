class TestCalculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		if (calc.add(1, 2) == 3) {
			System.out.println("Addition test passed.");
		} else {
			System.out.println("Addition test failed!");
		};
		if (calc.substract(6, 3) == 3) {
			System.out.println("Substraction test passed.");
		} else {
			System.out.println("Substraction test failed!");
		};
		if (calc.multiply(1, 3) == 3) {
			System.out.println("Multiply test passed.");
		} else {
			System.out.println("Multiply test failed!");
		};
		if (calc.divide(6, 2) == 3) {
			System.out.println("Divide test passed.");
		} else {
			System.out.println("Divide test failed!");
		};
		if (calc.modulus(3, 6) == 3) {
			System.out.println("Modulus test passed.");
		} else {
			System.out.println("Modulus test failed!");
		};
	}
}