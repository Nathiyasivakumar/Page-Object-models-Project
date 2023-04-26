package test_cases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_function.common_function;
import pom_files.logins_pom;




public class login extends common_function{

    @Test
	public static void login() throws IOException    {
	
    	FileInputStream file = new FileInputStream("config.properties");

		Properties Properties = new Properties();

		Properties.load(file);

      
		PageFactory.initElements(driver, logins_pom.class);
		logins_pom.signinBtnbtn.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	     logins_pom.login_Email.sendKeys(Properties.getProperty("Email", "snathiyasivakumar0601@gmail.com"));

		logins_pom.login_password.sendKeys(Properties.getProperty("Password","Ayyapa@0601"));

		logins_pom.Sign_in_btn_final.click();
	}
}
