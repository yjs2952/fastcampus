package examples.io;

import java.io.File;

public class FileExam04 {
    public static void main(String[] args) {
        File file = new File("C:/tmp/a/b/c/d/e");

        if (!file.exists()) {
            file.mkdirs();  // 하위 디렉토리까지 다 생성
                            // mkdir()은 최상위 디렉토리 하나만 생성
        }
    }
}
