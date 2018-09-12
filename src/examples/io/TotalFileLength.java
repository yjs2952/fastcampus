package examples.io;

import java.io.File;

public class TotalFileLength {
    public static void main(String[] args) {
        File file = new File(".");
        File[] files = file.listFiles();

        if (files.length != 0) {
            System.out.println(fileLength(files));
        } else {
            System.out.println("no file exists");
        }
    }

    public static long fileLength(File[] files) {

        long sum = 0;

        for (File f : files) {
            if (f.isDirectory()) {
                File[] subFiles = f.listFiles();
                sum += fileLength(subFiles);
            } else {
                sum += f.length();
            }
        }

        return sum;
    }
}
