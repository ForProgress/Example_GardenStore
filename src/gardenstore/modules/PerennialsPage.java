package gardenstore.modules;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TafException;
import fp.forevo.proxy.Button;
import gardenstore.modules.maps.PerennialsPageMap;

public class PerennialsPage extends PerennialsPageMap {
	
	WebDriver driver = MasterScript.browser;
	
	public PerennialsPage() {
		
		//WebElement title = (new WebDriverWait(driver, 10))
		//		.until(ExpectedConditions.presenceOfElementLocated(By.tagName("title"))); 
		
		try {
			Boolean title = (new WebDriverWait(driver, 10))		
				.until(ExpectedConditions.titleContains("Byliny"));
			
			if(title)
				log.info("Page 'Byliny - GARDEN STORE' opened successfully");
			else
				log.info("Something went wrong. Can't find page /'Byliny - GARDEN STORE/'");
		}
		catch (TimeoutException toe) {
			log.info(toe.toString());
		}
	}
	
	public boolean isElementPresent(By by) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		List<WebElement> list = driver.findElements((By) by);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(list.size() == 0) {
			return false;
		}
		else
		{
			return list.get(0).isDisplayed();
		}
	} 
	
	public void jCheckCountProducts(String str) {
				
		//isElementPresent(counter));
		try {
			
			WebElement counter = driver.findElement(By.cssSelector("#center_column .heading-counter"));
			
			if(counter.getText().split(" ")[1].equals(str))
				log.info("Counter founded = " + counter.getText().split(" ")[1]);
			else
				log.info("Counter didn't found, expected = " + str);
		}
		catch(NoSuchElementException nsee) {
			log.info(nsee.toString());
		}
	}
	
	public boolean jAddToCart(Button el) throws TafException {
		
		el.click();
		btnAddToCart.click();
		btnContinueShoping.click();
		
		log.info(objTextLable.getText() + " added to cart");
		
		driver.navigate().back();
		
		return true;		
	}
	
	
	
	public void Text() throws TafException {
		objText.assertText("BYLINY ");
		WebDriver dr = MasterScript.browser;
		WebElement el = MasterScript.browser.findElement(By.partialLinkText("Purpurea"));
		System.out.println(el.getText());
		
		if(MasterScript.browser.getTitle().equals("Byliny - GARDEN STORE")) {
			log.info("text tega <title> jest poprawny");
		}
		
		WebElement el1 = dr.findElement(By.cssSelector(".navigation_page"));
		log.info(".navigation_page : TEXT = " + el1.getText());
		
		WebElement hc = dr.findElement(By.cssSelector("#center_column .heading-counter"));
		
		log.info("#center_column .heading-counter : Liczba produktow jest " + hc.getText().split(" ")[1]);
		
		WebElement hc1 = dr.findElement(By.cssSelector(".nomargin.hiddable.col-lg-6>label>a>span"));
		log.info(".nomargin.hiddable.col-lg-6>label>a>span : Niedostêpne " + hc1.getText());
		log.info(objUnvav.getText());
		
		
		/*MasterScript.browser.get("http://www.google.com");
		WebElement element = MasterScript.browser.findElement(By.name("q"));
		element.sendKeys("Selenium");
		element.submit();
		System.out.println("Page title is: " + MasterScript.browser.getTitle());*/
		
		
		
	}
	
	

}
