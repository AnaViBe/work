package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By titleComicsLocator =  By.id("menu-item-2008");
    public String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void clickOnTitleComics() throws Exception {
        this.click(titleComicsLocator);
    }

    public boolean homePageIsDisplayed() throws Exception {
        return this.getTitle().equals(titleHomePage);
    }

}
