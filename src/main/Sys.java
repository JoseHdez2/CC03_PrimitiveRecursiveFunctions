package main;

import structs.Tuple;

public abstract class Sys {
    public static void out(Object... objects){
        Tuple tuple = new Tuple(objects);
        System.out.println(tuple);
    }
}
