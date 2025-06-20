package stepdefinitions;

import io.cucumber.java.en.*;
import pages.CouponPage;

public class PlayCouponSteps {

    CouponPage couponPage = new CouponPage();

    @Given("The kiosk screen is opened")
    public void openKiosk() {
        couponPage.openKiosk();
    }

    @When("The league and match are selected")
    public void selectLeagueAndMatch() {
        couponPage.selectLeagueAndMatch();
    }

    @And("The bet type and amount are entered")
    public void selectBetAndAmount() {
        couponPage.selectBetAndAmount();
    }

    @And("The coupon is confirmed")
    public void confirmCoupon() {
        couponPage.confirmCoupon();
    }

    @Then("The success message should be displayed")
    public void assertSuccess() {
        couponPage.verifySuccessMessage();
    }
}
