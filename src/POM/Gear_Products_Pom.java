package pom_files;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Gear_Products_Pom {

	@FindBy(id="ui-id-6")
	public static WebElement Gear;

	@FindBy(xpath="//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/a/span/span/img")
	public static WebElement product;

	@FindBy(id="tab-label-reviews-title")
	public static WebElement review; 

	@FindBy(xpath="//*[@id=\"Rating_3_label\"]")
	public static WebElement rating; 

	@FindBy(id="nickname_field")
	public static WebElement NickName; 

	@FindBy(id="summary_field")
	public static WebElement Summary; 

	@FindBy(id="review_field")
	public static WebElement My_Review; 

	@FindBy(xpath="//*[@id=\"review-form\"]/div/div/button")
	public static WebElement Submit_Review; 

	@FindBy(id="qty")
	public static WebElement Quantity;

	@FindBy(id="bundle-slide")
	public static WebElement Custom_AddToCart;

	@FindBy(id="bundle-option-1-3")
	public static WebElement Sprite_Stasis_Ball_75_cm;

	@FindBy(id="product-addtocart-button")
	public static WebElement product_add_to_cart;
	
	
	









	}

