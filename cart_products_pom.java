package pom_files;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cart_products_pom {
	
	
	
	@FindBy(xpath="/html/body/div[1]/header/div[2]/div[1]/a/span[2]/span[1]")
	public static WebElement Added_Cart_items;
	
	@FindBy(id="top-cart-btn-checkout")
	public static WebElement cart;
	
	@FindBy(xpath="//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input")
	public static WebElement shipping_Method;
	
	
	@FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/div/button")
	public static WebElement next;
	
	@FindBy(xpath="//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")
	public static WebElement Place_order;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/h1/span")
	public static WebElement Success_Message;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]/a/strong")
	public static WebElement Oreder_id;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/a")
	public static WebElement print;


}
