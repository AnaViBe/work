package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By titleMiTiendeoLocator =  By.id("header-account-button");
    private By buttonIniciarSesionLocator =  By.xpath("//div[@id='login-button']/span");
    private By dropdownMiTiendeoLocacor =  By.className("dropdown__my-tiendeo__link");
    private By searchInputLocator = By.id("header-search-input");
    private By imageCatalogLocator = By.className("c·catalog__details");
    //*[@id="products"]/ul/li[1]/div/div[2]/div[1]/h3
    //*[@id="products"]/ul/li[1]/div/div[1]/div/img
    //*[@id="products"]/ul/li[1]/div/div[1]/div/img
    //*[@id="products"]/ul/li[1]/div/div[1]/div/img
    //*[@id="header-search-input"]
    private By buttonSearch =  By.id("header-search-submit");
    public String titleHomePage = "Comprar en Barcelona - Ofertas, catálogos y tiendas";

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void clickOnTitleMiTiendeo() throws Exception {
        this.click(titleMiTiendeoLocator);
    }

    public void clickOnIniciarSesion() throws Exception {
        this.click(buttonIniciarSesionLocator);
    }

    public boolean homePageIsDisplayed() throws Exception {
        return this.getTitle().equals(titleHomePage);
    }

    public void clickOpcion(String opcion) throws Exception {
        this.clickElementListSearchDirect(dropdownMiTiendeoLocacor, opcion);
    }

    public boolean optionIsDisplayed(String url) throws Exception {
        return this.webCompareCurrenUrl(url);
    }
    public void writeTxtInBusqueda(String textToWrite) throws Exception {
        this.writeTxtField(searchInputLocator, textToWrite);
    }
    public void clickOnBuscar() throws Exception {
        this.click(buttonSearch);
    }

    public boolean catalogImageIsDisplayed ()throws Exception{
        return this.isDisplayed(imageCatalogLocator);
    }
}
