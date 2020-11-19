package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Event
import typingsSlinky.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Event")
@js.native
class Event_ protected () extends Event {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: EventInit) = this()
}
@JSGlobal("Event")
@js.native
object Event_
  extends Instantiable1[/* type */ java.lang.String, org.scalajs.dom.raw.Event]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ EventInit, 
      org.scalajs.dom.raw.Event
    ] {
  
  val AT_TARGET: Double = js.native
  
  val BUBBLING_PHASE: Double = js.native
  
  val CAPTURING_PHASE: Double = js.native
  
  val NONE: Double = js.native
}
