package pom_files;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Men_Products_pom {
@FindBy(id="ui-id-5")
	public static WebElement men;

@FindBy(xpath="//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[2]/li[1]/a")
public static WebElement pants;

@FindBy(xpath="//*[@id=\"narrow-by-list\"]/div[1]")
public static WebElement style;

@FindBy(xpath="//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[5]/a")
public static WebElement Tracks;

@FindBy(id="mode-list")
public static WebElement listview; 

@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[4]/div/div/strong/a")
public static WebElement product; 

 
@FindBy(xpath="//*[@id=\"option-label-size-143-item-175\"]")
public static WebElement size; 

@FindBy(id="option-label-color-93-item-58")
public static WebElement color; 

@FindBy(id="product-addtocart-button")
public static WebElement AddToCart; 
	
}