package main;

import basic.Projection;
import basic.Successor;
import basic.Zero;
import constructor.Composition;
import derived.RecursiveSum;

public class Main {

    public static void main(String[] args) {
        // Basic PRFs
        Projection P = new Projection();
        Successor succ = new Successor();
        Zero zero = new Zero();
        // Constructor PRFs
        Composition o = new Composition();
        // Derived PRFs
        RecursiveSum rec_sum = new RecursiveSum();
        
        Sys.out(P.__(2,2,3,4));
        Sys.out(succ.__(2));
        Sys.out(zero.__(2,1,3,4));
        Sys.out(o.__(succ,zero.__((777))));
        Sys.out(rec_sum.__(3,2));
        
        
        
    }
}
