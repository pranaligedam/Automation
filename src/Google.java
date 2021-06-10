import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//driver.findElement(By.xpath("//div[@class = 'RNNXgb']/div/div[2]/input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//div[@id = 'gbw']/div/div/div/div[2]/a")).click();

	}

}
