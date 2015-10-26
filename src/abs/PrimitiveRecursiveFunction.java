package abs;


public abstract class PrimitiveRecursiveFunction {
 
    protected int inputTokenNum;
    
    /*
     * Input token number validation.
     */

    /**
     * Low-level function.
     * Counts the tokens, and throws an exception if outside the expected range.
     * @param input
     * @throws Exception
     */
    protected void validateTokenNum(Object... input) throws Exception{
        inputTokenNum = input.length;
        if (inputTokenNum < expectedTokenMin()){
            String str = String.format("%d tokens, expected at least %d.", inputTokenNum, expectedTokenMin());
            throw new Exception(str);
        }
            
        if (inputTokenNum > expectedTokenMax()){
            String str = String.format("%d tokens, expected at most %d.", inputTokenNum, expectedTokenMax());
            throw new Exception(str);
        }
    }
    
    /**
     * @return  Minimum number of tokens this PRF takes.
     */
    protected abstract int expectedTokenMin();
    
    /**
     * @return  Maximum number of tokens this PRF takes.
     */
    protected abstract int expectedTokenMax();
    
    
    /**
     * High-level Mathematical PRF function.
     * Process the input and return the output.
     * @param input
     * @return
     */
    public Integer __(Object... input){
        try{
            validateTokenNum(input);    // wow damn haha
            return treatInput(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    };
    
    /**
     * Low-level function.
     * Subsection of {@link PrimitiveRecursiveFunction#__(Object...)}, where the number of parameters
     * has already been checked by {@link PrimitiveRecursiveFunction#validateTokenNum(Object...)}
     * and we can concentrate on processing the correctly-sized input.
     * @param input
     * @return
     * @throws Exception
     */
    protected abstract Integer treatInput(Object... input) throws Exception;

}
