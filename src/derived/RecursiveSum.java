package derived;

import abs.PrimitiveRecursiveFunction;

public class RecursiveSum extends PrimitiveRecursiveFunction {

    @Override
    protected int expectedTokenMin() {
        // TODO Auto-generated method stub
        return 1;
    }

    @Override
    protected int expectedTokenMax() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    protected Integer treatInput(Object... input) throws Exception {
        if (input.length == 2){
            return (Integer)input[0] + treatInput(input[1]);
        }
        if (input.length == 1){
            return (Integer)input[0];
        }
        if (input.length <= 0){
            throw new Exception("Recursive base case skip. Shouldn't happen.");
        }
        return null;
    }

}
