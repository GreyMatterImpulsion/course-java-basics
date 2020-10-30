package com.rakovets.course.javabasics.practice.jcf.collection;

import java.util.ArrayList;
import java.util.List;

public class StringCollectionUtil {
    public List<String> resetWordsByLength(List<String> list, int i) {
        List<String> censoredList = new ArrayList<String>();
        String star = "*";
        for (String str : list) {
            String result = str.length() == i ? star : str;
            censoredList.add(result);
        }
        return censoredList;
    }

    public List<String> removeWordsByLength(List<String> list, int i) {
        List<String> newList = new ArrayList<String>();
        for (String str : list) {
            if (str.length() != i) {
                newList.add(str);
            }
        }
        return newList;
    }
}
