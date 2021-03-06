package sauce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefinition {
	WebDriver d;
	@Given("The user has to be in saucrdemo login page")
	public void the_user_has_to_be_in_saucrdemo_login_page() {
		WebDriverManager.chromedriver().setup();
	    d = new ChromeDriver();
		d.get("https://www.saucedemo.com/");
	}

	@When("The user has to fill {string} and {string}")
	public void the_user_has_to_fill_and(String user, String pswd) {
	  WebElement username = d.findElement(By.id("user-name"));
	  username.sendKeys(user);
	  WebElement pswrd = d.findElement(By.id("password"));
	  pswrd.sendKeys(pswd);
	
	}

	@When("The user click the login button")
	public void the_user_click_the_login_button() {
	    WebElement login = d.findElement(By.id("login-button"));
	    login.click();
	 }
	

	@Then("The user in valid login page")
	public void the_user_in_valid_login_page() {
	     System.out.println("valid credentials ");
	
	}
	@When("The user has to fill username {string} and pasword {string}")
	public void the_user_has_to_fill_username_and_pasword(String usr, String paswrd) {
		WebElement username = d.findElement(By.id("user-name"));
		  username.sendKeys(usr);
		  WebElement pswrd = d.findElement(By.id("password"));
		  pswrd.sendKeys(paswrd);
		
	}

	@Then("The user in invalid login page")
	public void the_user_in_invalid_login_page() {
	    System.out.println("invalid credentials");
	    d.quit();
	
	}





}
