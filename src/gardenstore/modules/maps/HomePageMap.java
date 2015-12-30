package gardenstore.modules.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2015-12-30 12:26:06
 */
public class HomePageMap extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/gardenstore.modules/HomePage/HomePage.map");

	/**
	 * <b>Description:</b> Home page
	 */
	protected Window winHomePage = getWindow(tomgr, "winHomePage");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> linkText=Sign in<br/>
	 */
	protected Button btnSignIN = getButton(tomgr, winHomePage, "btnSignIN");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> linkText=Sign out<br/>
	 */
	protected Button btnSignOut = getButton(tomgr, winHomePage, "btnSignOut");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> css=.logo.img-responsive<br/>
	 */
	protected Button imgLogo = getButton(tomgr, winHomePage, "imgLogo");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> ComboBox<br/>
	 * <b>Target:</b> id=languages-block-top<br/>
	 */
	protected ComboBox cmbChangeLanguage = getComboBox(tomgr, winHomePage, "cmbChangeLanguage");

	/**
	 * <b>Description:</b> Przycisk 'Submit', Przycisk 'Dodaj do koszyka'<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> name=Submit<br/>
	 */
	protected Button btnSubmit = getButton(tomgr, winHomePage, "btnSubmit");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> TextBox<br/>
	 * <b>Target:</b> id=email<br/>
	 */
	protected TextBox txtEmail = getTextBox(tomgr, winHomePage, "txtEmail");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Element<br/>
	 * <b>Target:</b> css=span<br/>
	 */
	protected Element elemLanguage = getElement(tomgr, winHomePage, "elemLanguage");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> linkText=Perennials<br/>
	 */
	protected Button btnPerennials = getButton(tomgr, winHomePage, "btnPerennials");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Image<br/>
	 * <b>Target:</b> .//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img<br/>
	 */
	protected Image obj = getImage(tomgr, winHomePage, "obj");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> .//*[@id='contact-link']/a<br/>
	 */
	protected Button btnNew = getButton(tomgr, winHomePage, "btnNew");

}
