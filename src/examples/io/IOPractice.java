package examples.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class IOPractice {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
        String currentDate = sdf.format(date);
        /*int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);*/

        File dir = new File("C:/tmp/");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        File yearDir = new File(dir.getAbsolutePath() + File.separator + currentDate.substring(0, 4));
        if (!yearDir.exists()) {
            yearDir.mkdir();
        }
        File monthDir = new File(yearDir.getAbsolutePath() + File.separator + currentDate.substring(4, 6));
        if (!monthDir.exists()) {
            monthDir.mkdir();
        }
        File dayDir = new File(monthDir.getAbsolutePath() + File.separator + currentDate.substring(6, 8));
        if (!dayDir.exists()) {
            dayDir.mkdir();
        }
    }
}
