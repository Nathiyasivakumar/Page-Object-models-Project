package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_function.common_function;
import pom_files.women_product_pom;
@Test
public class Women_products extends common_function{
	public static void Women_products() throws InterruptedException  {
		
		

		PageFactory.initElements(driver,women_product_pom.class);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		women_product_pom.Women.click();
	
		women_product_pom.Hoodies_Sweatshirts.click();
		
		women_product_pom.listview.click();
		
		women_product_pom.product.click();
		
		women_product_pom.size.click();
		
		women_product_pom.color.click();
		
		women_product_pom.AddToCart.click();
		
		
		
		
		
	}


}

