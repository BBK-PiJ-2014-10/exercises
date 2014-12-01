class SmartPhone extends MobilePhone {

    @Override
    public void call(String number) {
        super.call(number);
        if (number.startsWith("00")) {
            System.out.println("Calling " + number + " through the internet to save money");
        }
    }


    public void browseWeb(String webAddress) {
        System.out.println("Browsing web address: " + webAddress);
    }

    public void findPosition() {
        System.out.println("Current position: N40° 44.9064', W073° 59.0735");
    }
}
