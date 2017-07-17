package steps.nicebank;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import nicebank.Money;
import org.junit.Assert;
import support.KnowsTheDomain;
import transforms.MoneyConverter;

/**
 * Created by juan.hernandez on 7/17/17.
 */
public class AccountSteps {

    KnowsTheDomain helper;

    public AccountSteps(){
        helper = new KnowsTheDomain();
    }


    @Given("^I have deposited \\$(\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().deposit(amount);
        Assert.assertEquals("Incorrect balance - ", amount, helper.getMyAccount().getBalance());
    }
}
