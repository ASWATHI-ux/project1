package ksrtc1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class casestudy {
	@Test
	public void ksrtc() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ASWATHI\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	//WebElement w1 = null;
	d1 = new ChromeDriver();
	
	//d1.get("https://ksrtc.in/oprs-web/login/show.do");
	d1.get("https://ksrtc.in/oprs-web/");
	/*d1.get("https://ksrtc.in/oprs-web/user/add.do");
	
	d1.findElement(By.id("email")).sendKeys("aswathi433@gmail.com");
	d1.findElement(By.id("fullName")).sendKeys("Aswathi Thalappan");
	d1.findElement(By.id("mobileNo")).sendKeys("8157880654");
	d1.findElement(By.xpath("//*[@id=\"userProfileForm\"]/div/div/div/div/div/div[5]/input")).click();*/
	
	
	d1.get("https://ksrtc.in/oprs-web/login/show.do");
	d1.findElement(By.id("userName")).sendKeys("aswathi433@gmail.com");
	d1.findElement(By.id("password")).sendKeys("Abc@123");
	d1.findElement(By.id("submitBtn")).click();
	
	
	
	//d1.manage().window().maximize();
	//d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//d1.get("http://leafground.com/pages/autoComplete.html");
	d1.findElement(By.id("fromPlaceName")).sendKeys("BANG");
	Thread.sleep(3000);
	
	List<WebElement> element1=d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

	for(WebElement el:element1) {
		if(el.getText().equalsIgnoreCase("BANGALORE")) {
			el.click();
			break;
		}
	}
	
	d1.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/div[1]/div/div[2]/div/input[3]")).sendKeys("MANG");
	Thread.sleep(3000);
	List<WebElement> element2=d1.findElements(By.xpath("//ul[@id=\'ui-id-2\']/li"));

	for(WebElement e2:element2) {
		if(e2.getText().equalsIgnoreCase("MANGALORE")) {
			e2.click();
			break;
		}
	}
	//public void javascript1() {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\ASWATHI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver d1;
		//d1 = new ChromeDriver();
		//d1.get("http://demo.automationtesting.in/Datepicker.html");
	//d1.findElement(By.id("/html/body/main/form/div[1]/div/div[2]/div[2]/div/div[1]/div/input")).sendKeys("BANG");
	//Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor) d1;
		jse.executeScript("document.getElementById('txtJourneyDate').value='20/01/2022'");
		jse.executeScript("document.getElementById('txtReturnJourneyDate').value='25/01/2022'");
		
		//d1.findElement(By.xpath("//label[text()='singleLady']")).click();
		d1.findElement(By.cssSelector("#bookingsForm > div.main-booking > div > div:nth-child(2) > div.col-md-2.mb-1.booking-input > button > i")).click();
		}
}
	