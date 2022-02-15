package com.raw.black_belt.n002_generics;

import java.util.ArrayList;
import java.util.List;

public class Na5Subtyping {
    public static void main(String[] args) {
        X x = new Y();
//        List<X> xList = new ArrayList<Y>(); // error
        // так как Совокупность ArrayList с параметром Y  не является подтипом List с параметром X
    }
}
class X{}
class Y extends X{}
