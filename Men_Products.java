package test_cases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_function.common_function;
import pom_files.Men_Products_pom;
@Test
public class Men_Products extends common_function{


	public static void men_products() throws InterruptedException  {
		
		PageFactory.initElements(driver,Men_Products_pom.class);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Men_Products_pom.men.click();
	
		Men_Products_pom.pants.click();
		
		Men_Products_pom.style.click();
		
		Men_Products_pom.Tracks.click();
		
		Men_Products_pom.listview.click();
		
		Men_Products_pom.product.click();
		Thread.sleep(3000);
		
		Men_Products_pom.size.click();
		
		Men_Products_pom.color.click();
		
		Men_Products_pom.AddToCart.click();
		
		
	}
	

}

