package win.zhangzhixing.common.tool;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static Long todayTimeRemaining() {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        return (cal.getTime().getTime() - now.getTime()) / 1000;
    }
}