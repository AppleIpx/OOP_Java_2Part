package Task4;

class SmtpClient {
    public void smtpConnect(String server) {
        System.out.println("Подключение к SMTP серверу: " + server);
    }

    public void smtpDisconnect() {
        System.out.println("Отключение от SMTP сервера");
    }

    public void smtpSend(String data) {
        System.out.println("Отправка данных по SMTP: " + data);
    }
}
