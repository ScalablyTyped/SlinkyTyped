package typingsSlinky.tabris

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageEvent extends Event {
  val data: js.Any = js.native
  val origin: String = js.native
  val ports: js.Any = js.native
  val source: js.Any = js.native
  def initMessageEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    dataArg: js.Any,
    originArg: String,
    lastEventIdArg: String,
    sourceArg: js.Any
  ): Unit = js.native
}

@JSGlobal("MessageEvent")
@js.native
object MessageEvent
  extends Instantiable1[/* type */ String, MessageEvent]
     with Instantiable2[/* type */ String, /* eventInitDict */ MessageEventInit, MessageEvent]

