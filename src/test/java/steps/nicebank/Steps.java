package steps.nicebank;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nicebank.Account;
import nicebank.CashSlot;
import nicebank.Money;
import nicebank.Teller;
import org.junit.Assert;
import support.KnowsTheDomain;
import transforms.MoneyConverter;

/**
 * Created by juan.hernandez on 7/14/17.
 */
public class Steps {

    KnowsTheDomain helper;

    public Steps(){
        helper = new KnowsTheDomain();
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

