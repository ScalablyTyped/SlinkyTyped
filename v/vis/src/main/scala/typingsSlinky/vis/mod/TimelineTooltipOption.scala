package typingsSlinky.vis.mod

import typingsSlinky.vis.visStrings.cap
import typingsSlinky.vis.visStrings.flip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineTooltipOption extends js.Object {
  var followMouse: js.UndefOr[Boolean] = js.native
  var overflowMethod: js.UndefOr[cap | flip] = js.native
}

object TimelineTooltipOption {
  @scala.inline
  def apply(): TimelineTooltipOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineTooltipOption]
  }
  @scala.inline
  implicit class TimelineTooltipOptionOps[Self <: TimelineTooltipOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollowMouse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followMouse")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowMethod(value: cap | flip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowMethod")(js.undefined)
        ret
    }
  }
  
}

