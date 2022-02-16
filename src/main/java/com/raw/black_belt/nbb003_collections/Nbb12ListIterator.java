package com.raw.black_belt.nbb003_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Nbb12ListIterator {
    public static void main(String[] args){
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()){
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()){
            if(iterator.next() != reverseIterator.previous()){
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome);

    }
}
