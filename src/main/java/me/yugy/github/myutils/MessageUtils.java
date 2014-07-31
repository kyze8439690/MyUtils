package me.yugy.github.myutils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by yugy on 14-1-6.
 */
public class MessageUtils {

    public static void toast(Context context, String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
