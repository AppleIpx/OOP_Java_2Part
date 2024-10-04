package Task3;

public class BasicNetworkManager extends NetworkManager {

    public BasicNetworkManager(Network network) {
        super(network);
    }

    @Override
    public void connect() {
        network.connect();
    }

    @Override
    public void disconnect() {
        network.disconnect();
    }
}
