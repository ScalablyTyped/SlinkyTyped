package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.KeyboardEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("KeyboardEvent")
@js.native
class KeyboardEvent protected ()
  extends typingsSlinky.std.KeyboardEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: KeyboardEventInit) = this()
}
@JSGlobal("KeyboardEvent")
@js.native
object KeyboardEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalajs.dom.raw.KeyboardEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ KeyboardEventInit, 
      org.scalajs.dom.raw.KeyboardEvent
    ] {
  
  val DOM_KEY_LOCATION_LEFT: Double = js.native
  
  val DOM_KEY_LOCATION_NUMPAD: Double = js.native
  
  val DOM_KEY_LOCATION_RIGHT: Double = js.native
  
  val DOM_KEY_LOCATION_STANDARD: Double = js.native
}
