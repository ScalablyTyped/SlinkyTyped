package typingsSlinky.senchaTouch.Ext.ux.device.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICordova extends IAbstract {
  /** [Method] Track an pageview in your application
  		* @param page Object
  		*/
  @JSName("trackPageview")
  var trackPageview_ICordova: js.UndefOr[js.Function1[/* page */ js.UndefOr[js.Any], Unit]] = js.native
}

object ICordova {
  @scala.inline
  def apply(): ICordova = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICordova]
  }
  @scala.inline
  implicit class ICordovaOps[Self <: ICordova] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrackPageview(value: /* page */ js.UndefOr[js.Any] => Unit): Self = {
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

