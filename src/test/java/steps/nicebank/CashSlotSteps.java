package steps.nicebank;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import support.KnowsTheDomain;

/**
 * Created by juan.hernandez on 7/17/17.
 */
public class CashSlotSteps {

    KnowsTheDomain helper;

    public CashSlotSteps(){
        helper = new KnowsTheDomain();
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", dollars, helper.getCashSlot().getContents());
    }
}
