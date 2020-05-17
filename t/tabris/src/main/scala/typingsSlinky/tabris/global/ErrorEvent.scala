package typingsSlinky.tabris.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.tabris.ErrorEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ErrorEvent")
@js.native
class ErrorEvent protected ()
  extends typingsSlinky.tabris.ErrorEvent {
  def this(`type`: String) = this()
  def this(`type`: String, errorEventInitDict: ErrorEventInit) = this()
}

@JSGlobal("ErrorEvent")
@js.native
object ErrorEvent
  extends Instantiable1[/* type */ String, typingsSlinky.tabris.ErrorEvent]
     with Instantiable2[
      /* type */ String, 
      /* errorEventInitDict */ ErrorEventInit, 
      typingsSlinky.tabris.ErrorEvent
    ]

