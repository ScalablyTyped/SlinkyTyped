package typingsSlinky.titanium.Titanium.UI.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the motion state of the drawer view changes.
			 */
@js.native
trait DrawerLayoutChangeEvent extends DrawerLayoutBaseEvent {
  /**
  				 * Whether or not the drawer is currently dragging.
  				 */
  var dragging: Boolean = js.native
  /**
  				 * Contains the drawer frame type. Either `left` or `right`.
  				 */
  var drawer: String = js.native
  /**
  				 * Whether or not the drawer is currently idle.
  				 */
  var idle: Boolean = js.native
  /**
  				 * Whether or not the drawer is currently settling.
  				 */
  var settling: Boolean = js.native
  /**
  				 * The current drawer state.
  				 */
  var state: Double = js.native
}

object DrawerLayoutChangeEvent {
  @scala.inline
  def apply(
    dragging: Boolean,
    drawer: String,
    idle: Boolean,
    settling: Boolean,
    source: DrawerLayout,
    state: Double
  ): DrawerLayoutChangeEvent = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], settling = settling.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutChangeEvent]
  }
  @scala.inline
  implicit class DrawerLayoutChangeEventOps[Self <: DrawerLayoutChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

