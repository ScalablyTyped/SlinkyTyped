package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.ErrorEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ErrorEvent")
@js.native
class ErrorEvent protected ()
  extends typingsSlinky.std.ErrorEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: ErrorEventInit) = this()
}

@JSGlobal("ErrorEvent")
@js.native
object ErrorEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalajs.dom.raw.ErrorEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ ErrorEventInit, 
      org.scalajs.dom.raw.ErrorEvent
    ]

