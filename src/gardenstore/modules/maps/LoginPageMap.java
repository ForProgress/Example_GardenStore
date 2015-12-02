package gardenstore.modules.maps;


import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2015-10-08 14:41:53
 */
public class LoginPageMap extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/gardenstore.modules/LoginPage/LoginPage.map");

	/**
	 * <b>Description:</b> Window Login Page
	 */
	protected Window winLoginPage = getWindow(tomgr, "winLoginPage");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> TextBox<br/>
	 * <b>Target:</b> id:email<br/>
	 */
	protected TextBox txtEmail = getTextBox(tomgr, winLoginPage, "txtEmail");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> TextBox<br/>
	 * <b>Target:</b> id:passwd<br/>
	 */
	protected TextBox txtPass = getTextBox(tomgr, winLoginPage, "txtPass");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> id:SubmitLogin<br/>
	 */
	protected Button btnSubmitLogin = getButton(tomgr, winLoginPage, "btnSubmitLogin");

	/**
	 * <b>Description:</b> Welcome to your account. Here you can manage all of your personal information and orders.<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> cssSelector:p.info-account<br/>
	 */
	protected Button labelMyAccount = getButton(tomgr, winLoginPage, "labelMyAccount");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> cssSelector:a[title="Orders"] > span<br/>
	 */
	protected Button btnOrderHistory = getButton(tomgr, winLoginPage, "btnOrderHistory");

	/**
	 * <b>Description:</b> There is 1 error<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> cssSelector:div.alert.alert-danger > p<br/>
	 */
	protected Button labelError = getButton(tomgr, winLoginPage, "labelError");

	/**
	 * <b>Description:</b> Invalid email address.<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> cssSelector:ol > li<br/>
	 */
	protected Button labelErrorMSG = getButton(tomgr, winLoginPage, "labelErrorMSG");

}
