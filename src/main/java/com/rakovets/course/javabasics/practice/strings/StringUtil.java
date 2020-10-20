package com.rakovets.course.javabasics.practice.strings;

public class StringUtil {
    public static String getStringsConcat(String string1, String string2) {
        return string1.concat(string2);
    }

    public static String getSymbolIndex(String string, String symbol) {
        var symbolIndex = string.indexOf(symbol);
        if (symbolIndex >= 0) {
            return String.valueOf(symbolIndex);
        } else {
            return "-1";
        }
    }

    public static String getStringsEquality(String string1, String string2) {
        if (string1.equals(string2)) {
            return String.valueOf(true);
        } else {
            return String.valueOf(false);
        }
    }

    public static String getStringTrimAndLowCase(String string) {
        string = string.trim();
        string = string.toLowerCase();
        return string;
    }

    public static String get10To23Chars(String string) {
        if (string.length() >= 23) {
            return string.substring(10, 23);
        } else {
            return "Nein";
        }
    }
}