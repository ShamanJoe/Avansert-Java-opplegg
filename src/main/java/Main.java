import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        Socket socket = new Socket("urlecho.appspot.com", 80);
        String request = GET /html HTTP/1.1 "\r\n"
        Host: httpbin.org"\r\n"
        Connection: keep-alive"\r\n"
        Pragma: no-cache"\r\n"
        Cache-Control: no-cache
        Upgrade-Insecure-Requests: 1
        User-Agent: Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Mobile Safari/537.36
        Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
        Accept-Language: nb-NO,nb;q=0.9,no;q=0.8,nn;q=0.7,en-US;q=0.6,en;q=0.5
        dnt: 1

        socket.getOutputStream().write(request.getBytes());

    }
}
}