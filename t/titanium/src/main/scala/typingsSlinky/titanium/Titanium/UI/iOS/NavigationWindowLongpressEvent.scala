package typingsSlinky.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the device detects a long press.
			 */
@js.native
trait NavigationWindowLongpressEvent extends NavigationWindowBaseEvent {
  /**
  				 * X coordinate of the event from the `source` view's coordinate system.
  				 */
  var x: Double = js.native
  /**
  				 * Y coordinate of the event from the `source` view's coordinate system.
  				 */
  var y: Double = js.native
}

object NavigationWindowLongpressEvent {
  @scala.inline
  def apply(source: NavigationWindow, x: Double, y: Double): NavigationWindowLongpressEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationWindowLongpressEvent]
  }
  @scala.inline
  implicit class NavigationWindowLongpressEventOps[Self <: NavigationWindowLongpressEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

