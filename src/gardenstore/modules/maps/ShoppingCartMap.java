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
public class ShoppingCartMap extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/gardenstore.modules/ShoppingCart/ShoppingCart.map");

	/**
	 * <b>Description:</b> Shopping cart
	 */
	protected Window winShoppingCart = getWindow(tomgr, "winShoppingCart");

	/**
	 * <b>Description:</b> PrzejdŸ do realizacji zamówienia<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> name:button btn btn-default standard-checkout button-medium<br/>
	 */
	protected Button btnPrzejdzDoRealizacjiZam = getButton(tomgr, winShoppingCart, "btnPrzejdzDoRealizacjiZam");

	/**
	 * <b>Description:</b> Przycisk 'PrzejdŸ do realizacji zamówienia' na ekranie zatwierdzania adresu<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> name:processAddress<br/>
	 */
	protected Button btnZatwierdzAdres = getButton(tomgr, winShoppingCart, "btnZatwierdzAdres");

	/**
	 * <b>Description:</b> Przycisk 'PrzejdŸ do realizacji zamówienia' na ekranie zatwierdzania wysylki<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> name:processCarrier<br/>
	 */
	protected Button btnZatwierdzWysylke = getButton(tomgr, winShoppingCart, "btnZatwierdzWysylke");

	/**
	 * <b>Description:</b> Przycisk z napisem:Zap³aæ przelewem (czas przetwarzania zamówienia bêdzie d³u¿szy)<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> linkText:Zap³aæ przelewem (czas przetwarzania zamówienia bêdzie d³u¿szy)<br/>
	 */
	protected Button btnZaplacPrzelewem = getButton(tomgr, winShoppingCart, "btnZaplacPrzelewem");

	/**
	 * <b>Description:</b> Checkbox akceptacji regulaminu<br/><br/>
	 * <b>Driver:</b> WebDriver<br/>
	 * <b>Class:</b> Button<br/>
	 * <b>Target:</b> id:cgv<br/>
	 */
	protected Button btnZawierdzRegulamin = getButton(tomgr, winShoppingCart, "btnZawierdzRegulamin");

}
