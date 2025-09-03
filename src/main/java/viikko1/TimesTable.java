package viikko1;

public class TimesTable {
    public static String table(int n) {
        String result = "";
        for (int i = 1; i<=10; ++i) {
            result += n + " x " + i + " = " + (n * i) + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(table(7));
    }
}
