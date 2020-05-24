package com.test.config;

import java.text.SimpleDateFormat;

public class FrameworkLogger {

    public static String currentDate;

   
    public static void logError(final String message) {
        currentDate = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new java.util.Date());
        System.err.println(currentDate + "---- " + message);
    }

    public static void logStep(final String message) {
        currentDate = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new java.util.Date());
        System.out.println(currentDate + "---- " + message);
    }

}
