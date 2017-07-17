package nicebank;

/**
 * Created by juan.hernandez on 7/17/17.
 */
public class Teller {

    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot){
        this.cashSlot = cashSlot;
    }

    public void withdrawFrom(Account account,  int dollars){
        cashSlot.dispense(dollars);
    }
}
