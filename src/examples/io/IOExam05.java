package examples.io;

import java.io.*;

// 키보드로 부터 한줄씩 입력받아서 파일에 한줄씩 출력하시오.
// quit이라고 입력을 하면 프로그램 종료
// 1. 어디서 읽어들이지? 키보드    (System.in : 표준입력)
// 2. 어디에 쓰지? 파일            (FileWriter : 파일에 char 단위 출력)
// 3. 읽는 방법 : 한줄씩 입력받는다.    // 장식이 쓰인다 (BufferedReader)
// 4. 쓰는 방법 : 한줄씩 쓴다.           // PrintWriter
public class IOExam05 {
    public static void main(String[] args) {
        BufferedReader br = null;   // readLine() 한줄 읽어 들이는 메소드
        PrintWriter pw = null;      // println() 메소드를 가지고 있다.

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            pw = new PrintWriter(new FileWriter("C:/study/read.txt"));

            String line = null;
            int count = 1;

            while ((line = br.readLine()) != null) {
                if ("quit".equals(line)) {
                    break;
                }

                pw.println(count + " : " + line);
                count++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ioe) {}

            pw.close();
        }

    }
}
