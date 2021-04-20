package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.http.ClientConfig;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {

    public static final String SEARCHFIELD = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        By cookies_accept = By.xpath("//*[@title='Accept All']");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(cookies_accept));

        WebElement searchField = driver.findElement(By.xpath(SEARCHFIELD));
        searchField.click();

        Thread.sleep(2000);

        WebElement selectComboDay = driver.findElement(By.id("day"));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByValue("2");

        WebElement selectComboMonth = driver.findElement(By.id("month"));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(2);

        WebElement selectComboYear = driver.findElement(By.id("year"));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByValue("2000");
    }
}
