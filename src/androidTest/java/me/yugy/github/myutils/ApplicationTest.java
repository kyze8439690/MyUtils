package me.yugy.github.myutils;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
//        DebugUtils.setLogEnable(true);
//        DebugUtils.log("test");
        String test = "kyze8439690";
        String md5 = MD5Utils.md5(test);
        assertEquals(md5, "6c607ffac5d90243606a1b372b91c276");
    }
}