package basic;

import structs.Tuple;

/**
 * @author jose
 *
 *  Basic Primitive Recursive Function: Projection.
 */
public class P {

//    TODO: What about the error cases?
    
    // == only works for numbers between -128 and 127 
    
    public static Integer __(Integer n, Integer i, Integer input) {
//        if (!(n == 1)) throw new Exception("Projection: Incorrect n parameter");
//        if (!(i == 1)) throw new Exception("Projection: Incorrect i parameter");
      return input;
  }
    
    public static Integer __(Integer n, Integer i, Tuple input) {
//        if (n != input.size()) throw new Exception("Projection: Incorrect n parameter");
//        if (i < 0 || i > input.size()-1) throw new Exception("Projection: Incorrect i parameter");
        return input.get(i);
    }
}
