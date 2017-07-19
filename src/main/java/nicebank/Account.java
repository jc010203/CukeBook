package nicebank;

import org.springframework.stereotype.Component;

/**
 * Created by juan.hernandez on 7/17/17.
 */


public class Account {
    private Money balance = new Money();

    public void credit(Money amount) {
        balance = balance.add(amount);
    }

    public Money getBalance() {
        return balance;
    }

    public void debit(int dollars){
        balance = balance.minus(new Money(dollars, 0));
    }
}
