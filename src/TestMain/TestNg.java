package TestMain;
import Action.GetPageAction;
import org.apache.log4j.xml.DOMConfigurator;
import Action.GetPageAction;
import org.testng.annotations.*;
import Log.Log;
import Utility.StartApplication;
import static org.junit.Assert.*;
class TestNg {
    @Parameters("applicationName")
    @BeforeTest
    public void beforeMethod(String applicationName) throws Exception {
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("LogIn_Test_001");
        StartApplication.setApplication(applicationName);
    }
    @Parameters({"userName","passWord","veedPageName"})
    @Test
    public void TestImagesLinkGooglePage(String userName, String passWord,String veedPageNameTest) throws Exception {
        Log.info("Found Images Link Name");
        GetPageAction.LoginPage(userName,passWord);
        String veedPagenameiOS= GetPageAction.FoundHomePage();
        assertEquals(veedPageNameTest,veedPagenameiOS);
    }

    @AfterTest
    public void tearDown()
    {
        StartApplication.closeAllDriver();
        Log.endTestCase("Complete ");
    }


}