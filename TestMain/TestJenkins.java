package TestMain;

import Action.GetJenkinsData;
import Action.GetPageAction;
import Log.Log;
import Utility.Util;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class TestJenkins {

    @Parameters("browserName")
    @BeforeTest
    public void beforeMethod(String browserName) throws Exception {
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("Jenkins_Test_001");

    }
    @Parameters("jobName")
    @Test
    public void TestjobName(String jobName) throws Exception {
        Log.info("Found Images Link Name");
        String jobNameJenkins= GetJenkinsData.JobName();
        assertEquals(jobNameJenkins,jobName);
    }

    @Parameters("lastRun")
    @Test
    public void testlastRun(String lastRun) throws Exception {
        Log.info("Search Selenium Items in Google");
        String lastRunJenkins= GetJenkinsData.LastRun();
        assertEquals(lastRun,lastRunJenkins);
    }
    @Parameters("status")
    @Test
    public void testSearchItems(String status) throws Exception {
        Log.info("Search Selenium Items in Google");
        String statusJenkins= GetJenkinsData.status();
        assertEquals(status,statusJenkins);
    }
    @AfterTest
    public void tearDown()
    {
        Util.closeAllDriver();
        Log.endTestCase("Complete ");
    }
}
