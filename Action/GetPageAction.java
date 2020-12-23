package Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import POM.LogIn;
public class GetPageAction {
    static WebDriver driver=null;

    public static void LoginPage(String userName, String passWord) throws Exception {
        LogIn.userName().sendKeys(userName);
        LogIn.userPassWord().sendKeys(passWord);
        Thread.sleep(1000);
        ClickLogin();

    }   public static void ClickLogin() throws Exception {
        LogIn.ClickLogin().click();

    }
    public static String FoundHomePage() throws Exception {
      String pageName= LogIn.CheckLoginPage().getText();
      return pageName;

    }


}
