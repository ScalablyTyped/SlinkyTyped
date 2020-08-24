package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamepadEventInit extends EventInit {
  var gamepad: org.scalajs.dom.experimental.gamepad.Gamepad = js.native
}

object GamepadEventInit {
  @scala.inline
  def apply(gamepad: org.scalajs.dom.experimental.gamepad.Gamepad): GamepadEventInit = {
    val __obj = js.Dynamic.literal(gamepad = gamepad.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadEventInit]
  }
  @scala.inline
  implicit class GamepadEventInitOps[Self <: org.scalajs.dom.experimental.gamepad.GamepadEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGamepad(value: org.scalajs.dom.experimental.gamepad.Gamepad): Self = this.set("gamepad", value.asInstanceOf[js.Any])
  }
  
}

