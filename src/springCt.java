import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class springCt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000L);
		//driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
		driver.findElement(By.cssSelector("a[title=\"Log in to your customer account\"]")).click();
		driver.findElement(By.id("email")).sendKeys("phishing@springct.com");
		driver.findElement(By.id("passwd")).sendKeys("Phish@123 ");
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(3000L);
		//driver.findElement(By.className("sf-with-ul")).click();
		 Actions builder = new Actions(driver);
		 WebElement element = driver.findElement(By.className("sf-with-ul"));
		 builder.moveToElement(element).build().perform();
		 driver.findElement(By.cssSelector("a[title=\"Evening Dresses\"]")).click();
		 //System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
		 driver.findElement(By.cssSelector("input[id=\"layered_id_attribute_group_2\"]")).click();
		 driver.findElement(By.cssSelector("input[id=\"layered_id_attribute_group_24\"]")).click();
		 
		 Actions builders = new Actions(driver);
		 WebElement elements = driver.findElement(By.cssSelector("img[title=\"Printed Dress\"]"));
		 builder.moveToElement(elements).build().perform();
		 
		driver.findElement(By.cssSelector("a[title=\"View\"]")).click();
		Thread.sleep(2000L);
		int i = 1;
		while(i<3)
		{
			driver.findElement(By.cssSelector("a[class=\"btn btn-default button-plus product_quantity_up\"]")).click();;
			i++;
		}
		
		Select s = new Select(driver.findElement(By.id("group_1")));
		s.selectByValue("2");
		driver.findElement(By.id("color_24")).click();
		driver.findElement(By.cssSelector("button[name=\"Submit\"]")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("span[id=\"layer_cart_product_quantity\"]")));
		
	
		
		
		 
		 
		
		
		

	}

}
