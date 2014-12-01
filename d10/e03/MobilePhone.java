class MobilePhone extends OldPhone {
    private String[] lastTenNumbers = new String[10];
    private int lastNumberIndex = 0;
    private String brand = null;

    public MobilePhone(String brand) {
        super(brand);
        this.brand = brand;
    }

    @Override
    public void call(String number) {
        super.call(number);
        lastTenNumbers[lastNumberIndex] = number;
        lastNumberIndex ++;
        if (lastNumberIndex == 10) {
            lastNumberIndex = 0;
        }
    }

    public void ringAlarm(String alarmName) {
        System.out.println("Playing alarm: " + alarmName);
    }

    public void playGame(String gameName) {
        System.out.println("Playing game: " + gameName);
    }

    public void printLastNumbers() {
        String numbers = "";
        for (int i = 0; i < lastTenNumbers.length; i++) {
            numbers += lastTenNumbers[i] + "\n";
        }
        System.out.println("\nLast 10 numbers: \n" + numbers);
    }
}