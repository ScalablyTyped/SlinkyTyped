package typingsSlinky.wordpressComponents.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fill extends js.Object {
  var Fill: ReactComponentClass[OmitPropsname] = js.native
  var Slot: ReactComponentClass[OmitPropsnameBubblesVirtually] = js.native
}

object Fill {
  @scala.inline
  def apply(Fill: ReactComponentClass[OmitPropsname], Slot: ReactComponentClass[OmitPropsnameBubblesVirtually]): Fill = {
    val __obj = js.Dynamic.literal(Fill = Fill.asInstanceOf[js.Any], Slot = Slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  @scala.inline
  implicit class FillOps[Self <: Fill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFill(value: ReactComponentClass[OmitPropsname]): Self = this.set("Fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlot(value: ReactComponentClass[OmitPropsnameBubblesVirtually]): Self = this.set("Slot", value.asInstanceOf[js.Any])
  }
  
}

