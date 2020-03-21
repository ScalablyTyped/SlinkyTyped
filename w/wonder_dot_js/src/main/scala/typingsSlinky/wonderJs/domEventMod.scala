package typingsSlinky.wonderJs

import typingsSlinky.wonderJs.customEventMod.CustomEvent
import typingsSlinky.wonderJs.eventMod.Event
import typingsSlinky.wonderJs.eventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/DomEvent", JSImport.Namespace)
@js.native
object domEventMod extends js.Object {
  @js.native
  abstract class DomEvent protected () extends Event {
    def this(event: js.Any, eventName: EEventName) = this()
    var event: js.Any = js.native
    def getDataFromCustomEvent(event: CustomEvent): Unit = js.native
    def preventDefault(): Unit = js.native
  }
  
}

