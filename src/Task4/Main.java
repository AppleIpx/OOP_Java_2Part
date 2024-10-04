package Task4;

public class Main {
    public static void main(String[] args) {
        NetworkProtocol httpProtocol = new HttpAdapter(new HttpClient());
        httpProtocol.connect("http://example.com");
        httpProtocol.sendData("HTTP data");
        httpProtocol.disconnect();
        System.out.println();

        NetworkProtocol ftpProtocol = new FtpAdapter(new FtpClient());
        ftpProtocol.connect("ftp://example.com");
        ftpProtocol.sendData("FTP data");
        ftpProtocol.disconnect();
        System.out.println();

        NetworkProtocol smtpProtocol = new SmtpAdapter(new SmtpClient());
        smtpProtocol.connect("smtp://example.com");
        smtpProtocol.sendData("SMTP data");
        smtpProtocol.disconnect();
    }
}