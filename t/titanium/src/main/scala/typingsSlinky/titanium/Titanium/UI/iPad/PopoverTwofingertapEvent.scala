package typingsSlinky.titanium.Titanium.UI.iPad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the device detects a two-finger tap against the view.
			 */
@js.native
trait PopoverTwofingertapEvent extends PopoverBaseEvent {
  /**
  				 * X coordinate of the event from the `source` view's coordinate system.
  				 */
  var x: Double = js.native
  /**
  				 * Y coordinate of the event from the `source` view's coordinate system.
  				 */
  var y: Double = js.native
}

object PopoverTwofingertapEvent {
  @scala.inline
  def apply(source: Popover, x: Double, y: Double): PopoverTwofingertapEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverTwofingertapEvent]
  }
  @scala.inline
  implicit class PopoverTwofingertapEventOps[Self <: PopoverTwofingertapEvent] (val x: Self) extends AnyVal {
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

