import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		
		// //a[@value = "BLR"] - xpath for bengaluru
		// //a[@value = "PNQ"] - xpath for Pune
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		

	}

}
