package basic;

import structs.Tuple;

/**
 * @author jose
 *
 *  Basic Primitive Recursive Function: Successor.
 */
public class Succ {
    
    public static Tuple __(Tuple input) {
        Tuple output = new Tuple();
        output.add(input.get(0) + 1);
        return output;
    }
    
}
