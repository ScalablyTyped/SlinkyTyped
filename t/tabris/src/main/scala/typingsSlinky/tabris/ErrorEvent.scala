package typingsSlinky.tabris

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorEvent extends Event {
  val colno: Double = js.native
  val error: js.Any = js.native
  val filename: String = js.native
  val lineno: Double = js.native
  val message: String = js.native
  def initErrorEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    messageArg: String,
    filenameArg: String,
    linenoArg: Double
  ): Unit = js.native
}

@JSGlobal("ErrorEvent")
@js.native
object ErrorEvent
  extends Instantiable1[/* type */ String, ErrorEvent]
     with Instantiable2[/* type */ String, /* errorEventInitDict */ ErrorEventInit, ErrorEvent]

