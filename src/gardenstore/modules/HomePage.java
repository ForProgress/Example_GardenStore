package gardenstore.modules;

import org.openqa.selenium.By;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TafException;
import fp.forevo.proxy.Browser;
import gardenstore.modules.maps.HomePageMap;

public class HomePage extends HomePageMap {

	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";
	
	public boolean jOpenParennialsPage() {
		try {
			btnPerennials.click();
		} catch (TafException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.info("Open Parennials page");
		return true;
	}

	/**
	 * Opening the login page if user logged out. User logout if logged in.
	 * Example: | J Open Form | |
	 */
	public boolean jOpenLoginForm() throws TafException {
		imgLogo.click();

		log.info("Open login page");
		boolean status = btnSignIN.checkIfExist();
		if (status == false) {
			log.info("Open login page", "User is already logged in. Executing sign off action");
			jLogout();
		}

		btnSignIN.click();

		if (txtEmail.waitIfNotExist(20)) {
			log.info("jOpenLoginForm", "Ok. Sign in form is correct", winHomePage.screenShot());
			return true;
		} else {
			throw new TafException("Something went wrong. Can't find email text field.", winHomePage.screenShot());
		}

	}

	public boolean jOpenContactPage() {
		try {
			btnNew.click();
		} catch (TafException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.info("Open contact page");
		return true;
	}

	public boolean jSearchProduct(String product) {
		log.info("Search product");
		return true;
	}

	/**
	 * Opening the browser and the GardenStore page.
	 * 
	 * Example: | J Open Garden Store | |
	 * 
	 */
	public boolean jOpenGardenStore() throws TafException {
		log.info("Run browser");
		//runBrowser(Browser.Firefox, "http://localhost:8181/gardenstore");
		runBrowser(Browser.Firefox, "http://testy.forprogress.com.pl:8000/gardenstore/pl/");
		MasterScript.browser.manage().window().maximize();
		
		if (imgLogo.waitIfNotExist(20)) {
			log.info("openGardenStore", "Main page is correct", winHomePage.screenShot());
			return true;
		} else {
			throw new TafException("Something went wrong. Can't find Gardenstore logo", winHomePage.screenShot());
		}

	}

	/**
	 * User logout
	 * 
	 * Example: | J Logout | |
	 * 
	 */
	public boolean jLogout() throws TafException {

		btnSignOut.click();
		if (btnSignIN.waitIfNotExist(20)) {
			log.info("Sign out", "User has been successfully logged out", winHomePage.screenShot());
			return true;
		} else {
			throw new TafException("User has not been successfully logged out. Can't find button 'Sign in'", winHomePage.screenShot());
		}
	}

	/**
	 * Changes Language on the website
	 * 
	 * @param lang
	 *            - language name to change
	 * 
	 *            Example: | J Change Language | English | | J Change Language |
	 *            Polski |
	 * @throws TafException
	 * 
	 */
	public boolean jChangeLanguage(String lang) throws TafException {
		log.info("Change language: " + lang);

		//cmbChangeLanguage.click();
		elemLanguage.click();
		
		
		cmbChangeLanguage.waitForVisible(10);
		cmbChangeLanguage.clickElementFromListByTag(lang, "span");
		// TODO
		// zamiana funkcji combox na wywolanie w stylu:
		// combobox.select("nazwa elementu do wybrania");

		// cmbChangeLanguage.select("Polski");
		
		
		
		/*
		 * WebDriverWait wait = new WebDriverWait(browser, 30);
		 * wait.until(ExpectedConditions
		 * .visibilityOfElementLocated(By.id("languages-block-top")));
		 * browser.findElement(By.id("languages-block-top")).click(); WebElement
		 * element = browser.findElement(By.id("first-languages"));
		 * element.findElement(By.partialLinkText(lang)).click();
		 */

		return true;
	}

	public void jCloseGardenStore() {
		MasterScript.browser.close();
	}

	public boolean jChooseItem(String name) {

		browser.findElement(By.linkText(name)).click();
		return true;
	}

}
