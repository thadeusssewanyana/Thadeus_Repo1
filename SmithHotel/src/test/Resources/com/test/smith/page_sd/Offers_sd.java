package com.test.smith.page_sd;

import com.test.smith.page.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

/**
 * Created by sewadeus on 10/06/2015.
 */
public class Offers_sd {
    HomePage homePage = new HomePage()
    @Then("^I should see hotels with offers in \"([^\"]*)\" city$")
    public void I_should_see_hotels_with_offers_in_city(String arg1) throws Throwable {

    }
}
