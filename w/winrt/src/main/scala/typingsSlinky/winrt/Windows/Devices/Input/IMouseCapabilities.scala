package typingsSlinky.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMouseCapabilities extends js.Object {
  var horizontalWheelPresent: Double = js.native
  var mousePresent: Double = js.native
  var numberOfButtons: Double = js.native
  var swapButtons: Double = js.native
  var verticalWheelPresent: Double = js.native
}

object IMouseCapabilities {
  @scala.inline
  def apply(
    horizontalWheelPresent: Double,
    mousePresent: Double,
    numberOfButtons: Double,
    swapButtons: Double,
    verticalWheelPresent: Double
  ): IMouseCapabilities = {
    val __obj = js.Dynamic.literal(horizontalWheelPresent = horizontalWheelPresent.asInstanceOf[js.Any], mousePresent = mousePresent.asInstanceOf[js.Any], numberOfButtons = numberOfButtons.asInstanceOf[js.Any], swapButtons = swapButtons.asInstanceOf[js.Any], verticalWheelPresent = verticalWheelPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseCapabilities]
  }
  @scala.inline
  implicit class IMouseCapabilitiesOps[Self <: IMouseCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontalWheelPresent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalWheelPresent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousePresent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousePresent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfButtons(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwapButtons(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalWheelPresent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalWheelPresent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

