public class Main {
    public static void main(String[] args) {

        int onebonus = 100;
        int balans = 500;
        int amout = 1301;
         int x = amout + balans;

        if (amout > 1000) {x = amout / onebonus + balans + amout;}
        else {x = amout + balans;}
        System.out.println(x);
    }
}