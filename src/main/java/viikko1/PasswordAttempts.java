package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        int yritykset = 3;

        for (int i = 0; i < tries.length && i < yritykset; i++) {
            if (tries[i].equals("java123")) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }

    public static void main(String[] args) {
        String[] attempts = {"123", "321", "java123"};
        System.out.println(login(attempts));
    }    
}
