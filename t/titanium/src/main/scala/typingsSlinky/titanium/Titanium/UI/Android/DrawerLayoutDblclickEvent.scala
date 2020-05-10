package typingsSlinky.titanium.Titanium.UI.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the device detects a double click against the view.
			 */
@js.native
trait DrawerLayoutDblclickEvent extends DrawerLayoutBaseEvent {
  /**
  				 * X coordinate of the event from the `source` view's coordinate system.
  				 */
  var x: Double = js.native
  /**
  				 * Y coordinate of the event from the `source` view's coordinate system.
  				 */
  var y: Double = js.native
}

object DrawerLayoutDblclickEvent {
  @scala.inline
  def apply(source: DrawerLayout, x: Double, y: Double): DrawerLayoutDblclickEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutDblclickEvent]
  }
  @scala.inline
  implicit class DrawerLayoutDblclickEventOps[Self <: DrawerLayoutDblclickEvent] (val x: Self) extends AnyVal {
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

