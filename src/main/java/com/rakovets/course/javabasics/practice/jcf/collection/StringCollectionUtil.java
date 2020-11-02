package com.rakovets.course.javabasics.practice.jcf.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(Collection<String> list, int i) {
        Collection<String> censoredList = new ArrayList<String>();
        String star = "*";
        for (String str : list) {
            String result = str.length() == i ? star : str;
            censoredList.add(result);
        }
        return censoredList;
    }

    public Collection<String> removeWordsByLength(Collection<String> list, int i) {
        Collection<String> newList = new ArrayList<String>();
        for (String str : list) {
            if (str.length() != i) {
                newList.add(str);
            }
        }
        return newList;
    }
}
