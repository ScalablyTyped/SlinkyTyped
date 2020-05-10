package typingsSlinky.senchaTouch.Ext.device.contacts

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IObservable {
  /** [Method] Returns an Array of contact objects
  		* @param config Object
  		* @returns Object[] An array of contact objects.
  		*/
  var getContacts: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Returns the value of includeImages
  		* @returns Boolean
  		*/
  var getIncludeImages: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns localized user readable label for a contact field i e
  		* @param config Object
  		* @returns String user readable string
  		*/
  var getLocalizedLabel: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], String]] = js.native
  /** [Method] Returns base64 encoded image thumbnail for a contact specified in config id This method is for Sencha Native Packager
  		* @param config Object
  		* @returns String base64 string
  		*/
  var getThumbnail: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], String]] = js.native
  /** [Config Option] (Boolean) */
  var includeImages: js.UndefOr[Boolean] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IAbstract: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Sets the value of includeImages
  		* @param includeImages Boolean The new value.
  		*/
  var setIncludeImages: js.UndefOr[js.Function1[/* includeImages */ js.UndefOr[Boolean], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContacts(value: /* config */ js.UndefOr[js.Any] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContacts")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetContacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContacts")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIncludeImages(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIncludeImages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIncludeImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIncludeImages")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLocalizedLabel(value: /* config */ js.UndefOr[js.Any] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalizedLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetLocalizedLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalizedLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetThumbnail(value: /* config */ js.UndefOr[js.Any] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThumbnail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeImages")(js.undefined)
        ret
    }
    @scala.inline
    def withRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRelayEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIncludeImages(value: /* includeImages */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIncludeImages")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIncludeImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIncludeImages")(js.undefined)
        ret
    }
  }
  
}

