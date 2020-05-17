package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An individual button of a gamepad or other controller, allowing access to the current state of different types of buttons available on the control device. */
@js.native
trait GamepadButton extends js.Object {
  val pressed: scala.Boolean = js.native
  val touched: scala.Boolean = js.native
  val value: Double = js.native
}

object GamepadButton {
  @scala.inline
  def apply(pressed: scala.Boolean, touched: scala.Boolean, value: Double): GamepadButton = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadButton]
  }
  @scala.inline
  implicit class GamepadButtonOps[Self <: org.scalajs.dom.experimental.gamepad.GamepadButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPressed(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouched(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

