package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.PointerEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSPointerEvent")
@js.native
class MSPointerEvent protected ()
  extends typingsSlinky.std.MSPointerEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: PointerEventInit) = this()
}
@JSGlobal("MSPointerEvent")
@js.native
object MSPointerEvent
  extends Instantiable1[/* typeArg */ java.lang.String, typingsSlinky.std.MSPointerEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ PointerEventInit, 
      typingsSlinky.std.MSPointerEvent
    ]
