package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> resultList = new ArrayList<Integer>();

        if(left < right) {
            for(int i = left; i <= right; ++i)
                resultList.add(i);
        } else {
            for(int i = left; i >= right; --i)
                resultList.add(i);
        }

        return resultList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> resultList = new ArrayList<Integer>();
        if(left < right) {
            for(int i = left; i <= right; ++i)
                if(i%2== 0) resultList.add(i);
        } else {
            for(int i = left; i >= right; --i)
                if(i%2== 0) resultList.add(i);
        }

        return resultList;

    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> resultList = new ArrayList<Integer>();
        for(int value: array) {
            if(value%2 == 0) {
                resultList.add(value);
            }
        }
        return resultList;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {

        List<Integer> resultList = new ArrayList<Integer>();
        List<Integer> secondList = new ArrayList<Integer>();
        for(int value : secondArray) {
            secondList.add(value);
        }
        for(int value : firstArray) {
            if(secondList.contains(value)) {
                resultList.add(value);
            }
        }
        return resultList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> resultList = new ArrayList<Integer>(Arrays.asList(firstArray));

        for(int value : secondArray) {
            if(!resultList.contains(value)) {
                resultList.add(value);
            }
        }
        return resultList;
    }
}
