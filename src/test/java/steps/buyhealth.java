package steps;

import static steps.BaseTest.driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class buyhealth {
	
	
	
	
	
	@Given("User launches the Star Health application with {string}")
	public void user_launches_the_star_health_application_with(String string)  {
		driver.get("https://www.starhealth.in/");
	
	    
	}

	@Then("User get home page title and Validates it")
	public void user_get_home_page_title_and_validates_it() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Star Health Insurance: Medical, Accident and Travel insurance policies";
		 Assert.assertEquals("The actual title does not match the expected title", expectedTitle, actualTitle);

	    
	}

	@Then("User clicks on the Buy Now button")
	public void user_clicks_on_the_buy_now_button() {
		
		WebElement buy = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[2]/button/span"));
		buy.click();
		
	}

	@Then("User Enters data for  {string},{string},{string},{string}")
	public void user_enters_data_for(String string, String string2, String string3, String string4) {
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"fullname\"]"));
		e1.sendKeys("vishnu");
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
		e2.sendKeys("9090890978");
		WebElement e3 = driver.findElement(By.xpath("////*[@id=\"email\"]"));
		e3.sendKeys("vishnu@gmail.com");
		WebElement e4 = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
		e4.sendKeys("524230");
	  
	}

	@Then("User click on getstarted button")
	public void user_click_on_getstarted_button() {
		WebElement started = driver.findElement(By.xpath("//*[@id=\"userDetails-form\"]/div/div/div/div[1]/div/div/div[2]/div/button"));
		started.click();
		
	}

	@Then("User select the checkbox for myself")
	public void user_select_the_checkbox_for_myself() {
		By checkboxLocator = By.xpath("//*[@id=\"myself\"]");
		driver.findElement(checkboxLocator).click();
		
	}

	@Then("user navigates to the HomePage with {string}")
	public void user_navigates_to_the_home_page_with(String string) {
		 String homePageUrl = "https://www.starhealth.in/";
		 driver.get(homePageUrl);

	    
	}

}
