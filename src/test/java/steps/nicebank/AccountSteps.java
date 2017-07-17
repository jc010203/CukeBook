package steps.nicebank;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import nicebank.Money;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import support.KnowsTheDomain;
import transforms.MoneyConverter;

/**
 * Created by juan.hernandez on 7/17/17.
 */
public class AccountSteps extends Steps{

    @Autowired
    KnowsTheDomain helper;

    @Given("^I have deposited \\$(\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().deposit(amount);
        Assert.assertEquals("Incorrect balance - ", amount, helper.getMyAccount().getBalance());
    }
}
