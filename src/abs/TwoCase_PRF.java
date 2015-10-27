package abs;

public abstract class TwoCase_PRF extends PrimitiveRecursiveFunction {
    
    // TODO: Do all TwoCase PRFs have two tokens as their input, no more, no less?
    // Thinking about my implementation, not Mathematics.
    
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
    
    /*
     * Function implementation.
     */
    
    @Override
    protected Integer treatInput(Object... input) throws Exception {
//        Integer x = (Integer)input[0];
//        Integer y = (Integer)input[0];
        // TODO: Use x, y instead in all PRFs, since it's always 2 parameters.
        
        if ((Integer)input[1] < 0){
            throw new Exception("Second parameter less than zero. Would recurse indefinitely.");
        }
        if ((Integer)input[1] == 0){
            return baseCase(input);         // Base case ( y = 0 )
        } else {
            return recursiveCase(input);    // Recursive case ( y > 0 )
        }
    }
    
    /**
     * Case that calls itself. Will activate as long as (y > 0).
     * @param input
     * @return Depends on implementing class.
     */
    protected abstract Integer recursiveCase(Object... input);
    
    /**
     * Case that will end the recursion. Will activate when (y = 0).
     * @param input
     * @return Depends on implementing class.
     */
    protected abstract Integer baseCase(Object... input);


}
