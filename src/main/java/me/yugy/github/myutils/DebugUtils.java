package me.yugy.github.myutils;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by yugy on 14-1-29. See <a href="https://github.com/MustafaFerhan/DebugLog">https://github.com/MustafaFerhan/DebugLog</a>
 */
public class DebugUtils {

    static String className;
    static String methodName;
    static int lineNumber;

    private static String createLog( String log ) {

        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        buffer.append(methodName);
        buffer.append(":");
        buffer.append(lineNumber);
        buffer.append("]");
        buffer.append(log);

        return buffer.toString();
    }

    private static void getMethodNames(StackTraceElement[] sElements){
        className = sElements[1].getFileName();
        methodName = sElements[1].getMethodName();
        lineNumber = sElements[1].getLineNumber();
    }

    public static void log(Object log){
        if(BuildConfig.DEBUG){
            getMethodNames(new Throwable().getStackTrace());

            if(log == null){ //log null
                Log.e(className, createLog("log content is null"));
            }else if(log instanceof Integer || log instanceof Float || log instanceof Double){ //log num
                Log.d(className, createLog(String.valueOf(log)));
            }else if(log instanceof String){ //log string
                Log.d(className, createLog((String) log));
            }else if(log instanceof JSONObject || log instanceof JSONArray){ //log json
                Log.d(className, createLog(log.toString()));
            }else if(log instanceof byte[]){ //log byte array
                Log.d(className, createLog(new String((byte[]) log)));
            }
        }
    }
}
