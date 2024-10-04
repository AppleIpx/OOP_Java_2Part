package Task3;

public class Main {
    public static void main(String[] args) {
        Network wifi = new WiFi();
        Network bluetooth = new Bluetooth();
        Network zigbee = new Zigbee();

        NetworkManager manager = new BasicNetworkManager(wifi);
        manager.connect();
        manager.disconnect();

        System.out.println();

        manager = new BasicNetworkManager(bluetooth);
        manager.connect();
        manager.disconnect();

        System.out.println();

        manager = new BasicNetworkManager(zigbee);
        manager.connect();
        manager.disconnect();
    }
}
