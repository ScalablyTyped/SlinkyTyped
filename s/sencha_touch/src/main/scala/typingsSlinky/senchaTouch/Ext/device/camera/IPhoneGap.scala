package typingsSlinky.senchaTouch.Ext.device.camera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPhoneGap extends IAbstract {
  /** [Method] Allows you to capture a photo
  		* @param args Object
  		*/
  @JSName("capture")
  var capture_IPhoneGap: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.native
}

object IPhoneGap {
  @scala.inline
  def apply(): IPhoneGap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPhoneGap]
  }
  @scala.inline
  implicit class IPhoneGapOps[Self <: IPhoneGap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapture(value: /* args */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
  }
  
}

