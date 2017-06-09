package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {
    static String regex = "\\d{2}";

    public static void main(String[] args) {
//        Pattern mPattern = Pattern.compile(regex);
//        Matcher matcher = mPattern.matcher("0s00sfsfsfsf");
//        System.out.println("find = " + matcher.find());
//        System.out.println("matches = " + matcher.matches());

//        Pattern pattern = Pattern.compile("[`~!@#$%^&*()_+=\\[\\]{}\\|;:'\",<.>/?-]");
//        Matcher matcher = pattern.matcher("`~!@#$%^&*()_+=[]{}|;:'\",<.>/?-0#[](s<%4&s*f");
//        String s = matcher.replaceAll("");
//        System.out.println("result is " + s);

        Pattern pattern = Pattern.compile("\\d*\\.?\\d{0,2}");
        Matcher matcher = pattern.matcher("");
        System.out.println("result is " + matcher.matches());
    }
}
