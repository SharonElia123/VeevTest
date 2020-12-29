package JsonRead;
import POM.JenkinsPage;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JenkinsResultsTest  {
    static WebDriver driver =  new ChromeDriver();
    private static Object String;
    static String file= "C:\\ShaJson\\JenkinsJob.json";
    static final String objectName="jobs";
    static TestJson test=new TestJson();

    public static void JenkinsJobRead() throws Exception {
        JsonObject myobject = (JsonObject) new JsonParser().parse(new FileReader(file));
        JsonArray jobs= (JsonArray) myobject.get(objectName);
        int jobClass= jobs.size();
        for(int row=0; row<jobClass;row++){
        JsonObject patient0= jobs.get(row).getAsJsonObject();
        String id =patient0.get("name").getAsString();
        String name =JenkinsPage.NameAfterFix(row,1).getText();
        test.jsonTest(name,id);
    }}

    }





