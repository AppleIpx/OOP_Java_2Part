package Task11;

public class Main {
    public static void main(String[] args) {
        Settings defaultSettings = new Settings("Светлая", "Русский", true);

        Settings user1Settings = defaultSettings.clone();
        user1Settings.setTheme("Темная");
        System.out.println("Настройки пользователя 1: " + user1Settings);

        Settings user2Settings = defaultSettings.clone();
        user2Settings.setLanguage("Английский");
        System.out.println("Настройки пользователя 2: " + user2Settings);

        System.out.println("Базовые настройки: " + defaultSettings);
    }
}

