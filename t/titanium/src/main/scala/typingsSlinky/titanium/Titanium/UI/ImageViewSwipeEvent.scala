package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the device detects a swipe gesture against the view.
		 */
@js.native
trait ImageViewSwipeEvent extends ImageViewBaseEvent {
  /**
  			 * Direction of the swipe--either 'left', 'right', 'up', or 'down'.
  			 */
  var direction: String = js.native
  /**
  			 * X coordinate of the event's endpoint from the `source` view's coordinate system.
  			 */
  var x: Double = js.native
  /**
  			 * Y coordinate of the event's endpoint from the `source` view's coordinate system.
  			 */
  var y: Double = js.native
}

object ImageViewSwipeEvent {
  @scala.inline
  def apply(direction: String, source: ImageView, x: Double, y: Double): ImageViewSwipeEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageViewSwipeEvent]
  }
  @scala.inline
  implicit class ImageViewSwipeEventOps[Self <: ImageViewSwipeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

