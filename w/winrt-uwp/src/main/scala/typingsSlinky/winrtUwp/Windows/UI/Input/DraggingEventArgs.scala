package typingsSlinky.winrtUwp.Windows.UI.Input

import typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the Dragging event. */
@js.native
trait DraggingEventArgs extends js.Object {
  /** Gets the state of the Dragging event. */
  var draggingState: DraggingState = js.native
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the mouse or pen/stylus contact. */
  var position: Point = js.native
}

object DraggingEventArgs {
  @scala.inline
  def apply(draggingState: DraggingState, pointerDeviceType: PointerDeviceType, position: Point): DraggingEventArgs = {
    val __obj = js.Dynamic.literal(draggingState = draggingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggingEventArgs]
  }
  @scala.inline
  implicit class DraggingEventArgsOps[Self <: DraggingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraggingState(value: DraggingState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerDeviceType(value: PointerDeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

