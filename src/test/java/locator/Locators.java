package locator;

import org.openqa.selenium.By;

public interface Locators {

    By lTropicalButton = By.xpath("//*[@index='0' and @resource-id='com.spotify.music:id/card_root']");
    By lPlaylistButton = By.xpath("//*[@index='0' and @resource-id='com.spotify.music:id/main_track_cloud']");

    By lMusicSelect = By.xpath("//android.widget.LinearLayout[@index='4']");
}
