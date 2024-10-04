package Task4;

class HttpClient {
    public void httpConnect(String url) {
        System.out.println("Подключение к HTTP по адресу: " + url);
    }

    public void httpDisconnect() {
        System.out.println("Отключение от HTTP");
    }

    public void httpSend(String data) {
        System.out.println("Отправка данных по HTTP: " + data);
    }
}
