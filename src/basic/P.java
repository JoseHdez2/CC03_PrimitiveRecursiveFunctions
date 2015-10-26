package basic;

import abs.PrimitiveRecursiveFunction;

/**
 * @author jose
 *
 *  Basic Primitive Recursive Function: Projection.
 */
public class P extends PrimitiveRecursiveFunction{


    // TODO: == only works for numbers between -128 and 127 
    
    public static Integer __(Object... input) throws Exception {
        int token_number = 0;
        for (Object ob : input) token_number++;
        if (token_number < 3) throw new Exception("Incorrect input size.");
        int n = (int)input[0];
        int i = (int)input[1];
        int tuple_size = token_number - 2;
        if (n != tuple_size) throw new Exception("Invalid n parameter.");
        if (!(0 < i || i <= tuple_size)) throw new Exception("Invalid i parameter.");
        return (Integer) input[i+2-1];
    }
}
