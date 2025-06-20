package stepdefinitions;

import io.cucumber.java.en.*;
import io.qameta.allure.Step;
import pages.CouponPage;

public class PlayCouponSteps {

    CouponPage couponPage = new CouponPage();

    @Step("Kiosk ekranı açılır")
    @Given("The kiosk screen is opened")
    public void openKiosk() {
        couponPage.openKiosk();
    }

    @Step("Lig ve maç seçimi yapılır")
    @When("The league and match are selected")
    public void selectLeagueAndMatch() {
        couponPage.selectLeagueAndMatch();
    }

    @Step("Bahis tipi ve tutarı girilir")
    @And("The bet type and amount are entered")
    public void selectBetAndAmount() {
        couponPage.selectBetAndAmount();
    }

    @Step("Kupon onaylanır")
    @And("The coupon is confirmed")
    public void confirmCoupon() {
        couponPage.confirmCoupon();
    }

    @Step("Başarı mesajı doğrulanır")
    @Then("The success message should be displayed")
    public void assertSuccess() {
        couponPage.verifySuccessMessage();
    }
}
