import java.text.SimpleDateFormat;
import java.util.Date;

public interface DateFormatUtility {
    static String formatDate(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }
}