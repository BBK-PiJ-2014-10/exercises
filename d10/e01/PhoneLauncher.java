// Create a small script called PhoneLauncher in which you create a SmartPhone and use all its methods, including those inherited from its ancestor classes.

public class PhoneLauncher {
    
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }
    
    public void launch() {
        SmartPhone sp = new SmartPhone();
        for (int i = 1; i < 12; i++) {
            sp.call("1234" + i);
        }
        sp.printLastNumbers();
        sp.ringAlarm("Alarm sound!");
        sp.playGame("Mario");
        sp.browseWeb("moodle.com");
        sp.findPosition();
    }
}
