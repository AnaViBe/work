package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class TestMiTiendeo extends TestBase{

    @Given("^El usuario se encuentra en la pagina Home de Tiendeo$")
    public void elUsuarioSeEncuentraEnLaPaginaHomeDeTiendeo() throws Throwable {
        Assert.assertTrue("No se accedió correctamente a la pagina de Tiendeo", homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobre el titulo Mi Tiendeo$")
    public void haceClickSobreElTituloMiTiendeo() throws Throwable {
        homePage.clickOnTitleMiTiendeo();
    }

    @And("^Hace click sobre el boton Iniciar sesion$")
    public void haceClickSobreElBotonIniciarSesion() throws Throwable {
        homePage.clickOnIniciarSesion();
    }
    @And("^Se muestra un popUp de Inicio de sesion$")
    public void seDebeAbrirPopUpInicioSesion() throws Throwable {
        Assert.assertTrue("No se muestra correctamente el popUp de Inicio de sesion", loginPage.isTitleInicioSesionIsDisplayed());
    }

    @Then("^Se verifica que el usuario tiene la opcion Logueate con Facebook para hacer Login$")
    public void seVerificaQueElUsuarioTieneLaOpcionLogueateConFacebookParaHacerLogin() throws Exception {
        Assert.assertTrue("La opcion Logueate con Facebook no se muestra en la pag de Login", loginPage.opcionFacebokLogin());
    }

    @And("^Se verifica que el usuario tiene la opcion Logueate con Google para hacer Login$")
    public void seVerificaQueElUsuarioTieneLaOpcionLogueateConGoogleParaHacerLogin() throws Exception {
        Assert.assertTrue("La opcion Logueate con Google no se muestra en la pag de Login", loginPage.opcionGoogleLogin());
    }

    @And("^Hace click sobre la opcion \"([^\"]*)\"$")
    public void haceClickSobreLaOpcion(String opcion) throws Exception {
        homePage.clickOpcion(opcion);
    }

    @Then("^Se redirige correctamente al sitioWeb : \"([^\"]*)\"$")
    public void seRedirigeCorrectamenteAlSitioWeb(String url) throws Exception {
        Assert.assertTrue("La opcion Logueate con Google no se muestra en la pag de Login", homePage.optionIsDisplayed(url));
    }
}
