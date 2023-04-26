package common_function;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class common_function {

	public static WebDriver driver=null;

	public static Properties Properties=null;

	@BeforeSuite
	public void launchBrowser() throws IOException {

		FileInputStream file = new FileInputStream("config.properties");

		Properties Properties = new Properties();

		Properties.load(file);


		String browser= Properties.getProperty("browser");
		String Url= Properties.getProperty("Url");
		String DriverLocation= Properties.getProperty("DriverLocation");

		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", DriverLocation);
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", DriverLocation);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(Url);
	}

	@AfterSuite
	public void CloseBrowser() {
		driver.quit();
	}
}
