import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodaysDate {
    String time;
    public int day;
    private int month;
    protected int year;

    public void printDateAndTime(){
        GregorianCalendar calendar = new GregorianCalendar();
        time =  calendar.get(Calendar.HOUR_OF_DAY) + ":"
                + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND);

    }
}
