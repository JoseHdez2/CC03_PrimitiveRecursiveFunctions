package basic;

import abs.PrimitiveRecursiveFunction;

/**
 * @author jose
 * 
 * Basic Primitive Recursive Function: Zero.
 */
public class Zero extends PrimitiveRecursiveFunction{

    protected Integer treatInput(Object... objects){
        return 0;
    }

    @Override
    protected int expectedTokenMin() {
        return 0;
    }

    @Override
    protected int expectedTokenMax() {
        return Integer.MAX_VALUE;
    }

}
