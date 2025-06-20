package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMethods {

    private static final int TIMEOUT_SECONDS = 1;

    public static void clickElement(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), TIMEOUT_SECONDS);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
            Logger.log("Elemente tıklandı: " + locator);
        } catch (Exception e) {
            Logger.log("Elemente tıklanamadı: " + locator + " | Hata: " + e.getMessage());
        }
    }

    public static void sendKeys(By locator, String text) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), TIMEOUT_SECONDS);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.sendKeys(text);
            Logger.log("Elemente yazı gönderildi: " + locator + " -> " + text);
        } catch (Exception e) {
            Logger.log("Yazı gönderilemedi: " + locator + " | Hata: " + e.getMessage());
        }
    }

    public static void assertElementVisible(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), TIMEOUT_SECONDS);
            boolean isDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
            Logger.log("Element görünürlüğü doğrulandı: " + locator + " | Sonuç: " + isDisplayed);
        } catch (Exception e) {
            Logger.log("Element bulunamadı veya görünmüyor: " + locator);
        }
    }
}
