package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < array.size(); ++i) {
            resultList.add(3 * this.array.get(i));
        }
        return resultList;
    }

    public List<String> mapLetter() {
        List<String> resultList = new ArrayList<>();
        for(int i = 0; i < array.size(); ++i) {
            resultList.add(letterList.get(i));
        }
        return resultList;
    }

    public List<String> mapLetters() {
        List<String> resultList = new ArrayList<>();

        for(int i = 0; i < array.size(); ++i) {
            int value = array.get(i);
            String letters;

            if(value > 26) {
                if(value%26 == 0) {
                    letters = letterList.get(value/26 - 2) + letterList.get(value%26 + 25);
                } else {
                    letters = letterList.get(value/26 - 1) + letterList.get(value%26 - 1);
                }

            } else {
                letters = letterList.get(value%26 - 1);
            }
            resultList.add(letters);
        }
        return resultList;
    }

    public List<Integer> sortFromBig() {
        List<Integer> resultList = new ArrayList<>();
        Integer[] arr= array.toArray(new Integer[array.size()]);
        Arrays.sort(arr);
        for(int i=arr.length-1; i >= 0; --i) {
            resultList.add(arr[i]);
        }

        return resultList;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> resultList = new ArrayList<>();
        Integer[] arr= array.toArray(new Integer[array.size()]);
        Arrays.sort(arr);
        resultList.addAll(Arrays.asList(arr));
        return resultList;
    }
}
