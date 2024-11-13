package Task9;

public class Main {
    public static void main(String[] args) {
        DataCache cache = DataCache.getInstance();

        cache.put("user_1", "Данные пользователя 1");

        String userData = (String) cache.get("user_1");
        System.out.println("Данные из кэша: " + userData);

        if (cache.containsKey("user_1")) {
            System.out.println("Данные найдены в кэше.");
        } else {
            System.out.println("Данных в кэше нет.");
        }
    }
}

