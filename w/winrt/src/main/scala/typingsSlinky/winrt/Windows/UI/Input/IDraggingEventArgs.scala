package typingsSlinky.winrt.Windows.UI.Input

import typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDraggingEventArgs extends js.Object {
  var draggingState: DraggingState = js.native
  var pointerDeviceType: PointerDeviceType = js.native
  var position: Point = js.native
}

object IDraggingEventArgs {
  @scala.inline
  def apply(draggingState: DraggingState, pointerDeviceType: PointerDeviceType, position: Point): IDraggingEventArgs = {
    val __obj = js.Dynamic.literal(draggingState = draggingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDraggingEventArgs]
  }
  @scala.inline
  implicit class IDraggingEventArgsOps[Self <: IDraggingEventArgs] (val x: Self) extends AnyVal {
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

