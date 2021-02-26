package typingsSlinky.w3cGamepad

import typingsSlinky.w3cGamepad.Gamepad.GamepadList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
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
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGamepads(value: () => js.Array[typingsSlinky.w3cGamepad.Gamepad.Gamepad]): Self = StObject.set(x, "getGamepads", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWebkitGetGamepads(value: () => GamepadList): Self = StObject.set(x, "webkitGetGamepads", js.Any.fromFunction0(value))
  }
}
