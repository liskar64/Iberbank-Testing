package cucumberJava; /**
 * Created by Ibermatica on 05/05/2017.
 */

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.annotation.en.And;

import cucumber.annotation.es.Dado;
import cucumber.annotation.es.Entonces;
import cucumber.annotation.es.Cuando;
import cucumber.annotation.es.Y;
import io.appium.java_client.android.AndroidDriver;


import io.appium.java_client.service.local.AppiumDriverLocalService;
import javafx.scene.input.ScrollEvent;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class cucumberJava {

    private WebDriver driver;

    AppiumDriverLocalService appiumService;
    String appiumServiceUrl;


    @Dado("que me conecto a la aplicacion$")

    public void openDevices(){

        appiumService = AppiumDriverLocalService.buildDefaultService();
        appiumService.start();
        appiumServiceUrl = appiumService.getUrl().toString();
        System.out.println("Appium Service Address : - "+ appiumServiceUrl);


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","Xperia M2");
        capabilities.setCapability("platformVersion","5.1.1");
        capabilities.setCapability("browser_Name","Android");
        capabilities.setCapability("app","src/apk/android-debug.apk");
        try{
            driver = new AndroidDriver(new URL(appiumServiceUrl), capabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    };




    @Cuando("^introduzco el Usuario \"([^\"]*)\" y la Contraseña \"([^\"]*)\"$")
    public void I_enter_Usuario_as_and_Contrasena_as(String arg1, String arg2) throws AWTException {

        driver.findElement(By.id("usuario")).sendKeys(arg1);

        driver.findElement(By.id("contrasena")).sendKeys(arg2);

        driver.findElement(By.id("boton1")).click();

    }


    @Y("^tecleo el Usuario \"([^\"]*)\" y la Contraseña \"([^\"]*)\"$")

    public void login_correcto(String arg1, String arg2) throws AWTException {

        driver.findElement(By.id("usuario")).sendKeys(arg1);

        driver.findElement(By.id("contrasena")).sendKeys(arg2);

        driver.findElement(By.id("boton1")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

    }

    @Entonces("sale mensaje de error y no podemos entrar$")
    public void loginshouldbeunsuccessful() {

        WebElement texto = driver.findElement(By.id("credenciales"));
        Assert.assertTrue(isElementPresent(By.id("credenciales")));


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }


        System.out.println("Stop driver");
        System.out.println("Compruebo que cambio de version en GitHub3");
        driver.quit();
        System.out.println("Stop appium service");
        appiumService.stop();


    }

    @Entonces("entramos en la aplicacion$")
    public void loginshouldbesuccessful() {

        Assert.assertFalse(isElementPresent(By.id("credenciales")));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Stop driver");
        driver.quit();
        System.out.println("Stop appium service");
        appiumService.stop();

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
