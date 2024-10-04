package Task4;

class HttpAdapter implements NetworkProtocol {
    private final HttpClient httpClient;

    public HttpAdapter(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public void connect(String address) {
        httpClient.httpConnect(address);
    }

    @Override
    public void disconnect() {
        httpClient.httpDisconnect();
    }

    @Override
    public void sendData(String data) {
        httpClient.httpSend(data);
    }
}
