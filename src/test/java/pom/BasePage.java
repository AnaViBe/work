package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By element) throws Exception {
        try {
            wait(element, 10);
            driver.findElement(element).click();
        } catch (Exception e) {
            throw new Exception("Could not click on the button " + element);
        }
    }

    public void click(WebElement element) throws Exception {
        try {
            element.click();
        } catch (Exception e) {
            throw new Exception("Could not click on the button " + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try {
            wait(element, 10);
            driver.findElement(element).isDisplayed();
            return true;
        } catch (Exception e) {
            throw new Exception("The element " + element + " is not visible in the DOM");
        }
    }

    public boolean isDisplayed(WebElement element) throws Exception {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            throw new Exception("The element " + element + " is not visible in the DOM");
        }
    }

    public String getText(By element) throws Exception {
        try {
            wait(element, 10);
            return driver.findElement(element).getText();
        } catch (Exception e) {
            throw new Exception("Could not get the text of the following element: " + element);
        }
    }

    public void wait(By element, int time) {
        WebDriverWait webDriverWait = new WebDriverWait((WebDriver) driver, time);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public String getText(WebElement element) throws Exception {
        try {
            return element.getText();
        } catch (Exception e) {
            throw new Exception("Could not get the text of the following element: " + element);
        }
    }

    public String getTitle() throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("Could not get the tab title");
        }

    }

    public void selectDropdownByVisibleText(By objectName, String text) throws Exception {
        try {
            WebElement element = driver.findElement(objectName);
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(text);

        } catch (Exception e) {
            throw new Exception("Could not select the tex");
        }
    }

    public void clickElementListSearchDirect(By objList, String textToFind) throws Exception {
        boolean elementFound = false;
        try {
            java.util.List<WebElement> elementsOnList = driver.findElements(objList);
            for (WebElement element : elementsOnList) {
                if ((element.getText().equalsIgnoreCase(textToFind))) {
                    element.click();
                    elementFound = true;
                }
                if (elementFound) {
                    break;
                }
            }
        } catch (Exception e) {
            throw new Exception("Could not find the item in the list");
        }
    }

    public Boolean webCompareCurrenUrl(String url) throws Exception {
        try {
            return this.driver.getCurrentUrl().equals(url);
        } catch (Exception e) {
            throw new Exception("Could not get the url for the following element:" + url);
        }
    }

    public void writeTxtField(By objectName, String textToWrite) throws Exception {
        try {
            if (driver.findElement(objectName).isEnabled()) {
                driver.findElement(objectName).clear();
                driver.findElement(objectName).sendKeys(textToWrite);
                Thread.sleep(3000);
            }
        }catch(Exception e){
            throw new Exception("Could not write the text");
        }
    }
}
