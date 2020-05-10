package typingsSlinky.senchaTouch.Ext.device.device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISencha extends IAbstract {
  /** [Method] Opens a specified URL
  		* @param url Object
  		*/
  @JSName("openURL")
  var openURL_ISencha: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.native
}

object ISencha {
  @scala.inline
  def apply(): ISencha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISencha]
  }
  @scala.inline
  implicit class ISenchaOps[Self <: ISencha] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenURL(value: /* url */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpenURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openURL")(js.undefined)
        ret
    }
  }
  
}

