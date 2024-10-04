package Task3;

public class Zigbee implements Network {
    @Override
    public void connect() {
        System.out.println("Подключение к сети Zigbee");
    }

    @Override
    public void disconnect() {
        System.out.println("Отключение от сети Zigbee");
    }
}
