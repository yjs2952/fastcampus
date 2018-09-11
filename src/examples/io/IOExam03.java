package examples.io;

import java.io.*;

public class IOExam03 {
    public static void main(String[] args) throws Exception {

        String str = "hello world";
        byte[] buffer = str.getBytes();

        InputStream in1 = new ByteArrayInputStream(buffer);
        OutputStream out1 = new FileOutputStream("C:/study/out.txt");

        CopyUtil.copy(in1, out1);

        InputStream in2 = new FileInputStream("C:/study/out.txt");
        OutputStream out2 = new ByteArrayOutputStream();

        CopyUtil.copy(in2, out2);

        byte[] result = ((ByteArrayOutputStream) out2).toByteArray();
        String str2 = new String(result);

        System.out.println(str2);
    }
}
