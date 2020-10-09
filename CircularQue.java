package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class CircularQue {
    int size;
    Queue<Integer> fq;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public CircularQue(int k) {
        fq= new PriorityQueue<Integer>(k);


    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(!fq.isEmpty()){
            return false;
        }

        fq.add(value);
        return true;

    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        fq.remove();
        return true;

    }

    /** Get the front item from the queue. */
    public int Front() {
        int save=fq.peek();
        return save;

    }




}
