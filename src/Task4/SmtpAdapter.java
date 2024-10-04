package Task4;

class SmtpAdapter implements NetworkProtocol {
    private final SmtpClient smtpClient;

    public SmtpAdapter(SmtpClient smtpClient) {
        this.smtpClient = smtpClient;
    }

    @Override
    public void connect(String address) {
        smtpClient.smtpConnect(address);
    }

    @Override
    public void disconnect() {
        smtpClient.smtpDisconnect();
    }

    @Override
    public void sendData(String data) {
        smtpClient.smtpSend(data);
    }
}
