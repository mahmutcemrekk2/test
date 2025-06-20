package pages;

import org.openqa.selenium.By;
import utils.BaseMethods;
import utils.DriverManager;
import utils.Logger;

public class CouponPage {

    public By superLig = By.xpath("//div[text()='Süper Lig']");
    public By teamA_vs_teamB = By.xpath("//div[text()='Team A vs Team B']");
    public By betOption = By.xpath("//button[contains(text(),'1.5 ÜST')]");
    public By stakeAmount = By.id("stake-amount");
    public By confirmButton = By.id("confirm-bet");
    public By successMessage = By.id("bet-success-message");

    public void openKiosk() {
        DriverManager.getDriver().get("https://www.nesine.com/");
        Logger.log("Kiosk ekranı açıldı.");
    }

    public void selectLeagueAndMatch() {
        BaseMethods.clickElement(superLig);
        BaseMethods.clickElement(teamA_vs_teamB);
    }

    public void selectBetAndAmount() {
        BaseMethods.clickElement(betOption);
        BaseMethods.sendKeys(stakeAmount, "100");
    }

    public void confirmCoupon() {
        BaseMethods.clickElement(confirmButton);
    }

    public void verifySuccessMessage() {
        BaseMethods.assertElementVisible(successMessage);
    }
}
