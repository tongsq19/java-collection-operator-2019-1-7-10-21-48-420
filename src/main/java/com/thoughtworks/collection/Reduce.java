package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int max = arrayList.get(0);
        for(int v : arrayList) {
            if(v > max) {
                max = v;
            }
        }
        return max;
    }

    public double getMinimum() {
        int min = arrayList.get(0);
        for(int v : arrayList) {
            if(v < min) {
                min = v;
            }
        }
        return min;
    }

    public double getAverage() {
        int sum = 0;
        int count = 0;
        for(int v: arrayList) {
            sum += v;
            count++;
        }
        return (double)sum/count;
    }

    public double getOrderedMedian() {

        Integer[] ordered = arrayList.toArray(new Integer[arrayList.size()]);
        Arrays.sort(ordered);
        if(ordered.length % 2 == 0) {
            return 0.5*(ordered[ordered.length/2 - 1] + ordered[ordered.length/2]);
        } else {
            return ordered[ordered.length/2 - 1];
        }
    }

    public int getFirstEven() {

        for(int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) % 2 == 0) {
                return arrayList.get(i);
            }
        }
        return 0;
    }

    public int getIndexOfFirstEven() {
        for(int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) % 2 == 0) {
                return i;
            }
        }
        return 0;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if(arrayList.size() != this.arrayList.size()) return false;
        for(int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) != this.arrayList.get(i)) {
                return false;
            }
        }
        return true;
    }

    public double getMedianInLinkList(SingleLink singleLink) {
        for(int i=0; i<arrayList.size(); i++){
            singleLink.addTailPointer(arrayList.get(i));
        }

        int index = arrayList.size()/2;

        if(arrayList.size()%2 == 0){
            int value1 = (int)singleLink.getNode(index);
            int value2 = (int)singleLink.getNode(index+1);
            return 0.5 * (value1 + value2);
        } else {
            return (int) singleLink.getNode(index+1);
        }
    }

    public int getLastOdd() {
        for(int i = arrayList.size() - 1; i >=0 ; i++) {
            if(arrayList.get(i) % 2 == 1) {
                return arrayList.get(i);
            }
        }
        return 0;
    }

    public int getIndexOfLastOdd() {
        for(int i = arrayList.size() - 1; i >=0 ; i++) {
            if(arrayList.get(i) % 2 == 1) {
                return i;
            }
        }
        return 0;
    }
}
