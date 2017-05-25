package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {
    static String regex = "\\d{0,2}";

    public static void main(String[] args) {
        Pattern mPattern = Pattern.compile(regex);
        Matcher matcher = mPattern.matcher("000sfsfsfsf");
        System.out.println("find = " + matcher.find());
        System.out.println("matches = " + matcher.matches());
    }
}
