package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.PopStateEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PopStateEvent")
@js.native
class PopStateEvent protected ()
  extends typingsSlinky.std.PopStateEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: PopStateEventInit) = this()
}
@JSGlobal("PopStateEvent")
@js.native
object PopStateEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalajs.dom.raw.PopStateEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ PopStateEventInit, 
      org.scalajs.dom.raw.PopStateEvent
    ]
