package steps.nicebank;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nicebank.Money;
import org.junit.Assert;
import transforms.MoneyConverter;

/**
 * Created by juan.hernandez on 7/14/17.
 */
public class Steps {

    KnowsTheDomain helper;

    public Steps(){
        helper = new KnowsTheDomain();
    }

    class KnowsTheDomain{
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

    class Account {
        private Money balance = new Money();

        public void deposit(Money amount) {
            balance = balance.add(amount);
        }

        public Money getBalance() {
            return balance;
        }
    }

    class Teller{
        private CashSlot cashSlot;

        public Teller(CashSlot cashSlot){
            this.cashSlot = cashSlot;
        }

        public void withdrawFrom(Account account,  int dollars){
            cashSlot.dispense(dollars);
        }
    }

    class CashSlot{
        private int contents;

        public int getContents() {
            return contents;
        }

        public void dispense(int dollars){
            contents = dollars;
        }
    }

    @Given("^I have deposited \\$(\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().deposit(amount);
        Assert.assertEquals("Incorrect balance - ", amount, helper.getMyAccount().getBalance());
    }

    @When("^I request \\$(\\d+)$")
    public void iRequest$(int dollars) throws Throwable {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", dollars, helper.getCashSlot().getContents());
    }
}

