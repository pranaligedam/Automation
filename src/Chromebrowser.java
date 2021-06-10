import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/"); // URL in the browser
/*driver.findElement(By.id("email")).sendKeys("This is my first code");
driver.findElement(By.name("pass")).sendKeys("123456");
driver.findElement(By.linkText("Forgotten account?")).click();*/

driver.findElement(By.cssSelector("#email")).sendKeys("Email Address");
driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123456");
driver.findElement(By.xpath("//*[@id=\'u_0_a\']/div[3]/a")).click();

	}

}
