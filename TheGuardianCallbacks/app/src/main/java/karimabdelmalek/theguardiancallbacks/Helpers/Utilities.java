package karimabdelmalek.theguardiancallbacks.Helpers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by karimabdelmalek on 10/1/16.
 */

public class Utilities
{
    public static Boolean CheckIfApplicationIsConnected(Context context) {

        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetInfo != null) {
            return activeNetInfo != null;
        } else {
            return false;
        }
    }

    public static String formatDate (String inputDate)
    {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Date myDate = null;
        try {
            myDate = formatter.parse(inputDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        formatter = new SimpleDateFormat("EEEE, dd MMM yyy HH:mm ");
        return formatter.format(myDate);
    }

}
