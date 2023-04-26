package pom_files;



	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.ui.Select;

	public class women_product_pom {
	@FindBy(id="ui-id-4")
		public static WebElement Women;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[1]/a")
	public static WebElement Hoodies_Sweatshirts;


	@FindBy(xpath="//*[@id=\"mode-list\"]")
	public static WebElement listview; 

	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a")
	public static WebElement product; 

	 
	@FindBy(id="option-label-size-143-item-167")
	public static WebElement size; 

	@FindBy(xpath="//*[@id=\"option-label-color-93-item-53\"]")
	public static WebElement color; 

	@FindBy(id="product-addtocart-button")
	public static WebElement AddToCart; 
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/div[2]/div/div")
	public static WebElement AddCart_Success;
		
	}

