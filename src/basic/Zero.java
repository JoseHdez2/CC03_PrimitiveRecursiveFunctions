package basic;

import structs.Tuple;

/**
 * @author jose
 * 
 * Basic Primitive Recursive Function: Zero.
 */
public class Zero {

    public static Tuple __(Tuple input) {
        Tuple output = new Tuple();
        output.add(0);
        return output;
    }

}
