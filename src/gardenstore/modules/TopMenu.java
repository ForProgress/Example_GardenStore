package gardenstore.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TafException;
import gardenstore.modules.maps.TopMenuMap;


public class TopMenu extends TopMenuMap {
	
	//private final WebDriver driver;
	
	//public TopMenu(WebDriver driver) {
	//	this.driver = driver;		
	//}
	
	public PerennialsPage doOpenByliny() throws TafException {
		
		btnByliny.click();
		
		return new PerennialsPage();
		
	}
	
	public void jCheckCartStatus() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement el = MasterScript.browser.findElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]"));
		
		//el.
		
		//WebElement count = (WebElement) (new WebDriverWait(MasterScript.browser, 5)).
		//		until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("quantity")));
		System.out.println("cnew ount = " +  el.getText());
	}

}
