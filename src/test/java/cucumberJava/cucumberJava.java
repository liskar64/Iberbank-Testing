package cucumberJava; /**
 * Created by Ibermatica on 05/05/2017.
 */

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class cucumberJava {

    private WebDriver driver;

    AppiumDriverLocalService appiumService;
    String appiumServiceUrl;




    @Given("I open the app$")


    public void openDevices(){

        appiumService = AppiumDriverLocalService.buildDefaultService();
        appiumService.start();
        appiumServiceUrl = appiumService.getUrl().toString();
        System.out.println("Appium Service Address : - "+ appiumServiceUrl);


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","Xperia M2");
        capabilities.setCapability("platformVersion","5.1.1");
        //  capabilities.setCapability("platformVersion","4.4.2");
        //  capabilities.setCapability("deviceName","SM-G130HN");
        capabilities.setCapability("browser_Name","Android");
        //capabilities.setCapability("app","/android-debug.apk");
       //capabilities.setCapability("app","/IberBank.apk");
        //capabilities.setCapability("app","/Iberbank_fuentes/IberBank.apk");
        capabilities.setCapability("app","src/apk/android-debug.apk");
        try{
    //        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities) {};
    //        driver = new RemoteWebDriver(new URL(appiumServiceUrl), capabilities);
            driver = new AndroidDriver(new URL(appiumServiceUrl), capabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    };



    @When("^I enter Usuario as \"([^\"]*)\" and Contrasena as \"([^\"]*)\"$")
    public void I_enter_Usuario_as_and_Contrasena_as(String arg1, String arg2) throws AWTException {

        driver.findElement(By.id("usuario")).sendKeys(arg1);

        driver.findElement(By.id("contrasena")).sendKeys(arg2);

        //WebElement elemento = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]"));

        //List<WebElement> childs = elemento.findElements(By.xpath("//*"));

        //for (WebElement e : childs) {
        //    System.out.print(e.getAttribute("xpath"));
        // }
        //driver.findElement(By.xpath("//button[contains(text(),'Iniciar Sesión')]")).click();
        //driver.findElement(By.xpath("//button")).click();

        driver.findElement(By.id("boton1")).click();
        //driver.findElement(By.name("Aceptar")).click();

        // getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //driver.navigate().back();
        // driver.navigate().forward();

        //driver.findElement(By.id("Value")).sendKeys(Keys.RETURN);
        //AndroidDriver dr;
        //dr.pressKeyCode(key);(Keys.ENTER);


        // WebElement.sendKeys(Keys.RETURN);


        //Robot r = new Robot();
        //r.keyPress(KeyEvent.VK_ENTER);
        //r.keyRelease(KeyEvent.VK_ENTER);



        // WebElement button = driver.findElement(By.className("main-button"));
        // button.click();

        //      driver.findElement(By.xpath(xpathExpression).click();

    }


    @Then("login should be unsuccessful$")
    public void loginshouldbeunsuccessful() {
        //WebElement texto = driver.findElement(By.className("UIAAlert"));

        WebElement texto = driver.findElement(By.id("credenciales"));
        boolean display = texto.isDisplayed();

        //String texto2 = texto.getAttribute("p");
        //System.out.print(texto2);

        //assertTrue(isElementPresent(By.id("credenciales")));

        //Assert.assertTrue("Correcto", display.("Credenciales incorrectas"));

        Assert.assertTrue(isElementPresent(By.id("credenciales")));


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }


        System.out.println("Stop driver");
        System.out.println("Compruebo que cambio de version en GitHub2");
        driver.quit();
        System.out.println("Stop appium service");
        appiumService.stop();


    }

    @Then("login should be successful$")
    public void loginshouldbesuccessful() {
        //WebElement texto = driver.findElement(By.className("UIAAlert"));
        // WebElement texto = driver.findElement(By.id("credenciales"));
        // boolean display = texto.isDisplayed();

        //String texto2 = texto.getAttribute("p");
        //System.out.print(texto2);

        //assertTrue(isElementPresent(By.id("credenciales")));

        //Assert.assertTrue("Correcto", display.("Credenciales incorrectas"));

        //Assert.assertTrue(isElementPresent(By."imagen/logo2-pequeno.png")));

        //Assert.assertTrue(isElementPresent(By.id("operacion")));
        //WebElement operacion = driver.findElement(By.id("operacion"));
        Assert.assertFalse(isElementPresent(By.id("credenciales")));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Stop driver");
        driver.quit();
        System.out.println("Stop appium service");
        appiumService.stop();

    //    driver.quit();

    }


    public boolean isElementPresent(By by){
        try {
            driver.findElement(by);
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }


}
