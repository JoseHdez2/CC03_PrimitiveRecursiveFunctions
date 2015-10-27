package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import basic.Projection;
import basic.Successor;
import basic.Zero;
import constructor.Composition;
import derived.RecursiveAddition;
import derived.RecursiveMultiplication;
import derived.RecursivePower;

public class Main {

    public static void main(String[] args) {
        // Basic PRFs
        Projection P = new Projection();
        Successor succ = new Successor();
        Zero zero = new Zero();
        // Constructor PRFs
        Composition o = new Composition();
        // Derived PRFs
        RecursiveAddition rec_add = new RecursiveAddition();
        RecursiveMultiplication rec_mul = new RecursiveMultiplication();
        RecursivePower rec_pow = new RecursivePower();
        
//        Sys.out(P.__(2,2,3,4));
//        Sys.out(succ.__(2));
//        Sys.out(zero.__(2,1,3,4));
//        Sys.out(o.__(succ,zero.__((777))));
//        Sys.out(rec_add.__(9,2));
//        Sys.out(rec_mul.__(23,3));
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int base, exp;
        try {

            System.out.println("Introduzca la base de la potencia: ");
            base = Integer.parseInt(br.readLine());
            System.out.println("Introduzca el exponente de la potencia: ");
            exp = Integer.parseInt(br.readLine());
            System.out.print("El resultado es: ");
            Sys.out(rec_pow.__(base,exp));
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}
