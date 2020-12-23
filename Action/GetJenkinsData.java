package Action;
import POM.JenkinsPage;
import org.openqa.selenium.WebDriver;

public class GetJenkinsData {
        static WebDriver driver=null;

        public static String JobName() throws Exception {
            String jobName= JenkinsPage.jobName().getText();
            return jobName;

        }
    public static String LastRun() throws Exception {
        String lastRun= JenkinsPage.jobName().getText();
        return lastRun;

    }
    public static String status() throws Exception {
        String status= JenkinsPage.jobName().getText();
        return status;

    }


}
