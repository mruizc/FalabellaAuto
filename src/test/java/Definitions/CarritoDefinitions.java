package Definitions;
import PageObjects.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarritoDefinitions {

    MenuPrincipal menu;

    public CarritoDefinitions(){
        menu = new MenuPrincipal(Setup.driver);

    }

    @Given("Ingreso a la pagina de Falabella")
    public void ingresoAlaPaginaFalabella() {
        Setup.driver.get("https://www.falabella.com/falabella-cl");
    }

    @When("Busca el producto {string}")
    public void buscaElProducto(String term) throws Throwable {
        menu.BuscarProducto(term);
        menu.BtnEliminarVentanaAlerta();
        menu.ClickBuscar();
    }

    @Then("Verifica que traiga {string}")
    public void verificaQueTraiga(String MsjEsperado) throws Throwable{
        Assert.assertTrue(menu.MensajeValidacion().contains(MsjEsperado));
    }

}
