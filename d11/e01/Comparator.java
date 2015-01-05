public class Comparator {

    public <T> T getUniMax(T n, T m) {
        if (n > m) {
            return n;
        } else {
            return m;
        }
    }

    public int getMax(int n, int m) {
        return getUniMax(n, m);
    }

    public double getMax(double d1, double d2) {
        return getUniMax(d1, d2);
    }

    public String getMax(String number1, String number2) {
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);

        return getUniMax(n1, n2);
    }
}