package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if(leftBorder > rightBorder)
            return getSumOfEvens(rightBorder, leftBorder);

        if(rightBorder%2 == 1) rightBorder-=1;
        if(leftBorder%2 == 1) leftBorder+=1;

        int w = (rightBorder + leftBorder)/2;
        int h = (rightBorder - leftBorder)/2 + 1;
        return  w * h;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if(leftBorder > rightBorder)
            return getSumOfOdds(rightBorder, leftBorder);

        if(leftBorder%2 == 0) leftBorder+=1;
        if(rightBorder%2 == 0) rightBorder-=1;

        int w = (rightBorder + leftBorder)/2;
        int h = (rightBorder - leftBorder)/2 + 1;
        return  w * h;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (int value: arrayList) {
            sum += 3*value + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> newList = new ArrayList<Integer>();
        for(int value : arrayList) {
            if(value%2 == 1) {
                newList.add(3*value + 2);
            } else {
                newList.add(value);
            }
        }
        return newList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for(int value : arrayList) {
            if( value%2 == 1 ) sum += 3*value + 5;
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        List<Integer> evens = new ArrayList<Integer>();
        for(int value : arrayList) {
            if( value%2 == 0 ) {
                evens.add(value);
            }
        }
        double median;
        if(evens.size()%2 == 1) {
            median = evens.get(evens.size()/2);
        } else {
            median = 0.5 * (evens.get(evens.size()/2 - 1) + evens.get(evens.size()/2));
        }
        return median;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        int sum = 0;
        int count = 0;
        for(int value : arrayList) {
            if( value%2 == 0 ) {
                sum += value;
                count += 1;
            }
        }
        return (double)(sum)/count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        for(int value : arrayList) {
            if( value%2 == 0 && value == specialElment) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> resultArray = new ArrayList<>();

        for(int value : arrayList) {
            if(value%2 == 0 && !resultArray.contains(value)) {
                resultArray.add(value);
            }
        }
        return resultArray;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {

        List<Integer> oddList = new ArrayList<Integer>();
        List<Integer> evenList = new ArrayList<Integer>();

        for (int value : arrayList) {
            if (value % 2 == 1) {
                oddList.add(-value);
            } else {
                evenList.add(value);
            }
        }

        Integer[] oddArray = oddList.toArray(new Integer[0]);
        Integer[] evenArray = evenList.toArray(new Integer[0]);
        Arrays.sort(oddArray);
        Arrays.sort(evenArray);

        List<Integer> resultList = new ArrayList<Integer>(Arrays.asList(evenArray));

        for(int value : oddArray) {
            resultList.add(-value);
        }
        return resultList;

    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size()-1; i++) {
            newList.add((arrayList.get(i) + arrayList.get(i + 1))*3);
        }
        return newList;
    }
}
