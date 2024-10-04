package Task3;

public class WiFi implements Network {
    @Override
    public void connect() {
        System.out.println("Подключение к сети Wi-Fi");
    }

    @Override
    public void disconnect() {
        System.out.println("Отключение от сети Wi-Fi");
    }
}
