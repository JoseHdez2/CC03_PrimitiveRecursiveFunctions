package basic;

import abs.PrimitiveRecursiveFunction;

/**
 * @author jose
 *
 *  Basic Primitive Recursive Function: Successor.
 */
public class Successor extends PrimitiveRecursiveFunction{
    
    protected Integer treatInput(Object... input) throws Exception {
        if (inputTokenNum != 1) throw new Exception("Invalid number of parameters.");
        return (Integer)input[0] + 1;
    }

    /*
     * Input token number validation.
     */
    
    @Override
    protected int expectedTokenMin() {
        // TODO Auto-generated method stub
        return 1;
    }

    @Override
    protected int expectedTokenMax() {
        // TODO Auto-generated method stub
        return 1;
    }
    
}
