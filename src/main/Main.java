package main;

import basic.P;
import structs.Tuple;

public class Main {
    public static void main(String[] args) {
        System.out.println((new Tuple(3,4)));
        System.out.println(new Tuple(2,2,new Tuple(3,4)));
        System.out.println(P.__(new Tuple(2,2,new Tuple(3,4))));
    }
}
