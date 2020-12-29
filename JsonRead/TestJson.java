package JsonRead;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import static org.junit.Assert.assertEquals;

@Test
public class TestJson {
    JenkinsResultsTest testJson =new JenkinsResultsTest();
    @BeforeTest
    public void launchCli() throws Exception {
        System.out.print("Start");
        testJson.JenkinsJobRead();
        }
    @Test
    public void jsonTest(String name, String name1){
       assertEquals(name,name1);
    }
    @AfterTest
    public void terminateCli(){

        System.out.print("End");
    }
}