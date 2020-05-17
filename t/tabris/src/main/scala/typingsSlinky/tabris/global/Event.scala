package typingsSlinky.tabris.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.tabris.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Event")
@js.native
class Event protected ()
  extends typingsSlinky.tabris.Event {
  def this(typeArg: String) = this()
  def this(typeArg: String, eventInitDict: EventInit) = this()
}

@JSGlobal("Event")
@js.native
object Event
  extends Instantiable1[/* typeArg */ String, typingsSlinky.tabris.Event]
     with Instantiable2[/* typeArg */ String, /* eventInitDict */ EventInit, typingsSlinky.tabris.Event] {
  val AT_TARGET: Double = js.native
  val BUBBLING_PHASE: Double = js.native
  val CAPTURING_PHASE: Double = js.native
}

