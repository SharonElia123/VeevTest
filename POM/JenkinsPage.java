package POM;

import Log.Log;
import Utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JenkinsPage extends BaseClass {
    private static WebElement element = null;

    public JenkinsPage(WebDriver driver) {
        super(driver);
    }

    public static WebElement jobName() throws Exception {
        try {
            element = driver.findElement(By.id("jobName"));
            Log.info("User name is found on the Home Page");

        } catch (Exception e) {
            Log.error("User name not found on the Home Page");
            throw (e);
        }

        return element;

    }
    public static WebElement lastRun() throws Exception {
        try {
            element = driver.findElement(By.id("PassWord"));
            Log.info("user Pass Word is found on the Home Page");

        } catch (Exception e) {
            Log.error("user Pass Word not found on the Home Page");
            throw (e);
        }

        return element;

    }

    public static WebElement status() throws Exception {
        try {
            element = driver.findElement(By.id("status"));
            Log.info("status");

        } catch (Exception e) {
            Log.error("status not found on the Home Page");
            throw (e);
        }

        return element;

    }



}

