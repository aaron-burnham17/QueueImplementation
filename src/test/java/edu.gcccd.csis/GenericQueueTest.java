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

        IntQueue.enqueue(1);
        assertEquals((Integer)1,IntQueue.dequeue());
        IntQueue.enqueue(256);
        assertEquals((Integer)256,IntQueue.dequeue());
    }

    @Test
    public void lengthTest() {
        GenericQueue<Exception> ExcepQueue = new GenericQueue<Exception>();

        assertEquals(0,ExcepQueue.length());
        for(int i = 0; i < 36;i++) {
            ExcepQueue.enqueue(null);
        }
        assertEquals(36,ExcepQueue.length());

    }
}