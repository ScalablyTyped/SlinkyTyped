package typingsSlinky.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebUIActivationStatics extends js.Object {
  var onactivated: js.Any = js.native
  var onnavigated: js.Any = js.native
  var onresuming: js.Any = js.native
  var onsuspending: js.Any = js.native
}

object IWebUIActivationStatics {
  @scala.inline
  def apply(onactivated: js.Any, onnavigated: js.Any, onresuming: js.Any, onsuspending: js.Any): IWebUIActivationStatics = {
    val __obj = js.Dynamic.literal(onactivated = onactivated.asInstanceOf[js.Any], onnavigated = onnavigated.asInstanceOf[js.Any], onresuming = onresuming.asInstanceOf[js.Any], onsuspending = onsuspending.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUIActivationStatics]
  }
  @scala.inline
  implicit class IWebUIActivationStaticsOps[Self <: IWebUIActivationStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnactivated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onactivated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnnavigated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onnavigated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnresuming(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresuming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsuspending(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsuspending")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

