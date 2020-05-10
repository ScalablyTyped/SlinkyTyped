package typingsSlinky.tabris

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseEvent extends Event {
  val code: Double = js.native
  val reason: String = js.native
  val wasClean: Boolean = js.native
  def initCloseEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    wasCleanArg: Boolean,
    codeArg: Double,
    reasonArg: String
  ): Unit = js.native
}

@JSGlobal("CloseEvent")
@js.native
object CloseEvent
  extends Instantiable1[/* typeArg */ String, CloseEvent]
     with Instantiable2[/* typeArg */ String, /* eventInitDict */ CloseEventInit, CloseEvent]

