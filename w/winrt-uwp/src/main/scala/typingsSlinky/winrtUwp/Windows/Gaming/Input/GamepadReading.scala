package typingsSlinky.winrtUwp.Windows.Gaming.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the current state of the controller. */
@js.native
trait GamepadReading extends js.Object {
  /** The state of the controller buttons. */
  var buttons: GamepadButtons = js.native
  /** The position of the left thumbstick on the X-asxis. The value is between -1.0 and 1.0. */
  var leftThumbstickX: Double = js.native
  /** The position of the left thumbstick on the Y-axis.The value is between -1.0 and 1.0. */
  var leftThumbstickY: Double = js.native
  /** The position of the left trigger. The value is between 0.0 (not depressed) and 1.0 (fully depressed). */
  var leftTrigger: Double = js.native
  /** The position of the right thumbstick on the X-axis.The value is between -1.0 and 1.0. */
  var rightThumbstickX: Double = js.native
  /** The position of the right thumbstick on the Y-axis. The value is between -1.0 and 1.0. */
  var rightThumbstickY: Double = js.native
  /** The position of the right trigger. The value is between 0.0 (not depressed) and 1.0 (fully depressed). */
  var rightTrigger: Double = js.native
  /** Time when the state was retrieved from the controller. */
  var timestamp: Double = js.native
}

object GamepadReading {
  @scala.inline
  def apply(
    buttons: GamepadButtons,
    leftThumbstickX: Double,
    leftThumbstickY: Double,
    leftTrigger: Double,
    rightThumbstickX: Double,
    rightThumbstickY: Double,
    rightTrigger: Double,
    timestamp: Double
  ): GamepadReading = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], leftThumbstickX = leftThumbstickX.asInstanceOf[js.Any], leftThumbstickY = leftThumbstickY.asInstanceOf[js.Any], leftTrigger = leftTrigger.asInstanceOf[js.Any], rightThumbstickX = rightThumbstickX.asInstanceOf[js.Any], rightThumbstickY = rightThumbstickY.asInstanceOf[js.Any], rightTrigger = rightTrigger.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadReading]
  }
  @scala.inline
  implicit class GamepadReadingOps[Self <: GamepadReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtons(value: GamepadButtons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftThumbstickX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftThumbstickX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftThumbstickY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftThumbstickY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftTrigger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightThumbstickX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightThumbstickX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightThumbstickY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightThumbstickY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightTrigger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

