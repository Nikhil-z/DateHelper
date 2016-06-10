package ae.prototype.vip.helpers.date_helpers;

import android.support.annotation.Nullable;
import android.util.Log;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Chatikyan on 19.04.2016.
 */
public class DateHelper {

    private Date date;

    private Locale locale = Locale.getDefault();

    private SimpleDateFormat simpleDateFormat;

    private static String NULL_DATE = "-";

    private static String LOG_TEXT = "date must not be null";

    public static String DATE_PATTERN_WITH_T = "yyyy-MM-dd'T'HH:mm:ss";

    public static String USUAL_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static String ISO8601_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";


    public DateHelper(Date date) {
        this.date = date;
    }

    public DateHelper(Date date, Locale locale) {
        this.date = date;
        this.locale = locale;
    }

    @Nullable //13
    public String getDay() {
        simpleDateFormat = new SimpleDateFormat("dd", locale);
        if (date != null) {
            return simpleDateFormat.format(date);
        } else {
            Log.e(DateHelper.class.getSimpleName(), LOG_TEXT);
            return NULL_DATE;
        }
    }

    @Nullable //April
    public String getMonthLongName() {
        simpleDateFormat = new SimpleDateFormat("MMMM", locale);
        if (date != null) {
            return simpleDateFormat.format(date);
        } else {
            Log.e(DateHelper.class.getSimpleName(), LOG_TEXT);
            return NULL_DATE;
        }
    }

    @Nullable //13:30
    public String getHour() {
        simpleDateFormat = new SimpleDateFormat("kk:mm", locale);
        if (date != null) {
            return simpleDateFormat.format(date);
        } else {
            Log.e(DateHelper.class.getSimpleName(), LOG_TEXT);
            return NULL_DATE;
        }
    }

    @Nullable //Apr
    public String getMonthShortName() {
        simpleDateFormat = new SimpleDateFormat("MMM", locale);
        if (date != null) {
            return simpleDateFormat.format(date);
        } else {
            Log.e(DateHelper.class.getSimpleName(), LOG_TEXT);
            return NULL_DATE;
        }
    }

    @Nullable //Wednesday
    public String getDayOfTheWeek() {
        simpleDateFormat = new SimpleDateFormat("EEEE", locale);
        if (date != null) {
            return simpleDateFormat.format(date);
        } else {
            Log.e(DateHelper.class.getSimpleName(), LOG_TEXT);
            return NULL_DATE;
        }
    }

    @Nullable //Wed
    public String getDayOfWeekShortName() {
        simpleDateFormat = new SimpleDateFormat("EEE", locale);
        if (date != null) {
            return simpleDateFormat.format(date);
        } else {
            Log.e(DateHelper.class.getSimpleName(), LOG_TEXT);
            return NULL_DATE;
        }
    }

    @Nullable //04
    public String getIntMonth() {
        simpleDateFormat = new SimpleDateFormat("MM", locale);
        if (date != null) {
            return simpleDateFormat.format(date);
        } else {
            Log.e(DateHelper.class.getSimpleName(), LOG_TEXT);
            return NULL_DATE;
        }
    }

    @Nullable //1993
    public String getYear() {
        simpleDateFormat = new SimpleDateFormat("yyyy", locale);
        if (date != null) {
            return simpleDateFormat.format(date);
        } else {
            Log.e(DateHelper.class.getSimpleName(), LOG_TEXT);
            return NULL_DATE;
        }
    }

    public static Date stringToDate(String date, String dateTemplate) {

        DateFormat format = new SimpleDateFormat(dateTemplate, Locale.ENGLISH);

        try {
            return format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
