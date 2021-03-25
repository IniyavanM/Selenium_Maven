package Test_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testmaven {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Chrome-Driver\\chromedriver.exe");
		// Using Maven no need to usse above line
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("OnePlus 9");
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
