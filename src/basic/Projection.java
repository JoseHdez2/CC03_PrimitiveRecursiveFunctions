package basic;

import abs.PrimitiveRecursiveFunction;

/**
 * @author jose
 *
 *  Basic Primitive Recursive Function: Projection.
 */
public class Projection extends PrimitiveRecursiveFunction{

    // TODO: == only works for numbers between -128 and 127 
    
    protected Integer treatInput(Object... input) throws Exception {
        int n = (int)input[0];
        int i = (int)input[1];
        int tupleSize = inputTokenNum - 2;
        if (n != tupleSize) throw new Exception("Invalid n parameter.");
        if (!(0 < i || i <= tupleSize)) throw new Exception("Invalid i parameter.");
        
        // -1 to convert zeroth to normal ordinal counting...
        // +2 to skip the first two arguments (n, i)
        return (Integer) input[i+1];
    }

    /*
     * Input token number validation.
     */
    
    @Override
    protected int expectedTokenMin() {
        return 3;
    }

    @Override
    protected int expectedTokenMax() {
        return Integer.MAX_VALUE;
    }
}
