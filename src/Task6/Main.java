package Task6;

public class Main {
    public static void main(String[] args) {
        EventNotifier emailNotifier = new EmailNotifier();
        emailNotifier.notifyUser();

        System.out.println();

        EventNotifier smsNotifier = new SMSNotifier();
        smsNotifier.notifyUser();
    }
}
