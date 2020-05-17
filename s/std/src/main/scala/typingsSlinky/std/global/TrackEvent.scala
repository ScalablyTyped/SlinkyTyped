package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.TrackEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TrackEvent")
@js.native
class TrackEvent protected ()
  extends typingsSlinky.std.TrackEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: TrackEventInit) = this()
}

@JSGlobal("TrackEvent")
@js.native
object TrackEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalajs.dom.raw.TrackEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ TrackEventInit, 
      org.scalajs.dom.raw.TrackEvent
    ]

