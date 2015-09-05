package com.example.d_rom.supportdesigndemo.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Admin on 05.09.2015.
 */
public class ToastUtil {
    public static void addLongToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void addShortToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
