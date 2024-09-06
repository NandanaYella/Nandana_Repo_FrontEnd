package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
    WebDriver d;
Properties p;
    public void loadPropertiesFile() throws IOException {
        FileInputStream f = new FileInputStream("src/main/java/config/config.properties");
         p = new Properties();
        p.load(f);
    }

    public void selectBrowser(String browser) {
        if (browser.equals("Chrome") || browser.equals("chrome"))
            d = new ChromeDriver();
        if (browser.equals("Firefox") || browser.equals("firefox"))
            d = new FirefoxDriver();
        if (browser.equals("Edge") || browser.equals("edge"))
            d = new EdgeDriver();
    }

    public void launchBrowser() throws IOException {
        loadPropertiesFile();
        selectBrowser(p.getProperty("browser"));
        d.manage().window().maximize();
        d.get(p.getProperty("url"));

    }

    public static void main(String[] args) throws IOException {
        Base b = new Base();
        b.launchBrowser();
    }
}