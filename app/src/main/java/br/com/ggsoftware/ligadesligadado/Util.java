package br.com.ggsoftware.ligadesligadado;

import android.content.Context;
import android.os.Build;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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

    public static String getDataHojeFormatada(Context context){
        SimpleDateFormat  sdfData = new SimpleDateFormat("dd/MM/yyyy", getCurrentLocale(context));
        Calendar calendar = Calendar.getInstance();
        return sdfData.format(calendar.getTime());
    }

    public static String getHoraHojeFormatada(Context context){
         SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm:ss",  getCurrentLocale(context));
        Calendar calendar = Calendar.getInstance();
        return sdfHora.format(calendar.getTime());
    }
}
