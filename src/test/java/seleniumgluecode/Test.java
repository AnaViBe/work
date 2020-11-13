package seleniumgluecode;

import com.mongodb.client.MongoDatabase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.bson.Document;
import org.junit.Assert;
import utils.LogHelper;

import java.util.logging.Logger;

public class Test extends TestBase{

    private int start;
    private int left;
    MongoDatabase mongoDataBase = null;
    Document mipcgamer = null;
    private static final Logger LOGGER = LogHelper.getLogger(Test.class);

    @Given("^El usuario se encuentra en la pagina Home de imalittletester$")
    public void elUsuarioSeEncuentraEnLaPaginaHomeDeImalittletester() throws Throwable {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobre el titulo The little tester comics$")
    public void haceClickSobreElTituloTheLittleTesterComics() throws Throwable {
        homePage.clickOnTitleComics();
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void seDebeRedirigirAlaPantallaComics() throws Throwable {
        Assert.assertTrue("No se redirecciono correctamente a la pagina de Comics",comicsPage.isTitleComicsDisplayed());
    }

}
