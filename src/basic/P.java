package basic;

import abs.PrimitiveRecursiveFunction;
import structs.Tuple;

/**
 * @author jose
 *
 *  Basic Primitive Recursive Function: Projection.
 */
public class P extends PrimitiveRecursiveFunction{

    /*
     * Same code for every PRF.
     * Since static function inheritance is not allowed in Java.
     */
    
    public static Tuple __( Object... inputs){
        Tuple input = new Tuple(inputs);
        try {
            return treatInput(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // TODO: == only works for numbers between -128 and 127 
    
    private static Tuple treatInput(Tuple input) throws Exception {
        if (input.size() < 3) throw new Exception("Incorrect input size.");
        int n = input.get(input.get(0));
        int i = input.get(input.get(1));
        Tuple inputTuple = new Tuple();
        if (n != input.size()) throw new Exception("Invalid n parameter.");
        if (!(0 < i || i < input.size()-1)) throw new Exception("Invalid i parameter.");
        return null;
    }
}
