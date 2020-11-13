package runner.browser_manager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverManager extends DriverManager{

    @Override
    protected void createDriver() {
        System.setProperty("geckodriver.chrome.driver", "src/test/resources/geckodriver/geckodriver.exe");
        driver = new FirefoxDriver();
    }
}
