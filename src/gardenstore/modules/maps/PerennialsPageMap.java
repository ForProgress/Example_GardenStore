package gardenstore.modules.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2015-12-30 12:27:28
 */
public class PerennialsPageMap extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/gardenstore.modules/PerennialsPage/PerennialsPage.map");

	/**
	 * <b>Description:</b> 
	 */
	protected Window winPerennialsPage = getWindow(tomgr, "winPerennialsPage");

	/**
	 * <b>Description:</b> acena bezbronna "Purpurea"<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> xpath=//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img<br/>
	 */
	protected Button btnPurpurea = getButton(tomgr, winPerennialsPage, "btnPurpurea");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Image<br/>
	 * <b>Target:</b> cssSelector=img.replace-2x.img-responsive<br/>
	 */
	protected Image ImgFirst = getImage(tomgr, winPerennialsPage, "ImgFirst");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> name=Submit<br/>
	 */
	protected Button btnAddToCart = getButton(tomgr, winPerennialsPage, "btnAddToCart");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> xpath=//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span<br/>
	 */
	protected Button btnContinueShoping = getButton(tomgr, winPerennialsPage, "btnContinueShoping");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Element<br/>
	 * <b>Target:</b> xpath=//*[@id='center_column']/h1/span[1]<br/>
	 */
	protected Element objText = getElement(tomgr, winPerennialsPage, "objText");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Element<br/>
	 * <b>Target:</b> cssSelector=.nomargin.hiddable.col-lg-6>label>a>span<br/>
	 */
	protected Element objUnvav = getElement(tomgr, winPerennialsPage, "objUnvav");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Element<br/>
	 * <b>Target:</b> cssSelector=span[id="layer_cart_product_title"]<br/>
	 */
	protected Element objTextLable = getElement(tomgr, winPerennialsPage, "objTextLable");

	/**
	 * <b>Description:</b> acena Buchanana <br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> xpath=//*[@id='center_column']/ul/li[2]/div/div[1]/div/a[1]/img<br/>
	 */
	protected Button btnBuchanana = getButton(tomgr, winPerennialsPage, "btnBuchanana");

	/**
	 * <b>Description:</b> acena drobnolistna "Bronze<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> xpath=//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[1]/img<br/>
	 */
	protected Button btnBronze = getButton(tomgr, winPerennialsPage, "btnBronze");

	/**
	 * <b>Description:</b> akant miêkki "Hollard's Gold<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> xpath=//*[@id='center_column']/ul/li[12]/div/div[1]/div/a[1]/img<br/>
	 */
	protected Button btnHollard = getButton(tomgr, winPerennialsPage, "btnHollard");

}
