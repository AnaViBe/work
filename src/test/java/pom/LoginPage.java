package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    private By pageTitleLocator = By.xpath("//*[@id='#modal-root - ']/div/header/h2");
    public String titlePage = "Iniciar sesión";
    private By optionFacebookLocator = By.xpath("//*[@id='login-facebook-button']/span[2]"); //*[@id="login-google-button"]/span
    public String loginFacebook = "Loguéate con Facebook";
    private By optionGoogleLocator = By.xpath("//*[@id='login-google-button']/span");
    public String loginGoogle = "Loguéate con Google";

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public boolean isTitleInicioSesionIsDisplayed() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePage);
    }

    public boolean opcionFacebokLogin() throws Exception {
        return this.isDisplayed(optionFacebookLocator) && this.getText(optionFacebookLocator).equals(loginFacebook);
    }

    public boolean opcionGoogleLogin() throws Exception {
        return this.isDisplayed(optionGoogleLocator) && this.getText(optionGoogleLocator).equals(loginGoogle);
    }

}
