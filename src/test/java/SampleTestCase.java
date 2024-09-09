import base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.staticResource.Global_Static;
import utilities.evidences.Evidences;

import java.io.IOException;
@Listeners({utilities.extentReports.Report.class})
public class SampleTestCase extends Base {
    @BeforeMethod
    public void setup() throws IOException, InterruptedException {
        launchBrowser();
    }
   @Test
   public void testcase1()
   {
       Global_Static.testCase_ID=1;
       Evidences.takeScreenShot("screenshot1");
       System.out.println("Testcase1");
   }
    @AfterMethod()
    public void teardown()
    {
        Global_Static.d.close();
    }
}


