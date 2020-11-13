package seleniumgluecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class TestBusqueda extends TestBase{

    @When("^Escribe en la casilla de busqueda el catalogo: \"([^\"]*)\" que desea consultar$")
    public void escribeEnLaCasillaDeBusquedaElCatalogoQueDeseaConsultar(String catalogo) throws Throwable {
        homePage.writeTxtInBusqueda(catalogo);
    }

    @And("^Hace click sobre el boton Buscar$")
    public void haceClickSobreElBotonBuscar() throws Exception {
        homePage.clickOnBuscar();
    }

    @Then("^Se muestra correctamente la busqueda solicitada$")
    public void seMuestraCorrectamenteLaBusquedaSolicitada() throws Exception {
        Assert.assertTrue("No se muestran correctamente los catalogos solicitados en la busqueda",  homePage.catalogImageIsDisplayed());
    }
}
