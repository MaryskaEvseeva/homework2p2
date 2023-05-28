public class Main {
    public static void main(String[] args) {

        int onebonus = 100;
        int balans = 500;
        int amout = 1401;
        int finalBalans = amout + balans;

        if (amout > 1000) {
            finalBalans = amout / onebonus + balans + amout;
        } else {
            finalBalans = amout + balans;
        }
        System.out.println(finalBalans);
    }
}