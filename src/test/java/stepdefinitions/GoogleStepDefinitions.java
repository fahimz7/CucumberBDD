package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleStepDefinitions {
    WebDriver driver;

    @Given("I am on google homepage")
    public void i_am_on_google_homepage() {
        System.setProperty("webdriver.chrome.driver","/Users/Fahim/Desktop/Demo/AmericanEagleBDD/BrowserDriver/chromedriver");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }

    @When("I click on the search box I should see the curser")
    public void i_click_on_the_search_box_I_should_see_the_curser() {
    driver.findElement(By.xpath("//input[@name='q']")).click();
    }

    @Then("I will enter iphone")
    public void i_will_enter_iphone() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
    }

    @Then("I will click on the search button")
    public void i_will_click_on_the_search_button() {
        driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }
}
