import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j=0;
		String[] itemsNeeded={"Cucumber","Brocolli","Beetroot","Carrot"};
		Thread.sleep(3000);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			//Brocolli - 1 Kg
			String[] name=products.get(i).getText().split("-");
			String formatedName=name[0].trim();
			//Format it to get actual vegetable name
			//Check whether you extracted is present in array or not
			// convert array into array list for easy search
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
		
			if(itemsNeededList.contains(formatedName))
			{
				j++;
				//Click on ADD To CART
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
				if(j==0)
				{
					break;
				}
				
			}
		}
		
////button[text()='ADD TO CART']
	}

}
