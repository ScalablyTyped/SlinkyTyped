package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the scrollable region stops being dragged.
		 */
@js.native
trait ScrollViewDragendEvent extends ScrollViewBaseEvent {
  /**
  			 * Indicates whether scrolling will continue but decelerate, now that the drag gesture has
  			 * been released by the touch. If `false`, scrolling will stop immediately.
  			 * Is always `true` on Android.
  			 */
  var decelerate: Boolean = js.native
}

object ScrollViewDragendEvent {
  @scala.inline
  def apply(decelerate: Boolean, source: ScrollView): ScrollViewDragendEvent = {
    val __obj = js.Dynamic.literal(decelerate = decelerate.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewDragendEvent]
  }
  @scala.inline
  implicit class ScrollViewDragendEventOps[Self <: ScrollViewDragendEvent] (val x: Self) extends AnyVal {
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

