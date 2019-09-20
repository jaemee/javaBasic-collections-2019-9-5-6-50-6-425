package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.function.Consumer;

public class DistinctIterable<Character> implements Iterable<Character> {
    private Iterable<Character> iterable;

    public DistinctIterable(Iterable<Character> iterable) {
        this.iterable = iterable;
    }

    @Override
    public Iterator<Character> iterator() {
        return new DistinctIterator<>(iterable.iterator());
    }

    public List<Character> toList() {
        ArrayList<Character> result = new ArrayList<>();
        this.forEach(result::add);
        return result;
    }
}

class DistinctIterator<E> implements Iterator<E> {
    // TODO: Implement the class to pass the test. Note that you cannot put all items into memory or you will fail.
    // <--start
    @SuppressWarnings({"FieldCanBeLocal", "unused"})
    private final Iterator<E> iterator;
    private List<Character> tempChar = new ArrayList<>();
    private E checker;

    DistinctIterator(Iterator<E> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        while(this.iterator.hasNext()){
            checker = iterator.next();
            if(tempChar.contains(checker)){
                checker = iterator.next();
            }else {
                tempChar.add((Character)checker);
                return iterator.hasNext();
            }
        }

        return this.iterator.hasNext();
    }

    @Override
    public E next() {
        return checker;
    }



    // --end->
}