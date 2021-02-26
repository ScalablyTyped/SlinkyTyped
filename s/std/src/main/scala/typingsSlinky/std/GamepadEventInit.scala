package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GamepadEventInit extends EventInit {
  
  var gamepad: org.scalajs.dom.experimental.gamepad.Gamepad = js.native
}
object GamepadEventInit {
  
  @scala.inline
  def apply(gamepad: org.scalajs.dom.experimental.gamepad.Gamepad): org.scalajs.dom.experimental.gamepad.GamepadEventInit = {
    val __obj = js.Dynamic.literal(gamepad = gamepad.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.experimental.gamepad.GamepadEventInit]
  }
  
  @scala.inline
  implicit class GamepadEventInitMutableBuilder[Self <: org.scalajs.dom.experimental.gamepad.GamepadEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGamepad(value: org.scalajs.dom.experimental.gamepad.Gamepad): Self = StObject.set(x, "gamepad", value.asInstanceOf[js.Any])
  }
}
