import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

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
		driver.get("https://www.google.com/"); //url on the browser
		System.out.println(driver.getTitle()); //validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); //validate you are landed on current url
		
		//System.out.println(driver.getPageSource()); // print page source
		driver.get("https://in.yahoo.com/?p=us");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close(); // closes current browser
		driver.quit(); // It closes all the browser opened by selenium script
	}
	

}
