import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestProperty {
	public static WebDriver driver = null;

	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("C:\\WS_ejagruti\\Log4jDemo\\src\\config.properties");
        Properties prop = new Properties();
        prop.load(input);
        System.out.println("URL :"+ prop.getProperty("url"));
        driver = new FirefoxDriver();
        driver.navigate().to(prop.getProperty("url"));
        driver.manage().window().maximize();
        
	}

}
