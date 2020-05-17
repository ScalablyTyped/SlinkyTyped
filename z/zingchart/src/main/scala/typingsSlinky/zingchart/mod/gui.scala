package typingsSlinky.zingchart.mod

import typingsSlinky.zingchart.anon.Customitems
import typingsSlinky.zingchart.anon.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait gui extends js.Object {
  var behaviors: js.UndefOr[js.Array[Enabled]] = js.native
  var `context-menu`: js.UndefOr[Customitems] = js.native
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
    def withBehaviors(value: js.Array[Enabled]): Self = {
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
    def `withContext-menu`(value: Customitems): Self = {
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

