package Task4;

interface NetworkProtocol {
    void connect(String address);
    void disconnect();
    void sendData(String data);
}
