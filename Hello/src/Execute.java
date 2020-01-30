import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execute {

	public static void main(String[] args) throws IOException {
//		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssi49\\Downloads\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.amazon.com");
		
//		ExternalFileReadPractice r = new ExternalFileReadPractice();
//		Properties p = r.readProperties("C:\\Users\\ssi49\\eclipse-workspace\\Hello\\src\\config.properties");
//		
//		System.out.println(p.getProperty("userName"));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Kids");
		
//		HomeWork hw = new HomeWork();
//		hw.openBrowser();
//		hw.goUrl("https://www.target.com/");
//		hw.verifyTitle();
//		hw.verifyUrl();
		
		

		
		
		
		
//		

	}

}
