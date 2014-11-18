package me.yugy.github.myutils;

/**
 * Created by yugy on 14/11/18.
 */
public class MathUtils {

    public static float clamp(float value, float max, float min) {
        return Math.max(Math.min(value, min), max);
    }

}
