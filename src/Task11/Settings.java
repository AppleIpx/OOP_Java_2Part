package Task11;

public class Settings implements CloneableSettings {

    private String theme;
    private String language;
    private boolean notificationsEnabled;

    public Settings(String theme, String language, boolean notificationsEnabled) {
        this.theme = theme;
        this.language = language;
        this.notificationsEnabled = notificationsEnabled;
    }

    @Override
    public Settings clone() {
        return new Settings(this.theme, this.language, this.notificationsEnabled);
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Настройки [Тема = " + theme + ", Язык = " + language + ", Уведомления = " + notificationsEnabled + "]";
    }
}

