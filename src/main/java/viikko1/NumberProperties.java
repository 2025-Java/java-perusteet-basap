package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        if (n % 2 == 0 && n > 0) {
            return "positiivinen parillinen";
        } else if (n % 2 == 0 && n < 0) {
            return "negatiivinen parillinen";
        } else if (n > 0) {
            return "positiivinen pariton";
        } else if (n < 0) {
            return "negatiivinen pariton";
        } else {
            return "nolla";
        }
    }

    public static void main(String[] args) {
        System.out.println(describe(7));
    }
}
