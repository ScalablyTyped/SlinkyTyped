package typingsSlinky.titanium.Titanium.UI.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the drawer view is closed.
			 */
@js.native
trait DrawerLayoutCloseEvent extends DrawerLayoutBaseEvent {
  /**
  				 * Contains the drawer frame type. Either `left` or `right`.
  				 */
  var drawer: String = js.native
}

object DrawerLayoutCloseEvent {
  @scala.inline
  def apply(drawer: String, source: DrawerLayout): DrawerLayoutCloseEvent = {
    val __obj = js.Dynamic.literal(drawer = drawer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutCloseEvent]
  }
  @scala.inline
  implicit class DrawerLayoutCloseEventOps[Self <: DrawerLayoutCloseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

