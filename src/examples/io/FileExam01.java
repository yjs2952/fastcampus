package examples.io;

import java.io.File;

public class FileExam01 {
    public static void main(String[] args) {
        // c:\\tmp\\파일명 : \\ 되야 파일명
        // 윈도우는 \가 사용되고, 유닉스 계열(linux,mac)은 /가 된다.
        // 운영체제와 상관없는 경로명을 지정하겠다.
        String fileName = "C:" + File.separator + "study" + File.separator + "readme.txt";
        //String fileName = "C:/study/readme.txt";

        // fileNmae에 해당하는 파일이나 폴더가 있을 수도 없을 수도 있다.
        File file = new File(fileName);

        // 파일이 존재하면
        if (file.exists()) {
            System.out.println(fileName + "이 있어요~");
        }
    }
}
