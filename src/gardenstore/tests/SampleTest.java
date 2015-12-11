package gardenstore.tests;

import gardenstore.tests.maps.SampleTestMap;



import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TafException;
import gardenstore.modules.HomePage;
import gardenstore.modules.LoginPage;
import gardenstore.modules.PerennialsPage;
import gardenstore.modules.TopMenu;

public class SampleTest extends SampleTestMap {

	public static void main(String[] args) {
		new SampleTest().run();
	}
	
	private void run() {	
		log.info("");
		log.warning("", "");
		HomePage homePage = new HomePage();
		TopMenu topMenu = new TopMenu();
		
		/*LoginPage loginPage = new LoginPage();
		PerennialsPage page = new PerennialsPage();*/
		
		try {
			homePage.jOpenGardenStore();
			
			PerennialsPage PP = topMenu.doOpenByliny();
			PP.jCheckCountProducts("2180");
			PP.jCheckCountProducts("2179");
			PP.jAddToCart(btnPurpurea);
			PP.jAddToCart(btnBronze);
			PP.jAddToCart(btnBuchanana);
			PP.jAddToCart(btnHollard);
			
			topMenu.jCheckCartStatus();
			
			//PerennialsPage page = topMenu.doOpenByliny();
			//page.Text();
			//homePage.jChangeLanguage("English");
			
			//homePage.jOpenParennialsPage();
			//page.jAddToCart();
			
			/*homePage.jOpenLoginForm();
			loginPage.jLogin("tester@forprogress.com.pl", "12345678");
			homePage.jOpenContactPage();
			homePage.jLogout();*/
			
			//MasterScript.browser.quit();
			closeBrowser();
		} catch (TafException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
