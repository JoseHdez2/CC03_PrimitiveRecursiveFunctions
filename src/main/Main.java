package main;

import basic.Projection;
import basic.Successor;
import basic.Zero;
import constructor.Composition;

public class Main {
    // Basic PRFs
    Projection P = new Projection();
    Successor succ = new Successor();
    Zero zero = new Zero();
    // Constructor PRFs
    Composition o = new Composition();
    
    public static void main(String[] args) {
        Sys.out(3,4);
        Sys.out(2,2);
    }
}
