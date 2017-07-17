package steps.nicebank;

import cucumber.api.java.en.When;
import support.KnowsTheDomain;

/**
 * Created by juan.hernandez on 7/17/17.
 */
public class TellerSteps extends Steps{


    @When("^I request \\$(\\d+)$")
    public void iRequest$(int dollars) throws Throwable {
        getHelper().getTeller().withdrawFrom(helper.getMyAccount(), dollars);
    }
}
