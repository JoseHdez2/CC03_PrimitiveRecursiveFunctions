package basic;

/**
 * @author jose
 *
 *  Basic Primitive Recursive Function: Successor.
 */
public class Succ {
    
    public static Integer __(Object... input) throws Exception {
        int size = 0;
        for (Object ob : input) size++;
        if (size != 1) throw new Exception("Invalid number of parameters.");
        return (Integer)input[0] + 1;
    }
    
}
