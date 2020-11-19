package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.PointerEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PointerEvent")
@js.native
class PointerEvent protected ()
  extends typingsSlinky.std.PointerEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: PointerEventInit) = this()
}
@JSGlobal("PointerEvent")
@js.native
object PointerEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalajs.dom.raw.PointerEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ PointerEventInit, 
      org.scalajs.dom.raw.PointerEvent
    ]
