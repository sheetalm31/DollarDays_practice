import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\QA\\Installation\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseurl = "https://www.google.com/";
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Welcome");
		driver.findElement(By.name("btnK")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		
		
		driver.findElement(By.name("q")).clear();
		
		driver.close();
		
		
		Actions act = new Actions(driver);
		//WebElement source= driver.findElement(By.id);
		//WebElement target = driver.findElement(By.id);
		//ct.dragAndDrop(source, target).perform();
		
		
		

	}

}
