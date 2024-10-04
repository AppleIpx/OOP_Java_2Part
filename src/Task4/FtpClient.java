package Task4;

class FtpClient {
    public void ftpConnect(String server) {
        System.out.println("Подключение к FTP серверу: " + server);
    }

    public void ftpDisconnect() {
        System.out.println("Отключение от FTP сервера");
    }

    public void ftpSend(String data) {
        System.out.println("Отправка данных по FTP: " + data);
    }
}
