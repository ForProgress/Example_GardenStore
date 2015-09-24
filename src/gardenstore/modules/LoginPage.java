package gardenstore.modules;

import fp.forevo.manager.TafException;
import fp.forevo.manager.TestSettings;
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
		log.info("Logowanie","Type user name and password for user: " + user, winLoginPage.screenShot());
		btnSubmitLogin.click();
		
		btnOrderHistory.waitIfNotExist(20);
		return labelMyAccount.assertText("Welcome to your account. Here you can manage all of your personal information and orders.");	
	}
	public boolean jBadLogin(String user, String password) throws TafException {

		txtEmail.setText(user);
		txtPass.setText(password);
		log.info("Sign in","Type user name and password for user: " + user, winLoginPage.screenShot());
		btnSubmitLogin.click();		
		
		labelError.assertText("There is 1 error");
		return labelErrorMSG.assertText("Invalid email address.");	
	}
	
	

}