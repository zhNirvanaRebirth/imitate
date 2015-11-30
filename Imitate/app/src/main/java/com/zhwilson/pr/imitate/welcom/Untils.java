package com.zhwilson.pr.imitate.welcom;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by pr on 2015/11/27.
 */
public class Untils {
    public static boolean hasTosAccept(Context context){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getBoolean("tos", false);
    }
    public static void TosAccept(Context context){
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putBoolean("tos", true).commit();
    }
}
