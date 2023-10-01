package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("privet");
        list.add("how are u");
        list.add("bye");
        list.add("cool");
        list.add("bruh");
        list.add("cool");
        list.add("how are u");
        list.add("privet");
        list.add("hello");
        list.add("hello");
        list.add("fine");
        list.add("bruh");
        System.out.println(countOccurance(list, "fine"));
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(toList(array));
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(4);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(2);
        System.out.println(findUnique(list2));
        calcOccurance(list);
        System.out.println(findOccurance(list));


    }

    public static int countOccurance(List<String> stringList, String str) {

        int res = 0;
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            String word = stringIterator.next();
            if (word.equals(str)) {
                res++;
            }
        }

        return res;
    }

    public static List<Integer> toList(int[] array) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        return list;
    }

    public static List<Integer> findUnique(List<Integer> list) {

        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());

        return newList;
    }

    public static void calcOccurance(List<String> stringList) {

        HashMap<String, Integer> count = new HashMap<>();
        for (String word : stringList) {
            if (!count.containsKey(word)) {
                count.put(word, 0);
            }
            count.put(word, count.get(word) + 1);
        }
        for (String word : count.keySet()) {
            System.out.println(word + " " + count.get(word));
        }

    }

    public static HashMap<String, Integer> findOccurance(List<String> stringList) {

        HashMap<String, Integer> count = new HashMap<>();
        for (String word : stringList) {
            if (!count.containsKey(word)) {
                count.put(word, 0);
            }
            count.put(word, count.get(word) + 1);
        }

        return count;
    }
}
