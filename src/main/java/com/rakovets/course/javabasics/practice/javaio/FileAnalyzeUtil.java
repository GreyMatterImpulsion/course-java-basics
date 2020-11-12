package com.rakovets.course.javabasics.practice.javaio;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class FileAnalyzeUtil {
    public static void main(String[] args) {
            getFileStrings();
            getWordsStartWithVowels();
            getWordsWithEqualFirstAndLastChars();
            getIncreasingNumbers("src/main/resources/test2");
    }
    public static void getFileStrings() {
        FileInputStream fis = null;
        int i = 0;
        try {
            fis = new FileInputStream("src/main/resources/test.txt");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getWordsStartWithVowels() {
        FileInputStream fis = null;
        int i = 0;
        ArrayList<Integer> chars = new ArrayList<Integer>();
        boolean print = false;

        try {
            fis = new FileInputStream("src/main/resources/test.txt");
            while ((i = fis.read()) != -1) {
                chars.add(i);
            }
            for (int k = 0; k < chars.size(); k++) {
                switch (chars.get(k)) {
                    case (65):
                    case (97):
                    case (69):
                    case (101):
                    case (73):
                    case (105):
                    case (79):
                    case (111):
                    case (85):
                    case (117):
                    case (89):
                    case (121):
                        if (k == 0) {
                            print = true;
                        } else {
                            if (chars.get(k - 1) == 32 || chars.get(k - 1) == 10) {
                                print = true;
                            }
                        }
                        break;
                    case (32):
                    case (10):
                        if (print == true) {
                            System.out.print("\n");
                        }
                        print = false;
                        break;
                    default:
                        break;
                }
                if (print) {
                    System.out.print(Character.toChars(chars.get(k)));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getWordsWithEqualFirstAndLastChars() {
        String[] words;
        String text = "";
        FileInputStream fis = null;
        int i = 0;
        ArrayList<Character> chars = new ArrayList<Character>();
        try {
            fis = new FileInputStream("src/main/resources/test.txt");
            while ((i = fis.read()) != -1) {
                text += (char) i;
            }
            text = text.replaceAll("\n", " ");
            words = text.split(" ");

            String first;
            String last;
            for (int k = 0; k < words.length - 1; k++) {
                first = words[k + 1].substring(0, 1);
                last = words[k].substring(words[k].length() - 1, words[k].length());
                if (first.equalsIgnoreCase(last)) {
                    System.out.println(words[k]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //-------Task5
    public static void getIncreasingNumbers(String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(inputStreamReader)
        ) {
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = br.readLine()) != null) {
                stringBuilder.append(stringBuilder.length() == 0 ? "\"" : ", \"");
                for (int value : processLine(line)) {
                    stringBuilder.append(value).append(" ");
                }
                int length = stringBuilder.length();
                stringBuilder.deleteCharAt(length - 1).append("\"");
            }

            System.out.print(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] processLine(String line) {
        return findLongestSequence(distinct(sort(parseInt(line.split(" ")))));
    }

    public static int[] findLongestSequence(int[] arr) {
        int end = 0;
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    end = i;
                }
                currentLength = 0;
            } else {
                currentLength++;
            }
        }

        return Arrays.copyOfRange(arr, end - maxLength, end + 1);
    }

    public static int[] distinct(int[] arr) {
        int pointer = 0;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                result[pointer++] = arr[i];
                if (i + 1 == result.length - 1) {
                    result[pointer++] = arr[i + 1];
                }
            }
        }
        return result;
    }

    public static int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] parseInt(String[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = Integer.parseInt(arr[i]);
        }
        return result;
    }
}
