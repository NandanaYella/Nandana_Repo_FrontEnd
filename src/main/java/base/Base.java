package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import resources.staticResource.Global_Static;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public void loadPropertiesFile() throws IOException {
        FileInputStream f = new FileInputStream("src/main/java/config/config.properties");
         Global_Static.p = new Properties();
        Global_Static.p.load(f);
    }

    public void selectBrowser(String browser) {
        if (browser.equals("Chrome") || browser.equals("chrome"))
            Global_Static.d = new ChromeDriver();
        if (browser.equals("Firefox") || browser.equals("firefox"))
            Global_Static.d = new FirefoxDriver();
        if (browser.equals("Edge") || browser.equals("edge"))
            Global_Static.d = new EdgeDriver();
    }

    public void launchBrowser() throws IOException {
        loadPropertiesFile();
        selectBrowser(Global_Static.p.getProperty("browser"));
        Global_Static.d.manage().window().maximize();
        Global_Static. d.get(Global_Static.p.getProperty("url"));

    }
}