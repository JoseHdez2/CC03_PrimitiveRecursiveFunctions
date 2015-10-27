package derived;

import abs.TwoCase_PRF;
import basic.Successor;

public class RecursiveAddition extends TwoCase_PRF {

    @Override
    protected Integer recursiveCase(Object... input) {
        Successor succ = new Successor();
        RecursiveAddition rec_add = new RecursiveAddition();
//        return P.__(3,3,)
        return succ.__(rec_add.__(input[0],(Integer)input[1]-1));
    }

    @Override
    protected Integer baseCase(Object... input) {
        return (Integer)input[0];
    }

}
