package utils;

public enum App {

    SPOTIFY("com.spotify.music","MainActivity"),

    ;


    public String appPackage;
    public String appActivity;

    App(String appPackage, String appActivity) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
    }

}
