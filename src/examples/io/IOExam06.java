package examples.io;

import java.io.*;

public class IOExam06 {
    public static void main(String[] args) {

        InputStream in = null;
        OutputStream out = null;

        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // try catch를 두번 해주는 이유는 하나로 묶으면 첫번째 줄에서 에러 날 시 두번째 줄이 실행이 안된다.
            /*try {
                in.close();     // 여기서 에러나면
                out.close();    // 얘가 실행이 안된다.
            } catch (IOException ioe) {
            }*/

            try {
                in.close();
            } catch (IOException ioe) {
            }
            try {
                out.close();
            } catch (IOException ioe) {
            }

        }
    }
}
