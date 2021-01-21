import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 {

	@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\QA\\Installation\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseurl = "https://jqueryui.com/datepicke";
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\QA\\Screen shots\\scr3.png"));
		
		System.out.println("Screen shot taken succesfully");
		driver.quit();
		
		
		
		//Actions act = new Actions(driver);
      //  act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
      //  System.out.println("Scroll down perfomed");
      //  Thread.sleep(3000);
	//	driver.findElement(By.linkText("Draggable")).click();
		
	//	WebElement dateBox = driver.findElement(By.xpath("//*[@id='datepicker']"));
	//	dateBox.sendKeys("121010");
	
		
		
	//	 WebElement getdate = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		 
	//	 System.out.println(getdate);
		 
		 
		
		
				
		
		
	}

}
