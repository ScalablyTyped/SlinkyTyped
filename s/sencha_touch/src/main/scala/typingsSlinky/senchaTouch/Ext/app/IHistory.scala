package typingsSlinky.senchaTouch.Ext.app

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHistory extends IObservable {
  /** [Config Option] (Array) */
  var actions: js.UndefOr[Array] = js.native
  /** [Method] Adds an Action to the stack optionally updating the browser s url and firing the change event
  		* @param action Ext.app.Action The Action to add to the stack.
  		* @param silent Boolean Cancels the firing of the change event if true.
  		*/
  var add: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[IAction], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Navigate to the previous active action  */
  var back: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of actions
  		* @returns Array
  		*/
  var getActions: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of token
  		* @returns String
  		*/
  var getToken: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of updateUrl
  		* @returns Boolean
  		*/
  var getUpdateUrl: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IHistory: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Sets the value of actions
  		* @param actions Array The new value.
  		*/
  var setActions: js.UndefOr[js.Function1[/* actions */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of token
  		* @param token String The new value.
  		*/
  var setToken: js.UndefOr[js.Function1[/* token */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of updateUrl
  		* @param updateUrl Boolean The new value.
  		*/
  var setUpdateUrl: js.UndefOr[js.Function1[/* updateUrl */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (String) */
  var token: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var updateUrl: js.UndefOr[Boolean] = js.native
}

object IHistory {
  @scala.inline
  def apply(): IHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHistory]
  }
  @scala.inline
  implicit class IHistoryOps[Self <: IHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withAdd(value: (/* action */ js.UndefOr[IAction], /* silent */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withBack(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActions(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetToken(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToken")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUpdateUrl(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpdateUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUpdateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpdateUrl")(js.undefined)
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
    def withSetActions(value: /* actions */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActions")(js.undefined)
        ret
    }
    @scala.inline
    def withSetToken(value: /* token */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUpdateUrl(value: /* updateUrl */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUpdateUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUpdateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUpdateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(js.undefined)
        ret
    }
  }
  
}

