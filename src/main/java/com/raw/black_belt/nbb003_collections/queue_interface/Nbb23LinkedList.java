package com.raw.black_belt.nbb003_collections.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class Nbb23LinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.peek();
        System.out.println(queue);
    }
}
