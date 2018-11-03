package com.level11data.core;


public class CheckGuava {

    public static void printGuavaClasspath() {
        System.out.println("*** com.level11data.core.CheckGuava Here is the classpath of Google Guava Strings class");
        System.out.println(com.google.common.base.Strings.class.getResource("Strings.class"));
        System.out.println("*******************************************************************");
    }
}
