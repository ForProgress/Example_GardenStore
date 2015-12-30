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
	 * <b>Tags: </b><i> </i><br/>
	 * <div style="overflow:visible;width:378px;height:264px;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/gardenstore.modules/LoginPageIMG/login_passwd.png') no-repeat;width:378px;height:264px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:21px;margin-top:91px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 * <b>File:</b> login_passwd.png<br/>
	 * <b>Offset: </b> 1:28<br/>
	 * <b>Tags: </b><i> </i><br/>
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
	 * <b>Tags: </b><i> </i><br/>
	 * <div style="overflow:visible;width:378px;height:264px;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/gardenstore.modules/LoginPageIMG/login_passwd.png') no-repeat;width:378px;height:264px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:20px;margin-top:146px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 * <b>File:</b> login_passwd.png<br/>
	 * <b>Offset: </b> -1:84<br/>
	 * <b>Tags: </b><i> </i><br/>
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
	 * <b>Tags: </b><i> </i><br/>
	 * <div style="overflow:visible;width:378px;height:264px;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/gardenstore.modules/LoginPageIMG/login_passwd.png') no-repeat;width:378px;height:264px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:78px;margin-top:230px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
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
