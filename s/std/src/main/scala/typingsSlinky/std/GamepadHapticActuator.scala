package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Gamepad API interface represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware. */
@js.native
trait GamepadHapticActuator extends js.Object {
  val `type`: GamepadHapticActuatorType = js.native
  def pulse(value: Double, duration: Double): js.Promise[scala.Boolean] = js.native
}

object GamepadHapticActuator {
  @scala.inline
  def apply(pulse: (Double, Double) => js.Promise[scala.Boolean], `type`: GamepadHapticActuatorType): GamepadHapticActuator = {
    val __obj = js.Dynamic.literal(pulse = js.Any.fromFunction2(pulse))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadHapticActuator]
  }
  @scala.inline
  implicit class GamepadHapticActuatorOps[Self <: GamepadHapticActuator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPulse(value: (Double, Double) => js.Promise[scala.Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withType(value: GamepadHapticActuatorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

