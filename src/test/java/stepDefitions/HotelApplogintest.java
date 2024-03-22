package stepDefitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelApplogintest {
	WebDriver driver;
	@Given("User is navigating to Hotel app Login page")
	public void user_is_navigating_to_hotel_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
	    
	}

	@When("User need to enter username as {string} and password as {string}")
	public void user_need_to_enter_username_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("username")).sendKeys("anasuya02");
	    driver.findElement(By.id("password")).sendKeys("Sindhu@30");
	    driver.findElement(By.id("login")).click();
		system.out.println("login successfull");
	}

	@Then("User is successfully navigated to Hotel app page")
	public void user_is_successfully_navigated_to_hotel_app_page() {
	    // Write code here that turns the phrase above into concrete actions
		String Greeting=driver.findElement(By.id("username_show")).getAttribute("value");
		String expectedText="Hello anasuya02!";
		Assert.assertTrue(Greeting.equalsIgnoreCase(expectedText));
	}


}
