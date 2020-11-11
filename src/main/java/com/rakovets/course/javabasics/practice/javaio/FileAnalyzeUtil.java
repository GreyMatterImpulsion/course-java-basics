package com.rakovets.course.javabasics.practice.javaio;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class FileAnalyzeUtil {
    public static void main(String[] args) {
        getFileStrings();
        getWordsStartWithVowels();
        getWordsWithEqualFirstAndLastChars();
        getIncreasingNumbers();
    }

    public static void getFileStrings() {
        FileInputStream fis =null;
        int i = 0;
        try {
            fis = new FileInputStream("//D:/home/smargun/dev/course-java-basics/src/main/resources/test.txt");
            while ((i = fis.read()) != -1)
            {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getWordsStartWithVowels() {
        FileInputStream fis =null;
        int i = 0;
        ArrayList<Integer> chars = new ArrayList<Integer>();
        boolean print = false;

        try {
            fis = new FileInputStream("//D:/home/smargun/dev/course-java-basics/src/main/resources/test.txt");
            while ((i = fis.read()) != -1) {
                chars.add(i);
            }
            for (int k = 0; k < chars.size(); k++){
                switch (chars.get(k)) {
                    case (65) :
                    case (97):
                    case(69):
                    case (101):
                    case (73):
                    case (105):
                    case (79):
                    case (111):
                    case(85):
                    case (117):
                    case (89):
                    case (121):
                        if (k == 0) {
                            print = true;
                        } else {
                            if(chars.get(k-1) == 32 || chars.get(k-1) == 10) {
                                print = true;
                            }
                        }
                        break;
                    case (32):
                    case(10):
                        if(print == true) {
                            System.out.print("\n");
                        }
                        print = false;
                        break;
                    default:
                        break;
                }
                if(print) {
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
            fis = new FileInputStream("//D:/home/smargun/dev/course-java-basics/src/main/resources/test.txt");
            while ((i = fis.read()) != -1) {
                text += (char)i;
            }
            text = text.replaceAll("\n", " ");
            words = text.split(" ");

            String first;
            String last;
            for (int k = 0; k < words.length - 1; k++) {
                first = words[k + 1].substring(0,1);
                last = words[k].substring(words[k].length() -1, words[k].length());
                if(first.equalsIgnoreCase(last)) {
                    System.out.println(words[k]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getIncreasingNumbers() {

        try (FileInputStream fileInputStream = new FileInputStream(
                "//D:/home/smargun/dev/course-java-basics/src/main/resources/test2");
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(inputStreamReader)) {
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = br.readLine()) != null) {
                stringBuilder.append(stringBuilder.length() == 0 ? "\"" : ", \"");
                for (int value : splitLineParseAndSort(line)) {
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

   public static int[] splitLineParseAndSort(String line) {
       StringBuilder stringBuilder = new StringBuilder();
       ArrayList<Integer> preResult = new ArrayList<Integer>();
       ArrayList<Integer> comb = new ArrayList<Integer>();
       ArrayList<Integer> temp = new ArrayList<Integer>();
       for (String s: line.split(" ")) {
           int value = Integer.parseInt(s);
           preResult.add(value);
       }
       temp.add(preResult.get(0));
       for (int k = 0; k < preResult.size(); k++) {
           if (((preResult.get(k) - temp.get(temp.size() - 1) == 1))) {
               temp.add(preResult.get(k));
           } else {
               if (temp.size() > comb.size()) {
                   comb = temp;
               }
               temp.clear();
               temp.add(preResult.get(k));
           }
       }
       int [] result = new int[comb.size()];
       for (int s: comb) {
           int i = 0;
           result[i] = s;
       }
       return result;
   }
}