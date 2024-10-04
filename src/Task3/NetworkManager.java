package Task3;

public abstract class NetworkManager {
    protected Network network;

    public NetworkManager(Network network) {
        this.network = network;
    }

    public abstract void connect();
    public abstract void disconnect();
}

