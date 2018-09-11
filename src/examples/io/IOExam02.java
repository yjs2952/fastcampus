package examples.io;

import java.io.*;

public class IOExam02 {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;

        try {
            File file = new File("C:/study/readme.txt");
            if (!file.isDirectory() && file.exists()) {
                in = new FileInputStream(file);
                out = new FileOutputStream("C:/study/readme.md");
                byte[] buffer = new byte[1024];
                int readCount = 0;
                while ((readCount = in.read(buffer)) != -1) {
                    out.write(buffer, 0, readCount);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
