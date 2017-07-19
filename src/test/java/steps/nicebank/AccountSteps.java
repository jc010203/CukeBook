package steps.nicebank;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.WebDriverHooks;
import nicebank.Account;
import nicebank.Money;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import support.KnowsTheDomain;
import transforms.MoneyConverter;

/**
 * Created by juan.hernandez on 7/17/17.
 */
public class AccountSteps extends Steps{

    @Autowired
    KnowsTheDomain helper;

    private Account myAccount;


    @Given("^I have deposited \\$(\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        myAccount = helper.getMyAccount();
        myAccount.deposit(amount);
        Assert.assertEquals("Incorrect balance - ", amount, myAccount.getBalance());
    }

    @When("^I request \\$(\\d+)$")
    public void iRequest$(int dollars) throws Throwable {
        getHelper().getTeller().withdrawFrom(myAccount, dollars);
    }

    @Then("^the balance of my account should be \\$(\\d+\\.\\d+)$")
    public void theBalanceOfMyAccountShouldBe$(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        Assert.assertEquals("Incorrect account balance -", amount, myAccount.getBalance());
    }
}
