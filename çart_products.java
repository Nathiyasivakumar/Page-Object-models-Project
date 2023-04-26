package test_cases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_function.common_function;
import pom_files.Gear_Products_Pom;
import pom_files.cart_products_pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

@Test
public class �art_products extends common_function {


	public static void cart_products() throws InterruptedException, AWTException  {


		PageFactory.initElements(driver,cart_products_pom.class);

		Thread.sleep(3000);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		Actions at = new Actions(driver);

		at.moveToElement( cart_products_pom.Added_Cart_items).click().perform();


		at.moveToElement( cart_products_pom.cart).click().perform();

		cart_products_pom.shipping_Method.click();

		cart_products_pom.next.click();

		Thread.sleep(6000);

		cart_products_pom.Place_order.click();

		Thread.sleep(6000);

		String message= cart_products_pom.Success_Message.getText();

		System.out.println("Final message : " + message);

		String Order_id= cart_products_pom.Oreder_id.getText();

		System.out.println( "Order id :"+Order_id);
		
		

	}

}
