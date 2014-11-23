class PracticeWhile {
	public static void main(String[] args) {
		int userInput = 0;
		int howMany = 0;
		int distinction = 0;
		int passed = 0;
		int failed = 0;
		int invalid = 0;

		do {
			userInput = Integer.parseInt(System.console().readLine("Input mark: "));
			howMany ++;
			if (userInput >= 70 && userInput <= 100) {
				distinction ++;
			} else if (userInput >= 50 && userInput <= 69) {
				passed ++;				
			} else if (userInput >= 0 && userInput <= 49) {
				failed ++;
			} else if (userInput < 0 || userInput > 100) {
				invalid ++;
			}
		} while (userInput != -1);
		System.out.println("There are " + howMany + " students: "  + distinction + " distinctions, " + passed + " pass, " + failed + " fails (plus " + invalid + " invalid).");
	}
}