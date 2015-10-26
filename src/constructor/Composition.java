package constructor;

import abs.PrimitiveRecursiveFunction;

/**
 * @author jose
 *
 *  Constructor Primitive Recursive Function: Composition.
 */
public class Composition extends PrimitiveRecursiveFunction {
    
    protected Integer treatInput(Object... objects){
        PrimitiveRecursiveFunction f = (PrimitiveRecursiveFunction)objects[0];
        Integer g = (Integer)objects[1];
        return f.__(g);
    }

    /*
     * Input token number validation.
     */
    
    @Override
    protected int expectedTokenMin() {
        return 2;
    }

    @Override
    protected int expectedTokenMax() {
        return 2;
    }
}
