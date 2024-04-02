package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class careersPFactory {
		WebDriver driver;
		
		public careersPFactory(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//*[@id=\"careers_footer\"]") WebElement career;
		public void careerlink() {
			career.click();
		}
        

		@FindBy(xpath="//*[@id=\"masterContainer\"]/span") WebElement exBtn;
		public void exlink() { 
			exBtn.click();
		}
//		
//		@FindBy(xpath="//*[@id=\"mySearch\"]") WebElement Btn;
//		public void link() { 
//			Btn.click();
//			Btn.sendKeys("MANAGER");
//		}
//        

		@FindBy(xpath="//*[@id=\"masterContainer\"]/article/button") WebElement search;
		public void searchlink() {
			search.click();
		}
        

		@FindBy(xpath="//*[@id=\"reactContentMount\"]/main/article[1]/button[3]/span[1]") WebElement option;
		public void optionlink() {
			option.click();
		}
        

		@FindBy(xpath="//*[@id=\"reactContentMount\"]/main/div[1]/div[2]/span[1]") WebElement jobtitle;
		public void jobtitlelink() {
			jobtitle.click();
		}
        

		@FindBy(xpath="//*[@id=\"masterContainer\"]/main/button") WebElement applyBtn;
		         
		public void Applylink() {
			applyBtn.click();
		}
        
}
