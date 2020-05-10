package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events that occur due to the user moving a mouse wheel or similar input device. */
@js.native
trait WheelEvent extends MouseEvent {
  val DOM_DELTA_LINE: Double = js.native
  val DOM_DELTA_PAGE: Double = js.native
  val DOM_DELTA_PIXEL: Double = js.native
  val deltaMode: Double = js.native
  val deltaX: Double = js.native
  val deltaY: Double = js.native
  val deltaZ: Double = js.native
}

@JSGlobal("WheelEvent")
@js.native
object WheelEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalajs.dom.raw.WheelEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ WheelEventInit, 
      org.scalajs.dom.raw.WheelEvent
    ] {
  val DOM_DELTA_LINE: Double = js.native
  val DOM_DELTA_PAGE: Double = js.native
  val DOM_DELTA_PIXEL: Double = js.native
}

