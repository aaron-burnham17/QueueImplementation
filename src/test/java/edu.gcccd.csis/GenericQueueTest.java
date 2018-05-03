package edu.gcccd.csis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenericQueueTest {

    @Test
    public void dequeueTest() {
        GenericQueue<String> StringQueue = new GenericQueue<String>();

        StringQueue.enqueue("String1");
        StringQueue.enqueue("String2");
        assertEquals("String1",StringQueue.dequeue());
        assertEquals("String2",StringQueue.dequeue());
    }

    @Test
    public void enqueueTest() {
        GenericQueue<Integer> IntQueue = new GenericQueue<Integer>();

        Intqueue.enqueue

    }

    @Test
    public void lengthTest() {
    }
}