package typingsSlinky.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait splitPanesData extends js.Object {
  var container: containerTypes = js.native
  var panes: js.Array[_] = js.native
  var slotsCopy: String = js.native
  var slotsCount: Double = js.native
  // Detect double click on touch devices.
  var splitterTaps: splitterTapsTypes = js.native
  var splitters: js.Array[_] = js.native
  var touch: touchTypes = js.native
  var vnodes: js.Array[_] = js.native
}

object splitPanesData {
  @scala.inline
  def apply(
    container: containerTypes,
    panes: js.Array[_],
    slotsCopy: String,
    slotsCount: Double,
    splitterTaps: splitterTapsTypes,
    splitters: js.Array[_],
    touch: touchTypes,
    vnodes: js.Array[_]
  ): splitPanesData = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], panes = panes.asInstanceOf[js.Any], slotsCopy = slotsCopy.asInstanceOf[js.Any], slotsCount = slotsCount.asInstanceOf[js.Any], splitterTaps = splitterTaps.asInstanceOf[js.Any], splitters = splitters.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], vnodes = vnodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[splitPanesData]
  }
  @scala.inline
  implicit class splitPanesDataOps[Self <: splitPanesData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: containerTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlotsCopy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotsCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlotsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitterTaps(value: splitterTapsTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterTaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitters(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouch(value: touchTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVnodes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vnodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

