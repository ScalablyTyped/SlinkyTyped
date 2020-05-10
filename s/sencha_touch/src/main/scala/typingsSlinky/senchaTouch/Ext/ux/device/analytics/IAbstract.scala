package typingsSlinky.senchaTouch.Ext.ux.device.analytics

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Method] Returns the value of accountID
  		* @returns Object
  		*/
  var getAccountID: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Registers yur Google Analytics account
  		* @param accountID String Your Google Analytics account ID
  		*/
  var registerAccount: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of accountID
  		* @param accountID Object The new value.
  		*/
  var setAccountID: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Track an event in your application
  		* @param config Object
  		*/
  var trackEvent: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Track an pageview in your application
  		* @param config String The page you want to track (must start with a slash).
  		*/
  var trackPageview: js.UndefOr[js.Function1[/* config */ js.UndefOr[String], Unit]] = js.native
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
    def withGetAccountID(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAccountID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountID")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterAccount(value: /* accountID */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRegisterAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAccountID(value: /* accountID */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccountID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAccountID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccountID")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackEvent(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTrackEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackPageview(value: /* config */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackPageview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTrackPageview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackPageview")(js.undefined)
        ret
    }
  }
  
}

