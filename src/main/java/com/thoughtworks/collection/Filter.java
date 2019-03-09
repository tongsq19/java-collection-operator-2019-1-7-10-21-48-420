package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> resultList = new ArrayList<Integer>();
        for(int i = 0; i < array.size(); i++) {
            if(array.get(i) % 2 == 0 ) resultList.add(array.get(i));
        }
        return resultList;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> resultList = new ArrayList<Integer>();
        for(int i = 0; i < array.size(); i++) {
            if(array.get(i) % 3 == 0 ) resultList.add(array.get(i));
        }
        return resultList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> resultList = new ArrayList<Integer>();

        for(int value : firstList) {
            if(secondList.contains(value)) {
                resultList.add(value);
            }
        }
        return resultList;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> resultList = new ArrayList<Integer>();
        for(int i = 0; i < array.size(); i++) {
            if( !resultList.contains(array.get(i)) ) resultList.add(array.get(i));
        }
        return resultList;
    }
}