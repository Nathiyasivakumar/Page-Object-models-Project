package pom_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logins_pom{

	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/ul/li[2]/a")
	public static WebElement signinBtnbtn;

	@FindBy(id="email")
	public static WebElement login_Email;

	@FindBy(id="pass")
	public static WebElement login_password;

	@FindBy(xpath="//*[@id=\"send2\"]")
	public static WebElement Sign_in_btn_final;

}
