package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class valuesPFactory {
		WebDriver driver;
		
		public valuesPFactory(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//*[@id=\"values_footer\"]") WebElement value;
		public void valueslink() {
			value.click();
		}
        @FindBy(xpath="/html/body/div[1]/div[2]/p") WebElement para;
        public void paratext() {
        	System.out.println(para.getText());
        }
}
