package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.App;
import utils.Device;
import utils.Driver;
import utils.Utils;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static utils.Locators.*;

public class spotifydef {

    @Given("Application is opened")
    public void applicationIsOpened() {

        Utils.openApp(Device.HUAWEI, App.SPOTIFY);
    }

    @When("click on playlist")
    public void clickOnPlaylist() throws InterruptedException {
        sleep(2000);
        Driver.getDriver().findElement(lTropicalButton).click();
    }

    @Then("click to enter the playlist")
    public void clickToEnterThePlaylist() throws InterruptedException {
        sleep(1000);
        Driver.getDriver().findElement(lPlaylistButton).click();
    }

    @Then("scroll down the screen")
    public void scrollDownTheScreen() throws InterruptedException {

        sleep(2000);
        Dimension dimension = Driver.getDriver().manage().window().getSize();
        int startX = (int) (dimension.width * 0.5);
        int startY = (int) (dimension.height * 0.95);

        int finishX = (int) (dimension.width * 0.5);
        int finishY = (int) (dimension.height * 0.05);

        TouchAction touch = new TouchAction(Driver.getDriver());
        for (int i = 0; i < 3; i++) {
            touch.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(finishX, finishY)).release().perform();
        }
/*       ---> Horizontol Scrolling
        WebElement barButton = Driver.getDriver().findElement(By.xpath(""));
        TouchAction touch = new TouchAction(Driver.getDriver());
        touch.longPress(ElementOption.element(barButton)).moveTo(ElementOption.element(barButton,0,250)).release().perform();

 */
    }

    @And("song is played")
    public void songIsPlayed() throws InterruptedException {
        sleep(1000);
        Driver.getDriver().findElement(lMusicSelect).click();

    }
}
