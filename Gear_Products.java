package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_function.common_function;
import pom_files.Gear_Products_Pom;



@Test
public class Gear_Products extends common_function{


	
	public static void Gear_products() throws InterruptedException  {


		PageFactory.initElements(driver,Gear_Products_Pom.class);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Gear_Products_Pom.Gear.click();
	
		Gear_Products_Pom.product.click();
		
		 JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("window.scrollBy(0,500)");
		
        Gear_Products_Pom.review.click();
        
    	
    	
    	Actions at = new Actions(driver);
    	at.moveToElement( Gear_Products_Pom.rating).click().perform();
		
		Gear_Products_Pom.NickName.sendKeys("Nathiya");
		
		Gear_Products_Pom.Summary.sendKeys("Yoga Product");
		
		Gear_Products_Pom.My_Review.sendKeys("Good");
		
		Gear_Products_Pom.Submit_Review.click();
		
		at.moveToElement( Gear_Products_Pom.Custom_AddToCart).click().perform();
	
		at.moveToElement( Gear_Products_Pom.Quantity).click().perform();
		
		Gear_Products_Pom.Quantity.clear();
		Gear_Products_Pom.Quantity.sendKeys("5");
		
		Gear_Products_Pom.Sprite_Stasis_Ball_75_cm.click();
		
		Gear_Products_Pom.product_add_to_cart.click();
		
		
	
		
		
		
	}
	
}
