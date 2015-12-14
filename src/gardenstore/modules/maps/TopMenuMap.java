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
public class TopMenuMap extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/gardenstore.modules/TopMenu/TopMenu.map");

	/**
	 * <b>Description:</b> 
	 */
	protected Window winTopMenu = getWindow(tomgr, "winTopMenu");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> linkText:Byliny<br/>
	 */
	protected Button btnByliny = getButton(tomgr, winTopMenu, "btnByliny");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> linkText:Krzewy<br/>
	 */
	protected Button btnKrzewy = getButton(tomgr, winTopMenu, "btnKrzewy");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> linkText:Paprocie<br/>
	 */
	protected Button btnPaprocie = getButton(tomgr, winTopMenu, "btnPaprocie");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> linkText:Pn¹cza<br/>
	 */
	protected Button btnPn¹cza = getButton(tomgr, winTopMenu, "btnPn¹cza");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> linkText:Krzewinki<br/>
	 */
	protected Button btnKrzewinki = getButton(tomgr, winTopMenu, "btnKrzewinki");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> linkText:Zio³a<br/>
	 */
	protected Button btnZio³a = getButton(tomgr, winTopMenu, "btnZio³a");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> linkText:Kwiaty<br/>
	 */
	protected Button btnKwiaty = getButton(tomgr, winTopMenu, "btnKwiaty");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> linkText:Trawy ozdobne<br/>
	 */
	protected Button btnTrawy_ozdobne = getButton(tomgr, winTopMenu, "btnTrawy_ozdobne");

}
