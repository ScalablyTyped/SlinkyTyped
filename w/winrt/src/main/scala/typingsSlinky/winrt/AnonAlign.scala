package typingsSlinky.winrt

import typingsSlinky.winrt.Windows.UI.Text.TabAlignment
import typingsSlinky.winrt.Windows.UI.Text.TabLeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlign extends js.Object {
  var align: TabAlignment = js.native
  var leader: TabLeader = js.native
  var position: Double = js.native
}

object AnonAlign {
  @scala.inline
  def apply(align: TabAlignment, leader: TabLeader, position: Double): AnonAlign = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlign]
  }
  @scala.inline
  implicit class AnonAlignOps[Self <: AnonAlign] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: TabAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeader(value: TabLeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

