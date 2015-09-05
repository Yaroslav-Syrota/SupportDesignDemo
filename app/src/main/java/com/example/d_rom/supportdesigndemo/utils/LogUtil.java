package com.example.d_rom.supportdesigndemo.utils;

import android.util.Log;

import com.example.d_rom.supportdesigndemo.MainActivity;

/**
 * Created by Admin on 05.09.2015.
 */
public class LogUtil {
    public static void addLog(String message) {
        Log.d(MainActivity.TAG, message);
    }
}
