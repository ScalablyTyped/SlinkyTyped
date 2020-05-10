package typingsSlinky.w3cGamepad

import typingsSlinky.w3cGamepad.Gamepad.GamepadList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  /**
    * The currently connected and interacted-with gamepads. Gamepads must only appear in the list if they are currently connected to the user agent, and have been interacted with by the user. Otherwise, they must not appear in the list to avoid a malicious page from fingerprinting the user based on connected devices.
    * @readonly
    */
  def getGamepads(): js.Array[typingsSlinky.w3cGamepad.Gamepad.Gamepad] = js.native
  def webkitGetGamepads(): GamepadList = js.native
}

object Navigator {
  @scala.inline
  def apply(
    getGamepads: () => js.Array[typingsSlinky.w3cGamepad.Gamepad.Gamepad],
    webkitGetGamepads: () => GamepadList
  ): Navigator = {
    val __obj = js.Dynamic.literal(getGamepads = js.Any.fromFunction0(getGamepads), webkitGetGamepads = js.Any.fromFunction0(webkitGetGamepads))
    __obj.asInstanceOf[Navigator]
  }
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetGamepads(value: () => js.Array[typingsSlinky.w3cGamepad.Gamepad.Gamepad]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGamepads")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWebkitGetGamepads(value: () => GamepadList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitGetGamepads")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

