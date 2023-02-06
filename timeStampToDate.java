
// How to convert the TimeStamp to Date
import java.sql.Timestamp;
import java.util.Date;

public class timeStampToDate {
    public static void main(String args[]) {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        Date date = new Date(ts.getTime());
        System.out.println(date);
    }
}
