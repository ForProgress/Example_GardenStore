package gardenstore.tests.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2015-12-30 12:26:07
 */
public class SampleTestMap extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/gardenstore.tests/SampleTest/SampleTest.map");

	/**
	 * <b>Description:</b> 
	 */
	protected Window winNew = getWindow(tomgr, "winNew");

	/**
	 * <b>Description:</b> acena bezbronna "Purpurea"<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> xpath=.//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img<br/>
	 */
	protected Button btnPurpurea = getButton(tomgr, winNew, "btnPurpurea");

	/**
	 * <b>Description:</b> acena Buchanana<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> xpath=.//*[@id='center_column']/ul/li[2]/div/div[1]/div/a[1]/img<br/>
	 */
	protected Button btnBuchanana = getButton(tomgr, winNew, "btnBuchanana");

	/**
	 * <b>Description:</b> acena drobnolistna "Bronze"<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> xpath=.//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[1]/img<br/>
	 */
	protected Button btnBronze = getButton(tomgr, winNew, "btnBronze");

	/**
	 * <b>Description:</b> akant miêkki "Hollard's Gold"<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> xpath=.//*[@id='center_column']/ul/li[12]/div/div[1]/div/a[1]<br/>
	 */
	protected Button btnHollard = getButton(tomgr, winNew, "btnHollard");

}
