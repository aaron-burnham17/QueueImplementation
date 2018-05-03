package edu.gcccd.csis;


import java.util.ArrayList;
import java.util.EmptyStackException;

public class GenericQueue<T> {

    private final ArrayList<T> elements = null;

    public GenericQueue() {
        this(10);
    }

    public GenericQueue(int capacity){
        int initCapacity = capacity > 0 ? capacity : 10;
    }

    public T dequeue() {
        if(elements.isEmpty()){
            throw new EmptyStackException();
        }
        return elements.remove(0);
    }

    public void enqueue(T queueValue) {
        elements.add(queueValue);
    }

// current length of the queue
    public int length() {
        return elements.size();
    }
}