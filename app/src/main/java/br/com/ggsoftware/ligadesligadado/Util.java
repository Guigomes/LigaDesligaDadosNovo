package br.com.ggsoftware.ligadesligadado;

import android.content.Context;
import android.os.Build;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by f3861879 on 23/10/2017.
 */

public class Util {



    public  static Locale getCurrentLocale(Context context){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            return context.getResources().getConfiguration().getLocales().get(0);
        } else{
            //noinspection deprecation
            return context.getResources().getConfiguration().locale;
        }
    }

    public static String getDataFormatada(Context context, Date date){
        SimpleDateFormat  sdfData = new SimpleDateFormat("dd/MM/yyyy", getCurrentLocale(context));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return sdfData.format(calendar.getTime());
    }

    public static String getHoraFormatada(Context context, Date date){
         SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm:ss",  getCurrentLocale(context));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return sdfHora.format(calendar.getTime());
    }
}
