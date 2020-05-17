package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineItemsAlwaysDraggableOption extends TimelineOptionsItemsAlwaysDraggableType {
  var item: js.UndefOr[Boolean] = js.native
  var range: js.UndefOr[Boolean] = js.native
}

object TimelineItemsAlwaysDraggableOption {
  @scala.inline
  def apply(): TimelineItemsAlwaysDraggableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineItemsAlwaysDraggableOption]
  }
  @scala.inline
  implicit class TimelineItemsAlwaysDraggableOptionOps[Self <: TimelineItemsAlwaysDraggableOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

