package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class SingleLinkImpl <T> implements SingleLink<T> {

    private List<T> list = new ArrayList<>();

    @Override
    public void addTailPointer(T item) {
        list.add(item);
    }

    @Override
    public T getNode(int index) {
        return list.get(index - 1);
    }
}
