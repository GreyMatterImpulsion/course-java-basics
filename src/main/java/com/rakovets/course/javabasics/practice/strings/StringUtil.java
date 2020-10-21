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

    public static String getBracketsReplace(String string) {
        return string.replace('(', ')');
    }

    public static String getStringStartsAndEndsWithWord(String string, String word) {
        string = string.toLowerCase();
        word = word.toLowerCase();
            if (string.startsWith(word) && string.endsWith(word)) {
                return String.valueOf(true);
            } else {
                return String.valueOf(false);
            }
    }

    public static String getVowelsNumber(String string) {
        string = string.toLowerCase();
        int c;
        int a = 0;
        char symbol;
        for (c = 0; c < string.length(); c++ ) {
            symbol = string.charAt(c);
            if (symbol == 'a' || symbol == 'e' || symbol == 'y' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                a++;
            }
        }
        return String.valueOf(a);
    }

    public static String getDotsAndCommasNumber(String string) {
        int c;
        int a = 0;
        char symbol;
        for (c = 0; c < string.length(); c++ ) {
            symbol = string.charAt(c);
            if (symbol == '.' || symbol == ',' || symbol == '!') {
                a++;
            }
        }
        return String.valueOf(a);
    }

    public static String getForwardEqualBackward(String string) {
        StringBuffer strBuffer = new StringBuffer(string);
        if (strBuffer.toString().equals(strBuffer.reverse().toString())) {
            return String.valueOf(true);
        } else {
            return String.valueOf(false);
        }
    }

    public static String getWordsNumber(String string) {
        String[] words = string.split(" ");
        System.out.println(words);
        int a = 0;
        for (String word : words) {
            word.trim();
            a++;
            if (word.isEmpty()) {
                a--;
            }
        }
        return String.valueOf(a);
    }
}

