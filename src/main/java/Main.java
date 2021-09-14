import java.io.IOException;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("urlecho.appspot.com", 80);
        String request = "GET /html HTTP/1.1\r\n"+
        "Host: httpbin.org\r\n"+
        "Connection: keep-alive\r\n"+
        "Pragma: no-cache\r\n"+
        "Cache-Control: no-cache\r\n"+
        "Upgrade-Insecure-Requests: 1 \r\n" +
        "User-Agent: Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Mobile Safari/537.36\r\n"+
        "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\r\n\r\n";

        socket.getOutputStream().write(
                ("GET" + request + "/html HTTP/1.1\r\n"+
                "Host: httpbin.org\r\n" + "\r\n").getBytes());

        int c;
        while ((c = socket.getInputStream().read()) != -1) {
            System.out.print((char) c);
        }
    }
}
