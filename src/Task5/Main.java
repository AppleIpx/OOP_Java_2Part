package Task5;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        User user1 = new User("Алексей");
        User user2 = new User("Мария");

        calendar.addObserver(user1);
        calendar.addObserver(user2);

        calendar.addEvent("Встреча с командой в пятницу в 15:00");

        calendar.removeObserver(user1);
        calendar.addEvent("Конференция в понедельник в 10:00");
    }
}
