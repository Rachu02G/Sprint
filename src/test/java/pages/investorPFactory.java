package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class investorPFactory {
		WebDriver driver;
		
		public investorPFactory(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//*[@id=\"investor_relations_footer\"]") WebElement investor;
		public void investorlink() {
			
			investor.click();
		}
		
		@FindBy(xpath="//*[@id=\"content1\"]/div/table/tbody/tr/td[1]")
		List<WebElement> col1;
		
		@FindBy(xpath="//*[@id=\"content1\"]/div/table/tbody/tr/td[2]")
		List<WebElement> col2;
		public void table()
		{
			for(int i=0;i<=6;i++) {
				String text1=col1.get(i).getText();
				String text2=col2.get(i).getText();
				System.out.printf("%-50s%s\n",text1,text2);
			}
		}
		


}
