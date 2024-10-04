package Task4;

class FtpAdapter implements NetworkProtocol {
    private final FtpClient ftpClient;

    public FtpAdapter(FtpClient ftpClient) {
        this.ftpClient = ftpClient;
    }

    @Override
    public void connect(String address) {
        ftpClient.ftpConnect(address);
    }

    @Override
    public void disconnect() {
        ftpClient.ftpDisconnect();
    }

    @Override
    public void sendData(String data) {
        ftpClient.ftpSend(data);
    }
}