package gardenstore.modules;

import org.openqa.selenium.By;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import fp.forevo.manager.TafException;

import gardenstore.modules.maps.LoginPageMap;


public class LoginPage extends LoginPageMap {
	
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";
	
	
	
	public boolean jCreateAccount() {
		log.info("Create account");
		return true;
	}
	
	/**User login
	 * 
	 * @param user
	 * @param password
	 * 
	 *  Example:
	 * | J Login | UserName | UserPassword
	 * 
	 * @return 
	 * @throws TafException
	 */
	public boolean jLogin(String user, String password) throws TafException {
		
		txtEmail.setText(user);
		txtPass.setText(password);
		log.info("Type user name and password for user: " + user, winLoginPage.screenShot());
		btnSubmitLogin.click();
		
		btnOrderHistory.waitIfNotExist(20);
		return labelMyAccount.assertText("Welcome to your account. Here you can manage all of your personal information and orders.");	
	}
	public boolean jBadLogin(String user, String password) throws TafException {

		txtEmail.setText(user);
		txtPass.setText(password);
		log.info("Type user name and password for user: " + user, winLoginPage.screenShot());
		btnSubmitLogin.click();		
		
		labelError.assertText("There is 1 error");
		return labelErrorMSG.assertText("Invalid email address.");	
	}
	
	public void loginByForEvo(String userEmail, String userPassword) throws TafException {
		
		txtEmail.setText(userEmail);
		txtPass.setText(userPassword);
		btnSubmitLogin.click();
		
	}
	
	public void loginByWebDriver(String userEmail, String userPassword) {
		
		browser.findElement(By.id("email")).sendKeys(userEmail);
		browser.findElement(By.id("passwd")).sendKeys(userPassword);
		browser.findElement(By.id("SubmitLogin")).click();
	}
	
	public void loginBySikuli(String userEmail, String userPassword) throws FindFailed {
		Screen screen = new Screen();
		
		screen.click("img/userEmail.png");
		screen.type(userEmail);
		screen.click("img/userPassword.png");
		screen.type(userPassword);
		screen.click("img/submit.png");
	}

}
