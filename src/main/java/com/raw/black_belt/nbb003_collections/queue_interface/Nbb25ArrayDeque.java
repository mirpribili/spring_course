package com.raw.black_belt.nbb003_collections.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class Nbb25ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(11);
        deque.addLast(112);
        deque.addFirst(8);

        System.out.println(deque.removeFirst());
        deque.removeAll(deque);
        deque.peekFirst();
    }
}
