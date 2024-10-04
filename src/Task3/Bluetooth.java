package Task3;

public class Bluetooth implements Network {
    @Override
    public void connect() {
        System.out.println("Подключение к сети Bluetooth");
    }

    @Override
    public void disconnect() {
        System.out.println("Отключение от сети Bluetooth");
    }
}