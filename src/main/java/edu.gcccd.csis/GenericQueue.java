package edu.gcccd.csis;


import java.util.ArrayList;
import java.util.EmptyStackException;

public class GenericQueue<E> {

    private ArrayList<E> elements = null;

    public GenericQueue() {
        this(10);
    }

    public GenericQueue(int capacity){
        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<E>(initCapacity);
    }

    public E dequeue() {
        if(elements.isEmpty()){
            throw new EmptyStackException();
        }
        return elements.remove(0);
    }

    public void enqueue(E queueValue) {
        elements.add(queueValue);
    }

// current length of the queue
    public int length() {
        return elements.size();
    }
}