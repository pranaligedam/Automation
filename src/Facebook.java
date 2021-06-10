
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

////tagName[@attribute = 'value'] - xpath syntax
		/*
		 * driver.findElement(By.xpath("//*[@type = 'text']")).sendKeys("my own xpath");
		 * driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		 * driver.findElement(By.xpath("//*[@name = 'login']")).click();
		 */

//tagName[attribute = 'value'] - css syntax
		driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("my own css");
		driver.findElement(By.cssSelector("[name = 'login']")).click();
		driver.close();

	}

}
