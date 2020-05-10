package typingsSlinky.tabris

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  val AT_TARGET: Double = js.native
  val BUBBLING_PHASE: Double = js.native
  val CAPTURING_PHASE: Double = js.native
  val bubbles: Boolean = js.native
  val cancelable: Boolean = js.native
  val currentTarget: EventTarget = js.native
  val defaultPrevented: Boolean = js.native
  val eventPhase: Double = js.native
  val isTrusted: Boolean = js.native
  val target: EventTarget = js.native
  val timeStamp: Double = js.native
  val `type`: String = js.native
  def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

@JSGlobal("Event")
@js.native
object Event
  extends Instantiable1[/* typeArg */ String, Event]
     with Instantiable2[/* typeArg */ String, /* eventInitDict */ EventInit, Event] {
  val AT_TARGET: Double = js.native
  val BUBBLING_PHASE: Double = js.native
  val CAPTURING_PHASE: Double = js.native
}

