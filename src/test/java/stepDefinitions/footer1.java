package stepDefinitions;


 
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.WebDriver.Timeouts;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import pages.aboutusPFactory;
import pages.careersPFactory;
import pages.contactusPFactory;
import pages.investorPFactory;
import pages.valuesPFactory;
 
public class footer1  {
	WebDriver driver;
	

	@Given("when user is in redbus homepage")
	public void when_user_is_in_redbus_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
		
	}

	@When("user scroll to footer scetion")
	public void user_scroll_to_footer_scetion() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	@When("user click on about us link")
	public void user_click_on_about_us_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		//driver.findElement(By.xpath("//*[@id=\"about_us_footer\"]")).click();
		aboutusPFactory au=new aboutusPFactory(driver);
		au.aboutlink();
	}

	@Then("user should be redirected to about us page")
	public void user_should_be_redirected_to_about_us_page()  {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}
	@Then("user get the title of the page")
	public void user_get_the_title_of_the_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		 
	    
	}

	@When("user click on investor relations  link")
	public void user_click_on_investor_relations_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//*[@id=\"investor_relations_footer\"]")).click();
		 driver.get("https://www.redbus.in/");
		investorPFactory i=new investorPFactory(driver);
		i.investorlink();
		
	}

	@Then("user should be redirected to investor page")
	public void user_should_be_redirected_to_investor_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		
	}
	
	@Then("user get the content of the table from investor page")
	public void user_get_the_content_of_the_table_from_investor_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);
//		List<WebElement> col1=driver.findElements(By.xpath("//*[@id=\"content1\"]/div/table/tbody/tr/td[1]"));
//		List<WebElement> col2=driver.findElements(By.xpath("//*[@id=\"content1\"]/div/table/tbody/tr/td[2]"));
		
         
//		for(int i=0;i<7;i++) {
//			String text1=col1.get(i).getText();
//			String text2=col2.get(i).getText();
//			System.out.printf("%-50s%s\n",text1,text2);
//		}
		
		investorPFactory i=new investorPFactory(driver);
	    i.table();
	}

	@When("user click on contact us  link")
	public void user_click_on_contact_us_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//*[@id=\"contact_us_footer\"]")).click();
		contactusPFactory cu=new contactusPFactory(driver);
		cu.contactlink();
	}

	@Then("user should be redirected to contact us page")
	public void user_should_be_redirected_to_contact_us_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	
		
		
	}
	@Then("user get the Corporate Head Office list")
	public void user_get_the_corporate_head_office_list() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
	    Thread.sleep(5000);
//	    String title=driver.findElement(By.xpath("//*[@id=\"mBWrapper\"]/div/div/div[1]/table/tbody/tr[2]/td/div/heading")).getText();
//	    String loc1=driver.findElement(By.xpath("//*[@id=\"mBWrapper\"]/div/div/div[1]/table/tbody/tr[2]/td/div/div/div/div[1]/div")).getText();
//	    
//	    String loc2=driver.findElement(By.xpath("//*[@id=\"mBWrapper\"]/div/div/div[1]/table/tbody/tr[2]/td/div/div/div/div[2]/div")).getText();
//		System.out.println(title+"\n"+loc1+"\n"+loc2);
	    contactusPFactory cu=new contactusPFactory(driver);
	    cu.headline();
	}
	


	@When("user click on values link")
	public void user_click_on_values_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//*[@id=\"values_footer\"]")).click();
		valuesPFactory v=new valuesPFactory(driver);
		v.valueslink();
	}

	@Then("user should be redirected to values  page")
	public void user_should_be_redirected_to_values_page()  {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		
		                             
	}
	@Then("user get the heading from the page")
	public void user_get_the_heading_from_the_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);
//		String heading=driver.findElement(By.xpath("/html/body/div[1]/div[2]/p")).getText();
//		System.out.println(heading);
		valuesPFactory v=new valuesPFactory(driver);
		v.paratext(); 
		
		
	}

	@When("user click on careers link")
	public void user_click_on_careers_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//*[@id=\"careers_footer\"]")).click();
		careersPFactory au=new careersPFactory(driver);
		au.careerlink();
		
	}

	@Then("user should be redirected to careers page")
	public void user_should_be_redirected_to_careers_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		
		
		
	}
	@Then("user apply for the web automation role")
	public void user_apply_for_the_web_automation_role() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);
//		WebElement btn = driver.findElement(By.xpath("//*[@id=\"masterContainer\"]/span"));
//		btn.click();
		careersPFactory au=new careersPFactory(driver);
		au.exlink();
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);
//		WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"mySearch\"]"));
//		btn1.click();
//		btn1.sendkey("manager");
//		au.link();


		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(3000);
//		WebElement searchBtn = driver.findElement(By.xpath("//*[@id=\"masterContainer\"]/article/button"));
//		searchBtn.click();
		au.searchlink();

		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(3000);
//		WebElement category = driver.findElement(By.xpath("//*[@id=\"reactContentMount\"]/main/article[1]/button[3]"));
//		category.click();  
	
        au.optionlink();	
		

		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(3000);
//		WebElement jobTitle = driver.findElement(By.xpath("//*[@id=\"reactContentMount\"]/main/div[1]/div[3]/span[1]"));
//		jobTitle.click();
        au.jobtitlelink();	
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(3000);
//		WebElement applyBtn = driver.findElement(By.xpath("//*[@id=\"masterContainer\"]/main/button"));
//		applyBtn.click();
		au.Applylink();
	    
	}

	

}