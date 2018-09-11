package examples.first;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String args[]){

        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = Calendar.getInstance();

        // 필드
        System.out.println(Calendar.AM);
        System.out.println(Calendar.MONTH);

        System.out.println(cal2.get(Calendar.MONTH));   // 배열의 위치값을 리턴 따라서 +1을 해줘야 한다.
        System.out.println(cal2.get(Calendar.YEAR));
        System.out.println(cal2.get(Calendar.DAY_OF_MONTH));

    }
}
