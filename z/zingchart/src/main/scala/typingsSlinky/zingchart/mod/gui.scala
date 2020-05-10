package typingsSlinky.zingchart.mod

import typingsSlinky.zingchart.AnonCustomitems
import typingsSlinky.zingchart.AnonEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait gui extends js.Object {
  var behaviors: js.UndefOr[js.Array[AnonEnabled]] = js.native
  var `context-menu`: js.UndefOr[AnonCustomitems] = js.native
}

object gui {
  @scala.inline
  def apply(): gui = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[gui]
  }
  @scala.inline
  implicit class guiOps[Self <: gui] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehaviors(value: js.Array[AnonEnabled]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehaviors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviors")(js.undefined)
        ret
    }
    @scala.inline
    def `withContext-menu`(value: AnonCustomitems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context-menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContext-menu`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context-menu")(js.undefined)
        ret
    }
  }
  
}

