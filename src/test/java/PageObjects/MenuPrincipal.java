package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MenuPrincipal {
    private WebDriver driver;
    private WebDriverWait wait;

    //crear constructor
    public MenuPrincipal(WebDriver d){
        driver=d;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);

    }
    //locators

    @FindBy(xpath = "//input[@id=\"testId-SearchBar-Input\"]")
    private WebElement TxtBuscar;

    @FindBy(xpath = "//div[@class=\"dy-lb-close\"]")
    private WebElement BotonX;

    @FindBy(xpath = "//img[@class='SearchBar-module_searchIcon__FS7b4']")
    private WebElement TxtBtnBuscar;
    @FindBy(xpath = "//span[@id=\"search_numResults\"]")
    private WebElement TxtResultados;


    //Acciones
    public void BuscarProducto(String term) {
        wait.until(ExpectedConditions.elementToBeClickable(TxtBuscar)).sendKeys(term);
    }

    public void BtnEliminarVentanaAlerta() {
        wait.until(ExpectedConditions.elementToBeClickable(BotonX)).click();
    }

    public void ClickBuscar() {
        wait.until(ExpectedConditions.elementToBeClickable(TxtBtnBuscar)).click();
    }
    public String MensajeValidacion(){
        return wait.until(ExpectedConditions.visibilityOf(TxtResultados)).getText().trim();
    }
}
