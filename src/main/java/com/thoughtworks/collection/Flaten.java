package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> oneDimensionArray = new ArrayList<>();
        for(Integer[] column : array) {
            for(int element : column) {
                oneDimensionArray.add(element);
            }
        }
        return oneDimensionArray;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> oneDimensionArray = new ArrayList<>();
        for(Integer[] column : array) {
            for(int element : column) {
                if (!oneDimensionArray.contains(element)) {
                    oneDimensionArray.add(element);
                }
            }
        }
        return oneDimensionArray;
    }
}
