package derived;

import abs.TwoCase_PRF;
import basic.Successor;
import basic.Zero;

public class RecursivePower extends TwoCase_PRF{

    @Override
    protected Integer recursiveCase(Object... input) {
        RecursiveMultiplication rec_mul = new RecursiveMultiplication();
        RecursivePower rec_pow = new RecursivePower();
        return rec_mul.__(input[0],rec_pow.__(input[0],(Integer)input[1]-1));
    }

    @Override
    protected Integer baseCase(Object... input) {
        Zero zero = new Zero();
        Successor succ = new Successor();
        return succ.__(zero.__(input));
    }

}
