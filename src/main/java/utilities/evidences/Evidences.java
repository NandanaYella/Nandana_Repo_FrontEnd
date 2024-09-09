package utilities.evidences;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import resources.staticResource.Global_Static;

import java.io.File;
import java.io.IOException;


public class Evidences {
    public static void takeScreenShot(String screenshotName) {
        try {
            TakesScreenshot screenshot = (TakesScreenshot) Global_Static.d;
            File screenshotSourceFile = screenshot.getScreenshotAs(OutputType.FILE);
            File screenshotDestinationFile = new File("C:/TestEvidence/" + Global_Static.testCase_ID + "/" + screenshotName + ".png");
            FileUtils.copyFile(screenshotSourceFile, screenshotDestinationFile);

        } catch (IOException e) {
            System.out.println("IO exception occured");
        }
    }

}