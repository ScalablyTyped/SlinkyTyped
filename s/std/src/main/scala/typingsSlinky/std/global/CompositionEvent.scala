package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.CompositionEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CompositionEvent")
@js.native
class CompositionEvent protected ()
  extends typingsSlinky.std.CompositionEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: CompositionEventInit) = this()
}
@JSGlobal("CompositionEvent")
@js.native
object CompositionEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalajs.dom.raw.CompositionEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ CompositionEventInit, 
      org.scalajs.dom.raw.CompositionEvent
    ]
