package examples.io;

import java.io.File;

public class FileExam02 {
    public static void main(String[] args) {
        File file = new File("."); // .은 현재경로
        // 절대 경로는 / 로 시작하거나 드라이브명으로 시작한다.
        // 절대 경로로 출력한다.
        System.out.println(file.getAbsoluteFile()); // JVM이 실행되는 경로
    }
}
