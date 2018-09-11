package examples.io;

import java.io.File;

public class TotalFileLength {
    public static void main(String[] args) {
        File file = new File(".");
        System.out.println(file.getAbsoluteFile());

        File[] files = file.listFiles();
        System.out.println(fileLength(files));

    }

    public static long fileLength(File[] files){

        long sum = 0;

        if (files.length != 0) {
            for (File f : files) {
                if (f.isDirectory()) {
                    File[] subFiles = f.listFiles();
                    sum += fileLength(subFiles);
                } else {
                    sum += f.length();
                }
            }
        }

        return sum;
    }
}
