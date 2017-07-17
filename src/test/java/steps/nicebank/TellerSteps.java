package steps.nicebank;

import cucumber.api.java.en.When;
import support.KnowsTheDomain;

/**
 * Created by juan.hernandez on 7/17/17.
 */
public class TellerSteps {

    KnowsTheDomain helper;

    public TellerSteps(){
        helper = new KnowsTheDomain();
    }

    @When("^I request \\$(\\d+)$")
    public void iRequest$(int dollars) throws Throwable {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
    }
}
