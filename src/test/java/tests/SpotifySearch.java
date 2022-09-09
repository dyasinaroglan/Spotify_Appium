package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.App;
import utils.Device;
import utils.Driver;
import utils.Utils;

import java.time.Duration;

import static utils.Locators.*;

public class SpotifySearch extends Utils{



    @Given("click the search button")
    public void clickTheSearchButton() throws InterruptedException {
        openApp(Device.HUAWEI, App.SPOTIFY);
        Thread.sleep(2000);
        Driver.getDriver().findElement(lSearchButton).click();

    }

    @When("I enter {string} to search song")
    public void ıEnterToSearchSong(String str) throws InterruptedException {
        Thread.sleep(2000);
        Driver.getDriver().findElement(lSearchText).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(lSearchWrite).sendKeys(str);
    }

    @Then("scroll screen and select song from list")
    public void scrollScreenAndSelectSongFromList() throws InterruptedException {
        Thread.sleep(2000);
        Dimension dimension = Driver.getDriver().manage().window().getSize();

        int startX = (int) (dimension.width * 0.5);
        int startY = (int) (dimension.height * 0.3);
        int finishX = (int) (dimension.width * 0.5);
        int finishY = (int) (dimension.height * 0.05);

        TouchAction touchAction = new TouchAction(Driver.getDriver());
        touchAction.press(PointOption.point(startX,startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(finishX,finishY)).release().perform();
        Thread.sleep(2000);
        Driver.getDriver().findElement(lSelectAlbum).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(lMixPlayButton).click();
    }
}
