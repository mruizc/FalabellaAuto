package Definitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Setup {
    public static WebDriver driver;

    @Before
    public static void setUp(){
        //System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public static void tearDown(){
        driver.manage().deleteAllCookies();
        // driver.close();
    }
    
}
