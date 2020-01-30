import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
	ChromeDriver driver;
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssi49\\Downloads\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();		
	}
	
	
	public void goUrl(String url) {
		driver.get(url);
	}
	
	public void verifyTitle() {
		String foundTitle = driver.getTitle();	
		System.out.println("Title = " + foundTitle);
	}
	
	public void verifyUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Url = " + currentUrl);
	}
	

}
