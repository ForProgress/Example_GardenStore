package gardenstore.modules.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2015-12-11 13:09:01
 */
public class LoginPageIMGMap extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/gardenstore.modules/LoginPageIMG/LoginPageIMG.map");

	/**
	 * <b>Description:</b> Window Login Page
	 */
	protected Window winLoginPage = getWindow(tomgr, "winLoginPage");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> TextBox<br/>
	 * <br/>
	 * <b>File:</b> login_passwd.png<br/>
	 * <b>Offset: </b> -163:-36<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('D:\Andrew\workspace\Example_GardenStore\res\gardenstore.modules\LoginPageIMG\login_passwd.png') no-repeat;width:378px;height:264px;">
	 * <img style="margin-left:21px;margin-top:91px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 * <b>File:</b> login_passwd.png<br/>
	 * <b>Offset: </b> 1:28<br/>
	 * <b>Tags: </b> <br/>
	 * <b>OCR:</b> Adres<br/>
	 */
	protected TextBox txtEmail = getTextBox(tomgr, winLoginPage, "txtEmail");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> TextBox<br/>
	 * <br/>
	 * <b>File:</b> login_passwd.png<br/>
	 * <b>Offset: </b> -164:19<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('D:\Andrew\workspace\Example_GardenStore\res\gardenstore.modules\LoginPageIMG\login_passwd.png') no-repeat;width:378px;height:264px;">
	 * <img style="margin-left:20px;margin-top:146px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 * <b>File:</b> login_passwd.png<br/>
	 * <b>Offset: </b> -1:84<br/>
	 * <b>Tags: </b> <br/>
	 * <b>OCR:</b> Adres<br/>
	 */
	protected TextBox txtPass = getTextBox(tomgr, winLoginPage, "txtPass");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> login_passwd.png<br/>
	 * <b>Offset: </b> -106:103<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('D:\Andrew\workspace\Example_GardenStore\res\gardenstore.modules\LoginPageIMG\login_passwd.png') no-repeat;width:378px;height:264px;">
	 * <img style="margin-left:78px;margin-top:230px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btnSubmitLogin = getButton(tomgr, winLoginPage, "btnSubmitLogin");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 */
	protected Button labelMyAccount = getButton(tomgr, winLoginPage, "labelMyAccount");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 */
	protected Button btnOrderHistory = getButton(tomgr, winLoginPage, "btnOrderHistory");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 */
	protected Button labelError = getButton(tomgr, winLoginPage, "labelError");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 */
	protected Button labelErrorMSG = getButton(tomgr, winLoginPage, "labelErrorMSG");

}
