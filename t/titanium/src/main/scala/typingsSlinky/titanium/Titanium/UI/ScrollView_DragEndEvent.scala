package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the scrollable region stops being dragged.
		 */
@js.native
trait ScrollView_DragEndEvent extends ScrollViewBaseEvent {
  /**
  			 * Indicates whether scrolling will continue but decelerate, now that the drag gesture has
  			 * been released by the touch. If `false`, scrolling will stop immediately.
  			 */
  var decelerate: Boolean = js.native
}

object ScrollView_DragEndEvent {
  @scala.inline
  def apply(decelerate: Boolean, source: ScrollView): ScrollView_DragEndEvent = {
    val __obj = js.Dynamic.literal(decelerate = decelerate.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollView_DragEndEvent]
  }
  @scala.inline
  implicit class ScrollView_DragEndEventOps[Self <: ScrollView_DragEndEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecelerate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decelerate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

