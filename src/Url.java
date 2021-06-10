import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		//Create Driver object for chrome Browser
		
		// we will strictly implement methods of webdriver
		/* Class name= ChromeDriver,
		 * x Driver = new x()*/
		 
	// Invoke .exe file export	
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://webapp.ahs.allhands.cloud/"); //url on the browser
		System.out.println(driver.getTitle()); //validate if your page title is correct
		System.out.println(driver.getCurrentUrl()); //validate you are landed on current url
		

		//driver.close(); // closes current browser
		//driver.quit(); // It closes all the browser opened by selenium script
	}
	

}
