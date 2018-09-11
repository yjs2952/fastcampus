package examples.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class IOExam04 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.naver.com");
        InputStream in = url.openStream();

        OutputStream out = new FileOutputStream("C:\\study\\first\\naver.html");

        CopyUtil.copy(in, out);
    }
}
