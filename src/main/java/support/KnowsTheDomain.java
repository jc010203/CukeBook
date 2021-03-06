package support;

import nicebank.Account;
import nicebank.CashSlot;
import nicebank.Teller;
import org.springframework.stereotype.Component;

/**
 * Created by juan.hernandez on 7/17/17.
 */

@Component
public class KnowsTheDomain {

    private Account myAccount;
    private Teller teller;
    private CashSlot cashSlot;

    public Account getMyAccount() {
        if (myAccount == null){
            myAccount = new Account();
        }

        return myAccount;
    }

    public Teller getTeller() {
        if (teller == null){
            teller = new Teller(getCashSlot());
        }

        return teller;
    }

    public CashSlot getCashSlot() {
        if (cashSlot == null){
            cashSlot = new CashSlot();
        }

        return cashSlot;
    }
}
