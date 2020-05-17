package typingsSlinky.winrtUwp.Windows.UI.Input

import typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the CrossSliding event. */
@js.native
trait CrossSlidingEventArgs extends js.Object {
  /** Gets the state of the CrossSliding event. */
  var crossSlidingState: CrossSlidingState = js.native
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the touch contact. */
  var position: Point = js.native
}

object CrossSlidingEventArgs {
  @scala.inline
  def apply(crossSlidingState: CrossSlidingState, pointerDeviceType: PointerDeviceType, position: Point): CrossSlidingEventArgs = {
    val __obj = js.Dynamic.literal(crossSlidingState = crossSlidingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossSlidingEventArgs]
  }
  @scala.inline
  implicit class CrossSlidingEventArgsOps[Self <: CrossSlidingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossSlidingState(value: CrossSlidingState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossSlidingState")(value.asInstanceOf[js.Any])
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

