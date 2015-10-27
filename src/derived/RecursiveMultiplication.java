package derived;

import abs.TwoCase_PRF;

public class RecursiveMultiplication extends TwoCase_PRF {

    @Override
    protected Integer recursiveCase(Object... input) {
        RecursiveAddition rec_add = new RecursiveAddition();
        RecursiveMultiplication rec_mul = new RecursiveMultiplication();
        return rec_add.__(input[0],rec_mul.__(input[0],(Integer)input[1]-1));
    }

    @Override
    protected Integer baseCase(Object... input) {
        return 0;
    }


}
