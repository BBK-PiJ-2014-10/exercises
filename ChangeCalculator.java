// Write a program that reads the total cost of a purchase and an amount of money that is paid to buy it.
// Your program should output the correct change specifying the amount of notes (50, 20, 10, 5) and coins (2, 1, 0.50, 0.20, 0.10, 0005, 0002, 0001) needed.

public class ChangeCalculator {

    public static void main(String[] args) {
        double price = Math.round(Double.parseDouble(System.console().readLine("Enter price: £")) * 100);
        double paid = Math.round(Double.parseDouble(System.console().readLine("Enter amount paid: £")) * 100);
        int priceInPennies = (int) price;
        int paidInPennies = (int) paid;

        int change = paidInPennies - priceInPennies;
        System.out.println("Change: £" + change / 100.0);
        int notes50 = 0;
        int notes20 = 0;
        int notes10 = 0;
        int notes5 = 0;
        int coins2 = 0;
        int coins1 = 0;
        int coins50p = 0;
        int coins20p = 0;
        int coins10p = 0;
        int coins5p = 0;
        int coins2p = 0;
        int coins1p = 0;

        boolean finished = false;
        while (!finished) {
            if (change >= 5000) {
                change = change - 5000;
                notes50 ++;
            } else if (change >= 2000) {
                change = change - 2000;
                notes20 ++; 
            } else if (change >= 1000) {
                change = change - 1000;
                notes10 ++;
            } else if (change >= 500) {
                change = change - 500;
                notes5 ++; 
            } else if (change >= 200) {
                change = change - 200;
                coins2 ++; 
            } else if (change >= 100) {
                change = change - 100;
                coins1 ++; 
            } else if (change >= 50) {
                change = change - 50;
                coins50p ++; 
            } else if (change >= 20) {
                change = change - 20;
                coins20p ++; 
            } else if (change >= 10) {
                change = change - 10;
                coins10p ++;
            } else if (change >= 5) {
                change = change - 5;
                coins5p ++; 
            } else if (change >= 2) {
                change = change - 2;
                coins2p ++; 
            } else if (change >= 1) {
                change = change - 1;
                coins1p ++;
            } else if (change == 0) {
                finished = true;
            }
        }
        System.out.println("Notes: 50: " + notes50 + ", 20: " + notes20 + ", 10: " + notes10 + ", 5: " + notes5);
        System.out.println("coins: 2: " + coins2 + ", 1: " + coins1 + ", 0.50: " + coins50p + ", 0.20: " + coins20p + ", 0.10: " + coins10p + ", 0.05: " + coins5p + ", 0.02: " + coins2p + ", 0.01: " + coins1p);
    }
}