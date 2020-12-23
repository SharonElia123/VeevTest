package Utility;
import io.appium.java_client.ios.IOSDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class StartApplication {
    private static IOSDriver driver;
    public static IOSDriver setApplication(String application) throws InterruptedException, MalformedURLException {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/Apps/Veev/");
        File app = new File(appDir, "Veev.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("deviceName", "Iphone8");
        capabilities.setCapability("platformVersion", "5");
        capabilities.setCapability("platformName", application);
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "Veev");
        driver = new IOSDriver(new URL("https://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        Thread.sleep(10000);
        return driver;

    }
    public static void closeAllDriver() {
        driver.quit();

        }
    }




