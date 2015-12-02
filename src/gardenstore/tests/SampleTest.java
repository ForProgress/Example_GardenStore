package gardenstore.tests;


import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TafException;
import gardenstore.modules.HomePage;
import gardenstore.modules.LoginPage;

public class SampleTest extends MasterScript{

	public static void main(String[] args) {
		new SampleTest().run();
	}
	
	private void run() {
	
		log.info("");
		log.warning("", "");
		HomePage homePage = new HomePage();
		LoginPage loginPage = new LoginPage();
		
		
		try {
			homePage.jOpenGardenStore();
			//loginPage.jLogin("tester@forprogress.com.pl", "12345678");
			homePage.jChangeLanguage("English");
			homePage.jOpenContactPage();
			
			homePage.jLogout();
		} catch (TafException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
