package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactusPFactory {
		WebDriver driver;
		
		public contactusPFactory(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//*[@id=\"contact_us_footer\"]") WebElement contact;
		
		public void contactlink() {
			contact.click();
		}
        
		
		@FindBy(xpath="//*[@id=\"mBWrapper\"]/div/div/div[1]/table/tbody/tr[2]/td/div/heading") WebElement text;
		@FindBy(xpath="//*[@id=\"mBWrapper\"]/div/div/div[1]/table/tbody/tr[2]/td/div/div/div/div[1]/div") WebElement text1;
		@FindBy(xpath="//*[@id=\"mBWrapper\"]/div/div/div[1]/table/tbody/tr[2]/td/div/div/div/div[2]/div") WebElement text2;
		
		public void headline() {
			System.out.println(text.getText()+"\n"+text1.getText()+"\n"+text2.getText());
		}
}

