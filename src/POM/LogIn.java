package POM;
import Utility.BaseClass;
import org.openqa.selenium.By;
import Log.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LogIn extends BaseClass {
    private static WebElement element = null;
    public LogIn(WebDriver driver){
        super(driver);
    }


    public static WebElement userName() throws Exception{
        try{
            element = driver.findElement(By.id("useName"));
            Log.info("User name is found on the Home Page");

        }catch (Exception e){
            Log.error("User name not found on the Home Page");
            throw(e);
        }

        return element;

    }
    public static WebElement userPassWord() throws Exception{
        try{
            element = driver.findElement(By.id("PassWord"));
            Log.info("user Pass Word is found on the Home Page");

        }catch (Exception e){
            Log.error("user Pass Word not found on the Home Page");
            throw(e);
        }

        return element;

    }
    public static WebElement ClickLogin() throws Exception{
        try{
            element = driver.findElement(By.id("LogIn"));
            Log.info("LogIn");

        }catch (Exception e){
            Log.error("Can't log in");
            throw(e);
        }

        return element;

    }
    public static WebElement CheckLoginPage() throws Exception{
        try{
            element = driver.findElement(By.id("OurPage"));
            Log.info("Found Home Page");

        }catch (Exception e){
            Log.error("Can't Found Home Page");
            throw(e);
        }

        return element;

    }

    }


